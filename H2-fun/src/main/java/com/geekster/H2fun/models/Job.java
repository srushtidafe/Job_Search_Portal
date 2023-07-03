package com.geekster.H2fun.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table
@Entity
public class Job {
    @Id
    private Integer id;

    @NotBlank
    private String title;

    @NotBlank
    private String description;

    @NotBlank
    private String location;

    @NotNull
    @Min(value = 20000)
    private Double salary;

    @Email
    private String companyEmail;

    @NotBlank
    private String companyName;

    @NotBlank
    private String employerName;

    @Enumerated(EnumType.STRING)
    private JobType jobType;
}
