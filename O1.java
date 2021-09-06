package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class O1 {

	private String a1 = showInputDialog("Bruttointekt:");
	private double b1 = Double.parseDouble(a1);
	private double trinn0 = 0;
	private double trinn1 = 1.7;
	private double trinn2 = 4.0;
	private double trinn3 = 13.2;
	private double trinn4 = 16.2;
	
	
	public double sjekkTrinnskatt(double brutto) {
		
		if (brutto >= 0 && brutto <= 184800) return trinn0*brutto;
		
		else if (brutto > 184800 && brutto <= 260100) return trinn1*brutto/100;
		
		else if (brutto > 260100 && brutto <= 651250) return trinn2*brutto/100;
		
		else if (brutto > 651250 && brutto <= 1021550) return trinn3*brutto/100;
		
		return trinn4*brutto/100;
	}
	
	public static void main(String[] args) {
		
		O1 trinnskatt = new O1();
		double resault = trinnskatt.sjekkTrinnskatt(trinnskatt.b1);
		
		System.out.println(resault);

	}

}
