import java.io.File;

public class Main {
    public static void main(String[] args) throws UtilityFileExcepcion {
        FolderComparator folderComparator = new FolderComparator();
        String ruta1, ruta2;
        System.out.println("Introduzca las carpetas a comparar");
        System.out.println("primera carpeta: ");
        ruta1 = Utils.sc.nextLine();
        System.out.println("segunda carpeta: ");
        ruta2 = Utils.sc.nextLine();
        File f1 = new File(ruta1);
        File f2 = new File(ruta2);
        folderComparator.setFolders(f1, f2);
    }
}
