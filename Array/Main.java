
// class Main
// {
//     public static void main(String args[])
//     {
//         int a[] = new int[5];
//         a[0] = 10;
//         a[1] = 20;
//         a[2] = 30;
//         a[3] = 40;

//         for(int i = 0; i < a.length; i++)  //array
//         {
//             System.out.println(a[i]+"");
//         }
//     }

// }

////////////

// import java.util.*;
// class Main
// {
//     public static void main(String args[])
//     {
//         int a[] = new int[5];
//         Scanner sc = new Scanner(System.in);  //input in array
//         for(int i = 0; i < a.length; i++)     
//         {
//             a[i] = sc.nextInt();
//         }

//         for(int i = 0; i < a.length; i++)
//         {
//             System.out.println(a[i]);
//         }
//     }

// }

/////////////

// import java.util.*;

// class Main
// {
//     public static void main(String args[])
//     {

//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int a[] = new int[n];
//         for(int i = 0; i < n; i++)     //size of array is taken from user
//         {
//             a[i] = sc.nextInt();
//         }

//         for(int i = 0; i < n; i++)
//         {
//             System.out.println(a[i]);
//         }
//     }

// }

///////////

// import java.util.*;

// class Main
// {
//     public static int[] reverse(int a[])
//     {
//         int s=0;
//         int e=a.length-1;
//         while(s<e)
//         {
//             int temp = a[s];
//             a[s] = a[e];
//             a[e] = temp;
//             s++;
//             e--;
//         }
//         return a;
//     }
//     public static void main(String args[])
//     {
//                                                                                           //reverse an array
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int a[] = new int[n];
//         for(int i = 0; i < n; i++)
//         {
//             a[i] = sc.nextInt();
//         }   
//         reverse(a);
//         for(int i = 0; i < n; i++)
//         {
//             System.out.println(a[i]);
//         }
//     }

// }

///////////
//min max in array

// import java.util.*;
// /**
//  * Main
//  */
// public class Main {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int a[] = new int[n];
//         for(int i = 0; i < n; i++)
//         {
//             a[i] = sc.nextInt();
//         }   
//         int min = Integer.MAX_VALUE;
//         int max = Integer.MIN_VALUE;
//         for(int i = 0; i < n; i++)
//         {
//             if(a[i] < min)
//             {
//                 min = a[i];
//             }
//             if(a[i] > max)
//             {
//                 max = a[i];
//             }
//         }
//         System.out.println("Minimum: " + min);
//         System.out.println("Maximum: " + max);
//     }
// }

//subset of array
// import java.util.ArrayList;

// public class Main{

//   	//Prints all subarrays in arr[0..n-1]
//     static void subArray(ArrayList<Integer> arr) {
//         int n = arr.size();

//         // Pick starting point
//         for (int i = 0; i < n; i++) {

//             // Pick ending point
//             for (int j = i; j < n; j++) {

//                 // Print subarray between current starting and ending points
//                 for (int k = i; k <= j; k++) {
//                     System.out.print(arr.get(k) + " ");
//                 }
//                 System.out.println();
//             }
//         }
//     }

//     public static void main(String[] args) {
//         ArrayList<Integer> arr = new ArrayList<>();
//         arr.add(1);
//         arr.add(2);
//         arr.add(3);
//         arr.add(4);
//         System.out.println("All Non-empty Subarrays:");
//         subArray(arr);
//     }
// }

// import java.util.*;

// class Main{
//     //[2,4,6,8]
//     public static void main(String[] args) {

//         int n = arr.length;

//         int cs=0;
//         int ms= Integer.MIN_VALUE;

//   for(int i=0;i<n;i++){
//     for(int j=i;j<n;j++){
//         cs=0;
//         if(cs>ms){
//             ms=cs;
//         }
//     }
//   }

//     }}

// int n=nums.length;
// int cs=0;
// int ms =nums[0];

// for(int i=0;i<n;i++){
//     cs+=nums[i];

//     ms=Math.max(cs,ms);

//     if(cs<0){
//         cs=0;
//     }
//     return ms;
// }

// int n = height.length;
// int waterTrapped = 0;
// int [] lm = new int[n];
// int [] rm = new int[n];

// lm[0] = height[0];
// rm[n-1] = height[n-1];

// for(int i=1;i<n;i++){
//     lm[i] = Math.max(lm[i-1],height[i]);
// }
// for(int i=n-2;i>=0;i--){
//     rm[i] = Math.max(rm[i+1],height[i]);
// }

// for(int i=0;i<n;i++){
//     int waterHeight = Math.min(lm[i],rm[i]);
//     waterTrapped += (waterHeight - height[i]);
// }
// return waterTrapped;

// int n = digits.length;

// for(int i=n-1;i>=0;i--){
//    if(digits[i]!=9)
// {
//     digits[i]++;
//     break;
// }
// else{
//     digits[i]=0;
// }
// }
// if(digits[0]==0){
//     int [] newNumber = new int[n+1];
//     newNumber[0]=1;
//     return newNumber;
// }
// return digits;

// int profit = prices[i]-minSF;

// maxP=Math.max(maxP,profit);
// minSF=Math.min(minSF,prices[i]);

// int n = nums.length;

// HashMap<Integer,Integer> hm = new HashMap<>();

// for(int i=0; i<n ; i++){
//     if(hm.containsKey(target-nums[i]))
//     {
//         int [] arr = {hm.get(target-nums[i]),i};
//         return arr;
//     }
//     else{
//         hm.put(nums[i],i);
//     }
// }
// int [] arr = {-1, -1};
// return arr;


//     public List<List<Integer>> threeSum(int[] nums) {
//        public List<List<Integer>> threeSum(int[] nums) {
//         int n = nums.length;
        
// Set<List<Integer>> res = new HashSet<>();

// for(int i=0;i<n;i++){
//      HashSet<Integer> set = new HashSet<>();
//     for(int j=i+1;j<n;j++){
//         int third = 0 -(nums[i]+nums[j]);
//         if(set.contains(third)){
//             ArrayList<Integer> triplets = Arrays.asList(nums[i],nums[j],third);
//             Collection.sort(triplets);

//             res.add(triplets);
            
//         }
      

    
//     return new ArrayList<>(res);

//     }
// }
//        }
//     }


//     set.add(nums[j]);

public class Main {
    public static void moveZeros(int[] nums) {
        int pos = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
             int value = nums[i];
                nums[i] = nums[pos];
                nums[pos] = value;
                pos++;
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 0, 2, 0, 3, 0, 4};

        moveZeros(nums);

        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}