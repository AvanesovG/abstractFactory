package factory.webside;

import factory.Developer;
import factory.ProjectManager;
import factory.ProjectTimFactory;
import factory.Tester;

public class WebSiteTeamFactory implements ProjectTimFactory {
    @Override
    public Developer getDeveloper() {
        return new PhpDeveloper();
    }

    @Override
    public Tester getTester() {
        return new ManualTester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new WebSidePm();
    }
}
