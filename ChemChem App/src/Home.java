import java.util.Scanner;
import java.util.concurrent.ConcurrentHashMap;

public class Home {

	public static ConcurrentHashMap<String, Element> elements = new ConcurrentHashMap<String, Element>();
	public static ConcurrentHashMap<String, Compound> compounds = new ConcurrentHashMap<String, Compound>();
	
	static Scanner aye = new Scanner(System.in);
	static Scanner aye2 = new Scanner(System.in);
	static Scanner aye3 = new Scanner(System.in);
	static Scanner aye4 = new Scanner(System.in);
	
	public Home() {
		//============================================================= Adding the elements
		
		addElement(new Element("Hydrogen", "H", "Gas", 1, 1, 1, 1, 1.008));
		addElement(new Element("Helium", "He", "Solid", 2, 18, 1, 2, 4.0026));
		addElement(new Element("Lithium", "Li", "Solid", 3, 1, 2, 1, 6.94));
		addElement(new Element("Beryllium", "Be", "Solid", 4, 2, 2, 2, 9.0122));
		addElement(new Element("Boron", "B", "Solid", 5, 13, 2, 3, 10.81));
		addElement(new Element("Carbon", "C", "Solid", 6, 14, 2, 4, 12.001));
		addElement(new Element("Nitrogen", "N", "Gas", 7, 15, 2, 5, 14.007));
		addElement(new Element("Oxygen", "O", "Gas", 8, 16, 2, 6, 15.999));
		addElement(new Element("Fluorine", "F", "Gas", 9, 17, 2, 7, 18.998));
		addElement(new Element("Neon", "Ne", "Gas", 10, 18, 2, 8, 20.180));
		addElement(new Element("Sodium", "Na", "Solid", 11, 1, 3, 1, 22.990));
		addElement(new Element("Magnesium", "Mg", "Solid", 12, 2, 3, 2, 24.305));
		addElement(new Element("Aluminium", "Al", "Solid", 13, 13, 3, 3, 26.982));
		addElement(new Element("Silicon", "Si", "Solid", 14, 14, 3, 4, 28.085));
		addElement(new Element("Phosphurus", "P", "Solid", 15, 15, 3, 5, 30.974));
		addElement(new Element("Sulfur", "S", "Solid", 16, 16, 33, 6, 32.06));
		addElement(new Element("Chlorine", "Cl", "Gas", 17, 17, 3, 7, 35.45));
		addElement(new Element("Argon", "Ar", "Gas", 18, 18, 3, 8, 39.948));
		addElement(new Element("Potassium", "K", "Solid", 19, 1, 4, 1, 39.098));
		addElement(new Element("Calcium", "Ca", "Solid", 20, 2, 4, 2, 40.078));
		addElement(new Element("Scandium", "Sc", "Solid", 21, 3, 4, 2, 44.956));
		addElement(new Element("Titanium", "Ti", "Solid", 22, 4, 4, 2, 47.867));
		addElement(new Element("Vanadium", "V", "Solid", 23, 5, 4, 2, 50.942));
		addElement(new Element("Chromium", "Cr", "Solid", 24, 6, 4, 1, 51.996));
		addElement(new Element("Manganese", "Mn", "Solid", 25, 7, 4, 2, 54.938));
		addElement(new Element("Iron", "Fe", "Solid", 26, 8, 4, 2, 55.845));
		addElement(new Element("Cobalt", "Co", "Solid", 27, 9, 4, 2, 58.933));
		addElement(new Element("Nickel", "Ni", "Solid", 28, 10, 4, 2, 58.693));
		addElement(new Element("Copper", "Cu", "Solid", 29, 11, 4, 1, 63.543));
		addElement(new Element("Zinc", "Zn", "Solid", 30, 12, 4, 2, 65.38));
		addElement(new Element("Gallium", "Ga", "Solid", 31, 13, 4, 3, 69.723));
		addElement(new Element("Germanium", "Ge", "Solid", 32, 14, 4, 4, 72.630));
		addElement(new Element("Arsenic", "As", "Solid", 33, 15, 4, 5, 74.922));
		addElement(new Element("Selenium", "Se", "Solid", 34, 16, 4, 6, 78.971));
		addElement(new Element("Bromine", "Br", "Liquid", 35, 17, 4, 7, 79.904));
		addElement(new Element("Krypton", "Kr", "Gas", 36, 18, 4, 36, 83.798));
		addElement(new Element("Rubidium", "Rb", "Solid", 37, 1, 5, 1, 85.468));
		addElement(new Element("Strontium", "Sr", "Solid", 38, 2, 5, 2, 87.62));
		addElement(new Element("Yttrium", "Y", "Solid", 39, 3, 5, 2, 88.906));
		addElement(new Element("Zirconium", "Zr", "Solid", 40, 4, 5, 2, 91.224));
		addElement(new Element("Niobium", "Nb", "Solid", 41, 5, 5, 1, 92.906));
		addElement(new Element("Molybdenur", "Mo", "Solid", 42, 6, 5, 1, 95.95));
		addElement(new Element("Technetium", "Tc", "Solid", 43, 7, 5, 2, 98));
		addElement(new Element("Ruthenium", "Ru", "Solid", 44, 8, 5, 1, 101.07));
		addElement(new Element("Rhodium", "Rh", "Solid", 45, 9, 5, 1, 102.91));
		addElement(new Element("Palladium", "Pd", "Solid", 46, 10, 5, 18, 106.42));
		addElement(new Element("Silver", "Ag", "Solid", 47, 11, 5, 1, 107.87));
		addElement(new Element("Cadmium", "Cd", "Solid", 48, 12, 5, 2, 112.41));
		addElement(new Element("Indium", "In", "Solid", 49, 13, 5, 3, 114.82));
		addElement(new Element("Tin", "Sn", "Solid", 50, 14, 5, 4, 118.71));
		addElement(new Element("Antimony", "Sb", "Solid", 51, 15, 5, 5, 121.76));
		addElement(new Element("Tellurium", "Te", "Solid", 52, 16, 5, 6, 127.60));
		addElement(new Element("Iodine", "I", "Solid", 53, 17, 5, 7, 126.90));
		addElement(new Element("Xenon", "Xe", "Gas", 54, 18, 5, 8, 131.29));
		addElement(new Element("Caesium", "Cs", "Solid", 55, 1, 6, 1, 132.91));
		addElement(new Element("Barium", "Ba", "Solid", 56, 2, 6, 2, 137.33));
		addElement(new Element("Lanthanium", "La", "Solid", 57, 4, 6, 2, 138.91));
		addElement(new Element("Cerium", "Ce", "Solid", 58, 0, 6, 2, 140.12));
		addElement(new Element("Praseodymium", "Pr", "Solid", 59, 0, 6, 2, 140.91));
		addElement(new Element("Neodymium", "Nd", "Solid", 60, 0, 6, 2, 144.24));
		addElement(new Element("Promethium", "Pm", "Solid", 61, 0, 6, 2, 145));
		addElement(new Element("Samarium", "Sm", "Solid", 62, 0, 6, 2, 150.36));
		addElement(new Element("Europium", "Eu", "Solid", 63, 0, 6, 2, 151.96));
		addElement(new Element("Gadolinium", "Gd", "Solid", 64, 0, 6, 2, 157.25));
		addElement(new Element("Terbium", "Tb", "Solid", 65, 0, 6, 2, 158.93));
		addElement(new Element("Dysprosium", "Dy", "Solid", 66, 0, 6, 2, 162.50));
		addElement(new Element("Holmium", "Ho", "Solid", 67, 0, 6, 2, 164.93));
		addElement(new Element("Erbium", "Er", "Solid", 68, 0, 6, 2, 167.26));
		addElement(new Element("Thulium", "Tm", "Solid", 69, 0, 6, 2, 168.93));
		addElement(new Element("Ytterbium", "Yb", "Solid", 70, 0, 6, 2, 173.05));
		addElement(new Element("Lutetium", "Lu", "Solid", 71, 0, 6, 2, 174.97));
		addElement(new Element("Hafnium", "Hf", "Solid", 72, 4, 6, 2, 178.49));
		addElement(new Element("Tantalum", "Ta", "Solid", 73, 5, 6, 2, 180.95));
		addElement(new Element("Tungsten", "W", "Solid", 74, 6, 6, 2, 183.84));
		addElement(new Element("Rhenium", "Re", "Solid", 75, 7, 6, 2, 186.21));
		addElement(new Element("Osmium", "Os", "Solid", 76, 8, 6, 2, 190.23));
		addElement(new Element("Iridium", "Ir", "Solid", 77, 9, 6, 2, 192.22));
		addElement(new Element("Platinum", "Pt", "Solid", 78, 10, 6, 1, 195.08));
		addElement(new Element("Gold", "Au", "Solid", 79, 11, 6, 1, 196.97));
		addElement(new Element("Mercury", "Hg", "Liquid", 80, 12, 6, 2, 200.59));
		addElement(new Element("Thallium", "Tl", "Solid", 81, 13, 6, 3, 204.38));
		addElement(new Element("Lead", "Pb", "Solid", 82, 14, 6, 4, 207.2));
		addElement(new Element("Bismuth", "Bi", "Solid", 83, 15, 6, 5, 208.98));
		addElement(new Element("Polonium", "Po", "Solid", 84, 16, 6, 6, 209));
		addElement(new Element("Astatine", "At", "Solid", 85, 17, 6, 7, 210));
		addElement(new Element("Radon", "Rn", "Gas", 86, 18, 6, 8, 222));
		addElement(new Element("Francium", "Fr", "Solid", 87, 1, 7, 1, 223));
		addElement(new Element("Radium", "Ra", "Solid", 88, 2, 7, 2, 226));
		addElement(new Element("Actinium", "Ac", "Solid", 89, 0, 7, 2, 227));
		addElement(new Element("Thorium", "Th", "Solid", 90, 0, 7, 2, 140.12));
		addElement(new Element("Protactinium", "Pa", "Solid", 91, 0, 7, 2, 231.04));
		addElement(new Element("Uranium", "U", "Solid", 92, 0, 7, 2, 238.03));
		addElement(new Element("Neptunium", "Np", "Solid", 93, 0, 7, 2, 237));
		addElement(new Element("Plutonium", "Pu", "Solid", 94, 0, 7, 2, 244));
		addElement(new Element("Americium", "Am", "Solid", 95, 0, 7, 2, 243));
		addElement(new Element("Curium", "Cm", "Solid", 96, 0, 7, 2, 247));
		addElement(new Element("Berkelium", "Bk", "Solid", 97, 0, 7, 2, 247));
		addElement(new Element("Californium", "Cf", "Solid", 98, 0, 7, 2, 251));
		addElement(new Element("Einsteinium", "Es", "Solid", 99, 0, 7, 2, 252));
		addElement(new Element("Fermium", "Fm", "Solid", 100, 0, 7, 2, 257));
		addElement(new Element("Menndelevium", "Md", "Solid", 101, 0, 7, 2, 258));
		addElement(new Element("Nobelium", "No", "Solid", 102, 0, 7, 2, 259));
		addElement(new Element("Lawrencium", "Lr", "Solid", 103, 0, 7, 3, 266));
		addElement(new Element("Rutherfordium", "Rf", "Unknown", 104, 4, 7, 2, 267));
		addElement(new Element("Dubnium", "Db", "Unknown", 105, 5, 7, 2, 268));
		addElement(new Element("Seaborgium", "Sg", "Unknown", 106, 6, 7, 2, 269));
		addElement(new Element("Bohrium", "Bh", "Unknown", 107, 7, 7, 2, 270));
		addElement(new Element("Hassium", "Hs", "Unknown", 108, 8, 7, 2, 277));
		addElement(new Element("Meitnerium", "Mt", "Unknown", 109, 9, 7, 2, 278));
		addElement(new Element("Darmstadtium", "Ds", "Unknown", 110, 10, 7, 1, 281));
		addElement(new Element("Roentgenium", "Rg", "Unknown", 111, 11, 7, 2, 282));
		addElement(new Element("Copernicium", "Cn", "Unknown", 112, 12, 7, 2, 285));
		addElement(new Element("Nihonium", "Nh", "Unknown", 113, 12, 7, 3, 286));
		addElement(new Element("Flerovium", "Fl", "Unknown", 114, 14, 7, 4, 289));
		addElement(new Element("Moscovium", "Mc", "Unknown", 115, 15, 7, 5, 290));
		addElement(new Element("Livermorium", "Lv", "Unknown", 116, 16, 7, 6, 293));
		addElement(new Element("Tennesine", "Ts", "Unknown", 117, 17, 7, 7, 294));
		addElement(new Element("Oganesson", "Og", "Unknown", 118, 18, 7, 8, 294));
		
		//==================================================================================//
		
		
		//=========================================== Adding common compounds
		addCompound(new Compound("Carbon dioxide", "CO2", 44.009));
		addCompound(new Compound("Acetaldehyde", "C2H4O", 44.053));
		addCompound(new Compound("Sodium bicarbonate", "NaHCO3", 84.007));
		addCompound(new Compound("Acetamide", "C2H5NO", 59.068));
		addCompound(new Compound("Acetic Acid", "CH3COOH", 60.052));
		addCompound(new Compound("Acetone", "C3H6O", 58.080));
		addCompound(new Compound("Acetonitrile", "C2H3N", 41.053));
		addCompound(new Compound("Aluminium chloride", "AlCl3", 133.33));
		addCompound(new Compound("Aluminium nitrate", "Al2(NO3)3", 212.994));
		addCompound(new Compound("Aluminium sulfate", "Al2(SO4)3", 342.132));
		addCompound(new Compound("Ammonia", "NH3", 17.031));
		addCompound(new Compound("Ammonium acetate", "CH3COONH4", 77.083));
		addCompound(new Compound("Ammonium carbonate", "(NH4)2CO3", 96.086));
		addCompound(new Compound("Ammonium chloride", "NH4Cl", 53.49));
		addCompound(new Compound("Ammonium hydroxide", "NH4OH", 35.046));
		addCompound(new Compound("Aluminium dichromate", "(NH4)2Cr2O7", 252.063));
		addCompound(new Compound("Ammonium nitrate", "NH4NO3", 80.043));
		addCompound(new Compound("Ammonium oxalate", "(NH4)2C2O4", 124.096));
		addCompound(new Compound("Ammonium sulfate", "(NH4)2SO4", 132.13));
		addCompound(new Compound("Antimony(III) chloride", "SbCl3", 228.11));
		addCompound(new Compound("Antimony(V) chloride", "SbCl5", 299.01));
		addCompound(new Compound("Barium chloride", "BaCl2", 208.23));
		addCompound(new Compound("Barium hydroxide" ,"Ba(OH)2", 171.34));
		addCompound(new Compound("Barium nitrate", "Ba(NO3)2", 261.34));
		addCompound(new Compound("Bismuth(III) chloride", "BiCl3", 315.33));
		addCompound(new Compound("Bismuth(III) nitrate", "Bi(NO3)3", 394.99));
		addCompound(new Compound("Butan-1-ol", "C4H10O", 74.123));
		addCompound(new Compound("Butyric acid", "C4H8O2", 88.106));
		addCompound(new Compound("Cadmium nitrate", "Cd(NO3)2", 236.42));
		addCompound(new Compound("Cadmium sulfate", "CdSO4", 208.47));
		addCompound(new Compound("Calcium chloride", "CaCl2", 110.98));
		addCompound(new Compound("Calcium hydroxide", "Ca(OH)2", 74.092));
		addCompound(new Compound("Calcium nitrate", "Ca(NO3)2", 164.086));
		addCompound(new Compound("Calcium sulfate", "CaSO4", 136.13));
		addCompound(new Compound("Carbon disulfide", "CS2", 76.13));
		addCompound(new Compound("Chloroacetic acid", "C2H3ClO2", 94.49));
		addCompound(new Compound("Choroauric acid", "HAuCl4", 339.78));
		addCompound(new Compound("Chloroform", "CHCl3", 119.37));
		addCompound(new Compound("Chloroplatinic acid", "H2PtCl6", 409.80));
		addCompound(new Compound("Chromium(III) chloride", "CrCl3", 158.35));
		addCompound(new Compound("Chromium(III) nitrate", "Cr(NO3)3", 238.007));
		addCompound(new Compound("Chromium(III) sulfate", "Cr2(SO4)3", 392.16));
		addCompound(new Compound("Chromium(VI) oxide", "CrO3", 99.993));
		addCompound(new Compound("Citric acid", "C6H8O7", 192.123));
		addCompound(new Compound("Cobalt(II) nitrate", "Co(NO3)2", 182.941));
		addCompound(new Compound("Cobalt(II) sulfate", "CoSO4", 154.99));
		addCompound(new Compound("Copper(I) chloride", "Cu2Cl2", 197.99));
		addCompound(new Compound("Copper(II) nitrate", "Cu(NO3)2", 187.554));
		addCompound(new Compound("Copper(II) sulfate", "CuSO4", 154.99));
		addCompound(new Compound("Dichloroacetic acid", "C2H2Cl2O2", 128.94));
		addCompound(new Compound("Diethyl ether", "(C2H5)2O", 74.123));
		addCompound(new Compound("Dimethylglyoxime", "(CH3CNOH)2", 116.120));
		addCompound(new Compound("EDTA, disodium salt", "Na2C10H14N2O8", 336.21));
		addCompound(new Compound("Ethanol", "C2H5OH", 46.069));
		addCompound(new Compound("Ethylene glycol", "(CH2OH)2", 62.068));
		addCompound(new Compound("Formaldehyde", "CH20", 30.026));
		addCompound(new Compound("Formic acid", "CH2O2", 46.025));
		addCompound(new Compound("Fructose", "C6H12O6", 180.156));
		addCompound(new Compound("Glucose", "C6H12O6", 180.156));
		addCompound(new Compound("Glycerol", "C3H8O3", 92.094));
		addCompound(new Compound("Hexafluorosilicic acid", "H2SiF6", 144.089));
		addCompound(new Compound("Hydrazine", "N2H4", 32.046));
		addCompound(new Compound("Hydrobromic acid", "HBr", 80.912));
		addCompound(new Compound("Hydrochloric acid", "HCl", 36.46));
		addCompound(new Compound("Hydrocyanic acid", "HCN", 27.026));
		addCompound(new Compound("Hydrofluoric acid", "HF", 20.006));
		addCompound(new Compound("Hydrogen peroxide", "H2O2", 34.014));
		addCompound(new Compound("Hydroiodic acid", "HI", 127.9));
		addCompound(new Compound("Iodic acid", "HIO3", 175.9));
		addCompound(new Compound("Iron(II) ammonium sulfate", "FeSO4 + (NH4)2SO4", 284.04));
		addCompound(new Compound("Iron(II) sulfate", "FeSO4", 151.90));
		addCompound(new Compound("Iron(III) chloride", "FeCl3", 162.20));
		addCompound(new Compound("Iron(III) nitrate", "Fe(NO3)3", 241.857));
		addCompound(new Compound("Iron(III) sulfate", "Fe2(SO4)3", 399.86));
		addCompound(new Compound("Isobutanol", "C4H10O", 74.123));
		addCompound(new Compound("Lactic acid", "C3H6O3", 90.078));
		addCompound(new Compound("Lactose", "C12H22O11", 342.297));
		addCompound(new Compound("Lead(II) acetate", "Pb(C2H3O2)2", 325.3));
		addCompound(new Compound("Lead(II) chloride", "PbCl2", 278.1));
		addCompound(new Compound("Lead(II) nitrate", "Pb(NO3)2", 331.2));
		addCompound(new Compound("Lead(IV) acetate", "Pb(C2H3O2)4", 443.4));
		addCompound(new Compound("Lithium chloride", "LiCl", 42.39));
		addCompound(new Compound("Magnesium chloride", "MgCl2", 95.21));
		addCompound(new Compound("Magnesium nitrate", "Mg(NO3)2", 148.313));
		addCompound(new Compound("Magnesium sulfate", "MgSO4", 120.36));
		addCompound(new Compound("Maleic acid", "C4H4O4", 116.072));
		addCompound(new Compound("Malonic acid", "C3H4O4", 104.061));
		addCompound(new Compound("Maltose", "C12H22O11", 342.297));
		addCompound(new Compound("Manganese(II) chloride", "MnCl2", 125.84));
		addCompound(new Compound("Manganese(II) sulfate", "MnSO4", 150.99));
		addCompound(new Compound("Mannitol", "C6H14O6", 182.172));
		addCompound(new Compound("Mercury(II) chloride", "HgCl2", 271.49));
		addCompound(new Compound("Mercury(II) nitrate", "Hg(NO3)2", 324.60));
		addCompound(new Compound("Mercury(II) sulfate", "HgSO4", 296.65));
		addCompound(new Compound("Methanol", "CH3OH", 32.042));
		addCompound(new Compound("Methyl acetate", "C3H6O2", 74.079));
		addCompound(new Compound("Nickel chloride", "NiCl2", 129.59));
		addCompound(new Compound("Nickel nitrate", "Ni(NO3)2", 182.701));
		addCompound(new Compound("Nickel sulfate", "NiSO4", 154.75));
		addCompound(new Compound("Nicotine", "C10H14N2", 162.236));
		addCompound(new Compound("Nitric acid", "HNO3", 63.012));
		addCompound(new Compound("Oxalic acid", "H2C2O4", 90.034));
		addCompound(new Compound("Pentan-1-ol", "C5H11OH", 88.150));
		addCompound(new Compound("Perchloric acid", "HClO4", 100.45));
		addCompound(new Compound("Phenol", "C6H6O", 94.113));
		addCompound(new Compound("Phosphoric acid", "H3PO4", 97.994));
		addCompound(new Compound("Potassium bicarbonate", "KHCO3", 100.114));
		addCompound(new Compound("Potassium bromate", "KBrO3", 166.999));
		addCompound(new Compound("Potassium bromate", "KBr", 119.002));
		addCompound(new Compound("Potassium carbonate", "K2CO3", 138.204));
		addCompound(new Compound("Potassium chlorate", "KClO3", 122.55));
		addCompound(new Compound("Potassium chromate", "K2CrO4", 194.188));
		addCompound(new Compound("Potassium cyanide", "KCN", 65.116));
		addCompound(new Compound("Potassium dichromate", "K2Cr2O7", 294.181));
		addCompound(new Compound("Potassium dihydrogen phosphate", "KH2PO4", 136.084));
		addCompound(new Compound("Potassium hexacyanoferrate(II)", "K4Fe(CN)6", 368.345));
		addCompound(new Compound("Potassium hexacyanoferrate(III)", "K3Fe(CN)6", 329.247));
		addCompound(new Compound("Potassium hydrogen phosphate", "K2HPO4", 174.174));
		addCompound(new Compound("Potassium hydroxide", "KOH", 56.105));
		addCompound(new Compound("Potassium iodate", "KIO3", 214.0));
		addCompound(new Compound("Potassium iodide", "KI", 166.0));
		addCompound(new Compound("Potassium nitrate", "KNO3", 101.102));
		addCompound(new Compound("Potassium nitrite", "KNO2", 85.103));
		addCompound(new Compound("Potassium permanganate", "KMnO4", 158.032));
		addCompound(new Compound("Potassium sulfate", "K2SO4", 174.25));
		addCompound(new Compound("Potassium sulfite", "K2SO3", 158.25));
		addCompound(new Compound("Potassium tartrate", "K2C4H4O6", 226.266));
		addCompound(new Compound("Potassium thiocyanate", "KCNS", 97.18));
		addCompound(new Compound("Propan-1-ol", "CH3CH2CH2OH", 60.096));
		addCompound(new Compound("Propan-2-ol", "CH3CHOHCH3", 60.096));
		addCompound(new Compound("Pyridine", "C5H5N", 79102));
		addCompound(new Compound("Resorcinol", "C6H6O2", 110.112));
		addCompound(new Compound("Saccharose", "C12H22O11", 342.297));
		addCompound(new Compound("Silver nitrate", "AgNO3", 169.87));
		addCompound(new Compound("Silver sulfate", "Ag2SO4", 311.80));
		addCompound(new Compound("Sodium acetate", "NaC2H3O2", 82.03));
		addCompound(new Compound("Sodium arsenate", "Na3AsO4", 207.89));
		addCompound(new Compound("Sodium bromide", "NaBr", 102.89));
		addCompound(new Compound("Sodium carbonate", "Na2CO3", 105.99));
		addCompound(new Compound("Sodium chlorate", "NaClO3", 106.44));
		addCompound(new Compound("Sodium chloride", "NaCl", 58.44));
		addCompound(new Compound("Sodium chromate", "Na2CrO4", 161.97));
		addCompound(new Compound("Sodium citrate", "Na3C6H5O7", 258.07));
		addCompound(new Compound("Sodium dichromate", "Na2Cr2O7", 261.97));
		addCompound(new Compound("Sodium dihydrogen phosphate", "NaH2PO4", 119.98));
		addCompound(new Compound("Sodium formate", "HCOONa", 68.01));
		addCompound(new Compound("Sodium hydrogen carbonate", "NaHCO3", 84.01));
		addCompound(new Compound("Sodium hydrogen phosphate", "Na2HPO4", 141.96));
		addCompound(new Compound("Sodium hydrogen tartrate", "NaHC4H4O6", 172.07));
		addCompound(new Compound("Sodium hydroxide", "NaOH", 40.00));
		addCompound(new Compound("Sodium nitrate", "NaNO3", 84.99));
		addCompound(new Compound("Sodium nitrite", "NaNO2", 69.00));
		addCompound(new Compound("Sodium phosphate", "Na3PO4", 163.94));
		addCompound(new Compound("Sodium potassium tartrate", "NaKC4H4O6", 210.16));
		addCompound(new Compound("Sodium sulfate", "Na2SO4", 142.04));
		addCompound(new Compound("Sodium sulfide", "Na2S", 78.04));
		addCompound(new Compound("Sodium sulfite", "Na2SO3", 126.04));
		addCompound(new Compound("Sodium tartrate", "Na2C4H4O6", 194.05));
		addCompound(new Compound("Sodium thiosulfate", "Na2S2O3", 158.10));
		addCompound(new Compound("Strontium chloride", "SrCl2", 158.52));
		addCompound(new Compound("Strontium nitrate", "Sr(NO3)2", 211.63));
		addCompound(new Compound("Strontium sulfate", "SrSO4", 183.68));
		addCompound(new Compound("Sulfuric acid", "H2SO4", 98.07));
		addCompound(new Compound("Sulfurous acid", "H2SO3", 82.07));
		addCompound(new Compound("Tartaric acid", "H2C4H4O6", 150.086));
		addCompound(new Compound("Thiourea", "CH4N2S", 76.12));
		addCompound(new Compound("Tin(II) chloride", "SnCl2", 189.61));
		addCompound(new Compound("Tin(IV) chloride", "SnCl4", 260.51));
		addCompound(new Compound("Trichloroacetic acid", "CCl3COOH", 163.38));
		addCompound(new Compound("TRIS", "(HOCH2)3CNH2", 121.136));
		addCompound(new Compound("Urea", "(NH2)2CO", 60.056));
		addCompound(new Compound("Urethane", "C3H7NO2", 89.094));
		addCompound(new Compound("Zinc bromide", "ZnBr2", 225.19));
		addCompound(new Compound("Zinc chloride", "ZnCl2", 136.28));
		addCompound(new Compound("Zinc sulfate", "ZnSO4", 161.44));
		addCompound(new Compound("Zinc nitrate", "Zn(NO3)2", 189.39));
		addCompound(new Compound("Water", "H2O", 18.01528));
		
		
		
		
		
		
		
		// ==================================================================
		// Implement a flashcards Intent/Method where the user can choose what elements or 
		// compounds that they want to study and load them all in a different intent
		
		
		
	}
	
