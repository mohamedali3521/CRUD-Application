package com.crud.mohamed.fullstack_backend.exception;

public class UserNotFoundException extends RuntimeException{
    public UserNotFoundException(Long id)
    {
        super("the user with this id is not found "+id);
    }
}
