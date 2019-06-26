CREATE TABLE login (
	username VARCHAR(30) UNIQUE,
	password VARCHAR(30)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO login (username, password) VALUES ('admin', 'blablabla');