// Multithreading in Java using sleep method 
/*public class multithread extends Thread {
    public void run() { 
        String a = Thread.currentThread().getName();
        try{
        for(int i=1;i<=3;i++){
            System.out.println(a);
            Thread.sleep(3000);
        }
    }
    catch(InterruptedException i){

    }
    }
}
class B{
    public static void main(String[] args) {
        // sleep method in multithreading
        multithread t1 = new multithread(); 
        multithread t2 = new multithread();
        multithread t3 = new multithread();  

        t1.setName("Thread 1");
        t2.setName("Thread 2");
        t3.setName("Thread 3"); 

        t1.start();
        t2.start();
        t3.start();

    }   
}*/  

//with sleep method and goes to cathch block if interrupted
/*public class multithread extends Thread {
    public void run(){
        String a = Thread.currentThread().getName();
        try{
        for(int i=1;i<=3;i++){
            System.out.println(a);
            Thread.sleep(1000);
        }
    }
    catch(InterruptedException i){
        System.out.println("Thread was interrupted: " );
        Thread.currentThread().interrupt(); 
        return;
    }
    System.out.println(a + " has finished execution.");
        
    }
}
class B{
    public static void main(String[] args) {
        
        multithread t1 = new multithread();
        multithread t2 = new multithread();
        multithread t3 = new multithread(); 

        t1.setName("Thread 1");
        t2.setName("Thread 2");
        t3.setName("Thread 3"); 

        t1.start();
        t2.start();
        t3.start();
    }
} */   

//multithreading with join method   (if we want to run one thread perticularly among all threads then we use join method)
/*public class multithread extends Thread {
    public void run(){
        String a = Thread.currentThread().getName();
        for(int i=1;i<=3;i++){
            System.out.println(a);
        }
    }
}
class B{
    public static void main(String[] args) {
        multithread t1 = new multithread();
        multithread t2 = new multithread();
        multithread t3 = new multithread(); 

        t1.setName("Thread 1");
        t2.setName("Thread 2");
        t3.setName("Thread 3"); 

        t2.start(); 
        try{
            t2.join();
            Thread.sleep(1000);
        }
        catch(InterruptedException i){

        }
        t1.start();
        t3.start(); 
    }
}*/
//sum of n natural numbers using sleep method to wait prticular thread for few seconds
/*class multithread extends Thread {
    public void run() {
        String a = Thread.currentThread().getName();
        int n = 10; // You can change this value to set the range
        int sum = 0;
         if ("thread 2".equals(a)) {
            System.out.println(a+ " - Waiting for 5 seconds...");
            try {
                Thread.sleep(5000); // Sleep for 5000 milliseconds (5 seconds)
            } catch (InterruptedException e) {
                System.out.println("Thread was interrupted: " + e.getMessage());
                Thread.currentThread().interrupt(); // Re-interrupt the thread
            }
        }
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println(a + " - Sum of first " + n + " natural numbers is: " + sum);
       
    }
}  
public class B{
	public static void main(String[] args) {
		multithread t1 = new multithread();
		multithread t2 = new multithread();
		multithread t3 = new multithread();
		
		t1.setName("thread 1");
		t2.setName("thread 2");
		t3.setName("thread 3");
		
		t1.start();
		t2.start();
		t3.start();
	}
}*/ 

//palindrome number using join method in multithreading 
/*class multithread extends Thread {
    public void run() {
        String a = Thread.currentThread().getName();
        int n = 121; 
        int c = n;
        int rev = 0;
        while(n>0){
            int rem = n%10;
            rev=rev*10 + rem;
            n=n/10;
        }if(c == rev){
            System.out.println(a + " - " + c + " is a palindrome number.");
        } else {
            System.out.println(a + " - " + c + " is not a palindrome number.");
        }
    }
}
public class B{
    public static void main(String[] args) {
        multithread t1 = new multithread();
        multithread t2 = new multithread();
        multithread t3 = new multithread(); 

        t1.setName("Thread 1");
        t2.setName("Thread 2");
        t3.setName("Thread 3"); 

        t1.start();

        try{
           Thread.sleep(6000);
           System.out.println("waiting for Thread 1");
           t1.join(); 
           System.out.println("waiting for Thread 2");
              t2.join();
              System.out.println("waiting for Thread 3");
              t3.join();
        }catch(InterruptedException i){
            System.out.println("Thread was interrupted: " + i.getMessage());
            Thread.currentThread().interrupt(); 
        }

    }
}*/ 


        

