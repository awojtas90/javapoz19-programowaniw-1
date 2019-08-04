public class book {
    private String name;
    private int releaseyear;
    private int pages;

    public book() {

    }

    public book(String name, int releaseyear, int pages) {
        this.name = name;
        this.releaseyear = releaseyear;
        this.pages = pages;
    }

    @Override
    public String toString() {
        return "book{" +
                "name='" + name + '\'' +
                ", releaseyear=" + releaseyear +
                ", pages=" + pages +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getReleaseyear() {
        return releaseyear;
    }

    public void setReleaseyear(int releaseyear) {
        this.releaseyear = releaseyear;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }
}
