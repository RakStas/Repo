package Day52_ExceptionsContinue;

public class MultiException {
    public static void main(String[] args) {

        int arr[]={10,20};
        try{
            System.out.println(arr[5]);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException");
        }

        catch (IndexOutOfBoundsException e){

        System.out.println("IndexOutOfBoundsException");
        }

        catch (RuntimeException e){
            System.out.println("RuntimeException");

        }
        System.out.println("=====================");

        try{
            System.out.println(10/0);
            System.out.println("Try");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Catch");
        }finally {
            System.out.println("finally");
        }




    }
}
