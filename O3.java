package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class O3 {

	int number = parseInt(showInputDialog("Fakultet"));
	
	
	public int fakultet(int n) {
		if (n < 0) throw new IllegalArgumentException("number kan ikke være negativ");
		if (n == 0) return 1;
		return (n-1)*n;
	}
		
	
	public static void main(String[] args) {
		O3 fak = new O3();
		int result = fak.fakultet(fak.number);
		System.out.println(result);
	}

}
