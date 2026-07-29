// import java.util.*;
// public class Matrix {
//     public static void main(String args[])

//     {
//         // int  m ,n;
//         // Scanner sc0 = new Scanner(System.in);
//         // Scanner sc2 = new Scanner(System.in);

//         // int a[][] = new int[m][n];

//         // int b[][] = new int[3][3];

//         // Scanner sc = new Scanner(System.in);
//         // Scanner sc1= new Scanner(System.in);

//         // for(int i = 0; i < 3; i++)
//         // {
//         //     for(int j = 0; j < 3; j++)
//         //     {
//         //         a[i][j] = sc.nextInt();
//         //     }
//         // }
//         // for(int i = 0; i < 3; i++)
//         // {
//         //     for(int j = 0; j < 3; j++)
//         //     {
//         //         b[i][j] = sc1.nextInt();
//         //     }
//         // }


//         // for(int i = 0; i < 3; i++)
//         // {
//         //     for(int j = 0; j < 3; j++)
//         //     {
//         //         System.out.print(a[i][j]+" ");
//         //     }
//         //     System.out.println();
//         // }

//         // for(int i = 0; i < 3; i++)
//         // {
//         //     for(int j = 0; j < 3; j++)
//         //     {
//         //         System.out.print(b[i][j]+" ");
//         //     }
//         //     System.out.println();
//         // }

//         // //addition of two matrices

//         // int c[][] = new int[3][3];
//         // for(int i = 0; i < 3; i++)
//         // {
//         //     for(int j = 0; j < 3; j++)
//         //     {
//         //         c[i][j] = a[i][j] + b[i][j];
//         //     }
//         // }
//         // for(int i = 0; i < 3; i++)
//         // {
//         //     for(int j = 0; j < 3; j++)
//         //     {
//         //         System.out.print(c[i][j]+" ");
//         //     }
//         //     System.out.println();
//         // }

//         // //subtraction of two matrices
//         // int d[][] = new int[3][3];
//         // for(int i = 0; i < 3; i++)
//         // {
//         //     for(int j = 0; j < 3; j++)
//         //     {
//         //         d[i][j] = a[i][j] - b[i][j];
//         //     }
//         // }
//         // for(int i = 0; i < 3; i++)
//         // {
//         //     for(int j = 0; j < 3; j++)
//         //     {
//         //         System.out.print(d[i][j]+" ");
//         //     }
//         //     System.out.println();
//         // }

//         // //multiplication of two matrices
//         // int e[][] = new int[3][3];  
//         // for(int i = 0; i < 3; i++) {    
//         //     for(int j = 0; j < 3; j++){    
//         //         e[i][j] = 0;      
//         //         for(int k = 0; k < 3; k++)      
//         //         {      
//         //             e[i][j] += a[i][k] * b[k][j];      
//         //         }  
//         //     }  
//         // }
//         // for(int i = 0; i < 3; i++)
//         // {
//         //     for(int j = 0; j < 3; j++)
//         //     {
//         //         System.out.print(e[i][j]+" ");
//         //     }
//         //     System.out.println();
//         // }


// //         Scanner sc = new Scanner(System.in);

// //         System.out.println("Enter the number of rows of the matrix:");
// //         int rows = sc.nextInt();

// //         System.out.println("Enter the number of columns of the matrix:");
// //         int cols = sc.nextInt();

// //         int [][] a=  new int[rows][cols];
// //         int [][] b=  new int[rows][cols];

// //         System.out.println("Enter the elements of the first matrix:");
// //         for(int i=0;i<rows;i++){
// //             for(int j=0;j<cols;j++){
// //                 a[i][j] = sc.nextInt();

// //             }
// //         }

// //         System.out.println("Enter the elements of the second matrix:");
// //         for(int i=0;i<rows;i++){
// //             for(int j=0;j<cols;j++){
// //                 b[i][j] = sc.nextInt();
// //             }
// //         }

// //         //addition
// //         System.out.println("matrix addition");
// //         for(int i=0;i<rows;i++){
// //             for(int j=0;j<cols;j++){
// //                 a[i][j] = a[i][j] + b[i][j];
// //                 System.out.print(a[i][j]+" ");
// //             }
// //             System.out.println();
// //         }

