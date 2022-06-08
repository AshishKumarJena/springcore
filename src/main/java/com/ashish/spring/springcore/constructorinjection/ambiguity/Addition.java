package com.ashish.spring.springcore.constructorinjection.ambiguity;

public class Addition {
	
	Addition(int a, int b){
		System.out.println("Inside constructor INT");
	}
	
	Addition(double a, double b){
		System.out.println("Inside constructor Double");
	}
	
	Addition(String a, String b){
		System.out.println("Inside constructor String");
	}

}
