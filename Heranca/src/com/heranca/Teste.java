package com.heranca;

public class Teste {
	public static void main(String[] args) {
		
		Animal animal = new Animal();
		animal.setAlimenta("Todo animal se alimenta");
		animal.setLocomove("Todo animal se locomove");
		
		Cachorro cachorro = new Cachorro();
		cachorro.setAlimenta("Cachorro come ra��o de cachorro");
		cachorro.setLocomove("Cachorro se locomove");
		cachorro.setLatido("Cachorro late");
		
		Animal poodle = new Cachorro();
		poodle.setAlimenta("Poodle come ra��o de cachorro");
		poodle.setLocomove("Poodle tem 4 patas");
	}
}
