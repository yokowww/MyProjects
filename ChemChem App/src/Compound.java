
public class Compound {
	
	String name, formula;
	double weight;
	
	// Common compunds
	public Compound(String name, String formula, double weight) {
		super();
		this.name = name;
		this.formula = formula;
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Compound [name=" + name + ", formula=" + formula + ", weight=" + weight + "]";
	}
	
	
	
	
}
