package ru.equifax.streaming;

public class TestThread extends Thread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		(new TestThread()).start();
		(new TestThread()).start();
		(new TestThread()).start();
	}
	public void run(){
		for (int i =0;i<100;i++)
		System.out.println("Thread statrted " +i);
	}
	

}
