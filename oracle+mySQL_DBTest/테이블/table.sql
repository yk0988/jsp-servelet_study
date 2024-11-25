use mydb;
drop table if exists tblRegister;
create table tblRegister(
	id varchar(20) primary key,
	pwd varchar(20) not null,
	name char(6) null,
	num1 char(7) null,
	num2 char(7) null,
	email varchar(30) null,
	phone varchar(30) null,tblregister
	zipcode char(5) null,
	address varchar(60) null,
	job varchar(30) null
);

select * from tblRegister;

insert into tblRegister(id, pwd, name, num1, num2, email, phone, zipcode, address, job)
    values('rorod', '1234', '이경미', '1234567', '1234567', 'rorod@jspstudy.co.kr', '010-1111-1111', '1234', '부산 연제구', '프로그래머');
    
    
    CREATE TABLE board (
    num INT NOT NULL AUTO_INCREMENT,         -- 게시물 번호 (자동 증가, null 허용 안함)
    writer VARCHAR(10) NOT NULL,             -- 작성자 (null 허용 안함)
    subject VARCHAR(50) NOT NULL,            -- 제목 (null 허용 안함)
    reg_date DATETIME NOT NULL,              -- 작성일 (null 허용 안함)
    readcount INT DEFAULT 0,                 -- 조회수 (기본값 0)
    PRIMARY KEY (num)                        -- num을 기본 키로 설정
);