package ashwins;

public class Ex11_6Test {
	   public static void main(String[] args) {
	       Ex11_6 instanceA = new Ex11_6();
	       Ex11_6 instanceB = new Ex11_6();
	       instanceA.a = 8;
	       instanceB.b = instanceA.x;
	       instanceA.x++;
	       instanceB.a = 10;
	       instanceB.c = 90;
	       instanceB.x++;
	       // Values after the program is run
	       System.out.println("Values of instanceA:");
	       System.out.println("a: " + instanceA.a);
	       System.out.println("b: " + instanceA.b); // default value
	       System.out.println("c: " + instanceA.c); // default value
	       System.out.println("x: " + instanceA.x);
	       System.out.println("\nValues of instanceB:");
	       System.out.println("a: " + instanceB.a);
	       System.out.println("b: " + instanceB.b);
	       System.out.println("c: " + instanceB.c);
	       System.out.println("x: " + instanceB.x);
	   }
	}