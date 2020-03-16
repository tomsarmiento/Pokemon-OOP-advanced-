package com.codingdojo.pokemon;

public abstract class AbstractPokemon implements PokemonInterface {
	public abstract Pokemon createPokemon(String name, int Health, String type);
	public abstract String pokemonInfo(Pokemon pokemon);
}
