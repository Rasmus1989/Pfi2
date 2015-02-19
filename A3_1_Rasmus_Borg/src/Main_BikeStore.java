import java.util.ArrayList;

public class Main_BikeStore {

	
	/** create new bikes */
	public static void main(String [] args){// void setup
		
		ArrayList <Bike> bikeList = new ArrayList<Bike>();		
		bikeList.add(new Bike("voilet", 3,5000));
		bikeList.add(new Bike("blue", 8,8000));
		bikeList.add(new Bike("red", 20,3000));
		bikeList.add(new Bike("purple", 2,4000));
		bikeList.add(new Bike("orange", 35,20000));
		bikeList.add(new Bike("green", 20,300000));
		bikeList.add(new Bike("yellow", 25,-1));
		bikeList.add(new Bike("black", 43,4500));
		bikeList.add(new Bike("white", 5,5000));
		bikeList.add(new Bike("red", 30,6000));
		
		
		for(int i = 0; i<10; i++){
			System.out.println("Bike number #"+i+" "+bikeList.get(i).getColor()+
			" size: "+bikeList.get(i).getSize()+" ich"+" price: "+bikeList.get(i).getPrice()+"\n");
		}
    }

}
