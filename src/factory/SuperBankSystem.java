package factory;

import factory.banking.BankingTimFactory;

public class SuperBankSystem {
    public static void main(String[] args) {
        ProjectTimFactory projectTimFactory = new BankingTimFactory();
         Developer developer =projectTimFactory.getDeveloper();
         Tester tester = projectTimFactory.getTester();
         ProjectManager projectManager = projectTimFactory.getProjectManager();
        System.out.println("Creating bank system.......");
        developer.writeCode();
        tester.testCode();
        projectManager.managerProject();

    }
}
