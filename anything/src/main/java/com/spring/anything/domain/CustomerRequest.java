package com.spring.anything.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@ToString
@Getter
public class CustomerRequest {

    private String name;

    private String address;

    private String memo;

}
