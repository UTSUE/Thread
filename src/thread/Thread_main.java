package thread;

public class Thread_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Thread_run thmx [] = new Thread_run[3];
		Thread_runnable thmx2 [] = new Thread_runnable[3];
		
		for(int i = 0; i < 2; i++) {
			thmx[i] = new Thread_run();
			thmx2[i] = new Thread_runnable();
			thmx[i].start();
			thmx2[i].run();
			
		    try {
		    	thmx[i].join();
		    } catch (InterruptedException e) {
		    	// TODO Auto-generated catch block
		    	e.printStackTrace();
		    }
		 }
		for(int i = 0;i<10;i++) {
			System.out.println("main‚©‚ço—Í : "+i);
		}	

	}

}
