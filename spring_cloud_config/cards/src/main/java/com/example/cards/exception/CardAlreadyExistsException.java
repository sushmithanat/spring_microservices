package com.example.cards.exception;

public class CardAlreadyExistsException extends RuntimeException{
    public CardAlreadyExistsException(String message){
        super(message);
    }
}
