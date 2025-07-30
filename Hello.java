import java.util.Scanner;

class Hello{
    public static void main(String[] args) {
       // System.out.println("Hello, World!"); 

       //roots of quadratic equation 
      /*  Scanner sc = new Scanner(System.in);
       int a = sc.nextInt();
       int b = sc.nextInt();
       int c = sc.nextInt();
       double root1, root2;
       double d = (4*a*c) - (b*b);
       if(d > 0){
           root1 = (-b + Math.sqrt(d) / (2 * a));
           root2 = (-b - Math.sqrt(d) / (2 * a));
           System.out.println("roots are imaginary and different " +root1 + " " + root2);
         } else if(d == 0){
            root1 = -b/(2*a);
            root2 = -b/(2*a);
             System.out.println("roots are imaginary and same " +root1 + " " + root2);
            } else {
            System.out.println("roots are real and Imaginary");
            } 
        }
    } */
    

    // evencount and odd count 
   /* Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int evenCount = 0;
    int oddCount = 0;
    for(int i=1;i<=n;i++){
        System.out.print(i + " " );
        if(i%2 == 0){
            evenCount++;
        } else {
            oddCount++;
        }
    }System.out.println();
    System.out.println("Even Count: " + evenCount);
    System.out.println("Odd Count: " + oddCount); */
        
    // perfect number or not 
  /*   Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int sum = 0;
    for(int i=1;i<n;i++){
        if(n % i == 0){
            sum = sum+i;
        }
    }
    if(sum == n){
        System.out.println(n + " is a perfect number.");
    } else {
        System.out.println(n + " is not a perfect number.");
    } */

//count even numbers in given range 
        /* 
        Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int count = 0;
        for(int i=n;i<m;i++){
            if(i%2 == 0){
                count++;
            }
        }
        System.out.println("Count of even numbers between " + n + " and " + m + " is: " + count); */ 

    // check if a number is prime or not 
   /*  Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int count=0;
    for(int i=1;i<=n;i++){
        if(n%i == 0){
            count++;
        }
    }
    if(count == 2){
        System.out.println("its an prime number");
    }else {
        System.out.println("its not an prime number");
    } */ 

    //prime numbers in given range
  /*   Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    for(int i=n;i<=m;i++){
        int count = 0;
        for(int j=1;j<=i;j++){
            if(i%j==0){
                count ++;
            }
        }
        if(count == 2){
            System.out.print(i + " ");
        }
       
    } */  
   //print given charecter vowels or consonent 
 /*   Scanner sc = new Scanner(System.in);
   char ch = sc.next().charAt(0);
   if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' ||
   ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
    System.out.println("These is vowel ");
    }else{
    System.out.println("This is consonent ");
    } */


    //printing vowels or consonent using switch case 
   /*  Scanner sc = new Scanner(System.in);
    char ch = sc.next().charAt(0);
    switch(ch){
        case 'a':
        case 'A':
        System.out.println("This is vowel");
        break;
        case 'e':
        case 'E':
        System.out.println("This is vowel");
        break;
        case 'i':
        case 'I':
        System.out.println("This is vowel");
        break;
        case 'o':
        case 'O':
        System.out.println("This is vowel");
        break;
        case 'u':
        case 'U':
        System.out.println("This is vowel");
        break;
        default:
        System.out.println("This is consonent"); 
    }*/
    
    //print charecters lowercase or uppercase 
   /*   Scanner sc = new Scanner(System.in);
    String str = sc.next();
        String a = str.toLowerCase();     //str.toUpperCase();
        System.out.println("Lowercase: " + a); */

    //print 26 alphabets in lower and uppercase order 
     /*char ch;
    for( ch = 65; ch <= 90; ch++) {
        System.out.print(ch + " ");
    }
    System.out.println();
    for(ch = 97; ch<= 122; ch++) {
        System.out.print(ch + " ");
    } 
}
}*/


    //print lowercase and uppercase in reverse order 
  /*   char ch;
    for(ch = 122;ch>=97;ch--){
        System.out.print(ch + " ");
    }
    System.out.println();
    for(ch = 90;ch>=65;ch--){
        System.out.print(ch + " ");
    }  */ 

    //print ascii values of charecters 
   /* Scanner sc = new Scanner(System.in);
    char ch = sc.next().charAt(0);
    if(ch >= 'a' && ch <= 'z') {
        System.out.println("ASCII value of " + ch + " is: " + (int)ch);  // converts char to asci values
    } else if(ch >= 'A' && ch <= 'Z') {
        System.out.println("ASCII value of " + ch + " is: " + (int)ch);
    } else {
        System.out.println("Please enter a valid alphabet character.");
    }  */ 


    //print asci values of charecter  
  /*   Scanner sc = new Scanner(System.in);
    char ch = sc.next().charAt(0);
    int a = ch;
    System.out.println("given charecter asci value is " +a);
    }
}*/ 

 //print digit sum of a number 
/*  Scanner sc = new Scanner(System.in);
 int n = sc.nextInt();
 int sum=0;
 int rem;
  while(n >0){
    rem = n%10;
    sum = sum + rem;
    n=n/10; 
 }
 System.out.println("Sum of digits is: " + sum); */

 //reverse of a number 
 /*int rev=0;
 Scanner sc = new Scanner(System.in);
 int n = sc.nextInt();
 while(n>0){
    int rem = n%10;
    rev = rev * 10 + rem;
    n = n/10;
 }
 System.out.println("Reversing of the number is: " + rev);
 */ 


//print fibonacci series with prime numbers;
     /*    int a=0,b=1,temp,count;
        for(int i=1;i<=20;i++){
            count=0;
           for(int j=1;j<=a;j++){
               if(a%j==0){
                    count++;
               }
           }
           if(count==2){
               System.out.println(a);
           }
            temp=a+b;
            a=b;
            b=temp;
        }
    }
}*/

        //input must be number and output must be string ex:24 output: two four 
        /* 
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String numStr = Integer.toString(n);

        for (int i = 0; i < numStr.length(); i++) {
            char digit = numStr.charAt(i);
            switch (digit) {
                case '0':
                    System.out.print("zero ");
                    break;
                case '1':
                    System.out.print("one ");
                    break;
                case '2':
                    System.out.print("two ");
                    break;
                case '3':
                    System.out.print("three ");
                    break;
                case '4':
                    System.out.print("four ");
                    break;
                case '5':
                    System.out.print("five ");
                    break;
                case '6':
                    System.out.print("six ");
                    break;
                case '7':
                    System.out.print("seven ");
                    break;
                case '8':
                    System.out.print("eight ");
                    break;
                case '9':
                    System.out.print("nine ");
                    break;
            }
        } */ 

        /* input two four output 2 4
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number in words (e.g., two four):");
        String input = sc.nextLine().toLowerCase(); // Convert to lowercase
        String[] words = input.split(" "); // Split input into words
        for (int i = 0; i < words.length; i++) {
            String word = words[i];

            switch (word) {
                case "zero":
                    System.out.print("0 ");
                    break;
                case "one":
                    System.out.print("1 ");
                    break;
                case "two":
                    System.out.print("2 ");
                    break;
                case "three":
                    System.out.print("3 ");
                    break;
                case "four":
                    System.out.print("4 ");
                    break;
                case "five":
                    System.out.print("5 ");
                    break;
                case "six":
                    System.out.print("6 ");
                    break;
                case "seven":
                    System.out.print("7 ");
                    break;
                case "eight":
                    System.out.print("8 ");
                    break;
                case "nine":
                    System.out.print("9 ");
                    break;
                default:
                    System.out.print("? "); // Handles unexpected input
                    break;
            }
        }
    }
}


        //student marks and grade system
    /*     Scanner sc = new Scanner(System.in);
        int s1 = sc.nextInt();
        int s2 = sc.nextInt();
        int s3 = sc.nextInt();
        int s4 = sc.nextInt();
        int total = s1 + s2 + s3 + s4;
        System.out.println("Total marks: " + total);
        int avg = total / 4;
        switch (avg / 10) {
            case 9:
            System.out.println("O grade");
                break;
            case 8:
            System.out.println("A grade");
                break;
            case 7:
            System.out.println("B grade");
                break;
            case 6:
            System.out.println("C grade");
                break;
            case 5:
            System.out.println("D grade");
                break;
            case 4:
            System.out.println("pass");
                break; 
            default:
            System.out.println("fail");
        }
    }
}*/   
        /* 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks of 4 subjects:");
        int s1 = sc.nextInt();
        int s2 = sc.nextInt();
        int s3 = sc.nextInt();
        int s4 = sc.nextInt();

        int total = s1 + s2 + s3 + s4;
        System.out.println("Total marks: " + total);

        float avg = total / 4.0f;  // Notice the 4.0f to force float division

        System.out.println("Average marks: " + avg);

        if (avg > 90) {
            System.out.println("O grade");
        } else if (avg >= 80 && avg <= 90) {
            System.out.println("A grade");
        } else if (avg >= 70) {
            System.out.println("B grade");
        } else if (avg >= 60) {
            System.out.println("C grade");
        } else if (avg >= 50) {
            System.out.println("D grade");
        } else if (avg >= 40) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }
    }
}*/


//print basic calcolator using switch case 
	/*Scanner sc = new Scanner(System.in);
	double first = sc.nextDouble();
	double second = sc.nextDouble();
	double result ;
	System.out.println("Select any operator (+ , - , * , / , %)");
	char operator = sc.next().charAt(0);

switch(operator)
{
	case '+':
		result = first + second ;
		System.out.println(first+" "+operator+" "+ second+"="+" "+result);
		break;
	case '-':
		result = first - second ;
		System.out.println(first+" "+operator+" "+second+"="+" "+result);
		break;
	case '*':
		result = first * second ;
		System.out.println(first+" "+operator+" "+second+"="+" "+result);
		break;
	case '/':
		result = first / second ;
		System.out.println(first+" "+operator+" "+second+"="+" "+result);
		break;
	case '%':
		result = first % second ;
		System.out.println(first+" "+operator+" "+second+"="+" "+result);
		break;
		
	default:
		System.out.println("Error");
}


//print sum of two matrix 
    }
} */
