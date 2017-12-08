package ru.equifax.streaming;

public class TestRunnable implements Runnable{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		(new Thread(new TestRunnable())).start();
		
	}

	public void run() {
		// TODO Auto-generated method stub
		for (int i=0;i<100; i++){
			System.out.println("Run thread " + i);
		}
	}

}
