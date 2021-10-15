package com.gubee.gubtech.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class ProductInputDto {

    private String productName;

    private String description;

    private List<String> targetMarket = new ArrayList<>();

    private List<String> stack = new ArrayList<>();
}
