import org.junit.Test;
import redis.clients.jedis.HostAndPort;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisCluster;
import redis.clients.jedis.JedisPool;

import java.util.HashSet;
import java.util.Set;

public class Main {



    @Test
    public void test1(){
        // 连接到linux的redis数据库
        Jedis jedis = new Jedis("192.168.159.128",6379);
        // 选择要操作的数据库
        // 操作第二个数据库
        jedis.select(1);
        // 存数据 五种类型
        // 设置字符串类型
        jedis.set("welcome","欢迎来到cccc");
        // 设置hash
        jedis.hset("user:1001","username","张");
        jedis.hset("user:1001","age","22");
        jedis.hset("user:1001","gender","male");
        // 设置list
        jedis.lpush("team","美国","韩国","日本");
        // 设置set
        jedis.sadd("NBA","勇士","骑士","剑士","守卫者");
        // 设置sortedset
        jedis.zadd("english:scoreboard",90,"zhang");
        jedis.zadd("english:scoreboard",98,"iu");
        jedis.zadd("english:scoreboard",93,"lxk");
        // 取数据

        System.out.println(jedis.get("welcome"));

        // 关闭连接
        jedis.close();
    }
    @Test
    public void testJedisPool() {
        //创建一连接池对象
        JedisPool jedisPool = new JedisPool("192.168.159.128", 6379);
        //从连接池中获得连接
        Jedis jedis = jedisPool.getResource();
        jedis.select(1);

        String result = jedis.get("welcome");
        System.out.println(result);

        //关闭连接
        jedis.close();

        //关闭连接池
        jedisPool.close();
    }

    /**
     * 以集群的方式操作redis
     */
    @Test
    public void testJedisCluster() {
        //创建一连接，JedisCluster对象,在系统中是单例存在
        Set<HostAndPort> nodes = new HashSet<>();
        nodes.add(new HostAndPort("192.168.159.128", 7001));
        nodes.add(new HostAndPort("192.168.159.128", 7002));
        nodes.add(new HostAndPort("192.168.159.128", 7003));
        nodes.add(new HostAndPort("192.168.159.128", 7004));
        nodes.add(new HostAndPort("192.168.159.128", 7005));
        nodes.add(new HostAndPort("192.168.159.128", 7006));
        // spring ioc[控制反转]
        JedisCluster cluster = new JedisCluster(nodes);
        //执行JedisCluster对象中的方法，方法和redis一一对应。
        cluster.set("cluster-test", "my jedis cluster test");
        String result = cluster.get("cluster-test");
        System.out.println(result);
        //程序结束时需要关闭JedisCluster对象
        cluster.close();
    }
}
