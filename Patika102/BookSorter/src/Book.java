public class Book implements Comparable<Book> {
    private String name;
    private int pageNumber;
    private String authorName;

    public Book(String name, int pageNumber, String authorName) {
        this.name = name;
        this.pageNumber = pageNumber;
        this.authorName = authorName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    @Override
    public int compareTo(Book o) {
        return this.name.compareTo(o.name);
    }
}