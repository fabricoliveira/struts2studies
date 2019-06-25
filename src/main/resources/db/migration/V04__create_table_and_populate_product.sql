CREATE TABLE product (
	id BIGINT PRIMARY KEY AUTO_INCREMENT,
	name VARCHAR(50) NOT NULL,
	price INTEGER NOT NULL,
	idCategory BIGINT NOT NULL,
	FOREIGN KEY (idCategory) REFERENCES category(id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO product (name, price, idCategory) VALUES ('iPhone', 10000, 1);
INSERT INTO product (name, price, idCategory) VALUES ('Panasonic', 7000, 2);
INSERT INTO product (name, price, idCategory) VALUES ('LG', 20000, 3);
INSERT INTO product (name, price, idCategory) VALUES ('Macbook', 30000, 4);