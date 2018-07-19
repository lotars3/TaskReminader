package pl.szymondarek.Controller;
import pl.szymondarek.views.MainView;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

public class LogRegisterMenu {
    private MainView mainView;
    private Scanner scanner;
    File file = new File("C:\\TaskReminderFile\\users.txt");

    public void start() {
        createMainLoop();
    }


    public LogRegisterMenu() {
        this.mainView = new MainView();
        scanner = new Scanner(System.in);

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
                    userLogin = scanner.nextLine();
                    mainView.showPasswordRequest();
                    userPassword = scanner.nextLine();


                    try {
                        Files.write(file.toPath(), (userLogin + ":" + userPassword).getBytes(), StandardOpenOption.APPEND);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;
                }
                case "2": {
                    mainView.showLogingRequest();
                    userLogin = scanner.nextLine();
                    mainView.showPasswordRequest();
//                    userPassword = scanner.nextLine();
                    mainView.showPasswordRequest();
                    userPassword = scanner.nextLine();

                    try {
                        Files.write(file.toPath(), (userLogin + ":" + userPassword).getBytes(), StandardOpenOption.APPEND);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;
                }

            }

        } while (!chooseOption.equals("1") || chooseOption.equals("2")) ;
    }
}