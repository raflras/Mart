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
@ToString(exclude = {"user","product"})
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer ordId;
    private LocalDateTime ordDate;
    private Integer totalQty;
    private Integer totalPrice;
    @LastModifiedDate
    private LocalDateTime finalEditAt;
    @LastModifiedBy
    private String finalEditBy;

    @ManyToOne
    private User user;

    @ManyToOne
    private Product product;
}
