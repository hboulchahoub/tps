package presentation;

public class Test {

    public static void main(String[] args) {
        Class c= FactureController.class;
        Author author = (Author) c.getAnnotation(Author.class);
        System.out.println(author);
    }
}
