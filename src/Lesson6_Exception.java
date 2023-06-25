public class Lesson6_Exception {
    public static void main(String[] args) {
        try {
            int[] array = {1, 2, 3};
            System.out.println(array[5]);   /** this is checked Exception sout"Index 5 out of bounds for length 3"**/
        }catch(Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("Exception");

    }
}
}
