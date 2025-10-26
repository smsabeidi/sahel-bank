package com.sahelbank.Sahel_Bank.utils;

import java.security.SecureRandom;

public class AccountNumber {

    public static final String ACCOUNT_EXIST_CODE = "001";
    public static final String ACCOUNT_EXIST_MESSAGE = "This user already have an account";
    public static final String ACCOUNT_CREATION_SUCCESS = "002";
    public static final String ACCOUNT_CREATION_MESSAGE = "Account created successfully";



    public static String  generateAccountNumber(){

        /**
         * Patter of the account number : 8104 + random sixDigit numbers.
         * sample:  8104123456
         */
         final int BASE = 8104;
         final int MIN = 100000;
         final int MAX = 999999;
         final SecureRandom random = new SecureRandom();

        // now generate a random number between min and max - six digit
        String base = String.valueOf(BASE);
        int randomNumber = random.nextInt(MAX - MIN + 1) + MIN;
        String ran = String.valueOf(randomNumber);
        StringBuilder sb = new StringBuilder();
        return sb.append(base).append(ran).toString();


    }

}
