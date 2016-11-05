package org.hfpd.duck;

public abstract class Duck {

	FlyBehavior flyBehavior;
	
	public Duck(){
		
	}
	
	public abstract void display();
	
	public void performFly(){
		flyBehavior.fly();
	}
	
	public void setFlyBehavior(FlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}

	public void swim(){
		System.out.println("All ducks float.");
	}
}
