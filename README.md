# springboot - redis
### docker-redis 설치
* 이미지 다운(latest version)    
$ docker pull redis
* redis container 실행    
$ docker run --name redis-latest -p 6379:6379 -d redis
```
--name : 이름 설정
-p : 포트 설정
-d : 백그라운드 실행
```
* redis-cli 접속    
$ docker exec -it redis-latest redis-cli

### reference
* [뱀귤 - SpringBoot에서 Redis 사용하기](https://github.com/ParkJiwoon/PrivateStudy/blob/master/database/redis.md)
* [농구하는 개발자 - Redis를 Docker Compose로 띄우기](https://basketdeveloper.tistory.com/85)
