package OOO.SOLID.HT.UserPresenter;


import OOO.SOLID.HT.UserModel.User;
import OOO.SOLID.HT.UserModel.UserModel;
import OOO.SOLID.HT.UserView.UserView;

public class UserPresenter {
    private final UserModel model;
    private final UserView view;

    public UserPresenter(UserModel model, UserView view) {
        this.model = model;
        this.view = view;
    }

    public void processUser(String name) {
        model.setUser(new User(name));
        view.showReport(model.getUser().getName());
        model.saveUser();
    }
}
