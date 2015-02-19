import java.util.ArrayList;


public class BikeStore {

	//instance variables
		private ArrayList <Bike> cyklar = new ArrayList <Bike>();
		
		
		public String getAllBikes() {
			String data="";
			for(int i = 0; i<Bike.nbrOfBikes; i++){
				data=data+"Bike number # "+i+" "+cyklar.get(i).getColor()+", size: " +
			    cyklar.get(i).getSize()+ " ich"+", at the cost of: "+cyklar.get(i).getPrice()+" kr." +"\n";
				
			}
			
			return data;
		}
		
		
		public void addBike(String _Color, String _Size, String _Price) {
			
			cyklar.add(new Bike(_Color, Integer.parseInt(_Size), Integer.parseInt(_Price)));
			
			
			
			
			
		}
			
			
			
			
		}
		




