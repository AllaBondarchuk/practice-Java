import java.util.Scanner;

class apples{
	public static void main (String args[]){
		Scanner Alla = new Scanner (System.in);
		double fnum, snum, answer;
		System.out.println("Enter first num: ");
		fnum = Alla.nextDouble();
		System.out.println("Enter second num: ");
		snum = Alla.nextDouble();
		answer = fnum + snum;
		System.out.println(answer);
	}
}
