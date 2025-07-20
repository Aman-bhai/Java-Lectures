package in.learning.java.lec2typeCasting;

public class TypeCasting {
	public static void main(String []args) {
//		TypeCating ---> implicit type casting and explit typecasting
//		
//		1) implicit typecasting ---> typcasting which is done automatically by the jvm 

        int a=20;
		long b=30;
		
		b=a;
		System.out.println("Type Cast int to long : "+b);
		
		float c=3.0f;
		double d=4;
		
		d=c;
		System.out.println("Type Cast float to double : ");

		System.out.println(c);
		System.out.println(d);

//		2) explicit typecasting ---> typcasting which is done manually or forcefully
		
//		c=d;  // error
		
		c=(float)d;
		System.out.println("Type Cast double to float : "+c);


		
	}

}
