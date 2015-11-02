CREATE TABLE usuario
(
  email character varying(50) NOT NULL,
  foto character varying(200),
  senha character varying(200) NOT NULL,
  tipo character varying(140),
  cidade character varying(50),
  estado character varying(50),
  nomecompleto character varying(100) NOT NULL,
  apelido character varying(50),
  datanascimento character varying(10),
  sexo character varying(1),
  PRIMARY KEY (email)  
);

CREATE TABLE avaliacao
(
  codigo serial NOT NULL,
  comentario character varying(100),
  rating integer,
 PRIMARY KEY (codigo)
);

CREATE TABLE filme
(
  codigo serial NOT NULL,
  titulo character varying(40),
  ano character varying(10),
  sinopse text ,
  foto character varying(20),
  generos character varying(300),
  atores character varying(300),
  diretores character varying(300),
  PRIMARY KEY (codigo)
);

CREATE TABLE grupo(
  codigo serial NOT NULL,
  nomegrupo character varying(20),
  descricao character varying(100),
  PRIMARY KEY (codigo)
);



CREATE TABLE publicacao
(
  codigo bigserial NOT NULL,
  titulo character varying(200),
  ano character varying(11),
  genero character varying(80),
  ator character varying(80),
  diretor character varying(80),
  imagem character varying(200),
  descricao text,
  data timestamp without time zone,
  criador character varying(50),
  PRIMARY KEY (codigo),
  FOREIGN KEY (criador) REFERENCES usuario (email)
  );

