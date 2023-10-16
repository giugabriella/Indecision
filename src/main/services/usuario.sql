 CREATE DATABASE usuario;
 USE usuario;


CREATE TABLE tb_pessoa(
 	cod_pessoa INT PRIMARY KEY AUTO_INCREMENT,
     nome VARCHAR(200) NOT NULL,
     fone VARCHAR(200) NULL,
     email VARCHAR(200) NOT NULL
 );