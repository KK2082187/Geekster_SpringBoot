package com.geekster.Job.Model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Range;

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
   
    @NotNull(message= "salary may not be empty")
    @Range(min=20000)
    private Double salary;
    @Email(message = "Write your email")
    private String companyEmail;
    @NotNull
    private String companyName;
    private String employerName;
    @Enumerated(EnumType.STRING)
    private JobType jobType;

    private LocalDate appliedDate;
}
