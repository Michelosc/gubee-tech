package com.gubee.gubtech.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.OffsetDateTime;
import java.util.List;

@Getter
@Setter
public class ProductDto {

    private Long id;

    private String productName;

    private String description;

    private List<String> targetMarket;

    private List<String> stack;
}
