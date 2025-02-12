package practice.interfaces;

public class TestOutInterfaces {

	public static void main(String[] args) {		
		
		//Static methods invocation
		String producer = FirstInterface.producer();
		System.out.println(producer);		
		
		producer = FirstInterface.producer4();
		System.out.println(producer);
		
		
		//Default methods invocation
		FirstInterface vehicle = new FirstInterfaceImpl();
		String overview = vehicle.getOverview();
		System.out.println(overview);
		
		overview = vehicle.getOverview3();
		System.out.println(overview);

		
	}
}
