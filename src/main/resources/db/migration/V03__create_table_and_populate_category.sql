CREATE TABLE category (
	id BIGINT PRIMARY KEY AUTO_INCREMENT,
	name VARCHAR(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO category (name) VALUES ('Mobile Phone');
INSERT INTO category (name) VALUES ('Camera');
INSERT INTO category (name) VALUES ('TV');
INSERT INTO category (name) VALUES ('Laptop');
INSERT INTO category (name) VALUES ('Mens Fashion');