package com.heranca;

public class Teste {
	public static void main(String[] args) {
		
		Animal animal = new Animal();
		animal.setAlimenta("Todo animal se alimenta");
		animal.setLocomove("Todo animal se locomove");
		
		Cachorro cachorro = new Cachorro();
		cachorro.setAlimenta("Cachorro come ração de cachorro");
		cachorro.setLocomove("Cachorro se locomove");
		cachorro.setLatido("Cachorro late");
		
		Animal poodle = new Cachorro();
		poodle.setAlimenta("Poodle come ração de cachorro");
		poodle.setLocomove("Poodle tem 4 patas");
	}
}
