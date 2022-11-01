//delivery guy
public final class DelGuy extends Ember{
	private String company;
	private final Auto cartype;
	
	
	public DelGuy(String name, double skill, String company, String atipus, String acolor, double ateher) {
		super(name, skill);
		this.company = company;
		cartype = new Auto(atipus, acolor, ateher);
	}

	@Override
	public boolean isCharged(Packs packs) {
		boolean successfull = cartype.pickUp(packs);
		if(successfull) {
			return true;
		} 
		return super.isCharged(packs);
	}
	
	public void kipakol() {
		lerak();
		cartype.unPack();
	}
	
	@Override
	public String toString() {
		return super.toString()+ "company: " + company + System.lineSeparator() + cartype;
	}
	
	
	
	
	

}
