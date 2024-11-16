package net.mooctest;

public class InsufficientCreditException extends Exception{
        public InsufficientCreditException(String message) {
            super(message);
        }
    }
