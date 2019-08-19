package hello;



/**
 * @author ：zxq
 * @date ：Created in 2019/8/19 14:37
 */
public class MessagePrinter {
    public MessagePrinter() {
        super();
        System.out.println("MessagePrinter....");
    }

    private MessageService service;

    public void setService(MessageService service) {
        this.service = service;
    }

    public void printMessage(){
        System.out.println(this.service.getMessage());
    }
}
