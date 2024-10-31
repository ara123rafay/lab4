
public class TASK2 extends Thread{
	int rollNo=21;
	public void run() {
		for (int i=1;i<=10;i++) {
			int result =rollNo*i;
			System.out.println(rollNo+"*"+i+"="+result);
		}
	}
 
}
