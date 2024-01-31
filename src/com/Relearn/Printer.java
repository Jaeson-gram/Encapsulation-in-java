package com.Relearn;

public class Printer {

    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        //the pages printed will be managed by the class and not the calling class
        this.pagesPrinted = 0; //redundant since that's the default if we don't initialise. But just to be clear
        this.tonerLevel = (tonerLevel >= 0 && tonerLevel <= 100) ? tonerLevel : -1;
        this.duplex = duplex;
    }

    public int addToner(int tonerAmount){

        if ((tonerLevel + tonerAmount > 100) || (tonerLevel + tonerAmount < 0))
            return -1;

        tonerLevel += tonerAmount;
        return tonerLevel;
    }

    public int printPages(int numberOfPages){

        int jobPages = 0;

//        int pages = (duplex) ? (numberOfPages / 2) + (numberOfPages % 2) : numberOfPages;
//        pagesPrinted += pages;
//        return pages;
        //Same thing, in other words...

        if(duplex) {
            System.out.println("It is a duplex printer");
            jobPages = ((numberOfPages / 2) + (numberOfPages % 2));
            //2 pages will need 1 sheet, but 3 pages will need 2, so we add the remainder where it's an odd number

            pagesPrinted += jobPages;
            return jobPages;
        }

        pagesPrinted += numberOfPages;
        return numberOfPages;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
}
