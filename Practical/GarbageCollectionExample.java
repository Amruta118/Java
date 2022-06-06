package readerandwriterhierarchy;

//Java program of garbage collection

public class GarbageCollectionExample {
	
	//finalize method
	public void finalize(){
		System.out.println("garbage collected object");
	}
	
	//main method
	public static void main(String[] args) {
		
		//creating first object of GarbageCollectionExample class
		GarbageCollectionExample s1=new GarbageCollectionExample();
		
		//creating second object of GarbageCollectionExample class
		GarbageCollectionExample s2=new GarbageCollectionExample();
		s1=null;
		s2=null;
		System.gc();
		}
	}


