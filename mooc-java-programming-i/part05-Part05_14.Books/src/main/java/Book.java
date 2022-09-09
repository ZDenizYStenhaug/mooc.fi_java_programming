
public class Book {

    private String name;
    private int publicationYear;

    public Book(String name, int publicationYear) {
        this.name = name;
        this.publicationYear = publicationYear;
    }

    public String getName() {
        return name;
    }

    public int getPublicationYear() {
        return publicationYear;
    }
    
    public boolean equals(Object c) {
        if(this == c) {
            return true;
        }
        if(!(c instanceof Book)) {
            return false;
        }
        Book book = (Book) c;

        if(this.name.equals(book.name) &&
                this.publicationYear == book.publicationYear) {
            return true;
        }
        return false;
    }

}
