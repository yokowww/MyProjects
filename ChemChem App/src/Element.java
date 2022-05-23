
public class Element {
	
	// info from https://www.ptable.com/
	
	String name, symbol, state;		//state = solid, liquid, gas or unknown
	int atomicNumber, group, period, outermostElectrons;		//atomicNumber = numOfElectrons
	double weight;
	
	public Element(String name, String symbol, String state, int atomicNumber, int group, int period,
			int outermostElectrons, double weight) {
		super();
		this.name = name;
		this.symbol = symbol;
		this.state = state;
		this.atomicNumber = atomicNumber;
		this.group = group;
		this.period = period;
		this.outermostElectrons = outermostElectrons;
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Element [name=" + name + ", symbol=" + symbol + ", state=" + state + ", atomicNumber=" + atomicNumber
				+ ", group=" + group + ", period=" + period + ", outermostElectrons=" + outermostElectrons + ", weight="
				+ weight + "]";
	}

	public String getName() 			{	return name;				}
	public String getSymbol() 			{	return symbol;				}
	public String getState() 			{	return state;				}
	public int getAtomicNumber() 			{	return atomicNumber;			}
	public int getGroup() 				{	return group;				}
	public int getPeriod() 				{	return period;				}
	public int getOutermostElectrons() 		{	return outermostElectrons;		}
	public double getWeight() 			{	return weight;				}
	
	
	
	
}
