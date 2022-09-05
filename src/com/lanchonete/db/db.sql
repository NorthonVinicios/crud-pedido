CREATE TABLE cliente(
	id_cliente SERIAL NOT NULL,
	nome VARCHAR(255) NOT NULL,
	CONSTRAINT pk_cliente PRIMARY KEY (id_cliente)
);

CREATE TABLE pedido(
	id_pedido SERIAL NOT NULL,
	data_pedido VARCHAR(30) NOT NULL,
	forma_pagamento INT,
	data_entrega_programada VARCHAR(30),
	data_entrega_efetivada VARCHAR(30),
	id_cliente INT,
	CONSTRAINT pk_pedido PRIMARY KEY (id_pedido),
	CONSTRAINT fk_cliente FOREIGN KEY (id_cliente) REFERENCES cliente(id_cliente));

CREATE TABLE produto(
	id_produto SERIAL NOT NULL,
	nome_produto VARCHAR(30),
	tamanho_produto VARCHAR(30),
	cor INT,
	valor INT,
	CONSTRAINT pk_produto PRIMARY KEY (id_produto)
);
