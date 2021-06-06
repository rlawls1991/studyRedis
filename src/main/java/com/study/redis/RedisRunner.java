package com.study.redis;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
@RequiredArgsConstructor
public class RedisRunner implements ApplicationRunner {

    private final AccountRepository accountRepository;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        Account account = Account.builder()
                .email("rlawls1991@naver.com")
                .userName("rlawls1991")
                .build();
        accountRepository.save(account);

        Optional<Account> findId = accountRepository.findById(account.getId());
        System.out.println(findId.get().getEmail());
        System.out.println(findId.get().getId());
        System.out.println(findId.get().getUserName());
    }
}
