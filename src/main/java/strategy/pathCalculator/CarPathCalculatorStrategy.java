package strategy.pathCalculator;

public class CarPathCalculatorStrategy implements PathCalculatorStrategy {
	private static CarPathCalculatorStrategy instance;
	
	private CarPathCalculatorStrategy() {
		
	}
	
	public static CarPathCalculatorStrategy getInstance() {
		if(instance == null) {
			instance = new CarPathCalculatorStrategy();
		}
		return instance;
	}

	@Override
	public void findPath(String source, String destination) {
		// TODO Auto-generated method stub
		System.out.println("Car: "+source+" to "+destination);
	}
	
}
