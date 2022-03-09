package projectPatterns.singleton;

/**
 * Singleton "apressado"
 * Quando a classe for acionada a instancia ja é atribuída.
 * @Author techTeacherDio
*/

public class SingletonEager {
	
	private static SingletonEager instancia = new SingletonEager();
	
	private SingletonEager() {
		super();
	}
	
	public static SingletonEager getInstancia() {
		return instancia;
	}

}
