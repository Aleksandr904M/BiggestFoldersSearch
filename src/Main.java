import java.io.File;

public class Main {
    public static void main(String[] args) {

        String folderPath = "C:\\Java\\записки Java"; //строка с указанием пути к файлу
        File file = new File(folderPath);

        System.out.println(getFolderSize(file)); //размер ненастоящий, это размер блока данных на все ссылки в папке
    }

    public static long getFolderSize (File folder) { //рекурсивная функция

        if (folder.isFile()) {       //если folder является файлом
            return folder.length();  //вернуть размер файла
        }
        //если folder - папка
        long sum = 0;                //переменная для суммы
        File [] files = folder.listFiles();//получить список файлов в этой папке
        for (File file : files) {    //циклом идем по списку
            sum += getFolderSize(file);
        } return sum;

    }
}
