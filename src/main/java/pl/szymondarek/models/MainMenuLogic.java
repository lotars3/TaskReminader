package pl.szymondarek.models;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

public class MainMenuLogic{
    Scanner scanner = new Scanner(System.in);

    File file = new File("C:\\FileTest\\tasks.txt");

        if (!file.exists()) {
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    Scanner scanner = new Scanner(System.in);
    String answer;
        do {
        System.out.println("Wprowadź tekst: ");
        answer = scanner.nextLine() + "/n";

        try {
            Files.write(file.toPath(), (answer +"\n").getBytes(), StandardOpenOption.APPEND);
        } catch (IOException e) {
            e.printStackTrace();
        }

    } while (!answer.equals("Exit"));
}
