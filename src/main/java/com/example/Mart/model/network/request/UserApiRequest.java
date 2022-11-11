package com.example.Mart.model.network.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserApiRequest {
    private Integer userId;
    private String account;
    private String password;
    private String name;
    private String phoneNumber;
    private String address;
    private String gender;
    private Integer age;
}
