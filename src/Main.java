import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       char[] AlphabetToUpperCase = new char[]{'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
        char[] AlphabetToLowerCase = new char[]{'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y', 'z' };
       char[] Numbers = new char[]{'0','1','2','3','4','5','6','7','8','9'};
        String enter = "\n";
        String space = " ";
        try (FileWriter fileWriter = new FileWriter("Alphabet.txt")) {
            for (int i = 0; i < AlphabetToUpperCase.length; i++) {
                fileWriter.append(AlphabetToUpperCase[i]);
                fileWriter.append(space);
                fileWriter.append(AlphabetToLowerCase[i]);
                fileWriter.append(enter);
            }
            for (char number : Numbers) {
                fileWriter.append(number);
                fileWriter.append(enter);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try(FileReader fileReader = new FileReader("Alphabet.txt")){
            Scanner scanner = new Scanner(fileReader);
            int count = 1;
            while(scanner.hasNextLine()){
                System.out.println(count+": "+scanner.nextLine());
                count++;
            }

        }catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}