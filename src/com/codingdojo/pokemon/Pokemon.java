package com.codingdojo.pokemon;

public class Pokemon {
	//Constructor
	public Pokemon(String name, int health, String type) {
		this.name = name;
		this.health = health;
		this.type = type;
		count++;
	}
	//Attributes
	private String name;
	private int health;
	private String type;
	private static int count;
	//getters
	public String getName() {
		return name;
	}
	public int getHealth() {
		return health;
	}
	public String getType() {
		return type;
	}
	public static int getCount() {
		return count;
	}
	
	//methods 
	public void attackPokemon(Object pokemon) {
		pokemon.health-=10;
	}
}
