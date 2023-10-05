package test001;

import java.awt.Robot;
import java.awt.event.KeyEvent;

public class KeyPress {

    public static void main(String[] args) throws Exception {
        // 创建Robot对象
        Robot robot = new Robot();

        // 每3秒按下一次J键
        robot.keyPress(KeyEvent.VK_J);
        Thread.sleep(3000);
    }
}