	//Adding elements and compounds to various concurrent hashmaps
		public void addElement(Element e) {
			elements.put(e.name, e);
		}
		public void addCompound(Compound c) {
			compounds.put(c.formula, c);
		}
		
		
	
	
	
	public static void main(String[] args) {
		
		String key, choice, comp;
		int count = 0;
		int numOfElements, howMany;
		double totalMass = 0;
		
		
		new Home();
		
//		for (Element e : elements.values()) {
//			System.out.print("  " + e.name);
//			System.out.println();
//		}
		
		Methods a = new Methods();
		
//		System.out.println("********** Moles calculation **********\n");
//		System.out.println("What element do you want? **Enter full correct name**");
//		key = aye.nextLine();
//		
//		a.moles(elements.get(key));
		
//		for (Compound c : compounds.values()) {
//			++count;
//		}
//		System.out.println("There are " + count + " compounds entered");
//		
//		count = 0;
//		for (Element e : elements.values()) {
//			++count;
//		}
//		System.out.println("There are " + count + " elements entered");
//		
//		for (Compound c : compounds.values()) {
//			if (c.formula.equals("Mg(OH)2"))
//				System.out.println(c.name + " " + c.formula + " " + c.weight);
//		}
//		
//		System.out.println("********* Molar Mass *********");
//		System.out.println("What are you entering **F for formula, N for name**");
//		choice = aye.nextLine();
//		
//		if (choice.equals("F")) {
//			System.out.println("Enter the formula");
//			comp = aye.nextLine();
//			for (Compound c : compounds.values()) {
//				if (c.formula.equals(comp))
//					a.molarMass(c);
//			}
//		}
//		if (choice.equals("N")) {
//			System.out.println("Enter the name");
//			comp = aye.nextLine();
//			for (Compound c : compounds.values()) {
//				if (c.name.equals(comp))
//					a.molarMass(c);
//		}
//		}
		
		
	// ===========================================	
		
		Element one, two, three;
		double mass1, mass2, mass3;
		
		System.out.println("***** Molar mass with element contents *****");
		System.out.println("***** How many elements are present *****");
		numOfElements = aye3.nextInt();
		
		if (numOfElements == 3) {
			System.out.println("Enter first element name");
			key = aye.nextLine();
			one = elements.get(key);
			System.out.println("How many atoms of " + one.symbol);
			howMany = aye2.nextInt();
			mass1 = a.moles2(one) * howMany;
			totalMass += mass1;
			
			System.out.println("Enter second element name");
			key = aye.nextLine();
			two = elements.get(key);
			System.out.println("How many atoms of " + two.symbol);
			howMany = aye2.nextInt();
			mass2 = a.moles2(two) * howMany;
			totalMass += mass2;
			
			System.out.println("Enter third element name");
			key = aye.nextLine();
			three = elements.get(key);
			System.out.println("How many atoms of " + three.symbol);
			howMany = aye2.nextInt();
			mass3 = a.moles2(three) * howMany;
			totalMass += mass3;
			
		}
		
		if (numOfElements == 2) {
			System.out.println("Enter first element name");
			key = aye.nextLine();
			one = elements.get(key);
			System.out.println("How many atoms of " + one.symbol);
			howMany = aye2.nextInt();
			mass1 = a.moles2(one) * howMany;
			totalMass += mass1;
			
			System.out.println("Enter second element name");
			key = aye.nextLine();
			two = elements.get(key);
			System.out.println("How many atoms of " + two.symbol);
			howMany = aye2.nextInt();
			mass2 = a.moles2(two) * howMany;
			totalMass += mass2;
		}
		
		if (numOfElements == 1) {
			System.out.println("Enter element's name");
			key = aye.nextLine();
			one = elements.get(key);
			System.out.println("How many atoms of " + one.symbol);
			howMany = aye2.nextInt();
			mass1 = a.moles2(one) * howMany;
			totalMass += mass1;
		}
		
		System.out.printf("%.3f", totalMass);
		System.out.println("");
		
		
//		double moles;
//		
//		System.out.printf("The compound has %.3f", totalMass);
//		System.out.print("g/mol \n");
//		
//		System.out.println("How many moles");
//		moles = aye3.nextDouble();
		
//		System.out.printf("Answer: %.3f" , a.massInsideMoles(moles, totalMass));
		
		
		
		//Avogadro's
//		System.out.println(a.avogadros(elements.get("Gallium")));
		
		
		// Percent Composition
		
//		System.out.println("***** Molar mass with element contents *****");
//		System.out.println("***** How many elements are present *****");
//		numOfElements = aye3.nextInt();
//		
//		if (numOfElements == 3) {
//			System.out.println("Enter first element name");
//			key = aye.nextLine();
//			one = elements.get(key);
//			System.out.println("How many atoms of " + one.symbol);
//			howMany = aye2.nextInt();
//			mass1 = a.moles2(one) * howMany;
//			totalMass += mass1;
//			
//			System.out.println("Enter second element name");
//			key = aye.nextLine();
//			two = elements.get(key);
//			System.out.println("How many atoms of " + two.symbol);
//			howMany = aye2.nextInt();
//			mass2 = a.moles2(two) * howMany;
//			totalMass += mass2;
//			
//			System.out.println("Enter third element name");
//			key = aye.nextLine();
//			three = elements.get(key);
//			System.out.println("How many atoms of " + three.symbol);
//			howMany = aye2.nextInt();
//			mass3 = a.moles2(three) * howMany;
//			totalMass += mass3;
//			
//			// Percent Composition addition
//			double comp1, comp2, comp3;
//			comp1 = (mass1/totalMass) * 100;
//			comp2 = (mass2/totalMass) * 100;
//			comp3 = (mass3/totalMass) * 100;
//			
//			
//			System.out.println("******* Percent Composition *******");
//			System.out.println("% " + one.symbol + " = " + comp1 + "%");
//			System.out.println("% " + two.symbol + " = " + comp2 + "%");
//			System.out.println("% " + three.symbol + " = " + comp3 + "%");
//		}
//		
//		if (numOfElements == 2) {
//			System.out.println("Enter first element name");
//			key = aye.nextLine();
//			one = elements.get(key);
//			System.out.println("How many atoms of " + one.symbol);
//			howMany = aye2.nextInt();
//			mass1 = a.moles2(one) * howMany;
//			totalMass += mass1;
//			
//			System.out.println("Enter second element name");
//			key = aye.nextLine();
//			two = elements.get(key);
//			System.out.println("How many atoms of " + two.symbol);
//			howMany = aye2.nextInt();
//			mass2 = a.moles2(two) * howMany;
//			totalMass += mass2;
//			
//			// Percent Composition addition
//			double comp1, comp2;
//			comp1 = (mass1/totalMass) * 100;
//			comp2 = (mass2/totalMass) * 100;
//
//
//			System.out.println("******* Percent Composition *******");
//			System.out.println("% " + one.symbol + " = " + comp1 + "%");
//			System.out.println("% " + two.symbol + " = " + comp2 + "%");
//						
//		}
//		
//		if (numOfElements == 1) {
//			System.out.println("Enter element's name");
//			key = aye.nextLine();
//			one = elements.get(key);
//			System.out.println("How many atoms of " + one.symbol);
//			howMany = aye2.nextInt();
//			mass1 = a.moles2(one) * howMany;
//			totalMass += mass1;
//			
//			System.out.println("******* Percent Composition *******");
//			System.out.println("% " + one.symbol + " = 100%");
//		}
		
		
		
		
		
		
		
//			System.out.println(c);
			
		
	}
	
	// test code needs to be put in the method class later
}
