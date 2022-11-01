
public class Ember {
	private String name;
	private double skill;
	private Packs packForDelivery;
	
	
	public Ember(String name, double skill) {
		super();
		this.name = name;
		this.skill = skill;
	}

	public boolean isCharged(Packs packs) {
		if(packForDelivery != null) {
			System.out.println("His hands are full");
			return false;
		}
		if (skill * 10 < packs.getWeight()) {
			System.out.println("Too heavy for him");
			return false;
		}
		packForDelivery = packs;
		return true;
	}
	
	public void lerak() {
		packForDelivery = null;
	}

	@Override
	public String toString() {
		return "Ember [name=" + name + ", Skill=" + skill + ", Package for delivery=" + packForDelivery + "]";
	}
	
	
	
	
}
