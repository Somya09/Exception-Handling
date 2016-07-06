package com.niit.exception;

public class UserDAO {
public void addUser() throws UserExistException
{
	throw new UserExistException();
}
}
