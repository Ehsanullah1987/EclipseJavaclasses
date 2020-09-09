package com.class30;

public interface Bank {
void haveChecking();
void haveSavings();
}
interface Trustable{
	void trust();
}
class Finance{
	public void financing() {
		System.out.println("Financial transactions must");
	}
}
class BOA extends Finance implements Bank, Trustable{

	@Override
	public void haveChecking() {
		System.out.println("BOA has a checking acccunt");
		
	}

	@Override
	public void haveSavings() {
		System.out.println("BOA has a savings account");
		
	}

	@Override
	public void trust() {
		// TODO Auto-generated method stub
		
	}
	
}
class CapitalOne implements Bank{

	@Override
	public void haveChecking() {
		System.out.println("Capital one has a checnking account");
		
	}

	@Override
	public void haveSavings() {
		System.out.println("BOA has a saving account");
		
	}
	public void trust() {
		System.out.println("You can trust BOA with your money");
	}
}
class CapitalOneChild extends CapitalOne{
	
}
