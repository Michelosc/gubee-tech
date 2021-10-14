package com.gubee.gubtech.assembler;

import com.gubee.gubtech.dto.ProductInputDto;
import com.gubee.gubtech.model.Product;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductInputDisassembler {

    @Autowired
    private ModelMapper modelMapper;

    public Product toDomainObject(ProductInputDto productInput) {
        return modelMapper.map(productInput, Product.class);
    }
}
