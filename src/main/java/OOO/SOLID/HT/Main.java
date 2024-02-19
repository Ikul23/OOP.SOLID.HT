package OOO.SOLID.HT;

import OOO.SOLID.HT.UserModel.UserModel;
import OOO.SOLID.HT.UserPresenter.UserPresenter;
import OOO.SOLID.HT.UserView.UserView;

public class Main {
    public static void main(String[] args) {
        // Создаем объекты модели, представления и презентера
        UserModel userModel = new UserModel();
        UserView userView = new UserView();
        UserPresenter userPresenter = new UserPresenter(userModel, userView);

        // Устанавливаем презентер для представления
        userView.setPresenter(userPresenter);

        // Имитация пользовательского ввода
        userPresenter.processUser("Bob");
    }
}