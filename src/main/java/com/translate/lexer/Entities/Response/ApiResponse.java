package com.translate.lexer.Entities.Response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ApiResponse<TEntity> {
    boolean success;
    String message;
    TEntity data;
}
