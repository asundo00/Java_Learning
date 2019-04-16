public class MegaBytesConverter {
    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        if (kiloBytes < 0) {
            System.out.println("Invalid value");
        } else {
            int sranje = 1024;
            int megaBytes = kiloBytes / sranje;
            int rest = kiloBytes % sranje;


            System.out.println(kiloBytes + " KB = " + megaBytes + " MB and " + rest + " KB");
        }
    }
}
