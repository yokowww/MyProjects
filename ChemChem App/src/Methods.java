import java.util.Scanner;

public class Methods {
	
	final static float AVOGADRO = (float) (6.0221367 * Math.pow(10, 23));
	
	public Methods(){
		
	}

	static Scanner box = new Scanner(System.in);
	// molar mass of an element
	// how many moles are in 4.50 grams of Ca?
	// = 4.50g Ca * (1 mol Ca / 40.08g Ca) = 0.112g Ca
	
	public void moles(Element e) {
		double grams;
		double result;
		System.out.println("How many grams");
		grams = box.nextDouble();
		
		result = grams * ( 1 / e.weight);			// there is 1 mole of the element in its atomic weight grams
		
		System.out.printf("There are %.3f", result);
		System.out.print("g " + e.symbol + " in " + grams + "g of " + e.name);
	}
	
	public double moless(Element e) {
		double grams;
		double result;
		System.out.println("How many grams");
		grams = box.nextDouble();
		
		result = grams * ( 1 / e.weight);			// there is 1 mole of the element in its atomic weight grams
		
		return result;
	}
	
	public double moles2(Element e) {
		// this method should return the mass of an element
		return e.weight;
	}
	
	// ======================
	public void molarMass(Compound c) {
		System.out.println("The molar mass of " + c.name + " is " + c.weight);
	}
	
	public double massInsideMoles(double moles, double weight) {
		double total;
		total = moles * (weight / 1);
	
		return total;
	}
	// ======================
	
	// finding the number of atoms in a mole (uses AVOGADRO'S number)
	// uses moless method and then multiplied by avogadro's / 1
	public float avogadros(Element e) {
		double moles = moless(e);
		float result;
		result = (float) (moles * (AVOGADRO/1));
		
		return result;
	}
	
	// Empirical formula
		// N = Molecular mass/Empirical formula mass
		// Molecular mass = **g/mole
		// Save for later updates
	
	
	
	
	
	// Implement a method for if the compound is not is not in the app yet and request that they report it
	// so that it can be added as soon as possible
	
	
	
}
