package hello;


/**
 * @author ：zxq
 * @date ：Created in 2019/8/19 14:35
 * 打印服务
 */
public class MessageService {
    public MessageService() {
        super();
        System.out.println("MessageService...");
    }

    /**
     * 执行打印功能
     * @return 返回要打印的字符串
     */
    public String getMessage(){
        return "Hello World！";
    }
}
