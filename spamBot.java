package SpamBot;

import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.security.Key;
import java.util.Scanner;

public class Spammer {
    public static void main(String[] args) throws AWTException, InterruptedException {
        int x = 1;

        // create object for bot and input
        Robot robot = new Robot();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your message : ");
        String text = scan.nextLine();

        // to create string selection for sending message
        StringSelection stringSelection = new StringSelection(text);
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(stringSelection,null);

        // to wait for click
        System.out.println("The spamming will start in 5 seconds : ");
        Thread.sleep(5000);

        // to creating message and how many message
        while (x<=100){
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_V);
            robot.keyRelease(KeyEvent.VK_CONTROL);
            robot.keyRelease(KeyEvent.VK_V);

            // time period for sending message
            Thread.sleep(2000);
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);

            x++;
        }

    }
}
