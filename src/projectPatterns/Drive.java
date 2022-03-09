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

//		Singleton <Padr�o Criacional> Permitir a cria��o d euma unica instancia de classe e fornecer um modo para recupera-la.
		
//		SingletonLazy lazy = new SingletonLazy(); <- n�o funciona pois seu construtor � private!
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
		// Sempre guardam o mesmo endere�o de memoria
		
		
		
		
//		Strategy <Padr�o Comportamental> Simplificar a varia��o de algoritmos para a resolu��o de um mesmo problema.
		
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
		
		
		
//		Facade <Padr�o Estrutural> Prover uma interface que reduza a complexidade nas integra��es com subsistemas.
		
		Facade facade =  new Facade();
		facade.migrarCliente("Rebeca", "019283");
		
	}

}


/*
 * PADR�ES DE PROJETO
 * 
 * Singleton <Padr�o Criacional> Permitir a cria��o d euma unica instancia de
 * classe e fornecer um modo para recupera-la.
 * 
 * Strategy <Padr�o Comportamental> Simplificar a varia��o de algoritmos para a
 * resolu��o de um mesmo problema.
 * 
 * Facade <Padr�o Estrutural> Prover uma interface que reduza a complexidade nas
 * integra��es com subsistemas.
 * 
 */