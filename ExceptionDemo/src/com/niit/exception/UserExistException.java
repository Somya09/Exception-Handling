package com.niit.exception;

public class UserExistException extends Exception{
public UserExistException()
{
	super("User already exist with this user details");
}
}
