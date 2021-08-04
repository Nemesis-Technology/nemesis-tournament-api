package com.nemesisTechnology.tournamentGenerator.exceptions;

public class ItemNotFoundException extends RuntimeException {
    public ItemNotFoundException(String item) {
        super(item + " not found");
    }
}
