package com.sahelbank.Sahel_Bank.service.impl;

import com.sahelbank.Sahel_Bank.dto.BankResponseDTO;
import com.sahelbank.Sahel_Bank.dto.UserRequestDTO;
import com.sahelbank.Sahel_Bank.entity.User;
import com.sahelbank.Sahel_Bank.repository.UserRepository;
import com.sahelbank.Sahel_Bank.utils.AccountNumber;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;


@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepository userRepository;
    @Override
    public BankResponseDTO createAccount(UserRequestDTO userRequestDTO) {

        /**
         * First check if the user already exist.
         * Creating an account is basically saving a new user into the database
         */

        if(userRepository.existsByEmail(userRequestDTO.getEmail())){
             return BankResponseDTO.builder()
                    .responseCode(AccountNumber.ACCOUNT_EXIST_CODE)
                    .responseMessage(AccountNumber.ACCOUNT_EXIST_MESSAGE)
                    .accountInfo(null)
                    .build();

        }

        /**
         * Creating a user if the user does not exist
         */
        User newUser = User.builder()
                .firstName(userRequestDTO.getFirstName())
                .lastName(userRequestDTO.getLastName())
                .dob(userRequestDTO.getDob())
                .gender(userRequestDTO.getGender())
                .occupation(userRequestDTO.getOccupation())
                .nationality(userRequestDTO.getNationality())
                .idNumber(userRequestDTO.getIdNumber())
                .email(userRequestDTO.getEmail())
                .phoneNumber(userRequestDTO.getPhoneNumber())
                .alternativePhone(userRequestDTO.getAlternativePhone())
                .nextOfKing(userRequestDTO.getNextOfKing())
                .accountNumber(AccountNumber.generateAccountNumber())
                .accountBalance(BigDecimal.ZERO)
                .role("CUSTOMER")
                .status("ACTIVE")
                .username(userRequestDTO.getUsername())
                .password(userRequestDTO.getPassword())
                .build();

        User saveUser = userRepository.save(newUser);
        return BankResponseDTO.builder()
                .responseCode(AccountNumber.ACCOUNT_CREATION_SUCCESS)
                .responseMessage(AccountNumber.ACCOUNT_CREATION_MESSAGE)
                .build();
    }

}
