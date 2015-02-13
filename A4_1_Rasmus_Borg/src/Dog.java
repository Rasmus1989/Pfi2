/*																																											//Klassen
Rasmus Nilsson Borg
11/02-15
IDK14
*/


//Klassen DOG
public class Dog {

	public String name;
	
    public String dog;
	
	//Constructor
	public Dog(String name) {
		this.name = name;
		
		System.out.println("Dog created " + name);
		if(name.length()>3){
			this.dog = name;
		}else{
			System.out.println("Name too short... ");
		}
	}
	
    //Function
    public void setName(String namn){
    	namn = name;
    }
	 
    //Function
	public String getName(){
		return name;
	}


   //Function
   public String getInfo(){
	   return name;
   }


}

	
	
	
	

