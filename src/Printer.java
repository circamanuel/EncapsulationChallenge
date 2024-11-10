public class Printer {

    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;


    public Printer(int tonerLevel, boolean duplex) {
        this.tonerLevel = (tonerLevel >= 0 && tonerLevel <= 100) ? tonerLevel: -1;
        this.duplex = duplex;

    }
//    public int addToner(int tonerAmount) {
//
//        if (tonerLevel > 100 || tonerLevel < 0) {
//            tonerLevel = -1;
//        } else {
//             tonerLevel += tonerAmount;
//        }
//        return tonerLevel;
//    }

    public int printPages(int pages) {
        if(duplex) {
            pagesPrinted += (pages / 2) + (pages % 2);
            System.out.println(pages + " Duplex Pages Printed");
        } else {
            pagesPrinted += pages;
        }
        return this.pagesPrinted;
    }
    public int getPagesPrinted() {
        return pagesPrinted;
    }


}
