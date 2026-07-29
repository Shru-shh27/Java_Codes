// import java.util.*;
// public class strings {
    
//     public static void main(String args[])
//     {
//         Scanner sc = new Scanner(System.in);
//         String str = sc.nextLine();
        
//         //you need to count numer consonants,vowels , digits and special characters

//         int vowels = 0, consonants = 0, digits = 0, special = 0;
//         int len = str.length();

//         for(int i = 0; i < len; i++)
//         {
//             char ch = str.charAt(i);
//             if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'))
//             {
//                 ch = Character.toLowerCase(ch);
//                 if("aeiou".indexOf(ch)!=-1)
//                 {
//                     vowels++;
//                 }
//                 else
//                 {
//                     consonants++;
//                 }
//             }
//             else if(ch >= '0' && ch <= '9')
//             {
//                 digits++;
//             }
//             else
//             {
//                 special++;
//             }
//         }
//         System.out.println("Vowels " + vowels);
//         System.out.println("Consonants" + consonants);
//         System.out.println("Digits " + digits);
//         System.out.println("Special  " + special);

//     }
// }

// public class Main {
//     public static void main(String[] args) {
//       Scanner scn = new Scanner(System.in);
        
//       System.out.println("Please enter a string");  
//       String str = scn.nextLine().toLowerCase();
        
//       int vowels= 0, consonants = 0, digits = 0, special = 0;
        
//        for(int i = 0; i < str.length(); i++){
//            char ch = str.charAt(i);
           
//            if(Character.isLetter(ch)){
//                // vowels // consonants
//                if("aeiou".indexOf(ch) != -1){
//                    // vowels
//                    vowels++;
//                }else{
//                    consonants++;
//                }
//            }else if(Character.isDigit(ch)){
//                digits++;
//            }else{
//                special++;
//            }
//        }
        
//         System.out.println("Vowels = " + vowels);
//               System.out.println("Consonants = " + consonants);
//               System.out.println("Digits = " + digits);
//               System.out.println("Special Characters = " + special);
//     }
// }

//gfg

class Solution {

    static void checkString(String s) {
        int v = 0;
        int c = 0;

        // code here
         for(int i = 0; i < s.length(); i++){
           char ch = s.charAt(i);
           
           if(Character.isLetter(ch)){
              
               if("aeiou".indexOf(ch) != -1){
                   v++;
               }else{
                   c++;
               }
        }
         }
        if(v>c){
            System.out.println("Yes");
            
        }
        else if(v<c){
            System.out.println("No");
            
        }
        else{
            System.out.println("Same");
           
        }
        
         
    }
}