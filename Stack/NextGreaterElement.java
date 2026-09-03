//                                       ----------------------   BRUTE FORCE APPROACH   --------------------
// class greater {                             

//     int []arr= {4, 5, 2, 25,2,9,6,74,15};
//     int []arr2 = new int[arr.length];

//     public void nextGreater(){
//         for(int i=0;i<arr.length;i++){
//             for(int j=0;j<arr.length;j++){
//                 if(arr[i]<arr[j] && j>i){
//                     arr2[i]=arr[j];
//                     break;
//                 }
//                 else{
//                     arr2[i]=-1;
//                 }
//             }       
//         }
//     }
// }
// public class greaterMain {
//     public static void main(String args[]){
//         greater obj = new greater();
//         obj.nextGreater();
//         for(int i=0;i<obj.arr2.length;i++){
//             System.out.print(obj.arr2[i]+" ");
//         }
//     }
// }

//---------------------------------------------   OPTIMIZED APPROACH   ------------------------------------------

import java.util.*;

public class NextGreaterElement {
    public static int[] findNextGreater(int[] arr) {
        int n = arr.length;
        int[] result = new int[n];

        Stack<Integer> stack = new Stack<>();
        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && stack.peek() <= arr[i]) {
                stack.pop();
            }
            if (!stack.isEmpty()) {
                result[i] = stack.peek();
            }
            stack.push(arr[i]);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 7, 3, 5, 4, 6, 8 };
        int[] result = findNextGreater(arr);
        System.out.println(Arrays.toString(result)); 
    }
}   