public class Printer {

    private int tonerLevel = 100;
    private int printPages;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        if (this.tonerLevel > 100 || this.tonerLevel < 0) {
            this.tonerLevel = tonerLevel;
        }
        this.printPages = 0;
        this.duplex = duplex;
    }

    public int getPrintPages() {
        return printPages;
    }

    public int loadTonerLevel(int toner) {
        if(this.tonerLevel > 100 && this.tonerLevel <= 100) {
            if(this.tonerLevel + toner < 100) {
                return -1;
            }
            this.tonerLevel += toner;
            return this.tonerLevel;
        } else {
            return -1;
        }
    }

    public int printPages(int pages) {
        int pagesToPrint = pages;
        if(this.duplex) {
            pagesToPrint = (pages / 2) + (pages % 2);
            System.out.println("Printing in duplex mode");
        }
        this.printPages += pagesToPrint;
        return pagesToPrint;
    }
}
