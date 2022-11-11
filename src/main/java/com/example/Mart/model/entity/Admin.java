package com.example.Mart.model.entity;

import lombok.*;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
@EntityListeners(AuditingEntityListener.class)
public class Admin {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer admId;
    private String account;
    private String password;
    private Integer admGrade;
    @LastModifiedDate
    private LocalDateTime finalEditAt;
    @LastModifiedBy
    private String finalEditBy;

}
