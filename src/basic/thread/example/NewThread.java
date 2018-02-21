package basic.thread.example;

public class NewThread implements Runnable{
	public void run() {
	System.out.println("Running Thread!!!!!!!!");	
	}
 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       NewThread t1= new NewThread();
       Thread t2= new Thread(t1);
       t2.start();
	}

}
