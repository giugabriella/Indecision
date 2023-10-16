CREATE DATABASE Biblioteca_Indecision;
Use Biblioteca_Indecision;

	--1.Tabela de Livros

	create table tbl_livros
	(
		ID_Livro SMALLINT IDENTITY(100,1),
		Nome_Livro VARCHAR(50) NOT NULL,
		ISBN VARCHAR(15) NOT NULL UNIQUE,
		ID_Autor SMALLINT NOT NULL,
		ID_Editora SMALLINT NOT NULL,
		Data_Pub DATE NOT NULL,
		Preco_Livro MONEY NOT NULL,

		CONSTRAINT pk_idlivro PRIMARY KEY(ID_Livro),
		CONSTRAINT fk_ID_Autor FOREIGN KEY(ID_Autor)
			REFERENCES tbl_autores (ID_Autor) ON DELETE CASCADE,
		CONSTRAINT fk_id_editora FOREIGN KEY (ID_Editora)
			REFERENCES tbl_editora (ID_Editora) ON DELETE CASCADE
	);

-- 2- Tabela Autores

create table tbl_autores
	(
		ID_Autor SMALLINT,
		Nome_Autor VARCHAR(50),
		Sobrenome_Autor VARCHAR(60)
		CONSTRAINT pk_ID_Autor PRIMARY KEY (ID_Autor)
	);

	--3.Tabela de Editora

	create table tbl_editora
	(
		ID_Editora SMALLINT PRIMARY KEY IDENTITY,
		Nome_Editora VARCHAR(50)
	);