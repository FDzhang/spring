package soundsystem;

import org.springframework.stereotype.Component;

/**
 * @author ：zxq
 * @date ：Created in 2019/8/19 17:00
 */
@Component
public class Power {
    public Power() {
        super();
    }

    public void supply(){
        System.out.println("电源供电中.....");
    }
}
