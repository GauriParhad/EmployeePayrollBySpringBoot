package com.bridgelabz.Employeepayroll.dto;


import lombok.Data;

@Data
public class ResponseDto {
    private String message;
    private Object data;

    public ResponseDto(String message, Object empData) {
        this.message = message;
        data = empData;
    }

}
