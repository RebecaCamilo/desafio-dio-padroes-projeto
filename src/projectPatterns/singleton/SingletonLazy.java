package projectPatterns.singleton;

/**
 * Singleton <Padr�o Criacional> 
 * Permitir a cria��o d euma unica instancia de classe e fornecer um modo para recupera-la.
 * @Author techTeacherDio
*/

public class SingletonLazy {
	
	private static SingletonLazy instancia;
	
	private SingletonLazy() {
		super();
	}
	
	public static SingletonLazy getInstancia() {
		if (instancia == null)
			instancia = new SingletonLazy();
		return instancia;
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