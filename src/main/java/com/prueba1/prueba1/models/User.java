package com.prueba1.prueba1.models;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;
@Data
@Builder
public class User {

    private Long id;
    private String fullName;
    private LocalDate birthDay;
    private String email;
}
