package com.example.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.*;
import lombok.Data;

@Data
@Schema(
        name = "Customer",
        description = "Schema to hold Customer and Account Details"
)
public class CustomerDto {

    @Schema(
            description = "Name of the Customer",
            example = "John Doe"
    )
    @NotEmpty(message = "Name can't be null or empty")
    @Size(min = 5, max = 30)
    private String name;

    @Schema(
            description = "Email address of the customer", example = "browns@brandon.com"
    )
    @NotEmpty(message = "Email can't be null or empty")
    @Email(message = "Email should be valid")
    private String email;

    @Schema(
            description = "Mobile Number of the customer", example = "9345432123"
    )
    @NotEmpty(message = "Mobile Number can't be null or empty")
    @Pattern(regexp = "(^$|[0-9]{10})", message = "Mobile Number must be 10 digits")
    private String mobileNumber;

    @Schema(
            description = "Account details of the Customer"
    )
    private AccountsDto accountsDto;
}
