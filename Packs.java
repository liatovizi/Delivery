//class for the packages

public class Packs { 
	private String stamp;
	private double weight;  
	private boolean fragile;
	
	
	public Packs(String stamp, double weight, boolean fragile) {
		super();
		this.stamp = stamp;
		this.weight = weight;
		this.fragile = fragile;
	}


	public String getStamp() {
		return stamp;
	}


	public void setStamp(String stamp) {
		this.stamp = stamp;
	}


	public double getWeight() {
		return weight;
	}


	public void setWeight(double weight) {
		this.weight = weight;
	}


	public boolean isFragile() {
		return fragile;
	}


	public void setFragile(boolean fragile) {
		this.fragile = fragile;
	}


	@Override
	public String toString() {
		return "Packs [Stamp=" + stamp + ", weight=" + weight + " kg, and " + (fragile?"Fragile": " not fragile") + "]";
	}


	
	
	
	
	
	
}
