import java.util.Arrays;

public class Auto {
	private static final int MAX_PACKS = 3;
	
	private String tipus;  //type of the car
	private String color;
	private double burden;
	
	private Packs[] packages; 

	public Auto(String tipus, String color, double burden) {
		super();
		this.tipus = tipus;
		this.color = color;
		this.burden = burden;
		this.packages = new Packs[MAX_PACKS];
	}
	
	
	//Calculate the total weight
	private double totalWeight() {
		double sum = 0;
		
		for (Packs cs: packages) {
			if(cs != null) {
				sum += cs.getWeight();
			}
		}
		return sum;
	}
	
	//pick up the packages
	public boolean pickUp(Packs packs) {
		double weight = totalWeight() + packs.getWeight();
		
		if(weight>burden) {
			System.out.println("Too much weight for the car");
			return false;
		}
		
		for(int i = 0; i<packages.length;i++) {
			if(packages[i]== null) {
				packages[i]= packs;
				return true;
			}
		}
		
		return false;
	}
	
	//unpack packeges
	public void unPack() {
		Arrays.fill(packages, null);
	}
	

	public String getTipus() {
		return tipus;
	}

	public void setTipus(String tipus) {
		this.tipus = tipus;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getBurden() {
		return burden;
	}

	public void setBurden(double burden) {
		this.burden = burden;
	}

	public Packs[] getPackages() {
		return packages;
	}

	public void setPackages(Packs[] packages) {
		this.packages = packages;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder(tipus + " " + color + " " + burden + 
				System.lineSeparator());
		sb.append("Delivered packages: ").append(System.lineSeparator());
		
		for(Packs cs: packages) {
			if(cs!=null) {
			sb.append(cs).append(System.lineSeparator());
			}
		}
		
		return sb.toString();
	}
	
	
}
