package com.gubee.gubtech.exceptions;

public class ProductNotFoundException extends EntityNotFoundException{

    public ProductNotFoundException(String message) {
        super(message);
    }

    public ProductNotFoundException(Long productId) {
        this(String.format("Não existe um produto com o id %d", productId));
    }
}
