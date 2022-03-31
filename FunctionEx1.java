package com.functions;

public class FunctionEx1 {

	public static void main(String[] args) {
        System.out.println("I am in main method.");

            message();
            message();
            update(); 
            covid();
            System.out.println("I am  back in main method.");  		
	}
	private static void covid() {
		// TODO Auto-generated method stub
		
	}
	private static void update() {		
        System.out.println("I am in update method.");       
	}
	private static void message() {
        System.out.println("I am in message method.");
	update();	
	}

}
