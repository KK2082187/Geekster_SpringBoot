package com.geekster.Stock.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table
public class Stock {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer stockId;
    @Column(unique = true)
    private String stockName;
    private Double stockPrice;
    private Integer stockOwnerCount;
    private String stockType;
    private Double stockMarketCap;
    private LocalDateTime stockBirthTimeStamp;

}
