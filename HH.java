package hh;

public class HH {

	public static void main (String Args []) {
		int n [][][] = new int [4][4][4];
		
		n[0][0][1] = 45;
		n[0][1][1] = 1;
		n[1][0][0] = 9;
		n[1][1][1] = 78;
		
		System.out.print("[" + n[0][1][1] + "]");
		System.out.println("[" + n[0][1][1] + "]");
		System.out.print("[" + n[1][0][0] + "]");
		System.out.print("[" + n[1][1][1] + "]");
		
	}
	
	
}

