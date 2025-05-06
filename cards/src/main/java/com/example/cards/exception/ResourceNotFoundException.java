package com.example.cards.exception;

public class ResourceNotFoundException extends RuntimeException{
    public ResourceNotFoundException(String resourceName, String fieldName, String fieldValue){
        super(String.format("%s not found for given %s: %s", resourceName, fieldName, fieldValue));
    }
}
