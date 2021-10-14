package com.gubee.gubtech.model;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.time.OffsetDateTime;
import java.util.List;

@Data
@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @CreationTimestamp
    private OffsetDateTime createdAt;

    private String productName;

    private String description;

    @ElementCollection
    private List<String> targetMarket;

    @ElementCollection
    private List<String> stack;
}
