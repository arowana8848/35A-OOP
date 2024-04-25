import java.util.Scanner;
 public class taskkk {
    public static void main(String[] args) {
    //    /* System.out.println(null);
    //     'sout'
    //    */ 
    //   System.out.println("This line breaks");
    //   /*System.out.print */
    //   System.out.print("This will not break");
    //   System.out.print("This will continue\n");

    


    /*System.out.print() 
     * %s String, %d integers %f floating point, % boolean
    */
    // System.out.printf("Hello %s, Good morning\t","World");
    // System.out.printf("This is a num %d\t", 10);
    // /*Multi format */
    // System.out.printf("Both float %f and %b", 10.3f, false);


    // Scanner scan = new Scanner(System.in);
    // System.out.println("the follwing takes sentence");
    // String stringInput = scan.nextLine();
    // System.out.println("the following takes int");
    // int intInput = scan.nextInt();
    // System.out.println("the following takes boolean");
    // boolean boolInput = scan.nextBoolean();
    // scan.close();



    /*
     * Task:
     * make new Scanner object/variable called scan1
     * prompt the following ten input
     * what is your name ? -> save as string in name var
     * over 18? -> save as boolean in status var
     * how many siblings? -> save as int in sibling var
     *  Print the following
        * Hello <name>,
        * Status? status
        * You have <sibling> siblings.
     */

     Scanner scan1 = new Scanner(System.in);
     System.out.println("What is your name?");
     String name = scan1.nextLine();
     System.out.println("Are you over 18?");
     boolean status = scan1.nextBoolean();
     System.out.println("Number of siblings?");
     int sibling = scan1.nextInt();

     System.out.printf("Hello %s" ,name);
     System.out.printf("Status: %b",status);
     System.out.printf("You have %d number of siblings",sibling);
     scan1.close();
}
public class javaArgument{
    public static void main(String[] args) {
        if (args.length<2){
            System.out.println("provide args");
            return;

        }
        System.out.println("firstrargs"+args[0]);
        System.out.println("secoundargs"+args[1]);
        int parsedvalue= Integer.parseInt(args[1]);
        System.out.println("parsed value "+ parsedvalue);
    }
}