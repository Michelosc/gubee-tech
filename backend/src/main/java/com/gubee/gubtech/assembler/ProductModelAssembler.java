package com.gubee.gubtech.assembler;

import com.gubee.gubtech.dto.ProductDto;
import com.gubee.gubtech.model.Product;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class ProductModelAssembler {

    @Autowired
    private ModelMapper modelMapper;

    public ProductDto toModel(Product product) {
        return modelMapper.map(product, ProductDto.class);
    }

    public List<ProductDto> toCollectionModel(List<Product> products) {
        return products.stream().map(this::toModel).collect(Collectors.toList());
    }
}
