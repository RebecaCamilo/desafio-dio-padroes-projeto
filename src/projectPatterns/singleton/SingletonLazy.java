package projectPatterns.singleton;

/**
 * Singleton <Padrão Criacional> 
 * Permitir a criação d euma unica instancia de classe e fornecer um modo para recupera-la.
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