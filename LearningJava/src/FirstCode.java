import java.util.Iterator;

public class FirstCode
{
	public static void main(String args[]) throws Exception
	{		
		Thread t1=new Thread( () -> {
			for(int i=0;i<5;i++) {
				System.out.println("hi");			
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
});
		Thread t2=new Thread(()-> {
			for(int i=0;i<5;i++) {
				System.out.println("hello");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}	
			});
	}
}
