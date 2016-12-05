package latam.qa.testing.service;

public class Number {

    public String stringCalc(int x, int y){
    	return String.format("%d,%d",x,y);
    }
	
	public int dividirCalc(int dividendo, int divisor){
		int result;
		result = dividendo/divisor;
		return result;
			
	
	}
}
