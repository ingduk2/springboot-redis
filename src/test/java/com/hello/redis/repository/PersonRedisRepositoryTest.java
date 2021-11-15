package com.hello.redis.repository;

import com.hello.redis.entity.Person;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class PersonRedisRepositoryTest {

    @Autowired
    PersonRedisRepository redisRepository;

    @Test
    void test() {
        Person person = new Person("Park", 20);

        Person saved = redisRepository.save(person);
        System.out.println(saved.getId());

        Person findPerson = redisRepository.findById(person.getId()).get();
        System.out.println(findPerson.getId());

        long count = redisRepository.count();
        System.out.println(count);

//        redisRepository.delete(person);
    }
}