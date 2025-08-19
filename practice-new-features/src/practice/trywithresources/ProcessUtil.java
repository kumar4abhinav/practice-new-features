package practice.trywithresources;

public class ProcessUtil {

	
	public static void main(String[]args) throws Exception {
		new ProcessUtil().orderOfClosingResources();
	}

	private void orderOfClosingResources() throws Exception {
	    try (AutoCloseableResourcesFirst af = new AutoCloseableResourcesFirst();
	        AutoCloseableResourcesSecond as = new AutoCloseableResourcesSecond()) {

	        af.doSomething();
	        as.doSomething();
	        
	      	String s ="P";
	    	Integer.parseInt(s);
	    }
		catch (Exception e) {
			System.out.println(
					"Inside catch block and exception specifics are - " + e.getClass().getName() + "::" + e.getMessage());
		}
	    finally {
	    	
	    	System.out.println("Inside finally block");
	    	String s ="U";
	    	Integer.parseInt(s);
	    }
	}

}
