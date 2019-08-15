public class Bed {

    private String style;
    private int pillars;
    private int height;
    private int sheets;
    private int quilts;

    public Bed(String style, int pillars, int height, int sheets, int quilts) {
        this.style = style;
        this.pillars = pillars;
        this.height = height;
        this.sheets = sheets;
        this.quilts = quilts;
    }

    public String getStyle() {
        return style;
    }

    public int getPillars() {
        return pillars;
    }

    public int getHeight() {
        return height;
    }

    public int getSheets() {
        return sheets;
    }

    public int getQuilts() {
        return quilts;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public void setPillars(int pillars) {
        this.pillars = pillars;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setSheets(int sheets) {
        this.sheets = sheets;
    }

    public void setQuilts(int quilts) {
        this.quilts = quilts;
    }

    public void make() {
        System.out.println("Bed -> Making");
    }
}
