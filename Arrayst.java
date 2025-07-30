import java.util.Arrays;
public class Arrayst {
    public static void main(String[] args) {
        //length of an array
      /*   Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
        }
        System.out.print("size of length is " +arr.length);*/

        // method to return array elements
      /*   int [] a = readArray();
        for(int i=0;i<a.length;i++){
            System.out.print(a[i] + " ");
        }
    }
    public static int[] readArray() {
        int arr[] = {10,20,30,40,50};
        return arr;*/

    /*     int [] a = readArray();
        for(int i=0;i<a.length;i++){
            System.out.print(a[i] + " ");
        }
    }
    public static int [] readArray() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 
        int arr[] = new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        return arr;*/ 
        // method to return array elements print reverse
        /*int a[] = readArray();
        for(int i=0;i<a.length;i++){
        System.out.print(a[i]+ " ");
        }
    }
    public static int[] readArray(){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];
    for(int i=n-1;i>=0;i--){
    arr[i]=sc.nextInt();
    }
    return arr;*/

    // method to return array elements even numbers
   /*int even[] = readArray();
        for (int i = 0; i < even.length; i++) {
            System.out.print(even[i] + " ");
        }
    }

    public static int[] readArray() {
        int count = 0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            if (num % 2 == 0) {
                arr[count++] = num;
            }
        }
        int[] even = new int[count];
        for (int i = 0; i < count; i++) {
            even[i] = arr[i];
        }

        return even;*/

        // method to return array odd
    /*int[] a = readArray();
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }

    public static int[] readArray() {
        Scanner sc = new Scanner(System.in);
        int count = 0;

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            if (isPrime(num)) {
                arr[count++] = num;
            }
        }

        // Copy only prime numbers into final array
        int[] primes = new int[count];
        for (int i = 0; i < count; i++) {
            primes[i] = arr[i];
        }

        return primes;
    }
    // Method to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0)
                return false;
        }
        return true;*/

        //find the average of an array
        /*Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        double sum = 0;
        double average = 0;
        for(int i=0;i<n;i++){
            sum = sum+arr[i];
        }
        average = sum/n;
        System.out.println("The average of the array is: " + average);*/ 

        //sum of 2 array elements 
       /*  Scanner sc = new Scanner(System.in);
        int arr1[][] = new int[2][3];
        int arr2[][] = new int[2][3];
        int sum[][] = new int[2][3];
        for(int i=0;i<2;i++){
            for(int j=0;j<3;j++){
                arr1[i][j] = sc.nextInt();
            }
        }
        for(int i=0;i<2;i++){
            for(int j=0;j<3;j++){
                arr2[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                sum[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        for(int i=0;i<2;i++){
            for(int j=0;j<3;j++){
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }*/

        //compare two arrays
       /*  Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        int arr2[] = new int[m];
            for(int i=0;i<m;i++){
            arr2[i] = sc.nextInt();
            }
            for(int i=0;i<n;i++){
                boolean isEqual = false;
                for(int j=0;j<m;j++){
                    if(arr[i] == arr2[j]){
                        isEqual = true;
                        //System.out.println(" both are equal ");
                        break;
                    }
                }
                 if(isEqual) {
                System.out.println(arr[i] + " is present in both arrays");
            } else {
                System.out.println(arr[i] + " is NOT present in second array");
            }*/

           /*  int a[] = {5,4,3,2,1};
            int b[] = {5,4,3,2,1};

                if(Arrays.equals(a, b)) {
                    System.out.println("Both arrays are equal ");
                }else{
                    System.out.println("Both arrays are not equal ");
                }*/
	}
}
        
