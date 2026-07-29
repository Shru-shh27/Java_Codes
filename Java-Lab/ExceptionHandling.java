public class ExceptionHandling {
    public static void main(String[] Args){
        try{
        int res = 10/0;
        System.out.println(res);
        }
        catch(ArithematicException e){
            System.out.println("cannot be zero");
        }
    }
}
