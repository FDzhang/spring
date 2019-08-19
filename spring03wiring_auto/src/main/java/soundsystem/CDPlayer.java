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

    private Power power;

    public CDPlayer() {
        super();
        System.out.println("CDPlayer无参构造");
    }

    @Autowired
    public CDPlayer(CompactDisc cd, Power power) {
        this.cd = cd;
        this.power = power;
        System.out.println("CDPlayer 多参数构造函数");
    }


    public void play(){
        power.supply();
        cd.play();
    }

}
