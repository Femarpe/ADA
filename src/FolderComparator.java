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
        if (listaDeficheros1.length == listaDeficheros2.length){
            for (int i = 0; i < listaDeficheros1.length ; i++) {
                if (listaDeficheros1[i] == listaDeficheros2[i]){
                    salida = "los directorios tienen los mismos coontenidoso";
                } else {
                    salida = "los directorios no tienen los mismos coontenidoso";
                }
            }
        }
        return salida;
    }
}