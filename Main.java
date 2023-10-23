package lab2_2;

public class Main {

    public static void main(String[] args) {
        Number num1 = new Number(4);

        System.out.println("Is " + num1.getVariable() + " equal 0? " + num1.isZero());
        System.out.println("Is " + num1.getVariable() + " positive? " + num1.isPositive());
        System.out.println("Is " + num1.getVariable() + " negative? " + num1.isNegative());
        System.out.println("Is " + num1.getVariable() + " an odd number? " + num1.isOdd());
        System.out.println("Is " + num1.getVariable() + " an even number? " + num1.isEven());
        System.out.println("Is " + num1.getVariable() + " a prime number? " + num1.isPrime());
//        System.out.println("Is " + num1.getVariable() + " a armstrong number? " + num1.isArmstrong());
        System.out.println(num1.getVariable() + " factorial = " + num1.getFactorial());
        System.out.println(num1.getVariable() + " square root = " + num1.getSqrt());
        System.out.println(num1.getVariable() + " square = " + num1.getSqr());
    
    }

}

