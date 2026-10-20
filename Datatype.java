public class DataType{
	public static void main(String[] args){
		byte age = 20;
		short quantity = 1500;
		int population = 600000000;
		long worldPopulation = 8000000999080876890L;
		
		float myBalance = 839394.937F;
		double cbnBalance =6474648484846600.76;
		
		char symbol =  '$';
		boolean isJavaFun = true;
		
		System.out.printf("I am %d years old%n",age );
		System.out.printf( "I bought %,d loaves of bread%n",quantity );
		System.out.printf("Population of Nigeria is %,d%n",population);
		System.out.printf("The world's population is %,d%n",worldPopulation);
		System.out.printf("My account balance is %c%,.2f%n",symbol,myBalance);
		System.out.printf("The central bank of Nigeria balance is %c%,.2f%n",symbol ,cbnBalance);
		System.out.printf(" Is Java fun? %b%n", isJavaFun);
	}
}