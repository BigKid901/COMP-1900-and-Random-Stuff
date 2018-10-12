/* 
A very simple fighting game!
*/
import java.util.Scanner;

public class MyFirstGame {
	public static void main(String[] args) {
		int enemyHP = 100;
		System.out.print("Current enemy HP: ");
		System.out.println(enemyHP);

		Scanner scnr = new Scanner(System.in);
		System.out.print("How many attacks do you want to make? ");
		int p1Attacks = scnr.nextInt();

		int damage = p1Attacks * 8;
		enemyHP = enemyHP - damage;
		System.out.print("Current enemy HP: ");
		System.out.print(enemyHP);
	}
}