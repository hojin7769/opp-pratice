package org.example;

public class CorrentFixedPasswordGenerator implements PasswordGenerator{

    @Override
    public String generatePassword() {
        return "abcdefgh";
    }
}
