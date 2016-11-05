package org.hfpd.duck;

public class MallardDuck extends Duck{
	public MallardDuck(){
		flyBehavior = new FlyWithWings();
	}
	
	public void display(){
		System.out.println("I'm a Mallard duck");
	}
}