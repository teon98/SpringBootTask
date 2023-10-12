CREATE TABLE MEMBER(
    USER_ID VARCHAR(100) PRIMARY KEY, 
    USER_PW VARCHAR(100),
    USER_NICKNAME VARCHAR(100),
    USER_EMAIL VARCHAR(100)
);

insert into member values('test2', '1235', '태영2', 'test2@gmail.com');
insert into member values('test3', '1236', '태영3', 'test3@naver.com');