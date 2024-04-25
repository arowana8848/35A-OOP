public public class Operators{
    public static void main(String[] args) {
        // Arithmetic Operators
        int num1 = 10, num2 = 20;
        int sum = num1+num2;
        System.out.println("num 1 + num2 = " + sum);
        System.out.println("num 2 - num1 = " + (num2 - num1) );
        System.out.println("num1 x num2 = " + (num1*num2));
        System.out.println("num1 / num2 = " + (num1/num2));
        System.out.println("num1 modulo num2 = " + (num1% num2));
        //Assignment operators
        int aNum1;
        aNum1 = 200; //here "=" is assignment operator to assign value
        System.out.println(aNum1);
        System.out.println("aNum1 += can be " + (aNum1+=2));
        // aNum1 +=2 is equivalent to aNUm1 = aNum1+2
        System.out.println("aNum1 -= can be " + (aNum1-=10));
        System.out.println("aNum1 = can be " + (aNum1=3));
        System.out.println("aNum1 /= can be " + (aNum1/=3));
        System.out.println("aNum1 %*= can be " + (aNum1%=3));

        //Relational Operators
        int rNum1 =20, rNum2 = 21;
        boolean rExpression = rNum1==rNum2;
        System.out.println(rExpression);
        System.out.println(rNum1>rNum2);
        System.out.println(rNum1<=rNum2);
        System.out.println(rNum1!=rNum2);

        //Logical Operators
        boolean rOperator1 = false, rOperator2 =true;
        System.out.println(rOperator1 && rOperator2);
        System.out.println(rOperator1 || rOperator2 );
        System.out.println(! rOperator1);

        //Unary Operators
        int uNum1 = 10;
        /*uNum1++; >> equivalent to nNum1 = uNum1 + 1 and changes value from next line
        ++num1;    >> equivalent to uNum1 = nNum1 + 1 and changes value in this line*/
        System.out.println("uNum1++ " + (uNum1++));
        System.out.println("++uNum1 " + (++uNum1));
    }
} {
    
}
