package com.sahelbank.Sahel_Bank.service.impl;

import com.sahelbank.Sahel_Bank.dto.BankResponseDTO;
import com.sahelbank.Sahel_Bank.dto.UserRequestDTO;

public interface UserService {
    BankResponseDTO createAccount(UserRequestDTO userRequestDTO);
}
