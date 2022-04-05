package com.app.fruits;

public class Apple extends Fruit 
{	public Apple()
	{
	this.name="Apple";
	this.color="Red";
	this.weight=5;
	this.isFresh=true;
	
	}
	@Override
	public String getStateofFruit()
	{
		return super.getStateofFruit();
	}
	@Override
	public String taste(){
		return "sweet and sour";	
	}
}
