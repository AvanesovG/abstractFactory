package factory.banking;

import factory.Developer;

public class JavaDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Java Developer write Java Code............");
    }
}
