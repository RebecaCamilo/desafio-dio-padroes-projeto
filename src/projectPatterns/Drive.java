package projectPatterns;

import projectPatterns.singleton.SingletonEager;
import projectPatterns.singleton.SingletonLazy;
import projectPatterns.singleton.SingletonLazyHolder;

public class Drive {

	public static void main(String[] args) {

//		SingletonLazy lazy = new SingletonLazy(); <- não funciona pois seu construtor é private!
		SingletonLazy lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);
		lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);
		lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);

		SingletonEager eager = SingletonEager.getInstancia();
		System.out.println(eager);
		eager = SingletonEager.getInstancia();
		System.out.println(eager);
		
		SingletonLazyHolder holder = SingletonLazyHolder.getInstancia();
		System.out.println(holder);
		holder = SingletonLazyHolder.getInstancia();
		System.out.println(holder);
		
		// Sempre guardam o mesmo endereço de memoria
		
	}

}


/*
 * PADRÕES DE PROJETO
 * 
 * Singleton <Padrão Criacional> Permitir a criação d euma unica instancia de
 * classe e fornecer um modo para recupera-la.
 * 
 * Strategy <Padrão Comportamental> Simplificar a variação de algoritmos para a
 * resolução de um mesmo problema.
 * 
 * Facade <Padrão Estrutural> Prover uma interface que reduza a complexidade nas
 * integrações com subsistemas.
 * 
 */