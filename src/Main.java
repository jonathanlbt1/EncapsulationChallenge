public class Main {
    public static void main(String[] args) {

        Printer Epson = new Printer(50,  true);
        System.out.println("Initial page count = " + Epson.getPrintPages());
        int pagesPrinted = Epson.printPages(4);
        System.out.println("Pages printed was " + pagesPrinted + " new total print count = " + Epson.getPrintPages());
        pagesPrinted = Epson.printPages(3);
        System.out.println("Pages printed was " + pagesPrinted + " new total print count = " + Epson.getPrintPages());
    }
}
