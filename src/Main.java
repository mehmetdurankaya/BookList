import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        ArrayList<Book> book = new ArrayList<>();

        book.add(new Book("Harry Potter and the Sorcerer's Stone", 320, "J.K. Rowling", "26 6 1997"));
        book.add(new Book("To Kill a Mockingbird", 336, "Harper Lee", "01-01-2015"));
        book.add(new Book("1984", 328, "George Orwell", "08-06-1949"));
        book.add(new Book("The Great Gatsby", 180, "F. Scott Fitzgerald", "10-04-1925"));
        book.add(new Book("Pride and Prejudice", 432, "Jane Austen", "28-1-1813"));
        book.add(new Book("The Catcher in the Rye", 224, " J.D. Salinger", "16-07-1951"));
        book.add(new Book("The Hobbit", 310, "J.R.R. Tolkien", "21-09-1937"));
        book.add(new Book("Lord of the Flies", 224, "William Golding", "17-09-1954"));
        book.add(new Book("Brave New World", 288, " Aldous Huxley", "19-05-1932"));
        book.add(new Book("The Alchemist", 208, "Paulo Coelho", "01-04-1988"));

        Map<String, String> map = new TreeMap<>();
        book.forEach(b -> map.put(b.getName(), b.getAuthorName()));
        map.forEach((bookName, authorName) -> System.out.println("Kitap Adı: " + bookName + ", Yazar Adı: " + authorName));

        List<Book> list = book.stream().filter(b -> b.getPageCount() > 100).collect(Collectors.toList());
        System.out.println("\nSayfa Sayısı 100'den Fazla Olan Kitaplar:");
        list.forEach(b -> System.out.println("Kitap Adı: " + b.getName() + ", Yazar Adı: " + b.getAuthorName() + ", Sayfa Sayısı: " + b.getPageCount()));

    }
}
