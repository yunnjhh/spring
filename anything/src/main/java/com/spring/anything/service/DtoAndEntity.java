package com.spring.anything.service;

import com.spring.anything.domain.Customer;
import com.spring.anything.domain.CustomerMapper;
import com.spring.anything.domain.CustomerRequest;
import com.spring.anything.domain.CustomerResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanUtils;

@RequiredArgsConstructor
public class DtoAndEntity {

    private final CustomerMapper mapper;

    public static Customer changeByBuilder(CustomerResponse dto) {
        Customer customer = Customer.builder().name(dto.getName()).address(dto.getAddress()).memo(dto.getMemo()).build();
        return customer;
    }

    public static Customer changeByCopyProperties(CustomerResponse dto) {
        Customer customer = new Customer();
        BeanUtils.copyProperties(dto, customer);
        return customer;
    }

    public static Customer dtoToEntityByMapper(CustomerRequest request) {
        return CustomerMapper.INSTANCE.requestToEntity(request);
    }

    public static CustomerResponse entityToDtoByMapper(Customer customer) {
        return CustomerMapper.INSTANCE.entityToResponse(customer);
    }

}
