package hello;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author ：zxq
 * @date ：Created in 2019/8/19 14:41
 */

public class ApplicationSpring {

    public static void main(String[] args) {
        System.out.println("applicationSpring");

        // 初始化spring容器
        ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationSpring.class);
        // 从容器中获取MessagePrinter对象
        MessagePrinter printer = context.getBean(MessagePrinter.class);

        printer.printMessage();
    }
}
