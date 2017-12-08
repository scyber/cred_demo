package ru.equifax.streaming;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SampleExecutorService {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExecutorService service = null;
		
		try{
			service = Executors.newSingleThreadExecutor();
			System.out.println("begin");
			service.execute(()->System.out.println("Printing zoo Inventory ") );
			service.execute(()-> {for(int i=0;i<10; i++) 
				System.out.println("Print record " + i);});
			service.execute(()->System.out.println("Printing zoo Inventory "));
			System.out.println("End");
			
		} finally {
			if(service != null) service.shutdown();
		}

	}

}
