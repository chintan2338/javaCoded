//final Vs Immutability

//public class Mutable2 {
//
//	public static void main(String[] args) {
//		
//		final int a=10;
//		a=20;//error
//		System.out.println(a);
//
//	}
//
//}

//OR
//final lagane se wo immutable nahi ban jata vo mutable hi raheta hai bas vo only dusare object ko reffer nahi kar sakata.
//public class Mutable2 {
//
//	public static void main(String[] args) {
//		
//		final StringBuffer sb=new StringBuffer("Virat");
//		sb.append("Kohali");
//		System.out.println(sb);
//		sb=new StringBuffer("Sachin");//error
//		System.out.println(sb);
//
//	}
//
//}