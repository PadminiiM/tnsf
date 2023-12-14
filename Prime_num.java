package tnsf;

public class Prime_num {

	    public static void main(String[] args) {
	        for (int i = 1; i <= 20; i++) {
	            if (i == 2 || i == 3) {
	                System.out.println(i);
	            } else {
	                for (int j = 2; j <= i / 2; j++) {
	                    if (i % j == 0) {
	                        break;
	                    }
	                    if (j == i / 2) {
	                        System.out.println(i);
	                    }
	                }
	            }
	        }
	    }
	}