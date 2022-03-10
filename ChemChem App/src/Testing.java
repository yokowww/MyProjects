
public class Testing {

	static double mol;
	final static float AVOGADRO = (float) (6.0221367 * Math.pow(10, 23));
	static float ans;
	
	// moles in a mass of the element * (avogadros/1mol)
	
	public static void main(String[] args) {
		
		mol = 45.981;
		
		ans = (float) (mol * (1/12.0107) * (AVOGADRO/1));
		
		System.out.println(ans);
		
	}
	
}
