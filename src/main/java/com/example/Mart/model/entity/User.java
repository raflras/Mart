package com.example.Mart.model.entity;

import lombok.*;
import lombok.experimental.Accessors;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
@EntityListeners(AuditingEntityListener.class)
@ToString(exclude = {"orderList"})
@Accessors(chain = true)
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer userId;


    private String account;
    private String password;
    private String name;
    private String phoneNumber;
    private String address;
    private String gender;
    private Integer age;


    @CreatedDate
    private LocalDateTime registeredDate;
    @LastModifiedDate
    private LocalDateTime finalEditAt;
    @LastModifiedBy
    private String finalEditBy;

    @OneToMany(fetch = FetchType.LAZY)
    private List<Order> orderList;
}
