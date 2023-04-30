package com.geekster.Job.Model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table
public class JobModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @NotBlank
    @Column(unique = true)
    private String title;
    private String description;
    private String location;
    private Double salary;
    @NotNull
    private String companyName;
    private String employerName;
    @Enumerated(EnumType.STRING)
    private JobType jobType;

    //private LocalDate appliedDate;
}
