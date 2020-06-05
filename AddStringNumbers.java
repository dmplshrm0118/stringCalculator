package Assessment;
import java.util.*;

public class AddStringNumbers {
    
    public static int Add(String num){
            // Checking String Is Empty
            if(num.isEmpty()){
                    return 0;
                }
            else{
                //declaring & Initalizing sum variable
                int sum = 0;
                
                //Declaring Negative Value ArrayList
                ArrayList negatives =new ArrayList();
                
                // Replacing "\n" with ","
                num = num.replaceAll("\n",",");
                
                // Checking wehther String Starts with "//" If yes then replacing the delimiters to ","
                if(num.charAt(0) == '/' && num.charAt(1) == '/'){
                    char ch = num.charAt(2);
                    num = num.replace(ch, ',');
                    num = num.replaceAll("[^a-zA-Z0-9]", ",");
                }
                // Converting String Into Number Array By using split method
                String[] numbers = num.split(",");
                for(int i = 0; i < numbers.length; i++){
                    // Checking If Any Index In array is Empty, If Yes Then Adding 0 to it
                    if(numbers[i].isEmpty()){
                        numbers[i] = "0";
                    }
                    int number =Integer.parseInt(numbers[i]);
                    //Checking If Number Is Negative
                    if(number < 0){
                        negatives.add(number);
                    }
                    //Checking If Number Is Greater Than 1000
                    if(number >= 1000){
                        number = 0;
                    }
                    // Else Doing the Sum Of All Numbers In the String And Returning To Main
                    sum += number;
                }
                if(negatives.size() > 0)
                    throw new IllegalArgumentException("Negatives Not Allowed"+negatives);
                else
                return sum;
            } 
    }
    public static void main(String[] args) {
        String input = "//[*][%]\n1*2%3";
        // Calling Add Function With String Input
        int result = Add(input);
        System.out.println("Sum Of String: "+result);   
    }
}
