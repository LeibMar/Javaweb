create table usuario (
idUsuario int primary key auto_increment,
nomeUsuario varchar(100) not null,
pais varchar (40) not null,
dataCadastro varchar (30) not null,
dataEdicao varchar(30) not null,
email varchar(50));


create table artigo (
idArtigo int primary key auto_increment,
texto varchar (5000),
usuarioUltimoEditorID int not null,
criadoPorID int not null  ,
dataCriacao varchar (30) not null,
dataEdicao varchar(30) not null,
foreign key (criadoPorID)  references usuario(idUsuario),
foreign key (usuarioUltimoEditorID)  references usuario(idUsuario))
;




