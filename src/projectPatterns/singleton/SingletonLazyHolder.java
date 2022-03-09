package projectPatterns.singleton;

/**
 * Singleton LazyHolder
 * A classe Holder tem a função de encapsular a instancia.
 * É Thread Safe
 * @Author techTeacherDio
*/

public class SingletonLazyHolder {
	
	private static class Holder {
		public static SingletonLazyHolder instancia = new SingletonLazyHolder();
	}
	
	private SingletonLazyHolder() {
		super();
	}
	
	public static SingletonLazyHolder getInstancia() {
		return Holder.instancia;
	}

}
