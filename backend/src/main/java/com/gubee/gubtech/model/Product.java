package com.gubee.gubtech.model;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String productName;

    private String description;

    @ElementCollection
    private List<String> targetMarket = new ArrayList<>();

    @ElementCollection
    private List<String> stack = new ArrayList<>();
}
