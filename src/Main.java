import Common.Library;
import Controller.LetterAndCharacter;
import Model.Element;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Element element = new Element();
        element.setStr(library.setString("Enter your conntent"));
        new LetterAndCharacter(element).run();
    }
}
