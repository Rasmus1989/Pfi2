import java.util.ArrayList;


public class TestClass {
	
	public static void main (String[] args){
		
		 ArrayList<Animal> zoo = new ArrayList<Animal>();
		
		zoo.add(new Dog ("canis lupus", 4, true));
	    zoo.add(new Dog ("canis lupus", 4, false, "Rex"));
	    Cat cat = new Cat("lynx lynx", 3, 9);
	    cat.setFriendlyName("Figaro");
	    zoo.add(cat);
	    zoo.add(new Snake ("boa konstriktor", false));
	    Snake snake = new Snake ("boa", false);
	    snake.setFriendlyName("Ka");
	    zoo.add(snake);
	    
		for (Animal animal : zoo){
			System.out.println(animal.getInfo());
		}
	}

}
