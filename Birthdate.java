public class Birthdate extends Thread {
	int birthdate=31;
	public void run() {
		for (int i=1;i<=10;i++) {
			int result =birthdate*i;
			System.out.println("october"+birthdate+"*"+i+"="+result);
		}
	}
 
}
