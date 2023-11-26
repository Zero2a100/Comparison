import java.util.Scanner;

class Comparison
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner( System.in );
        //Scanner keyboard = new Scanner(System.in);
        double number1;
        double number2;

        System.out.print( "Enter first integer: " );
        number1 = input.nextDouble();

        System.out.print( "Enter second integer: ");
        number2 = input.nextDouble();

        if ( number1 == number2 )
            System.out.printf( "%.1f == %.1f\n", number1, number2);

        if ( number1 != number2 )
            System.out.printf( "%.1f != %.1f\n", number1, number2);

        if ( number1 < number2 )
            System.out.printf( "%.1f < %.1f\n", number1, number2);

        if ( number1 > number2 )
            System.out.printf( "%.1f > %.1f\n" , number1, number2);

        if ( number1 <= number2 )
            System.out.printf( "%.1f <= %.1f\n" , number1, number2);

        if ( number1 >= number2 )
            System.out.printf( "%.1f >= %.1f\n" , number1, number2);
    }
}