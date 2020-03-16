package com.codingdojo.pokemon;

public class PokemonTest {

	public static void main(String[] args) {
		Pokemon Pikachu = new Pokemon("Pikachu", 3, "Hielo");
		Pokemon Pidgeoto = new Pokemon("Pidgeoto", 3, "Fuego");
		
		Pikachu.attackPokemon(Pidgeoto);
	}

}
