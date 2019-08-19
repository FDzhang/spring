package soundsystem;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author ：zxq
 * @date ：Created in 2019/8/19 16:31
 */
@ComponentScan
public class App {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(App.class);
        CDPlayer player = context.getBean(CDPlayer.class);
        player.play();
    }
}
