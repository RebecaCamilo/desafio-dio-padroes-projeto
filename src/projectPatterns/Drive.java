package projectPatterns;

import projectPatterns.facade.Facade;
import projectPatterns.singleton.SingletonEager;
import projectPatterns.singleton.SingletonLazy;
import projectPatterns.singleton.SingletonLazyHolder;
import projectPatterns.strategy.Comportamento;
import projectPatterns.strategy.ComportamentoAgressivo;
import projectPatterns.strategy.ComportamentoDefensivo;
import projectPatterns.strategy.ComportamentoNormal;
import projectPatterns.strategy.Robo;

public class Drive {

	public static void main(String[] args) {

//		Singleton <Padrão Criacional> Permitir a criação d euma unica instancia de classe e fornecer um modo para recupera-la.
		
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
		
		
		
		
//		Strategy <Padrão Comportamental> Simplificar a variação de algoritmos para a resolução de um mesmo problema.
		
		Comportamento normal = new ComportamentoNormal();
		Comportamento agressivo = new ComportamentoAgressivo();
		Comportamento defensivo = new ComportamentoDefensivo();
		
		Robo robo = new Robo();
		
		robo.setStrategyComportamental(normal);
		robo.mover();
		robo.mover();
		robo.setStrategyComportamental(agressivo);
		robo.mover();
		robo.setStrategyComportamental(defensivo);
		robo.mover();
		robo.mover();
		robo.mover();
		
		
		
//		Facade <Padrão Estrutural> Prover uma interface que reduza a complexidade nas integrações com subsistemas.
		
		Facade facade =  new Facade();
		facade.migrarCliente("Rebeca", "019283");
		
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