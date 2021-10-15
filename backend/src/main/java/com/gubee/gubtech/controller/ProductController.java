package com.gubee.gubtech.controller;

import com.gubee.gubtech.assembler.ProductInputDisassembler;
import com.gubee.gubtech.assembler.ProductModelAssembler;
import com.gubee.gubtech.dto.ProductDto;
import com.gubee.gubtech.dto.ProductInputDto;
import com.gubee.gubtech.model.Product;
import com.gubee.gubtech.repository.ProductRepository;
import com.gubee.gubtech.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produtos")
public class ProductController {

    @Autowired
    private ProductRepository repository;

    @Autowired
    private ProductService productService;

    @Autowired
    ProductModelAssembler productModelAssembler;

    @Autowired
    ProductInputDisassembler productInputDisassembler;

    @GetMapping
    public List<ProductDto> findAll() {
        List<Product> products = productService.getAll();

        return productModelAssembler.toCollectionModel(products);
    }

    @GetMapping("/{stack}")
    public List<ProductDto> filter(@PathVariable String stack) {
        List<Product> products = productService.search(stack);
        return productModelAssembler.toCollectionModel(products);
    }

    @PostMapping
    public ProductDto add(@RequestBody ProductInputDto productInputDto) {
       Product product = productInputDisassembler.toDomainObject(productInputDto);
       productService.save(product);
       return productModelAssembler.toModel(product);
    }
}
