
package View;

import Common.Library;

public abstract class Menu<T> {

    protected static String title;
    Library l = new Library();

    public Menu() {
    }

    public Menu(String title) {
        this.title = title;
    }

    public abstract void execute();

    public void run() {
        execute();
    }

}