
public class TestKaefig {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// a)
		//TierKaefig<Animal> kaefiga= new TierKaefig<Katze>();
		// b)
		//TierKaefig<Hund> kaefigb= new TierKaefig<Animal>();		
		// c)
		//TierKaefig<?> kaefigc= new TierKaefig<Katze>();
		//kaefigc.setInsasse(new Katze());
		// d)
		TierKaefig kaefigd = new TierKaefig();
		kaefigd.setInsasse(new Hund());

	}

}
