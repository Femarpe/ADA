import java.io.File;

public class FolderComparator {
    private File folderA;
    private File folderB;
    File[] listaDeficheros1;
    File[] listaDeficheros2;
    ;

    public void setFolders(File f1, File f2) throws UtilityFileExcepcion {

        if (f1.exists() && f2.exists() && f1.isDirectory() && f2.isDirectory()) {
            folderA = f1;
            folderB = f2;
            listaDeficheros1 = f1.listFiles();
            listaDeficheros2 = f2.listFiles();
        } else {
            throw new UtilityFileExcepcion("Los parametros introducidos no son Carpetas");
        }
    }

    public File getFolderA() {
        return folderA;
    }

    public File getFolderB() {
        return folderB;
    }

    public String compare() {
        String salida = "";
        return salida;
    }
}