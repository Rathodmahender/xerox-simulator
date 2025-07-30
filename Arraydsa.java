import java.util.Scanner;
public class Arraydsa {
    public static void main(String[] args){
      /* linear search
        Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
             int arr[] = new int[n];
            for(int i=0;i<arr.length;i++){
                arr[i] = sc.nextInt();
            }
            int target = sc.nextInt();
            boolean flag = false;
             for(int i=0;i<arr.length;i++){
                if(arr[i] == target){
                    System.out.println("element is found at " +arr[i]);
                   System.out.println("element is found at index " + i);
                    flag = true;
                    break;
                }
            }
            if(flag == false){
                System.out.println("element is not found");
            } */
        //Bubblesort  
       /*  Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        boolean flag = false;
        for(int i=0;i<n;i++){
            for(int j=0;j<n-1-i;j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag = true;
                }
            }
            if(flag == false){
                break;
            }
            }
             for(int k=0;k<n;k++){
                System.out.print(arr[k] + " ");
        } */

    //linearsearch and as well bubblesort
    /*Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		boolean flag = false;
        for(int i=0;i<n;i++){
            for(int j=0;j<n-1-i;j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag = true;
                }
            }
            if(flag == false){
                break;
            }
            }
             for(int k=0;k<n;k++){
                System.out.print(arr[k] + " ");
        }
             System.out.println();
		int target=sc.nextInt();
		for(int i=0;i<n;i++) {
			if(arr[i] == target) {
				System.out.println("Element is found at index "+ i + " with value "+ arr[i]);
				flag = true;
				break;
			}
		}
		if(flag == false) {
			System.out.println("Element is not found");
        }*/

        //Insertion Sort
      /*  Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        for(int i=1;i<n;i++){
            int temp = arr[i];
            int j = i-1;
            while(j >= 0 && arr[j] > temp){
                arr[j+1] = arr[j];
                j--;
                }
            arr[j+1] = temp;
            }
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }*/

        //Selection Sort
      /*  Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<n-1;i++){
            int min = i;
            for(int j=i+1;j<n;j++){
                if(arr[j] < arr[min]){
                    min = j;
                }
            }
            if(min != i){
                int temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
            }
            }
        for(int i=0;i<n;i++){
                System.out.print(arr[i] + " ");
        }*/
    //binarysearch 
    /*  public static void sortBinary(int[] nums, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[j] < nums[i]) {
                    int temp = nums[j];
                    nums[j] = nums[i];
                    nums[i] = temp;
                }
            }
        }
    }

    // Binary search
    public static int binarySearch(int[] nums, int n, int data) {
        int l = 0, r = n - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (data == nums[mid]) {
                return mid;
            } else if (data < nums[mid]) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return -1;
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size
        int n = sc.nextInt();
        int[] arr = new int[n];

        // Input array elements
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Input target element to search
        int target = sc.nextInt();

        // Sort the array
        sortBinary(arr, n);

        // Print sorted array
        System.out.print("Sorted array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // Binary search
        int result = binarySearch(arr, n, target);
        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found");
        }*/

        /*
        *
        *
        *
        multiple programs using single inheritance
        import java.util.*;

class Big {
    Scanner sc = new Scanner(System.in);

    void bubbleSort() {
        System.out.print("Enter size of array for Bubble Sort: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        boolean flag;
        for (int i = 0; i < n - 1; i++) {
            flag = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    flag = true;
                }
            }
            if (!flag) break;
        }

        System.out.print("Sorted Array (Bubble Sort): ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    void binarySearch() {
        System.out.print("Enter size of array for Binary Search: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Sort array manually before binary search
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[i]) {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }

        System.out.print("Enter element to search: ");
        int target = sc.nextInt();

        int res = binarySearch(arr, target, n);
        if (res != -1)
            System.out.println("Element found at index: " + res);
        else
            System.out.println("Element not found.");
    }

    int binarySearch(int[] arr, int target, int n) {
        int l = 0, r = n - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr[mid] == target)
                return mid;
            else if (arr[mid] > target)
                r = mid - 1;
            else
                l = mid + 1;
        }
        return -1;
    }

    void studentGrade() {
        System.out.println("Enter marks of 4 subjects:");
        int s1 = sc.nextInt();
        int s2 = sc.nextInt();
        int s3 = sc.nextInt();
        int s4 = sc.nextInt();

        int total = s1 + s2 + s3 + s4;
        int avg = total / 4;

        System.out.println("Total Marks: " + total);
        System.out.print("Grade: ");
        switch (avg / 10) {
            case 10:
            case 9:
                System.out.println("O Grade");
                break;
            case 8:
                System.out.println("A Grade");
                break;
            case 7:
                System.out.println("B Grade");
                break;
            case 6:
                System.out.println("C Grade");
                break;
            case 5:
                System.out.println("D Grade");
                break;
            case 4:
                System.out.println("Pass");
                break;
            default:
                System.out.println("Fail");
        }
    }

    public static void main(String[] args) {
        Small obj = new Small();
        obj.bubbleSort();
        obj.binarySearch();
        obj.studentGrade();
        obj.sum3DArray();
    }
}

class Small extends Big {
    void sum3DArray() {
        int[][][] arr = new int[2][2][3];
        System.out.println("Enter 12 elements for 3D array:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 3; k++) {
                    arr[i][j][k] = sc.nextInt();
                }
            }
        }

        int sum = 0;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 3; k++) {
                    sum += arr[i][j][k];
                }
            }
        }

        System.out.println("Sum of all 3D array elements: " + sum);
         * 
         * 
         * 
         * 
         * 
         */

    

    }
    
}
