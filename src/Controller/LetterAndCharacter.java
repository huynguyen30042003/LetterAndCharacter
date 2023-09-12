package Controller;

import Common.Algorithm;
import Common.Library;
import Model.Element;
import View.Menu;

public class LetterAndCharacter extends Menu<String> {
    protected Algorithm algorithm;
    protected Library library;
    protected String Str;

    public LetterAndCharacter(Element element) {
        super(title);
        algorithm = new Algorithm();
        library = new Library();
        Str = element.getStr();
    }

    @Override
    public void execute() {
        // System.out.println(Str);
        algorithm.letterCount(Str);
        algorithm.characterCount(Str);
    }

}
