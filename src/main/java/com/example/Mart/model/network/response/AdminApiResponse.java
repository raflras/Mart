package com.example.Mart.model.network.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AdminApiResponse {
    private Integer admId;
    private String account;
    private String password;
    private Integer admGrade;
}
