
public class Cat extends Mammal{

	private int numberOfLives;
	
    public Cat (String latinName, int gestationTime, int numberOfLives){
	super(latinName, gestationTime);
	this.numberOfLives = numberOfLives;
	
}
	
	
	
	
	public int getNumberOfLives() {
		return numberOfLives;
	}

	public void setNumberOfLives(int numberOfLives) {
		this.numberOfLives = numberOfLives;
	}
	
	@Override
	public String getInfo() {
		String info = "A cat called: " + getFriendlyName() + ", in latin: " + getLatinName() + 
				"which has a gestation time on  " + getGestationTime() + " months " + ".and has " 
				+getNumberOfLives() + " lives.";
		return info;
	}
	
	
	
	
	
	
	
	
	
	
	
}
