import java.awt.*;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Eje7 {
    public static void main(String[] args) throws IOException {
        File archivo = new File("C:\\Users\\kurur\\Desktop\\textFile.txt");
        String textoAescribir = "";
        if (archivo.exists()) {
            FileReader fileReader = new FileReader(archivo);
            int i;
            while ((i = fileReader.read()) != -1) {
                textoAescribir += ((char) i);
            }
            fileReader.close();
            FileWriter fileWriter = new FileWriter(archivo);
            System.out.println("Introduce algo a guardar en el fichero");
            textoAescribir += Utils.sc.nextLine();
            fileWriter.write(textoAescribir);
            fileWriter.close();
        } else {
            System.out.println("Introduce algo a guardar en el fichero");
            textoAescribir = Utils.sc.nextLine();
            FileWriter fileWriter = new FileWriter(archivo);
            archivo.createNewFile();
            fileWriter.write(textoAescribir);
            fileWriter.close();
        }
    }
}