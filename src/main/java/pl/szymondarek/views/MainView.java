package pl.szymondarek.views;

public class MainView {

    public void showLogRegisterMenu() {
        System.out.println("Witaj urzytkowaniku");
        System.out.println("Masz koto podaj 1");
        System.out.println("Chcesz się zarejestrować podaj 2");
    }

    public void showLogingRequest() {
        System.out.println("Podaj login ");
    }

    public void showPasswordRequest() {
        System.out.println("podaj hasło");
    }


    public void printMainMenu() {
        System.out.println("==================================");
        System.out.println("Jaką operację chcesz wykonać: ");
        System.out.println("1 - Dodaj nowe zadanie");
        System.out.println("2 - Zobacz zadania na dziś");

    }

}
