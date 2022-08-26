package org.example;

public class PasswordVaildator {

    private static final String WRON_PASSWORD_LENGTH_EXCEPTION_MESSAGE = "비밀번호는 최소 12자 이상이여야 한다";

    public static void validate(String password) {
        int length = password.length();
        if(length < 8 || length > 12 ){
            throw new IllegalArgumentException(WRON_PASSWORD_LENGTH_EXCEPTION_MESSAGE);
        }

    }
}
