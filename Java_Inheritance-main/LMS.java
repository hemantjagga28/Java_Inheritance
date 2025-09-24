package pillars.Inheritance;
class Book{
     private String title;
    private int publicationYear;
    Book(String title, int publicationYear) {
        this.title = title;
        this.publicationYear = publicationYear;
    }
    public String getTitle(){
        return title;
    }
    public int getPublicationYear(){
        return publicationYear;
    }
}
class Author extends Book{
    private String name;
    private String bio;
    Author(String title, int publicationYear,String name,String bio){
      super(title,publicationYear);
      this.name=name;
      this.bio=bio;
    }
 void displayInfo(){
        System.out.println("Author Name: " + name + ", Bio: " + bio + ", Book Title: " + getTitle() + ", Publication Year: " + getPublicationYear());
    }
}
public class LMS {
   public static void main(String[] args) {
       Author author = new Author("Effective Java", 2008, "Joshua Bloch", "Java programming best practices");
       author.displayInfo();
   }
}

