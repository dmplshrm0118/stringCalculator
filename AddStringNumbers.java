package Assessment;
import java.lang.Exception;

class NegativeException extends Exception{
    NegativeException(String s){
        super(s);
    }
}

public class AddStringNumbers {
    
    public static int Add(String num){
            // Checking String Is Empty
            if(num.isEmpty()){
                    return 0;
                }
            else{
                //declaring & Initalizing sum variable
                int sum = 0;
                
                // Replacing "\n" with ","
                num = num.replaceAll("\n",",");
                
                // Checking wehther String Starts with "//" If yes then replacing the delimiters to ","
                if(num.charAt(0) == '/' && num.charAt(1) == '/'){
                    char ch = num.charAt(2);
                    num = num.replace(ch, ',');
                    num = num.replace('/', ',');
                }
                // Converting String Into Number Array By using split method
                String[] numbers = num.split(",");
                for(int i = 0; i < numbers.length; i++){
                    // Checking If Any Index In array is Empty, If Yes Then Adding 0 to it
                    if(numbers[i].isEmpty()){
                        numbers[i] = "0";
                    }
                    // Else Doing the Sum Of All Numbers In the String And Returning To Main
                    sum += Integer.parseInt(numbers[i]);
                }
                return sum;
            } 
    }
    public static void main(String[] args) {
        String a = "6,\n";
        // Calling Add Function With String Input
        int result = Add(a);
        System.out.println("Sum Of String: "+result);   
    }
}
