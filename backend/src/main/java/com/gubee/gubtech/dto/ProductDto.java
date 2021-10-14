package com.gubee.gubtech.dto;

import java.time.OffsetDateTime;
import java.util.List;

public class ProductDto {

    private Long id;

    private OffsetDateTime createdAt;

    private String productName;

    private String description;

    private List<String> targetMarket;

    private List<String> stack;
}
