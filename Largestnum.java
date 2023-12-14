package tnsf;

public class Largestnum {
	public static void main(String agrs[]) {
	int num1=56787,num2=4976,num3=64348;
	if(num1>num2 && num1>num3) {
		System.out.println(num1+" is the largest num");
	}
	else if(num2>num1 && num2>num3) {
		System.out.println(num2+" is the largest num");
	}
	else {
		System.out.println(num3+" is the largest num");
	}
}
}