package com.geekster.University.Event.Management.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table
public class Student {

    //@GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Integer studentId;
    private String firstName;
    private String lastName;
    private Integer age;
    @Enumerated(EnumType.STRING)
    private Department department;
}
