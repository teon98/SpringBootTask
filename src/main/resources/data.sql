CREATE TABLE MEMBER(
    USER_ID VARCHAR(100) PRIMARY KEY, 
    USER_PW VARCHAR(100),
    USER_NICKNAME VARCHAR(100),
    USER_EMAIL VARCHAR(100),
    USER_DATE DATE DEFAULT NOW()

);

insert into member (user_id, user_pw, user_nickname, user_email) values('test1', '1234', '태영1', 'test1@gmail.com');
insert into member (user_id, user_pw, user_nickname, user_email) values('test2', '1235', '태영2', 'test2@naver.com');

CREATE TABLE DOMAIN(
    NAME VARCHAR(100) PRIMARY KEY
);

insert into DOMAIN VALUES('daum.com');
insert into DOMAIN VALUES('cesco.com');
insert into DOMAIN VALUES('google.com');
insert into DOMAIN VALUES('naver.com');
insert into DOMAIN VALUES('yahoo.com');
insert into DOMAIN VALUES('apple.com');