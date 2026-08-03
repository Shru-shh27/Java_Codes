// public class ExceptionHandling {
//     public static void main(String[] Args){
//         try{
//         int res = 10/0;
//         System.out.println(res);
//         }
//         catch(ArithmeticException e){
//             System.out.println(e.getMessage());
//             System.out.println("cannot be zero");
//         }
//     }
// }
// // e instance of ArithmeticException class is created and the message is printed.
// // in object predefine value is zero.

public class TryCatchExample {

    // public static void main(String[] args) {
    // try{
    // int result = 10/0;
    // System.out.println(result);
    // }catch(Exception e){
    // System.out.println(e);
    // System.out.println("Excpetion Handled");
    // }

    // System.out.println("Why Me ?");
    // System.out.println("Why Me ?");
    // System.out.println("Why Me ?");
    // System.out.println("Why Me ?");
    // }

    // Example 2

    // public static void main(String[] args) {
    // try{
    // String str = null;
    // System.out.println(str.length());
    // }catch(Exception e){

    // System.out.println(e);
    // System.out.println("String is null");
    // }

    // System.out.println("Why Me ?");
    // System.out.println("Why Me ?");
    // System.out.println("Why Me ?");
    // System.out.println("Why Me ?");
    // }

    // Finally Block -> Executes always, whether an exception occurs or not
    // why it is used?
    /*
     * 1) Close files
     * 2) Accessing Files
     * 3) Relaease Resourse
     * 3) Cleanup memory / resources
     */

    // public static void main(String[] args) {
    // try{
    // String str = "aakash";
    // System.out.println(str.length());
    // }catch(Exception e){

    // System.out.println(e);
    // System.out.println("String is null");
    // }finally{
    // System.out.println("Finally Block Executed");
    // }

    // System.out.println("Why Me ?");
    // System.out.println("Why Me ?");
    // System.out.println("Why Me ?");
    // System.out.println("Why Me ?");
    // }

    // Multiple try Catch block

    public static void main(String[] args) {
        try {
            String str = null;
            System.out.println(str.length());
        } catch (ArithmeticException e) {

            System.out.println("Arithmetic Exception");
        } catch (NullPointerException e) {
            System.out.println("Null Pointer Exception Block Executed");
        } catch (Exception e) {
            System.out.println("I am parent of all the exceptions");
        } finally {
            System.out.println("Finally Block Exceuted");
        }

        System.out.println("Why Me ?");
        System.out.println("Why Me ?");
        System.out.println("Why Me ?");
        System.out.println("Why Me ?");
    }

}