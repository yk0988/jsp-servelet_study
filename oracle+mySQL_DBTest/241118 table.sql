CREATE TABLE 	t_member (
    id        VARCHAR(50) PRIMARY KEY,    -- id는 고유값이므로 Primary Key로 설정
    pwd       VARCHAR(100) NOT NULL,      -- 비밀번호는 NULL을 허용하지 않음
    name      VARCHAR(100) NOT NULL,      -- 이름도 NULL을 허용하지 않음
    email     VARCHAR(100) NOT NULL,      -- 이메일도 NULL을 허용하지 않음
    joinDate  DATETIME DEFAULT CURRENT_TIMESTAMP -- 가입일자는 기본값을 현재 날짜와 시간으로 설정
);


INSERT INTO t_member (id, pwd, name, email, joinDate)
VALUES ('hong', '1212', '홍길동', 'hong@gamil.com', '2018-09-04');

INSERT INTO t_member (id, pwd, name, email, joinDate)
VALUES ('lee', '1212', '이순신', 'lee@test.com', '2018-09-04');

INSERT INTO t_member (id, pwd, name, email, joinDate)
VALUES ('kim', '1212', '김유신', 'kim@jweb.com', '2018-09-04');

-- 데이터 조회
SELECT * FROM t_member;
drop table t_member;