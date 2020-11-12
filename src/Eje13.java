import java.io.*;

public class Eje13 {
    String ficheroProperties = "";
    String nombreFichero = "app.properties";

    public Eje13() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(nombreFichero));
        String linea;
        while ((linea = reader.readLine()) != null) {
            ficheroProperties += linea + "\n";
        }
        reader.close();
    }

    public String getKeys() {
        return ficheroProperties;
    }

    public String getNombres() {
        String salida = "";
        String[] lineas = ficheroProperties.split("\n");
        for (int i = 0; i < lineas.length; i++) {
            if (lineas[i].contains("userName=")) {
                String[] nombre = lineas[i].split("=");
                salida += nombre[1] + "\n";
            }
        }
        return salida;
    }
    public String getEmail() {
        String salida = "";
        String[] lineas = ficheroProperties.split("\n");
        for (int i = 0; i < lineas.length; i++) {
            if (lineas[i].contains("userEmail=")) {
                String[] nombre = lineas[i].split("=");
                salida += nombre[1] + "\n";
            }
        }
        return salida;
    }

    public void setLenguage(String newLanguage) {
        String ficheroModificado = "";
        String[] lineas = ficheroProperties.split("\n");
        for (int i = 0; i < lineas.length; i++) {
            if (lineas[i].contains("language=")) {
                lineas[i] = "language=" + newLanguage;
            }
            ficheroModificado += lineas[i] + "\n";
        }
        ficheroProperties = ficheroModificado;
    }
}
