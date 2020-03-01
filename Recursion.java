
package assignment.pkg1;


public class Recursion {
    
    public static void main(String[] args) {
        
        Fibonacci fibonas = new Fibonacci();
        
        System.out.println(" The Fibonacci Series Is : ");
        
        for ( int i = 1; i <= 40; i++ )
        {
            System.out.println(fibonas.fibonacci(i));
        }
    }
}