create table catalogo (
idLivro int primary key auto_increment,
nomeLivro varchar(200),
disponivel int );
create table emprestimo (
idEmprestimo int primary key auto_increment,
idUsuario int,
FOREIGN KEY (idUsuario) references usuario(idUsuario),
idlivro int,
FOREIGN KEY (idLivro) references catalogo(idLivro));