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
  sinopse character varying(45),
  foto character varying(20),
  generos character varying(20),
  PRIMARY KEY (codigo)
);

CREATE TABLE generos
(
  codigo integer NOT NULL,
  nome character varying(80) NOT NULL,
  PRIMARY KEY (codigo, nome),
  FOREIGN KEY (codigo)  REFERENCES filme (codigo)
);

CREATE TABLE grupo(
  codigo serial NOT NULL,
  nomegrupo character varying(20),
  descricao character varying(100),
  PRIMARY KEY (codigo)
);

CREATE TABLE nome_atores
(
  codigofilme integer NOT NULL,
  nomeator character varying(80) NOT NULL,
  PRIMARY KEY (codigofilme, nomeator),
  FOREIGN KEY (codigofilme)REFERENCES filme (codigo)
);

CREATE TABLE nome_diretores
(
  codigofilme integer NOT NULL,
  nomediretor character varying(80) NOT NULL,
  PRIMARY KEY (codigofilme, nomediretor),
  FOREIGN KEY (codigofilme)  REFERENCES filme (codigo)
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
