CREATE TABLE products (
	id BIGINT PRIMARY KEY AUTO_INCREMENT,
	name VARCHAR(50) NOT NULL,
	price INTEGER NOT NULL,
	category VARCHAR(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO products (name, price, category) VALUES ('iPhone', 10000, 'Mobile Phone');
INSERT INTO products (name, price, category) VALUES ('Panasonic', 7000, 'Camera');
INSERT INTO products (name, price, category) VALUES ('LG', 20000, 'TV');
INSERT INTO products (name, price, category) VALUES ('Macbook', 30000, 'Laptop');
INSERT INTO products (name, price, category) VALUES ('Shoes', 700, 'Mens Fashion');