package com.app.fruits;

public class Orange extends Fruit
{
	public Orange()
	{
	this.name="Orange";
	this.color="Orange";
	this.weight=2;
	this.isFresh=true;
	
	}
	@Override
	public String getStateofFruit()
	{
		return super.getStateofFruit();
	}
	@Override
	public String taste(){
		return "sour";	
	}
}
