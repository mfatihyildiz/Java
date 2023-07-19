import java.util.TreeSet;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        TreeSet<Book> books = new TreeSet<>();

        books.add(new Book("I Never Promised You a Rose Garden", 293, "Joanne Greenberg"));
        books.add(new Book("The Little Prince", 120, "Antoine De Saint Exupery"));
        books.add(new Book("Jane Eyre", 127, "Charlotte Bronte"));
        books.add(new Book("The Royal Game", 88, "Stefan Zweig"));
        books.add(new Book("1984", 352, "George Orwell"));

        System.out.println("\n................Sorted By Book Name............\n");
        for (Book bk : books) {
            System.out.printf("Book Name :%1$-40s Author Name :%2$-30s Page Number :%3$4s \n",
                    bk.getName(), bk.getAuthorName(),
                    bk.getPageNumber());
        }

        System.out.println("\n................Sorted By Page Number............\n");

        TreeSet<Book> book1 = new TreeSet<>(new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getPageNumber() - o2.getPageNumber();
            }
        });

        book1.addAll(books);

        for (Book bk : book1) {
            System.out.printf("Book Name :%1$-40s Author Name :%2$-30s Page Number :%3$4s  \n",
                    bk.getName(), bk.getAuthorName(),
                    bk.getPageNumber());
        }
    }
}