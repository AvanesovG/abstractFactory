package factory.banking;

import factory.Developer;
import factory.ProjectManager;
import factory.ProjectTimFactory;
import factory.Tester;

public class BankingTimFactory implements ProjectTimFactory {
    @Override
    public Developer getDeveloper() {
        return new JavaDeveloper();
    }

    @Override
    public Tester getTester() {
        return new QaTester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new BankingPm();
    }
}
