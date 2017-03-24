package com.wung.javaredis;

import redis.clients.jedis.Jedis;

/**
 *
 * Created by wung on 2017/3/24.
 */
public class JavaRedis {
    public static void main(String[] args) {
        Jedis jedis = new Jedis("localhost");
        System.out.println("connect redis successfully.");
        System.out.println(jedis.ping());

        // String
        jedis.set("k1", "String test");
        System.out.println("k1 = " + jedis.get("k1"));

        // list
        jedis.lpush("k2", "list1");
        jedis.lpush("k2", "list2", "list3");
        System.out.println("k2 = " + jedis.lrange("k2", 0, 2));
    }
}
