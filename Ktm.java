package org.bike;

public class Ktm extends Bike {

	@Override
	public void cost() {
		// TODO Auto-generated method stub
		System.out.println("KTM COST ");
		
	}

	@Override
	public void speed() {
		// TODO Auto-generated method stub
	System.out.println("KTM Speed ");
	}
	public static void main(String[] args) {
		Ktm c=new Ktm();
		c.cost();
		c.speed();
	}
	

}
