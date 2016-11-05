package org.hfpd.duck;

public class DuckSimulator {
	public static void main(String[] args) {
		Duck mallard = new MallardDuck();
		mallard.performFly();
		
		mallard.setFlyBehavior(new FlyNoWay());
		System.out.println("something woring with my wings");
		mallard.performFly();
	}
}
