package org.example;

import org.example.exceptions.NotCorrectFormatException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AccountTest {

    @Test
    public void testValidAccountNumber() {
        String accountNumber = "123-4567890-92";
        Account account = new Account(accountNumber);
        Assertions.assertEquals(accountNumber, account.getAccountNumber());
    }

    @Test
    public void testInvalidAccountNumberFormat() {
        String accountNumber = "123456789012";
        Assertions.assertThrows(NotCorrectFormatException.class, () -> new Account(accountNumber));
    }

    @Test
    public void testInvalidAccountNumberChecksum() {
        String accountNumber = "123-4567890-11";
        Assertions.assertThrows(NotCorrectFormatException.class, () -> new Account(accountNumber));
    }
}
