import java.io.*;

public class Eje8 {

    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\kurur\\Desktop\\textFile.txt";
        File archivo = new File(path);
        String textoAescribir = "";

        if (archivo.exists()) {
            BufferedReader reader = new BufferedReader(new FileReader(path));
            String linea;
            while ((linea = reader.readLine()) != null) {
                textoAescribir += linea;
                textoAescribir += '\n';
            }
            reader.close();
            System.out.println("Introduce algo a guardar en el fichero");
            textoAescribir += Utils.sc.nextLine();
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path));
            bufferedWriter.write(textoAescribir);
            bufferedWriter.close();
            System.out.println(textoAescribir);
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

