import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.nio.charset.StandardCharsets;

public class FileBackedTasksManager {

    final static String FN_FULLNAME = "resources" + File.separator + "tasks.csv";

    public static void main(String[] args) {
        FileBackedTasksManager manager = new FileBackedTasksManager();
        manager.save();
    }

    // IOException работает без правки сигнатуры метода/класса
    // Если файл сделать "только для чтения" будет напечатан текст ошибки через sout
    public void save() { // без throws IOException
        try (Writer fileWriter = new FileWriter(FN_FULLNAME, StandardCharsets.UTF_8)) {
            fileWriter.write("Строка 1\n");
            fileWriter.write("Строка 2\n");
            fileWriter.write("Строка 3\n");
        } catch (IOException e) {
            System.out.println("Произошла ошибка во время записи файла.");
        }
    }

}
