package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class O2 {
	int poeng;
	char a = 'A';
	char b = 'B';
	char c = 'C';
	char d = 'D';
	char e = 'E';
	char f = 'F';
	char g = 'G';
	
	
	public void poengsum(int poeng) {
		for(int i = 1; i <= 10; i++) {
		poeng = parseInt (showInputDialog("Poengsum:"));
		if(poeng >= 0 && poeng < 40) {
			System.out.println(f);
		}
		else if(poeng >= 40 && poeng < 50) {
			System.out.println(e);
		}
		else if(poeng >= 50 && poeng < 60) {
			System.out.println(d);
		}
		else if(poeng >= 60 && poeng < 80) {
			System.out.println(c);
		}
		else if(poeng >= 80 && poeng < 90) {
			System.out.println(b);
		}
		else if(poeng >= 90 && poeng <= 100) {
			System.out.println(a);
		}
		else {
			System.out.println("Umulig poengsum retry");
			i--;
		}
	}
	}
	
	public static void main(String[] args) {
		O2 karakter = new O2();
		karakter.poengsum(karakter.poeng);
		

	}

}
