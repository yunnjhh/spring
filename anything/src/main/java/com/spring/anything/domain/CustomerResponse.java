package com.spring.anything.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@ToString
public class CustomerResponse {

    private String name;

    private String address;

    private String memo;

}
