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