//print prime numbers 1 to n using sleep method multithreading 
/* 
public class multithread extends Thread {
    
    public void run(){
        String a = Thread.currentThread().getName();
        int n = 10; // You can change this value to set the range
        for(int i=1;i<=n;i++){
            boolean isPrime = true;
            if(i < 2) {
                isPrime = false; // 0 and 1 are not prime numbers
            } else {
                for(int j=2;j<=Math.sqrt(i);j++){
                    if(i % j == 0){
                        isPrime = false;
                        break;
                    }
                }
            }
            if(isPrime) {
                System.out.println(a + " - " + i + " is a prime number.");
            }
            try {
                Thread.sleep(100); // Sleep for 500 milliseconds
            } catch (InterruptedException e) {
                System.out.println("Thread was interrupted: " + e.getMessage());
            }
        }
    }
}
class B {
    public static void main(String[] args) {
        multithread t1 = new multithread();
        multithread t2 = new multithread();
        multithread t3 = new multithread(); 

        t1.setName("Thread 1");
        t2.setName("Thread 2");
        t3.setName("Thread 3"); 

        t1.start();
        t2.start();
        t3.start();
    }
}*/ 
//print even numbers 1 to n using sleep method multithreading
/*public class multithread extends Thread {
public void run() {
		String a = Thread.currentThread().getName();
		int n = 10;
		for(int i=1;i<=n;i++) {
			if(i%2 == 0) {
				System.out.println(i);
			}
		}
		try {
			Thread.sleep(100);
		}catch (InterruptedException e) {
			System.out.println("Thread was interrupted: " + e.getMessage());
		}
	}
}
class B{
	
public static void main(String[] args) {
	multithread t1 = new multithread();
	multithread t2 = new multithread();
	multithread t3 = new multithread();
	
	t1.setName("Thread1");
	t2.setName("Thread2");
	t3.setName("Thread3");
	
	t1.start();
	t2.start();
	t3.start();
}
}*/
 //print perfect numbers or not using sleep method multithreading
  /*   public class multithread extends Thread{
	public void run() {
		String a = Thread.currentThread().getName();
		int n=6;
		int sum=0;
		for(int i=1;i<=n;i++) {
			if(n%i == 0) {
				sum=sum+i;
                System.out.println(sum);
			}
		}
		if(sum == n) {
            System.out.println(n + " is a perfect number.");
        } else {
            System.out.println(n + " is not a perfect number.");
        }
	try {
		Thread.sleep(100);
	}catch (InterruptedException e) {
		System.out.println("Thread was interreupted " +e.getMessage());
	}
}
}
class B{
	public static void main(String[] args) {
		multithread t1 = new multithread();
		multithread t2 = new multithread();
		multithread t3 = new multithread();
		
		t1.setName("thread 1");
		t2.setName("thread 2");
		t3.setName("thread 3");
		
		t1.start();
		t2.start();
		t3.start();
	}
} */  
//avg marks and grade of the students using sleep method multithreading
/*public class multithread extends Thread {
public void run() {
		String a = Thread.currentThread().getName();
		int t=65,h=78,e=70,m=67,sc=88,so=90;
		int Total = t+h+e+m+sc+so;
		float avg = Total/6;
		System.out.println(avg);
        if(avg >=90){
            System.out.println("Grade A");
        } else if(avg >=80 && avg < 90){
            System.out.println("Grade B");
        } else if(avg >=70 && avg < 80){
            System.out.println("Grade C");
        } else if(avg >=60 && avg < 70){
            System.out.println("Grade D");
        } else {
            System.out.println("Grade F");
        }
	try {
		Thread.sleep(100);
	}catch (InterruptedException g) {
		System.out.println("Thread was interreupted " +g.getMessage());
	}
}
}
class B{
	public static void main(String[] args) {
        multithread t1 = new multithread();
        multithread t2 = new multithread();
        multithread t3 = new multithread();
        
        t1.setName("thread 1");
        t2.setName("thread 2");
        t3.setName("thread 3");
        
        t1.start();
        t2.start();
        t3.start();
    }
} */
    
