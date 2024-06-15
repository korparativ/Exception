package Exception.Exception;

import java.util.Scanner;

public class Console {
    String info;


    public void printMenu(){
    System.out.println ("Введите следующие данные через пробел: Фамилия Имя Отчество Дата_рождения(dd.mm.yyyy) Номер телефона(целое беззнаковое число) Пол(символ латиницей f или m)");

    }

    public String writeInfo(){
        
        Scanner scan = new Scanner(System.in);
        this.info = scan.nextLine();
        scan.close();
        
        return info;
    }
}
