package practice.interfaces;

public interface FirstInterface{
	
	static String producer() {
	    return "N&F Vehicles One";
	}
	
	static String producer2() {
	    return "N&F Vehicles Two";
	}
	
	static String producer3() {
	    return "N&F Vehicles Three";
	}
	
	static String producer4() {
	    return "N&F Vehicles Four";
	}
	
	
	default String getOverview() {
	    return "First ATV made by " + producer();
	}
	
	default String getOverview2() {
	    return "Second ATV made by " + producer2();
	}
	
	default String getOverview3() {
	    return "Three ATV made by " + producer3();
	}
}
