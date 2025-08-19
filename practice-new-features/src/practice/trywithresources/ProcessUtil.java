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
	        
	        int a =1;
	        int b = a/a;
	    }
	    catch(Exception e) {
	    	System.out.println(e.getClass()+"::"+e.getMessage());
	    }
	    finally {
	    	String s ="4";
	    	Integer.parseInt(s);
	    }
	}

}
