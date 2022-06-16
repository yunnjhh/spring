package com.spring.anything.domain;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.ERROR)
public interface CustomerMapper {

    CustomerMapper INSTANCE = Mappers.getMapper(CustomerMapper.class);

    @Mapping(target = "memo", source = "customer", qualifiedByName = "memoByObject")
    CustomerResponse entityToResponse(Customer customer);

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "memo", qualifiedByName = "memo")
    Customer requestToEntity(CustomerRequest request);

    @Named("memoByObject")
    default String getMemoByObject(Customer customer) {
        return String.format("%s%s%s", "[MapStruct] ", customer.getMemo(), "- memoByObject ");
    }

    @Named("memo")
    default String getMemo(String memo) {
        return String.format("%s%s%s", "[MapStruct] ", memo, "- memoByString ");
    }


}
