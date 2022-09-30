package creational_singleton;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Singleton.getInstance("Singleton no. 1");
		Singleton singleton = Singleton.getInstance("Singleton no. 2");
		
		System.out.println(singleton);
		System.out.println(singleton.getData());
	}
}