//print fibonacci series using sleep method multithreading
/*public class multithread extends Thread{
	public void run() {
		String s = Thread.currentThread().getName();
		int a=0,b=1,c,n=6;
		for(int i=1;i<=n;i++) {
			System.out.print(a+ " ");
			c=a+b;
			a=b;
			b=c;
		try {
			Thread.sleep(100);
		}catch (InterruptedException e) {
			System.out.println("These was interupted " +e.getMessage());
        }
	}
}
}
class B{
    public static void main(String[] args) {
        multithread t1 = new multithread();
        multithread t2 = new multithread();
        multithread t3 = new multithread();
        
        t1.setName("Thread 1");
        t2.setName("Thread 2");
        t3.setName("Thread 3");
        
        t1.start();
        t2.start();
        t3.start();
    }
}*/

//swaping without using third variable using sleep method multithreading
/*public class multithread extends Thread{
	public void run() {
		String a = Thread.currentThread().getName();
		int x=3,b=4;
		System.out.println("before swaping" + " x: " + x + " b: " + b);
		x=x+b;
		b=x-b;
		x=x-b;
		System.out.println("after swaping" + " x: " + x + " b: " + b);
		try {
			Thread.sleep(100);
		}catch (InterruptedException e) {
			System.out.println("These was Interrupted " +e.getMessage());
		}
	}
}
class B{
    public static void main(String[] args) {
        multithread t1 = new multithread();
        multithread t2 = new multithread();
        multithread t3 = new multithread();
        
        t1.setName("Thread 1");
        t2.setName("Thread 2");
        t3.setName("Thread 3");
        
        t1.start();
        t2.start();
        t3.start();
    }
}*/ 

//reverse of a number using sleep method multithreading 
/*public class multithread extends Thread{
	public void run() {
		String a = Thread.currentThread().getName();
		int rev;
		int n=12345;
		while(n>0) {
			rev=n%10;
			System.out.print(rev);
			n=n/10;
			try {
				Thread.sleep(100);
			}catch(InterruptedException g) {
				System.out.println("Thread was interrupted " +g.getMessage());
			}
		}
	} 
}
class B{
    public static void main(String[] args) {
        multithread t1 = new multithread();
        multithread t2 = new multithread();
        multithread t3 = new multithread();
        
        t1.setName("Thread 1");
        t2.setName("Thread 2");
        t3.setName("Thread 3");
        
        t1.start();
        t2.start();
        t3.start();
    }
}*/



//multithreading with sleep method and random time interval
/*import java.util.concurrent.TimeUnit;
public class multithread extends Thread {
    public void run(){
        String a = Thread.currentThread().getName();
        for(int i=1;i<=3;i++){
            System.out.println(a + " is running.");
            try {
                TimeUnit.MILLISECONDS.sleep((long) (Math.random()*7000)); // Sleep for 1 second
            } catch (InterruptedException e) {
                System.out.println("Thread was interrupted: " + e.getMessage());
                Thread.currentThread().interrupt();
                return;
            }
        }
    }
}
class B {
    public static void main(String[] args) {
        multithread t1 = new multithread();
        multithread t2 = new multithread();
        multithread t3 = new multithread();

        t1.setName("Thread 1");
        t2.setName("Thread 2");
        t3.setName("Thread 3");

        t1.start();
        t2.start();
        t3.start();
    }
}*/

            

