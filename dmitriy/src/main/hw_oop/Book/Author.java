package Book;

public class Author {

    private String author;

    public Author(){this.author = author;}
    public String getAuthor(){return author;}
    public void setAuthor(String newAuthor){author = newAuthor;}

    void show(){
        System.out.println("Autor - " + getAuthor());
    }
}
