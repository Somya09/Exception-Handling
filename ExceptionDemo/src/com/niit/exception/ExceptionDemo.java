package com.niit.exception;

public class ExceptionDemo {
public double divide(int x,int y){
	return x/y;
}
public static void main(String args[]){
	ExceptionDemo e=new ExceptionDemo();
	System.out.println(e.divide(10, 0));
	
}
}
