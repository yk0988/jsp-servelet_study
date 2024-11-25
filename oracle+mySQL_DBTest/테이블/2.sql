CREATE DATABASE mydb;

SELECT user, host FROM mysql.user;

CREATE USER 'dbuser'@'localhost' IDENTIFIED BY '12345';
GRANT ALL PRIVILEGES ON mydb.* TO 'dbuser'@'localhost';

FLUSH PRIVILEGES;