package basic.dev;

public class MainApp2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int i = 0;
        int tong = 0;
        while(i <= 100) {
      	    i++;
        	tong += i; // tong = tong + i
        	System.out.println(i);	
        }
        System.out.println("tong: " + tong);
	}

}
