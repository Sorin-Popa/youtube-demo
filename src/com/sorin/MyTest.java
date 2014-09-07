package com.sorin;

 
import java.util.ArrayList;
import java.util.List;

public class MyTest {
	 
	
	//private  static  StringBuffer CONSTANT_BUFFER = new StringBuffer("Hello");
	public static void main(String[] args) {
		MyTest x = new MyTest(); 
		A[] tab = new A[3];
		 tab[0] = x.new A();
		 tab[1] = x.new B();
		 tab[2] = x.new C();
		 
		 for (int i = 0; i<tab.length; i++){
			 tab[i].f();
		 }
		
		 
	}
	
	class A{
		 
		public   void f(){
			System.out.println("A buffer "  );
		 
	}}
	
	class C extends B{
		 
		public   void   f(){
			System.out.println("C buffer " );
		}
	}
	
	class B extends A{
		 
		public   void   f(){
			System.out.println("B buffer " );
		}
	}
		 
}
