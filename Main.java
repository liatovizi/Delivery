
public class Main {

	public static void main(String[] args) {
		Packs cs1 = new Packs("aaa", 4.5, true);
		Packs cs2 = new Packs("bbb", 3.3, true);
		Packs cs3 = new Packs("ccc", 2.2, false);
		Packs cs4 = new Packs("ddd", 5.5, true);
		Packs cs5 = new Packs("eee", 1.2, false);
//		System.out.println(cs5);
		
		Auto a1 = new Auto("fff", "red", 9.2);
		System.out.println(a1);
		
		a1.pickUp(cs1);
		a1.pickUp(cs2);
		System.out.println(a1);
		a1.pickUp(cs5);
		System.out.println(a1);
		a1.pickUp(cs4);
		System.out.println(a1);
		
		a1.unPack();
		System.out.println(a1);
		
		System.out.println("-------------");
		
		Ember e1 = new Ember("GG", 0.4);
		e1.isCharged(cs5);
		System.out.println(e1);
		
		DelGuy d1 = new DelGuy("JJ", 0.3, "Delivery LTD", "Lada", "blue",5.0);
		d1.isCharged(cs5);
		d1.isCharged(cs1);
		System.out.println(d1);

	}

}
