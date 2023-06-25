public class Age {
    static void checkAge(int age) throws Exception{      // unchecked (непроверенный) Exception
        if (age<18){
            throw new Exception ("Acces denied - You must be at least 18 years old.");

        }
      else {
            System.out.println("Access granted -You are old enough!");
        }
    }
    public static void main(String[] args) throws Exception{
        checkAge(18);

    }
}