// //         //subtraction
// //         System.out.println("matrix subtraction");
// //         for(int i=0;i<rows;i++){
// //             for(int j=0;j<cols;j++){
// //                 a[i][j] = a[i][j] - b[i][j];
// //                 System.out.print(a[i][j]+" ");
// //             }
// //             System.out.println();
// //         }

// //         //multiplication
// //         System.out.println("matrix multiplication");
// //         if(rows==cols){
// //             int [][] result = new int[rows][cols];
// //             for(int i=0;i<rows;i++){
// //                 for(int j=0;j<cols;j++){
// //                     for(int k=0;k<cols;k++){
// //                         result[i][j] += a[i][k] * b[k][j];
// //                     }
// //                 }
// //             }
// //               for(int i=0;i<rows;i++){
// //                 for(int j=0;j<cols;j++){
// //                     System.out.print(result[i][j]+" ");
// //                 }
// //                 System.out.println();
// //             }
// //         }
// //         else{
// //            System.out.println("Matrix multiplication is not possible.");
        
// //         }
// //     }
// // }

// // "static void main" must be defined in a public class.
// public class Main {
//     public static void main(String[] args) {
//         Scanner scn = new Scanner(System.in);
        
//         System.out.println("Enter number of rows: ");
//         int rows = scn.nextInt();
        
//         System.out.println("Enter number of Columns: ");
//         int cols = scn.nextInt();
        
//         int[][] a = new int[rows][cols];
//         int[][] b = new int[rows][cols];
        
//         System.out.println("Enter elements of first Matrix");
//         for(int i = 0; i < rows; i++){
//             for(int j = 0; j < cols; j++){
//                 a[i][j] = scn.nextInt();
//             }
//         }
        
//         System.out.println("Enter elements of second Matrix");
//         for(int i = 0; i < rows; i++){
//             for(int j = 0; j < cols; j++){
//                 b[i][j] = scn.nextInt();
//             }
//         }
        
//         // addition
//         System.out.println("Matrix Addition");
//         for(int i = 0; i < rows; i++){
//             for(int j = 0; j< cols; j++){
//                 System.out.print(a[i][j] + b[i][j] + " ");
//             }
//             System.out.println();
//         }
        
//         // subtraction
//          System.out.println("Matrix Subtraction");
//         for(int i = 0; i < rows; i++){
//             for(int j = 0; j< cols; j++){
//                 System.out.print(a[i][j] - b[i][j] + " ");
//             }
//             System.out.println();
//         }
        
//         // multiplication
        
//         if(rows == cols){
//             int[][] result = new int[rows][cols];
            
//             for(int i = 0; i < rows; i++){
//                 for(int j = 0; j < cols; j++){
//                     for(int k = 0; k < cols; k++){
//                          result[i][j] = result[i][j] + a[i][k] * b[k][j];
//                     }
                    
                   
//                 }
//             }
            
//             System.out.println("Matrix Multiplication");
//         for(int i = 0; i < rows; i++){
//             for(int j = 0; j < cols; j++){
//                 System.out.print(result[i][j] + " ");
//             }
//             System.out.println();
//         }
//         }else{
//             System.out.println("Multiplication is not possible");
//         }
        
//     }
// }


class Solution {
    public ArrayList<ArrayList<Integer>> multiplyMatrices(int[][] a, int[][] b) {
        // code here
       int rowsA = a.length;
       int colsA = a[0].length;
       int colsB = b[0].length;
       
       ArrayList<ArrayList<Integer>> result = new ArrayList<>();
       
       for(int i = 0; i<rowsA;i++){
           ArrayList<Integer> row = new ArrayList<>();
           for(int j=0;j<colsB;j++){
               int ansEachRow = 0;
               
               for(int k=0;k<colsA;k++){
                   ansEachRow = ansEachRow + a[i][k] * b[k][j];
                   
               }
               row.add(ansEachRow);
           }
           result.add(row);
           
       }
           
           
           return result;
    }
}