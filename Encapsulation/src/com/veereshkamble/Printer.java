package com.veereshkamble;

public class Printer {

    private int tonerLevel;
    private int numberOfPagesPrinted;
    private boolean isDuplexPrinter;

    public Printer(int tonerLevel, int numberOfPagesPrinted, boolean isDuplexPrinter) {
        this.tonerLevel = tonerLevel;
        this.numberOfPagesPrinted = numberOfPagesPrinted;
        this.isDuplexPrinter = isDuplexPrinter;
    }

    public void setTonerLevel(int tonerLevel) {
        this.tonerLevel = tonerLevel;
    }

    public void setNumberOfPagesPrinted(int numberOfPagesPrinted) {
        this.numberOfPagesPrinted = numberOfPagesPrinted;
    }

    public void setDuplexPrinter(boolean duplexPrinter) {
        isDuplexPrinter = duplexPrinter;
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getNumberOfPagesPrinted() {
        return numberOfPagesPrinted;
    }

    public boolean isDuplexPrinter() {
        return isDuplexPrinter;
    }

    public void fillToner(int tonerAmount) {

    }

    public void printingPage() {
        this.getNumberOfPagesPrinted()++;
    }
}
