package com.example.Mart.model.network.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AdminApiRequest {
    private Integer admId;
    private String account;
    private String password;
    private Integer admGrade;
}
