
public class Snake extends Animal{

	private boolean isPoisonus;
	
	public Snake (String latinName, boolean isPoisonus){
		super (latinName);
		this.isPoisonus = isPoisonus;
	}
  public String getInfo(){
	  String info = "";
	  if(isPoisonus){
		  
		  info = "A snake called: " + getFriendlyName() + ", in latin:"
          + getLatinName() + " and is poisonus";           
	  }else{
		  info = "A snake called: " + getFriendlyName() + ", in latin: " 
				  + getLatinName() + " and is not poisonus";
	  }
  
      return info;
  
  }
public boolean isPoisonous(){
	return isPoisonus;
}
}
