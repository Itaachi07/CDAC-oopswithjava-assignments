package com.app.fruits;

public class Mango extends Fruit
{
	public Mango()
	{
	this.name="Mango";
	this.color="Dark Yellow";
	this.weight=7;
	this.isFresh=true;
	
	}
	@Override
	public String getStateofFruit()
	{
		return super.getStateofFruit();
	}
	@Override
	public String taste(){
		return "sweet" ;	
	}
}
