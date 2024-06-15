package Exception.Exception;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.management.RuntimeErrorException;

public class Except {

    public static void checkFullName (String [] arr) throws RuntimeException{

        for (int i = 0; i < 3; i++){
            for(int j = 0; j<arr[i].length(); j++){
                if(Character.isDigit(arr[i].charAt(j))){
                    throw new RuntimeException("Строка содержит число");
                }
            }
        }        
    } 
    
    public static void checkLength (String [] arr) throws RuntimeErrorException{
        if(arr.length != 6){                
            throw new RuntimeErrorException( null, "Формат пола неверен");            
        }
    }

    public static void checkData (String [] arr){

        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        LocalDate.parse(arr[3], format);
    }

    public static void checkTelephoneNumber (String [] arr){
        Integer.parseInt(arr[4]);
    }

    public static void checkGender (String [] arr) throws RuntimeException{
        if(!"f".equals(arr[5]) && !"m".equals(arr[5])){
            throw new RuntimeException("Формат пола неверен");
        }
    }
        
}
