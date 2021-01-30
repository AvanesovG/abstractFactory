package factory;

import factory.webside.WebSiteTeamFactory;

public class AuctionSite {
    public static void main(String[] args) {

        ProjectTimFactory projectTimFactory = new WebSiteTeamFactory();
        Developer developer = projectTimFactory.getDeveloper();
        Tester tester = projectTimFactory.getTester();
        ProjectManager projectManager = projectTimFactory.getProjectManager();
        System.out.println("Create website...");
        developer.writeCode();
        tester.testCode();
        projectManager.managerProject();
    }
}
