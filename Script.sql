create table Cliente(
	IdCliente int not null primary key auto_increment,
	Nome varchar(20) not null,
	Indentidade int(10) not null,
	Cpf int(11) not null,
	email varchar(20) not null,
	Endereco varchar(250) not null	
);

insert into cliente(Nome,Indentidade,Cpf,Email,Endereco) values('Joelmir','876988','036017','jo.ooo','GraValley'); 

create  table Telefone(
	IdTel int not null primary key auto_increment,
	Telefone int(9),
	IdCliente int not null
)engine=InnoDB;

insert  into Telefone(IdTel,Telefone,IdCliente) values(1,629999,1);
alter table Telefone add foreign key(IdCliente) references Cliente(IdCliente);

create table ContaCorrente(
	IdCC int not null primary key auto_increment,
	NumConta varchar(20) not null,
	Agencia varchar(10) not null,
	NomeBanco varchar(100) not null,
	IdCliente int not null
)engine=InnoDB;

insert into ContaCorrente(IdCC,NumConta,Agencia,NomeBanco,IdCliente) values(1,'8573','8888','Itau',1);

alter table contacorrente add foreign key(IdCliente) references Cliente(IdCliente);

#---------------------------------------------------------------------------------------------------------------------

create table Empresa(
	IdEmpresa int not null primary key auto_increment,
	Nome varchar(50) not null,
	Cnpj varchar(11) not null,
	RazaoSocial varchar(50) not null,
	InsEstadual varchar(50) not null,
	InsMunicipal varchar(50) not null,
	Email varchar(20) not null,
	Segmento varchar(20) not null
)engine=InnoDB;

create table TelefoneEmpresa(
	IdTelefone int not null primary key auto_increment,
	Telefone int(9) not null,
	IdEmpresa int not null
)engine=InnoDB;

alter table telefoneempresa  add foreign key(IdEmpresa) references Empresa(IdEmpresa);

create  table EnderecoEmpresa(
	IdEndereco int not null primary key auto_increment,
	Rua varchar(50) not null,
	Viela varchar(50) not null,
	Bairro varchar(50) not null,
	Complemento varchar(50) not null,
	IdEmpresa int not null
)engine=InnoDB;

alter table enderecoempresa add foreign key(IdEmpresa) references Empresa(IdEmpresa);
#-----------------------------------------------------------------------------------------------------------------------------

create table Funcionario(
	IdFuncionario int not null primary key auto_increment,
	Nome varchar(20) not null,
	Enderece varchar(20) not null,
	Conplemento varchar(20) not null,
	Bairro varchar(20) not null,
	Cidade varchar(20) not null,
	Estado varchar(20) not null,
	CEP int(8) not null,
	CPF varchar(11) not null,
	CTPS varchar(10) not null,
	DataNascimento date not null
)engine=InnoDB;

create table Funcao(
	IdFuncao int not null primary key auto_increment,
	DescricaoFuncao varchar(20) not null,
	IdFuncionario int not null
)engine=InnoDB;

create table TesteCliente(
	idTesteCliente int not null primary key auto_increment,
	Indentidade int not null,
	CPF int not null,
	email varchar(50) not null,
	Endereco varchar(100) not null
)engine=InnoDB;
update testecliente set Nome='Joelmir G',email='jo.olive0@gmail.com' where idTesteCliente='1'
