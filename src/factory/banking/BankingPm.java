package factory.banking;

import factory.ProjectManager;

public class BankingPm implements ProjectManager {
    @Override
    public void managerProject() {
        System.out.println("Banking Pm manager banking project.....");
    }
}
