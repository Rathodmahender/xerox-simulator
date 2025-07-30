import java.util.Scanner;
import java.util.*;
public class Arrays {
    public static void main(String[] args) {
    /*
    sum of array elements
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];
    for(int i=0;i<arr.length;i++) {
        arr[i] = sc.nextInt();
    }
    int sum = 0;
    for(int i=0;i<arr.length;i++) {
        sum = sum+arr[i];
    }
    System.out.println("Sum of the array elements is: " + sum);*/  

    /*find the highest number in an array
    int max=0;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			if(max<arr[i]) 
				max=arr[i];
		}
		 System.out.print("This is the heighest number in given array "+ max);*/ 

    //find the lowest number in an array 
    /*Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] =new int[n];
		int min=1;                   
	    for(int i=0; i<n;i++){
	      arr[i]=sc.nextInt();
	    }
	    for(int i=0;i<n;i++){
	      if(min>=arr[i])             
	      min=arr[i];
	    }
	      System.out.print("This is the smallest number in given array "+ min);
		System.out.println();*/


    //reverse an array elements
  /*   Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];
    for(int i=0;i<arr.length;i++) {
        arr[i] = sc.nextInt();
    }
    for(int i=n-1;i>=0;i--) {
    System.out.print(arr[i]+ " ");
    }*/ 

    //2D array
    /*Scanner sc = new Scanner(System.in);
    int[][] arr = new int[2][3];
    for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr[i].length;j++){
            arr[i][j] = sc.nextInt();
        }
    }
    for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr[i].length;j++){
            System.out.print(arr[i][j]+ " ");
        }
        System.out.println();
    }*/

//sum of unique box elements
 /*Scanner sc = new Scanner(System.in); 
  int arr[][] = new int[2][3]; 
  for(int i=0;i<2;i++) { 
   for(int j=0;j<3;j++) { 
    arr[i][j]=sc.nextInt(); 
     
   } 
  } 
  for(int i=0;i<2;i++) { 
   int sum=0; 
   for(int j=0;j<3;j++) { 
    sum=sum+arr[i][j]; 
   } 
    System.out.println(sum);
}*/ 

        //3d array 
        /*Scanner sc = new Scanner(System.in);
        int[][][] arr = new int[2][2][2]; // 2 blocks, each block has 2 rows and 3 column
        for (int i = 0; i < arr.length; i++) {          
            for (int j = 0; j < arr[i].length; j++) {   
                for (int k = 0; k < arr[i][j].length; k++) {  
                    arr[i][j][k] = sc.nextInt();
                }
            }
        }
        int sum=0; 
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                for (int k = 0; k < arr[i][j].length; k++) {
                    sum=sum+arr[i][j][k];
                    System.out.print(arr[i][j][k] + " ");
                }
            }
            System.out.println();
        }*/
        // 3D array sum
        /*Scanner sc = new Scanner(System.in);
        int[][][] arr = new int[2][2][3]; // 2 blocks, each block has 2 rows and 3 column
        for (int i = 0; i < arr.length; i++) {          
            for (int j = 0; j < arr[i].length; j++) {   
                for (int k = 0; k < arr[i][j].length; k++) {  
                    arr[i][j][k] = sc.nextInt();
                }
            }
        }
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                for (int k = 0; k < arr[i][j].length; k++) {
                    sum=sum+arr[i][j][k];
                    //System.out.print(arr[i][j][k] + " ");
                }
            }
        }
         System.out.println("Sum of all elements: " + sum);

         //unique box sum in 3d array
        /*Scanner sc = new Scanner(System.in);
        int[][][] arr = new int[2][2][3]; // 2 blocks, 2 rows, 3 column
        for (int i = 0; i < arr.length; i++) {          
            for (int j = 0; j < arr[i].length; j++) {   
                for (int k = 0; k < arr[i][j].length; k++) {  
                    arr[i][j][k] = sc.nextInt();
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            int blockSum = 0;
            for (int j = 0; j < arr[i].length; j++) {
                for (int k = 0; k < arr[i][j].length; k++) {
                    blockSum += arr[i][j][k];
                }
            }
            System.out.println("Sum of elements in Block " + blockSum);
        }*/
    //sorting Techniques
    //sort in single array without sort method
     /* Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
        for(int j=i+1;j<n;j++){
        if(arr[j] < arr[i]){
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
        }
        }
    }
        for(int i=0;i<n;i++){
    System.out.print(arr[i]+ " ");
    }  */  


    /* sort in 2D array without sort method
      Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int arr[][] = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                for(int k=j+1;k<m;k++){
                    if(arr[i][k] < arr[i][j]){
                        int temp = arr[i][k];
                        arr[i][k] = arr[i][j];
                        arr[i][j] = temp;
                    }
                }
            }
        }
        for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            System.out.print(arr[i][j]+ " ");
        }
        System.out.println();
    }*/



    //sort unique boxes in 2D array
   /* Scanner sc = new Scanner(System.in);
    int arr[][] = new int[2][2]; 
     for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2 - 1; j++) {
                for (int k = j + 1; k < 2; k++) {
                    if (arr[i][k] < arr[i][j]) {
                        int temp = arr[i][j];
                        arr[i][j] = arr[i][k];
                        arr[i][k] = temp;
                    }
                }
            }
        }
        System.out.println("Row-wise Sorted 2D Array:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        //System.out.println();*/

        //print simple 3d array
    /*  Scanner sc = new Scanner(System.in);
        int arr[][][] = new int[2][2][3]; 
        for(int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                for (int k = 0; k < arr[i][j].length; k++) {
                    arr[i][j][k] = sc.nextInt();
                }
            }
        }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                for(int k=0;k<arr[i][j].length;k++){
                    System.out.print(arr[i][j][k] + " ");
                }
                 System.out.println();
            }
        }*/

        //print 3d array unique boxes sorted 
      /*Scanner sc = new Scanner(System.in);
        int[][][] arr = new int[2][2][3];
        System.out.println("Enter 12 elements:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 3; k++) {
                    arr[i][j][k] = sc.nextInt();
                }
            }
        }
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 2; k++) {
                    for (int l = k + 1; l < 3; l++) {
                        if (arr[i][j][k] > arr[i][j][l]) {
                            int temp = arr[i][j][k];
                            arr[i][j][k] = arr[i][j][l];
                            arr[i][j][l] = temp;
                        }
                    }
                }
            }
        }
        System.out.println("\nSorted 3D Array (Each row sorted):");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 3; k++) {
                    System.out.print(arr[i][j][k] + " ");
                }
                System.out.println();
            }
        }*/ 

    //reverse of elements in array
   /*  Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
   int arr[] = new int[n];
   for(int i=0;i<n;i++){
       arr[i] = sc.nextInt();
    }
   for(int i=n-1;i>=0;i--){
   System.out.print(arr[i]+ " ");
   }*/

    //linear search an element in array
    /*Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];
    for(int i=0;i<arr.length;i++){
        arr[i] = sc.nextInt();
    }
    int target = sc.nextInt();
    boolean flag = false;
    for(int i=0;i<arr.length;i++){
        if(arr[i] == target){
            System.out.println("Element is found at " + arr[i]);
            System.out.println("Element is found at index " + i);
            flag = true;
            break;
        }
    }
    if(flag == false){
        System.out.println("Element is not found");
    }*/
     
       //reverse of elements unique boxes in 2D array
      /*  Scanner sc = new Scanner(System.in);
       int arr[][] = new int[2][2];
        for(int i=0;i<2;i++){
        for(int j=0;j<2;j++){
        arr[i][j] = sc.nextInt();
        }
    }
    for(int i=0;i<2;i++){
    for(int j=2-1;j>=0;j--){
    System.out.print(arr[i][j]+ " ");
    }
    System.out.println();
    }*/

    //reverse of elements unique boxes in 3D array
    /*Scanner sc = new Scanner(System.in);
    int arr[][][] = new int[2][2][3];
    for(int i=0;i<2;i++){
        for(int j=0;j<2;j++){
            for(int k=0;k<3;k++){
                arr[i][j][k] = sc.nextInt();
            }
        }
    }
    for(int i=0;i<2;i++){
        for(int j=0;j<2;j++){
            for(int k=3-1;k>=0;k--){
                System.out.print(arr[i][j][k] + " ");
            }
            System.out.println();
            }
            }*/


        //to delete an element in array
        /*ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        list.remove(Integer.valueOf(2));
        System.out.println(list);*/

        /* remove duplicates from sorted array
         public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;

        int k = 1; // pointer for unique elements

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[k - 1]) {
                nums[k] = nums[i];
                k++;
            }
        }

        return k;*/  

        /*move all zeroes to the end of an array
         * class Solution {
    public void moveZeroes(int[] nums) {
        int min=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] != 0){
                nums[min] = nums[i];
                min++;
            }
        }
        while(min < nums.length) {
            nums[min] = 0;
            min++;

        }
         */

         /*missing number in array
         class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int expected = n*(n+1)/2;
        int actual = 0;
        for(int i=0;i<nums.length;i++){
            actual = actual+nums[i];
        }
        return expected-actual; 
    
          *
          */ 

        /* print odd numbers first then even numbers
         * class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2 == 0){
                int temp = nums[i];
                nums[i] = nums[count];
                nums[count] = temp;
                count++; 
            }
        }
    return nums;

         */


    /*print even odd even odd
     *class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int n = nums.length;
        int arr[] = new int[n];
        int even=0;
        int odd=1;
        for(int i=0;i<n;i++){
            if(nums[i]%2 == 0){
                arr[even] = nums[i];
                even += 2;
            }else{
                arr[odd] = nums[i];
                odd += 2;
            }
        }
        return arr;  
     * 
     * 
     * 
     */

     //swap first and last element of an array
        /*Scanner sc = new Scanner(System.in);

        // Input size of array
        System.out.print("Enter the size of the array: ");
        int x = sc.nextInt();
        int arr[] = new int[x];

        // Input array elements
        System.out.println("Enter the array elements:");
        for (int i = 0; i < x; i++) {
            arr[i] = sc.nextInt();
        }

        // Swap first and last elements
        if (x > 1) {
            int temp = arr[0];
            arr[0] = arr[x - 1];
            arr[x - 1] = temp;
        }

        // Print modified array
        System.out.println("Array after swapping first and last elements:");
        for (int i = 0; i < x; i++) {
            System.out.print(arr[i] + " ");
        }*/
    
        }
}
    

