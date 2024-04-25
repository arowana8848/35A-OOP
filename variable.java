public class Variable {
    /*Instance variable needs object to access
      Value is not shared.
     */
    int instanceVariable = 10;
    /*Static Variable doesnot need object to access
     * Value is shared among objects
     */
    static int staticVariable = 100;
    public static void main(String[] args){
        /*Primitive Data Type
         * Already defined in Programming language (JAVA)
         */
       byte byteValue = 100;
       /*the following cann9to be done again
        * byte bytevalue = 100;
        */
       short shortValue = 200;
       int intValue = -199;
       long longValue = 10000;
       float floatValue = 2.15f;
       double doubleValue = -90.223;
       char charValue = 'l';
       boolean booleanValue = false; 

       /*Non primitive data  type
        * Not defined by programming language except (String)
        Combination of primitve data type
        */
        String stringValue = "bibek suddo";
        int[] intArray = new int[5];
        Variable variableObject = new Variable();
        /*Use instance variable with variable object */
        System.out.println(variableObject.instanceVariable);
        /*Use static variable with Class itself */
        System.out.println(Variable.staticVariable);

        byte defaultByteValue;
        System.out.println("default byte value is"+defaultByteValue);
        /*continnue all and find the default value of all the primitive datatype */
    }
}