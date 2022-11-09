package com.example.Mart.model.network.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class OrderApiResponse {
    private int ordId;
    private LocalDateTime ordDate;
    private int totalQty;
    private int totalPrice;
}
