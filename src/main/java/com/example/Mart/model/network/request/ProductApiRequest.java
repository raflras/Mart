package com.example.Mart.model.network.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProductApiRequest {
    private int prodId;
    private String name;
    private int price;
    private int qty;
}
