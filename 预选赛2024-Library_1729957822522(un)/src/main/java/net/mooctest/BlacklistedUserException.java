package net.mooctest;

public class BlacklistedUserException extends Exception{
        public BlacklistedUserException(String message) {
            super(message);
        }
    }
