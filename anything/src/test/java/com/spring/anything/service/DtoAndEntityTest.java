package com.spring.anything.service;

import com.spring.anything.domain.Customer;
import com.spring.anything.domain.CustomerRequest;
import com.spring.anything.domain.CustomerResponse;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.assertj.core.api.Assertions.assertThat;

class DtoAndEntityTest {

    @Autowired
    DtoAndEntity dtoAndEntity;

    CustomerResponse response = new CustomerResponse("response", "spring", "test 생성");
    CustomerRequest request = new CustomerRequest("request", "spring", "test 생성");

    @Test
    void changeByBuilder() {

        System.out.println(response);

        Customer customer = dtoAndEntity.changeByBuilder(response);
        System.out.println(customer);

        assertThat(customer.getName()).isEqualTo(response.getName());

    }

    @Test
    void changeByCopyProperties() {
        Customer customer = dtoAndEntity.changeByCopyProperties(response);

        assertThat(customer.getName()).isEqualTo(response.getName());

    }

    @Test
    void dtoToEntityByMapper() {
        Customer customer = dtoAndEntity.dtoToEntityByMapper(request);

        System.out.println(request);
        System.out.println(customer);

        assertThat(customer.getName()).isEqualTo(request.getName());
    }

    @Test
    void entityToDtoByMapper() {
        Customer customer = dtoAndEntity.dtoToEntityByMapper(request);
        CustomerResponse response = dtoAndEntity.entityToDtoByMapper(customer);

        System.out.println(customer);
        System.out.println(response);

        assertThat(customer.getName()).isEqualTo(response.getName());

    }

}