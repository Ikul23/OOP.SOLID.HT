package OOO.SOLID.HT.UserView;

import OOO.SOLID.HT.UserPresenter.UserPresenter;

public class UserView {
    private UserPresenter presenter;

    public void setPresenter(UserPresenter presenter) {
        this.presenter = presenter;
    }

    public void showReport(String name) {
        System.out.println("Report for user: " + name);
    }
}