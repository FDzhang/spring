package soundsystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author ：zxq
 * @date ：Created in 2019/8/19 16:28
 */

@Component
public class CDPlayer {

    private CompactDisc cd;

    public CDPlayer() {
        super();
        System.out.println("CDPlayer无参构造");
    }

    @Autowired
    public CDPlayer(CompactDisc cd) {
        this.cd = cd;
        System.out.println("CDPlayer的有参构造函数");
    }

    public void play(){
        cd.play();
    }

}
