package ru.netology.data;

import lombok.Value;

public class DataHelper {
    private DataHelper() {
    }

    @Value
    public static class AuthInfo {
        private String login;
        private String password;
    }

    public static AuthInfo getAuthInfo() {
        return new AuthInfo("vasya", "qwerty123");
    }

    public static AuthInfo getOtherAuthInfo(AuthInfo original) {
        return new AuthInfo("petya", "123qwerty");
    }

    @Value
    public static class VerificationCode {
        private String code;
    }

    public static VerificationCode getVerificationCodeFor(AuthInfo authInfo) {
        return new VerificationCode("12345");
    }

    @Value
    public static class Card1Info {
        private String number;
    }

    public static Card1Info getCard1Info() {
        return new Card1Info("5559 0000 0000 0001");
    }

    @Value
    public static class Card2Info {
        private String number;
    }

    public static Card1Info getCard2Info() {
        return new Card1Info("5559 0000 0000 0002");
    }

    @Value
    public static class AmountValue {
        private String amountValue;
    }

}
