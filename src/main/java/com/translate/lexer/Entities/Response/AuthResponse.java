package com.translate.lexer.Entities.Response;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AuthResponse {
    String name;
    String userName;
    String email;
    String token;
    boolean redirect;
    long userId;
    String EmployeeCode;
    String CompanyCode;
    long rol;
    List<String> operations;
}
