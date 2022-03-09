package projectPatterns.strategy;

public class Robo {
	
	private Comportamento strategyComportamental;

	public void setStrategyComportamental(Comportamento strategyComportamental) {
		this.strategyComportamental = strategyComportamental;
	}
	
	public void mover() {
		strategyComportamental.mover();
	}
	

}
