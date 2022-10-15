package Task2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task2 {
    public static void main(String[] args) {
        String fileNameInput1 = "Лукошко_Java_15102022.txt";
        String fileNameInput2 = "Lukoshko_18091991.pdf";

        isValidNameFile(fileNameInput1);
        isValidNameFile(fileNameInput2);
    }

    public static void isValidNameFile(String nameFile) {
        Pattern patternSurname = Pattern.compile("[a-zA-Zа-яёА-ЯЁ]+");
        Pattern patternProject = Pattern.compile("[A-Z][a-zA-Z]+");

        Pattern patternDay = Pattern.compile("(([0-2][1-9])|(3[0-1]))");
        Pattern patternMonth = Pattern.compile("((0[1-9])|(1[0-2]))");
        Pattern patternYear = Pattern.compile("(2\\d{3})");
        Pattern patternDate = Pattern.compile(patternDay +  "" + patternMonth + patternYear);

        Pattern patternTypeFile = Pattern.compile("((\\.txt)$|(\\.pdf)$)");
        Pattern fileName = Pattern.compile(patternSurname + "_" + patternProject +  "_" + patternDate + patternTypeFile);

        Matcher matcher = fileName.matcher(nameFile);
        if (matcher.matches()) {
            System.out.println("Имя файла \"" + nameFile + "\" соответствует!");
        } else {
            System.out.println("Имя файла \"" + nameFile + "\" не соответствует!");
        }

    }
}
