
public class Bike {

	private String color = "default color";
	private int price;
	private int size = 8;
	public static int nbrOfBikes;
	
	
	/** This here creates a bike with these variables   */
	
	//Constructor
	public Bike(String _Color, int _Size) {
		nbrOfBikes++;

		// sets colors if true
				boolean correctColor = false;
				for (int i = 0; i < Constants.COLOR.length; i++) {
					if (_Color.equals(Constants.COLOR[i]))
						correctColor = true;
				}
				if (correctColor == true) {
					this.color = _Color;
				} else {
					System.out.println("Not a good color");
				}

				if (_Size < Constants.MIN_SIZE) {

					System.out.println("This bike is too small");
				} else {
					if (_Size > Constants.MAX_SIZE) {

						System.out.println("This bike is too big");
						this.size = 26;
					} else {
						this.size = _Size;
					}

				}

	}

	
	// Constructor2
	
	/** Check if color is true*/
	public Bike(String _Color, int _Size, int _Price) {
		nbrOfBikes++;
		// sets color if true
		boolean correctColor = false;
		for (int i = 0; i < Constants.COLOR.length; i++) {
			if (_Color.equals(Constants.COLOR[i]))
				correctColor = true;
		}
		if (correctColor == true) {
			this.color = _Color;
		} else {
			System.out.println("fel f‰rg");
		}

		//checks if 8<size> 28
		/** check if size is 8 <size> 28 */
		if (_Size < Constants.MIN_SIZE) {

			System.out.println("This bike is too small");
		} else {
			if (_Size > Constants.MAX_SIZE) {

				System.out.println("This bike is too big");
				this.size = 26;
			} else {
				this.size = _Size;
			}

		}
		
		//kollar ifall 8<price> 28
		/** check if sise is 8<price> 28 */
		if (_Price < Constants.MIN_PRICE) {

			System.out.println("För billig");
		} else {
			if (_Price > Constants.MAX_PRICE) {

				System.out.println("För dyrt");
				this.price = Constants.MAX_PRICE ;
			} else {
				this.price = _Price;
			}

		}
		
		

		

	}

	public String getColor() {
		return color;
	}

	public int getSize() {
		return size;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {

	}

}


