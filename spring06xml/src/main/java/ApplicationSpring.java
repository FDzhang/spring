import com.fd.demo.soundsystem.CompactDisc;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author ：zxq
 * @date ：Created in 2019/8/20 13:47
 */

public class ApplicationSpring {

    public static void main(String[] args) {
        System.out.println("ApplicationSpring is running .....");

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext-constructor.xml");
        CompactDisc cd1 = (CompactDisc) context.getBean("compactDisc1");
        CompactDisc cd2 = (CompactDisc) context.getBean("compactDisc2");
        cd1.paly();
        cd2.paly();
    }
}
