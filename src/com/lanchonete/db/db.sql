CREATE DATABASE produto;

CREATE TABLE cliente(
	id_cliente SERIAL NOT NULL,
	nome VARCHAR(255) NOT NULL,
	CONSTRAINT pk_cliente PRIMARY KEY (id_cliente)

);
CREATE TABLE produto(
	id_produto SERIAL NOT NULL,
	nome_produto VARCHAR(30),
	tamanho_produto VARCHAR(30),
	cor INT,
	valor INT,
	CONSTRAINT pk_produto PRIMARY KEY (id_produto)
);

CREATE TABLE pedido(
	id_pedido SERIAL NOT NULL,
	data_pedido VARCHAR(30) NOT NULL,
	forma_pagamento INT,
	data_entrega_programada VARCHAR(30),
	data_entrega_efetivada VARCHAR(30),
	preco INT,
	id_cliente INT,
	CONSTRAINT pk_pedido PRIMARY KEY (id_pedido),
	CONSTRAINT fk_cliente FOREIGN KEY (id_cliente) REFERENCES cliente(id_cliente));

CREATE TABLE produto_pedido(
	pedido INT REFERENCES pedido(id_pedido) ON UPDATE CASCADE ON DELETE CASCADE,
	produto INT REFERENCES produto(id_produto) ON UPDATE CASCADE,
	CONSTRAINT PRIMAY PRIMARY KEY (pedido, produto) 
)
INSERT INTO cliente(nome) values('silvani');
INSERT INTO cliente(nome) values('northon');
INSERT INTO cliente(nome) values('pedro');
INSERT INTO cliente(nome) values('luis');
INSERT INTO cliente(nome) values('ana');

