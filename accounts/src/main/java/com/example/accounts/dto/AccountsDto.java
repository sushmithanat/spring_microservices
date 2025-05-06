package com.example.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Schema(
        name = "Accounts",
        description = "Schema to hold Account Details"
)
@Data
public class AccountsDto {

    @Schema(
            description = "Account Number of Browns Bank account", example = "3454433243"
    )
    @NotEmpty(message = "Account Number can't be null or empty")
    @Pattern(regexp = "(^$|[0-9]{10})", message = "Account Number must be 10 digits")
    private Long accountNumber;

    @Schema(
            description = "Account type of Browns Bank account", example = "Savings"
    )
    @NotEmpty(message = "Account Type can't be null or empty")
    private String accountType;

    @Schema(
            description = "Browns Bank branch address", example = "123 NewYork"
    )
    @NotEmpty(message = "Branch Address can't be null or empty")
    private String branchAddress;
}
