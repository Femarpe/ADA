import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Ejemplo {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\kurur\\Desktop\\textFile.txt");
        FileReader fileReader = new FileReader(file);
        int i;
        while ((i = fileReader.read()) != -1) {
            System.out.println((char) i);
        }
        fileReader.close();
    }
}
