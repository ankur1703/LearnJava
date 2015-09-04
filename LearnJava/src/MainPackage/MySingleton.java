package MainPackage;

public class MySingleton {
	
	static MySingleton obj = new MySingleton();
	
	private MySingleton(){
		
	}

	public static MySingleton getSingletonObject(){
		return obj;
	}
	
	void print(){
		System.out.println("Hurreyyy");
	}
}
