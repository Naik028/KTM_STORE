package ktm_shop;

public class Duke200 extends KtmBikes implements Purchase{
	int cost=0;
	double displacement=0.0;
	double mileage=0.0;
	double fuelCapacity=0.0;
	String emission=null;
	String tyre=null;
	int gearbox=0;
	
	public Duke200(int cost, double displacement, double mileage, double fuelCapacity, String emission, String tyre,
			int gearbox) {
		super();
		this.cost = cost;
		this.displacement = displacement;
		this.mileage = mileage;
		this.fuelCapacity = fuelCapacity;
		this.emission = emission;
		this.tyre = tyre;
		this.gearbox = gearbox;
	}

	@Override
	public String toString() {
		return "Duke200 \ncost=" + cost + " \ndisplacement=" + displacement + " \nmileage=" + mileage + " \nfuelCapacity="
				+ fuelCapacity + " \nemission=" + emission + " \ntyre=" + tyre + " \ngearbox=" + gearbox ;
	}
	
	public void ProcessTransaction(double cashOnHand,double loanAmount) {
		System.out.println("Sir you have selected Duke200");
		if(cashOnHand>=this.cost) {
			System.out.println("You have "+cashOnHand+" on hand and you can purcahse this bike");
		}
		else {
			System.out.println("You dont have enough money...The cost of the bike is "+this.cost);
			loanAmount=cashOnHand-this.cost;
			loanAmount=Math.abs(cashOnHand-this.cost);
			System.out.println("You have to pay "+loanAmount+" more to purchase this bike");
		}
		
		
	}

	
	
	
}
