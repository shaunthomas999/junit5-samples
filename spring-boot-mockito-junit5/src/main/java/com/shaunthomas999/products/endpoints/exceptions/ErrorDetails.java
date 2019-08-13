package com.shaunthomas999.products.endpoints.exceptions;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

import java.util.Date;

@Getter
@AllArgsConstructor
public class ErrorDetails {
  private Date timestamp;
  private String message;
  private String details;
  private HttpStatus httpStatusCode;
}
