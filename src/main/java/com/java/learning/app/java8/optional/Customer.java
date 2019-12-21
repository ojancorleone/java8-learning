package com.java.learning.app.java8.optional;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Customer {
    private Long id;
    private String name;
    private String email;
    private Date dateOfBirth;
}
