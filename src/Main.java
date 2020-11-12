import java.io.IOException;

public class Main {
    public static void main(String[] args) throws UtilityFileExcepcion, IOException {

        Eje13 eje13 = new Eje13();

        System.out.println(eje13.getKeys());
        System.out.println(eje13.getNombres());
        System.out.println(eje13.getEmail());

        eje13.setLenguage("KL");

        System.out.println(eje13.getKeys());

        /**FolderComparator folderComparator = new FolderComparator();
        String ruta1, ruta2;
        System.out.println("Introduzca las carpetas a comparar");
        System.out.println("primera carpeta: ");
        ruta1 = Utils.sc.nextLine();
        System.out.println("segunda carpeta: ");
        ruta2 = Utils.sc.nextLine();
        File f1 = new File(ruta1);
        File f2 = new File(ruta2);
        folderComparator.setFolders(f1, f2);
        System.out.println(folderComparator.compare());**/
    }
}
