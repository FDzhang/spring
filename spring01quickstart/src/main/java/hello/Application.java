package hello;

/**
 * @author ：zxq
 * @date ：Created in 2019/8/19 14:41
 */

public class Application {

    public static void main(String[] args) {
        System.out.println("application");

        // 创建打印机对象
        MessagePrinter printer = new MessagePrinter();
        MessageService service = new MessageService();

        printer.setService(service);
        printer.printMessage();
    }
}
