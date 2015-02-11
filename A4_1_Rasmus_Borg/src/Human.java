/*																																											//Klassen
Rasmus Nilsson Borg
11/02-15
IDK14
*/
public class Human {

	public Dog dog;
	public String name;
	
	//Konstruktor
	public Human (String name){
		this.name = name;
		System.out.println("Human created! " + name);
		if(name.length()>3){
			this.name = name;
		}else{
			System.out.println("Name too short... ");
		}
	}

 
   public String getName(){
	   return name;
   }
   
   
   public void buyDog(Dog dog){
	   this.dog = dog;
	
   
	   
   }
  public String getInfo(){
	  return name;
  }

  
  
  
  
}
