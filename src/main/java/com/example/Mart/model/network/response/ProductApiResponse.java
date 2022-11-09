package com.example.Mart.model.network.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProductApiResponse {
    private int prodId;
    private String name;
    private int price;
    private int qty;
}
