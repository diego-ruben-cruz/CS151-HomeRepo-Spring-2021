
public class ExtraTopping implements PokeBowl{
	private static final double price = 2.50;
	private String name;
	private PokeBowl originBowl;

	public ExtraTopping(PokeBowl inputBowl, String inputName) {
		this.name = inputName;
		this.originBowl = inputBowl;
	}
	
	@Override
	public double getPrice(){
		return originBowl.getPrice() + ExtraTopping.price;
	}

	@Override
	public String getDescription() {
		return originBowl.getDescription() + " + extra " + this.name;
	}
}
