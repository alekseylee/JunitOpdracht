package org.example;

import org.example.exceptions.NotCorrectFormatException;

public class Account {

    private String accountNumber;
    public Account(String accountNumber) {
        validateAccountNumber(accountNumber);
        this.accountNumber = accountNumber;
    }

    public void validateAccountNumber(String accountNumber) {
        if (!accountNumber.matches("\\d{3}-\\d{7}-\\d{2}")) {
            throw new NotCorrectFormatException("Your input is not correct format");
        }

        int checksum = Integer.parseInt(accountNumber.substring(0, 3) + accountNumber.substring(4, 11)) % 97;
        if (checksum != Integer.parseInt(accountNumber.substring(12))) {
            throw new NotCorrectFormatException("Incorrect account number.");
        }
    }

      public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
}

