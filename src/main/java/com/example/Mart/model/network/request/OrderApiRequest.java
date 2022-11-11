package com.example.Mart.model.network.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class OrderApiRequest {
    private Integer ordId;
    private LocalDateTime ordDate;
    private Integer totalQty;
    private Integer totalPrice;
}
