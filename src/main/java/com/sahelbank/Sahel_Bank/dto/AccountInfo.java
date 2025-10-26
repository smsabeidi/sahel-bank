package com.sahelbank.Sahel_Bank.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class AccountInfo {
    private String accountName;
    private String accountNumber;
    private String accountType;
    private String status;


}
