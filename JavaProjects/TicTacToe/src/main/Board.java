package main;

public class Board {
	String uL = "1";
	String uM = "2";
	String uR = "3";
	
	String mL = "4";
	String mM = "5";
	String mR = "6";
	
	String dL = "7";
	String dM = "8";
	String dR = "9";
	
	String setup = "_"+uL+"_|_"+uM+"_|_"+uR+"_\r\n"
			+ "_"+mL+"_|_"+mM+"_|_"+mR+"_\r\n"
			+ " "+dL+" | "+dM+" | "+dR+" \r\n";
	
	//This method allows the game board to be edited while maintaining previous edits
	public void newSetup() {
		setup = "_"+uL+"_|_"+uM+"_|_"+uR+"_\r\n"
				+ "_"+mL+"_|_"+mM+"_|_"+mR+"_\r\n"
				+ " "+dL+" | "+dM+" | "+dR+" \r\n";
	}
	
}
