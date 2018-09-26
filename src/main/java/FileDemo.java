import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileDemo {
    public static void go() {
        ClassLoader classLoader = FileDemo.class.getClassLoader();
        File file = new File(classLoader.getResource("introduction.txt").getFile());
        StringBuilder result = new StringBuilder("");
        System.out.println(" --- FileDemo Start ---");
        System.out.println("absPath:" + file.getAbsolutePath());
        try (Scanner scanner = new Scanner(file)) {

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                result.append(line).append("\n");
            }
            scanner.close();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("-- FileDemo error --");
        }
        System.out.println(result.toString());
        System.out.println(" --- FileDemo End ---");
    }
}
