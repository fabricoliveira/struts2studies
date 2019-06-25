CREATE TABLE product (
	id BIGINT PRIMARY KEY AUTO_INCREMENT,
	name VARCHAR(50) NOT NULL,
	price INTEGER NOT NULL,
	category VARCHAR(50) NOT NULL,
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO product (name, price, idCategory) VALUES ('iPhone', 10000, 'Mobile Phone');
INSERT INTO product (name, price, idCategory) VALUES ('Panasonic', 7000, 'Camera');
INSERT INTO product (name, price, idCategory) VALUES ('LG', 20000, 'TV');
INSERT INTO product (name, price, idCategory) VALUES ('Macbook', 30000, 'Laptop');
INSERT INTO product (name, price, idCategory) VALUES ('Shoes', 700, 'Mens Fashion');