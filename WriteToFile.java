package Exception.Exception;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {

    public WriteToFile (String [] arr){
        String fileName = "C:\\Users\\korpa\\Documents\\Разработчик\\Java\\Exception\\Exception\\"+arr[0]+".txt";
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true))){
            writer.write(arr[0]+" "+arr[1]+" "+arr[2]+" "+arr[3]+" "+arr[4]+" "+arr[5]);
            writer.newLine();
        }
        catch (IOException e){
            System.out.println("Ошибка записи");
        }
    }    
}
