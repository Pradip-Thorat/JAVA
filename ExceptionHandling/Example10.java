package ExceptionHandling;

class NegativeNumberException extends RuntimeException {
    public NegativeNumberException(String message) 
    {
        super(message);
    }
}

class B 
{
    int square(int n) 
    {
        if (n < 0) 
            throw new NegativeNumbersException(n + " is negative");
        return n * n;
    }

    void checkAge(int age) {
        if (age < 0 || age > 120) 
            System.out.println("Invalid age: " + age);
        else
            System.out.println("Age is valid: " + age);
    }
}

public class Example10 {
    public static void main(String[] args) {

        try 
        {
            System.out.println(new B().square(-9));
        } 
        catch (NegativeNumbersException e) 
        {
            System.out.println(e.getMessage());
        }

        new B().checkAge(150);
    }
}
