package Exception.Exception;

import java.time.format.DateTimeParseException;

import javax.management.RuntimeErrorException;

public class Main {
    public static void main(String[] args) {
        Console console = new Console();
        console.printMenu();        
        String str = console.writeInfo();        
        String [] arr = str.split(" ");
        WriteToFile writer;
        boolean allright = true;

        try {
            Except.checkLength(arr);
        }
        catch (RuntimeErrorException e){
            allright = false;
            System.err.println("Количество данных не соответствует, вы ввели "+arr.length+ " значений вместо 6");
        }
       
        try {
            Except.checkFullName(arr); 
        }
        catch (RuntimeException e){
            allright = false;
            System.out.println("ФИО не должно содержать цифры");
        }

        try {
            Except.checkData(arr);
        }
        catch (DateTimeParseException e){
            allright = false;
            System.out.println("Неверен формат даты");
        }

        try {
            Except.checkTelephoneNumber(arr);
        }
        catch (NumberFormatException e){
            allright = false;
            System.out.println("Неверен формат телефонного номераa");
        }

        try {
            Except.checkGender(arr); 
        }
        catch (RuntimeException e){
            allright = false;
            System.out.println("Пол должен быть указан в формате m или f");
        }

        if (allright){
            writer = new WriteToFile(arr);
        }
    }   

}
