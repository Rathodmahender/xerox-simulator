import java.util.*;

import javax.lang.model.util.Elements;
public class Hashmap{
    public static void main(String[] args) {
        // Create a HashMap to store key-value pairs
       /* HashMap<String, Integer> a = new HashMap<>();
        a.put("mango", 1);
        a.put("apple", 2);
        a.put("banana", 3);
        a.put("orange", 4);
      //  a.put("mango", 5);  //To update the value
        a.remove("mango"); // To remove a key-value pair
        System.out.println(a);*/
     /*if(a.containsKey("apple")) {  //Check if key exists
            System.out.println("Key 'apple' exists " );
    }else{
        System.out.println("Key  does not exist");  
    } */
   //System.out.println(a.get("banana"));  //To get the value associated with a key

   //Iterating through the HashMap
   /*int arr[] = {12,15,18,20};
   for(int i = 0; i < arr.length; i++) {
       System.out.print(arr[i]+ " ");
   }
   System.out.println();
   for(int val:arr) {
       System.out.print(val + " ");
   }
    System.out.println();*/
   //putting values in an array
   /*for(Map.Entry<String,Integer> e : a.entrySet()) {
       System.out.println(e.getKey());
       System.out.println(e.getValue());
   }*/ 


/* problem 1
  HashMap<String,Integer> a = new HashMap<>();
    a.put("Alice",85);
    a.put("Bob",92);
    a.put("Charlie",78);
    a.put("David",95);
    System.out.println(a);
    System.out.println(a.get("Charlie")); 
    if(a.containsKey("Eve")) {
        System.out.println("Key 'Eve' exists");
    } else {
        System.out.println("Eve is not found ");
    }
    a.remove("David");
    System.out.println(a); */

// Problem 2 
    /*     HashMap<String,  Integer> a = new HashMap<>();
        a.put("New York", 8419000);
        a.put("Los Angeles", 3990000);
        a.put("Chicago", 2716000);
        a.put("Houston", 2328000);
        System.out.println(a);
        System.out.println(a.get("Chicago"));
        if(a.containsKey("Maiami{")) {
            System.out.println("Key 'Miami' exists");
        } else {
            System.out.println("Miami is not found ");
        }
        a.remove("los Angeles");
        System.out.println(a); */


    //problem on iterations 
   /*  HashMap<String, Integer> a = new HashMap<>();
    a.put("E101", 88);
    a.put("E102", 75);
    a.put("E103", 92);
    a.put("E104", 65);
    a.put("E105", 88);
    a.put("E106", 95);
    System.out.println(a);
    for (Map.Entry<String, Integer> entry : a.entrySet()) {
            System.out.println("Employee ID: " + entry.getKey() + ", Score: " + entry.getValue());
        }
        int totalSum = 0;
        for (int score : a.values()) { // Iterate directly over values
            totalSum += score;
        }
        double averageScore = (double) totalSum / a.size(); 
        System.out.println("\nAverage Performance Score: " + String.format("%.2f", averageScore));
        int highestScore = -1; // Initialize with a value lower than any possible score
        // First pass to find the highest score
        for (int score : a.values()) {
            if (score > highestScore) {
                highestScore = score;
            }
        }
         System.out.println("\nHighest Performance Score: " + highestScore);
        System.out.print("Employees with Highest Score: ");
        // Second pass to find employees with that score
        for (Map.Entry<String, Integer> entry : a.entrySet()) {
            if (entry.getValue() == highestScore) {
                System.out.print(entry.getKey() + " ");
            }
        }
        System.out.println();
         boolean c = false; // To check if anyone needs review
        System.out.println("\nUpdating scores for performance review...");
        for (Map.Entry<String, Integer> entry : a.entrySet()) {
            if (entry.getValue() < 70 && entry.getValue() != 0) { // Check if score is below 70 and not already 0
                a.put(entry.getKey(), 0); // Update the score to 0
                c = true;
            }
        }
        System.out.println("Map after performance review flagging: " + a);
        if (a.containsValue(0)) { // Efficiently check if any value is 0
            System.out.println("Attention: There are employees needing a performance review (score set to 0).");
        } else {
            System.out.println("All employees are performing well (no score is 0).");
        }*/
    




    // Problem 3 Counting Frequencies of Elements
 /*    String[] fruits = {"apple", "banana", "apple", "orange", "banana", "apple",
                         "grape","banana"};
     HashMap<String, Integer> a = new HashMap<>();
     for(int i=0;i<fruits.length;i++){
        String b = fruits[i];
        if (a.containsKey(b)) {
             int currentCount = a.get(b);
             a.put(b, currentCount + 1);
        }else{
            a.put(b, 1);
        }
     }
      System.out.println("Fruit Frequencies: " + a); */

    // Problem 3 performing sum
   /*  HashMap<String, Integer> a = new HashMap<>();
        a.put("e1",40);
        a.put("e2",50);
        a.put("e3",90);
        int sum=0;
        for(Map.Entry<String,Integer> e:a.entrySet()){
            System.out.println(e.getKey() + " " + e.getValue());
        }
        for(int score : a.values()){
            sum=sum+score;
        }
          System.out.println(sum);*/   
    
        //perform substarction 
     /*    HashMap<String, Integer> a = new HashMap<>();
         a.put("s1", 25);
         a.put("s2", 10);
         for(Map.Entry<String, Integer> e: a.entrySet()) {
             System.out.println(e.getKey() + " " + e.getValue());
         }
         Iterator<Integer> it = a.values().iterator();
            int result = 0;
            if (it.hasNext()) {
            result = it.next();
            }
             while (it.hasNext()) {
            result -= it.next();
        }
            System.out.println("Subtraction of all values: " + result);*/
        

    //average marks and grades of students
  /*   HashMap<String, Integer> a = new HashMap<>();
    a.put("Telugu", 75);
    a.put("English", 90);
    a.put("Maths", 80);
    a.put("Science", 65);
    System.out.println("Marks: " + a);
    for(Map.Entry<String, Integer> e : a.entrySet()) {
        System.out.println("Subject: " + e.getKey() + ", Marks: " + e.getValue());
    }
    int sum=0;
    for(int marks: a.values()) {
        sum=sum+marks;
    }
        System.out.println(sum + " ");
        double avg = (double) sum / a.size();
        System.out.println("Average Marks: " + avg);
        //String grade;
        if(avg >= 90) {
            System.out.println("Grade: A");
        }else if(avg >= 80 && avg < 90) {
            System.out.println("Grade: B");
        }else if(avg >= 70 && avg < 80) {
            System.out.println("Grade: C");
        }else if(avg >= 60 && avg < 70) {
            System.out.println("Grade: D");
        }else{
            System.out.println("Fail");
        }*/

        /* all basic operations 
        HashMap<String, Integer> a = new HashMap<>();
		a.put("mahi",1);
		a.put("arjun",2);
		a.put("aliya",3);
		System.out.println(a);
		System.out.println(a.containsKey("mahi"));
        System.out.println(a.keySet());//all keys will be printed
        System.out.println(a.values());//all values will be printed 
        System.out.println("Key-Value Pairs:");
       for(String key : a.keySet()) {  // key value pairs
            System.out.println(key + "=> " + a.get(key));    
        }
        a.merge("jahnavi", 4, Integer::sum); //for merging values
        System.out.println("After merge: " + a);

        HashMap<String, Integer> b = new HashMap<>();//copying all data from old map and putting it new map
        b.putAll(a); 
        System.out.println("new HashMap " + b); */  

        //problem 1
      /*   String [] arr = {"java", "is", "easy", "and", "java", "is", "powerful"};
        HashMap<String, Integer> a = new HashMap<>();
        for(int i = 0; i < arr.length; i++) {
            String str = arr[i];
           if (a.containsKey(str)) { 
             int currentCount = a.get(str);
             a.put(str, currentCount + 1);
        }else{
            a.put(str, 1);
        }
    }
    System.out.println("Word Frequencies: ");
    System.out.println(a); */ 

    //swap keys and values example {a=1,b=2} output{1=a,2=b}
   /*  HashMap<String, Integer> a = new HashMap<>();
        a.put("a",1);
        a.put("b",2);
        a.put("c",3);
        System.out.println(a);
        HashMap<Integer, String> swappedMap = new HashMap<>();
         for (Map.Entry<String, Integer> entry : a.entrySet()) {
            swappedMap.put(entry.getValue(), entry.getKey());
        }
        System.out.println("Swapped Map: " + swappedMap); */  

        //Finding common keys between two hashmaps
    /*  HashMap<String, Integer> map1 = new HashMap<>();
        map1.put("a", 1);
        map1.put("b", 2);
        map1.put("c", 3);
        System.out.println("Map 1: " + map1);
        HashMap<String, Integer> map2 = new HashMap<>();
        map2.put("a", 4);
        map2.put("b", 5);
        map2.put("d", 6);
        System.out.println("Map 2: " + map2); 
        for(Map.Entry<String, Integer> e: map2.entrySet()) {
            if(map1.containsKey(e.getKey())) {
                System.out.println("Common Key: " + e.getKey());
            }
            } */ 
        //sorting ascending order by there values
      /*   HashMap<String, Integer> a = new HashMap<>();
        a.put("apple", 3);
        a.put("mango", 1);
        a.put("banana", 2);
        List<Map.Entry<String,Integer>> e = new ArrayList<>(a.entrySet());
            e.sort(Map.Entry.comparingByValue());
              for (Map.Entry<String, Integer> entry : e) {
            System.out.println(entry.getKey() + " => " + entry.getValue()); */


            //Remove All Entries with Duplicate Values
          /*   HashMap<String, Integer> a = new HashMap<>();
            a.put("apple", 3);
            a.put("mango", 2);
            a.put("banana", 1);
            a.put("orange", 2);
            a.put("grape", 3);
            System.out.println(a);
            Map<Integer, Integer> valueCount = new HashMap<>();
            for (Integer value : a.values()) {
                valueCount.put(value, valueCount.getOrDefault(value, 0) + 1);
            }
            Iterator<Map.Entry<String, Integer>> it = a.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<String, Integer> entry = it.next();
                if (valueCount.get(entry.getValue()) > 1) {
                    it.remove(); 
                }
            }
                for (Map.Entry<String, Integer> e : a.entrySet()) {
            System.out.println(e.getKey() + " => " + e.getValue());
        } */ 


    //print reverse elements 
  /*   int arr[] = {12, 15, 18, 20};
    int n = arr.length;
    HashMap<Integer, Integer> a = new HashMap<>();
    for(int i=0;i<n;i++) {
        a.put(i, arr[n-1-i]);
    }
    System.out.println("Reversed Array Elements:");
    for(int i=0;i<n;i++){
        System.out.print(a.get(i) + " ");
    }*/ 


    //sum of array elements using hashmap
  /*   int arr[] = {12, 15, 18, 20};
    HashMap<Integer, Integer> a = new HashMap<>();
    for(int i=0;i<arr.length;i++){
        a.put(i, arr[i]);
    }
    int sum = 0;
    for(int i=0;i<arr.length;i++) {
        sum = sum + a.get(i);
    }
    System.out.println("Sum of the array elements is: " + sum);*/ 

    //print the alternate elements in array
   /*  int arr[] = {1,2,3,4,5,6,7,8};
    HashMap<Integer, Integer> a = new HashMap<>();
    for(int i=0;i<=arr.length;i++){
        a.put(i, arr[i]);
    }
    for(int i=1;i<=arr.length;i++) {
        if(i%2==0){
            System.out.print(a.get(i) + " ");
        }
        }*/ 

        //count occurences of each element 
      /*   int arr[] = {1, 2, 2, 3, 3, 3, 4, 4, 4, 4};
        HashMap<Integer, Integer> a = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int n = arr[i];
            if (a.containsKey(n)) {
                int currentCount = a.get(n);
                a.put(n, currentCount + 1);
            } else {
                a.put(n, 1);
            }
        }
            //System.out.println("Element: " + arr[i] + ", Count: " + a.get(arr[i]));
            System.out.println("Element Frequencies: " + a); */
        
    //check each charecter in string 
  /*   String str = "Programming";
    int n = str.length();
    HashMap<Character, Integer> ch = new HashMap<>();
        for(int i=0;i<n;i++) {
            char c = str.charAt(i);
            if (ch.containsKey(c)) {
               ch.put(c,ch.get(c)+1);
            }else{
                ch.put(c,1);
            }
        }
        for (char key : ch.keySet()) {
            System.out.println(key + ", Count: " + ch.get(key));
        }*/

        /*merging two hashmaps
        HashMap<String, Integer> map1 = new HashMap<>();
        map1.put("a",1);
        map1.put("b",2);
        HashMap<String, Integer> map2 = new HashMap<>();
        map2.put("c",3);
        map2.put("d",4);
        HashMap<String, Integer> mergedMap = new HashMap<>(map1);
        mergedMap.putAll(map2);
        System.out.println("Merged Map: " + mergedMap); */

     
    }   
}
            
              
            
    


