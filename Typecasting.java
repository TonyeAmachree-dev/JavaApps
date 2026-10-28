public class Typecasting{
	public static void main(String[] args){
		double price = 900;
		
		double weight =2.5;
		int convertedweight = (int)weight;
		
		int number = 65;
		char letter = (char)number;
		
		
		System.out.printf("The price of the commodity is %.2f%n",price);
		System.out.printf( "The weight of your package is %dkg%n",convertedweight);
		System.out.printf("The character represented by 65 is the %c%n" ,letter);
	}
}