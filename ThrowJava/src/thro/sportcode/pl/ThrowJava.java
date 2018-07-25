package thro.sportcode.pl;

import java.util.Scanner;

public class ThrowJava 
{
	public static void main(String[] args) throws ArithmeticException
	{
		double number , number2 , division ; 
		Scanner odczyt = new Scanner(System.in) ; 
		
		System.out.println("Podaj pierwsza liczbe");
		number = odczyt.nextInt() ; 
		System.out.println("Podaj druga liczbe");
		number2 = odczyt.nextInt() ;
		
		if(number2==0) throw new ArithmeticException("Nie mozna dzielic przez zero\n") ;
		else
		{
			division = number/number2 ; 
			System.out.println("Wynik dzielenia tych dwoch liczb wynosi "+division);
		}
		
	}
}
