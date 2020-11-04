import sun.misc.IOUtils;

import java.io.*;
import java.util.Scanner;

public class Eje9 {
    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\kurur\\Desktop\\BinaryFile.dat";
        File archivo = new File(path);
        String textoAescribir = "String títulos [] = {“Las tinieblas y el alba”, “ Don Quijote de la\n" +
                "Mancha”, “El Señor de los Anillos”, “El principito”};\n" +
                "int anyoPublicacion [] = {2020, 1605, 1954, 1943};\n";

        if (archivo.exists()) {
            FileInputStream reader = new FileInputStream(archivo);
            Scanner scanner = new Scanner(reader).useDelimiter("\\A");
            String enbinario = scanner.hasNext() ? scanner.next() : "";
            byte[] lectura = enbinario.getBytes();
            /*for (int i = 0; i <enbinario.length() ; i++) {
                lectura[i] = enbinario.getBytes();
            }**/

            String salida = new String(lectura, "UTF-8");

            System.out.println("leido archivo con contenido: \n" + salida);
            reader.close();

        } else {
            FileOutputStream stream = new FileOutputStream(archivo);
            Writer escritor = new OutputStreamWriter(stream, "UTF-8");
            escritor.write(textoAescribir);
            System.out.println("creado archivo con contenido: \n" + textoAescribir);
        }
    }
}