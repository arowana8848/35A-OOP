public class argument {
   
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

