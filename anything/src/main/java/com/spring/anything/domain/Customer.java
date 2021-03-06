package com.spring.anything.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Customer {

    private long id;

    private String name;

    private String address;

    private String memo;

}
