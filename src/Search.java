import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class Search {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Type in your command, pattern, file:");
        String input = sc.nextLine();
        String[] inputs = input.split(" ");
        String command = inputs[0];
        String pattern = inputs[1];
        String theFile = inputs[2];

        File file = new File(theFile);
        int number = 0;
        if (command.equals("search")) {
            try {
                Scanner fileSC = new Scanner(file);
                while (fileSC.hasNextLine()) {
                    String line = fileSC.nextLine();
                    number++;
                    if (line.contains(pattern)) {
                        System.out.println("On row number " + number + " we get a hit with: " + line);
                    }
                }
                fileSC.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }else{

            System.out.println("The only command available is \"search\", please try again");
        }
        sc.close();
    }
}
