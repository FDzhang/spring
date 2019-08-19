package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author ：zxq
 * @date ：Created in 2019/8/19 14:37
 */
@Component
public class MessagePrinter {
    public MessagePrinter() {
        super();
        System.out.println("MessagePrinter....");
    }

    private MessageService service;

    @Autowired
    public void setService(MessageService service) {
        this.service = service;
    }

    public void printMessage(){
        System.out.println(this.service.getMessage());
    }
}
