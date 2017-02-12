package com.smsmt.ae.programming.prework;

import redis.clients.jedis.Jedis;

public class RedisPublishingStringClient {

    private Jedis redisClient = null;

    public final String REDIS_STRING_CHANNEL = "string-channel";

    public RedisPublishingStringClient(Jedis redisClient) {
        this.redisClient = redisClient;
    }

    public void set(String key, String value) {
        redisClient.set(key, value);
        redisClient.publish(REDIS_STRING_CHANNEL, key+":"+value);
    }

    public void get(String key) {
        redisClient.get(key);
    }

}
