package basic.thread.example;

public class Muiti extends Thread{
	
	public void run() {
		System.out.println("Therad is being Executed!!!!");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Muiti m1= new Muiti();
		m1.start();

	}

}
