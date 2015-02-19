
public class Dog extends Mammal{
	private boolean isStupid;
	
	//Constructor #1
	public Dog (String latinName, int gestationTime, boolean isStupid){
		super (latinName, gestationTime);
		this.isStupid = isStupid;
	}
   // Constructor #2
   public Dog (String latinName, int gestationTime, boolean isStupid, String friendlyName){
	   super (latinName, gestationTime);
	   this.isStupid = isStupid;
	   setFriendlyName(friendlyName);
	   
   }





// Function
public boolean isStupid() {
	return isStupid;
}

public String getInfo() {
	 String info ="";
	 if (isStupid){
		 info = "A dog called: " + getFriendlyName() + ", in latin: " + getLatinName() +
				 " which has a gestation time on " + getGestationTime() + " months and is not very intelligent";
	 }else{
		 info = "A dog called: " + getFriendlyName() + ", in latin: " + getLatinName() + 
				 " which has a gestation time on " + getGestationTime() + " months nad is intelligent";
		 
	 }
	 return info;
}

}