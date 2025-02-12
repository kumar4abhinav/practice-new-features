package practice.lambdas.returnstatement;


  
public class ReturnStatementLambdaExpressionExample1 {  
	
	interface Addable{  
	    int add(int a,int b);  
	}
	
	
	
    public static void main(String[] args) {  
          
        // Lambda expression without return keyword.  
        Addable ad1=(a,b)->(a+b);  
        System.out.println(ad1.add(10,20));  
          
        // Lambda expression with return keyword.    
        Addable ad2=(int a,int b)->{  
                            return (a+b);   
                            };  
        System.out.println(ad2.add(100,200));
                
     
        //Thread Example1 with lambda  
        Runnable r1=()->{  
                System.out.println("Thread1 is running...");  
        };  
        Thread t1=new Thread(r1);  
        t1.start();
        
        
        //Thread Example2 with lambda  
        Runnable r2=()-> System.out.println("Thread2 is running..."); 
        Thread t2=new Thread(r2);  
        t2.start();  
    }  
}  