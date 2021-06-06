package com.study.redis;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.redis.core.RedisHash;

@RedisHash("account")
@Data
@Builder
public class Account {
    private String id;
    private String userName;
    private String email;
}
