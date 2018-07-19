package pl.szymondarek.views;

import java.util.Scanner;

public class MainView {

    private Scanner scanner = new Scanner(System.in);
    private int choice;

    }

    public void printMenu() {
        System.out.println("==================================");
        System.out.println("Jaką operację chcesz wykonać: ");
        System.out.println("1 - Dodaj nowe zadanie");
        System.out.println("2 - Zobacz zadania na dziś");

        System.out.println("3 - EXIT (Wyloguj mnie\n)");
        System.out.println("Twój wybór to: ");
    }

    public void userAnswer() {
        switch (choice) {
            case 1: {
                addNewTask();
            }
            break;
        }
        case 2: {
            viewTaskForToday();
            break;
        }
        case 3: {
            break;
        }
    }


