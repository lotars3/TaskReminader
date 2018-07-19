package pl.szymondarek.Controller;
import pl.szymondarek.views.MainView;

import java.util.Scanner;

public class LogRegisterMenu {
    private MainView mainView;
    private Scanner scanner;


    public void start() {
        createMainLoop();
    }


    public LogRegisterMenu() {
        this.mainView = mainView;
        this.scanner = scanner;

    }

    public void createMainLoop() {
         String userLogin;
         String userPassword;
        String chooseOption;

        do {
            mainView.showLogRegisterMenu();
            chooseOption = scanner.nextLine();

            switch (chooseOption) {
                case "1": {
                    mainView.showLogingRequest();
                    userLogin=scanner.nextLine();
                    mainView.showPasswordRequest();
                    userPassword=scanner.nextLine();
                }
                case "2":{
                    mainView.showLogingRequest();
                    userLogin=scanner.nextLine();
                    mainView.showPasswordRequest();
                    userPassword=scanner.nextLine();
                        mainView.showPasswordRequest();
                        userPassword=scanner.nextLine();
                }
            }

        }
    }
}
