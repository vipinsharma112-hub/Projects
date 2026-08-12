
import java.util.*;

public class TestTree {

    public static void main(String[] args) {
        new TestTree().go();
    }

    public void go() {

        Book b1 = new Book("How Cats Work");
        Book b2 = new Book("Remix your Body");
        Book b3 = new Book("Finding Emo");

        Comparator<Book> bookComparator =
                (one, two) -> one.getTitle().compareTo(two.getTitle());

        Set<Book> tree = new TreeSet<>(bookComparator);

        tree.add(b1);
        tree.add(b2);
        tree.add(b3);
        tree.add(b2);   // duplicate, won't be added

        System.out.println(tree);
    }
}

class Book {

    private String title;

    public Book(String t) {
        title = t;
    }

    public String getTitle() {
        return title;
    }

    public String toString() {
        return title;
    }
}
