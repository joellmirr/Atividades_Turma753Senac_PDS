create table Cliente(
	IdCliente int not null primary key auto_increment,
	Nome varchar(20) not null,
	Cpf varchar(11) not null,
	email varchar(20) not null,
	Endereco varchar(250) not null	
);

insert into cliente(Nome,Cpf,Email,Endereco) values('Joelmir','036017','jo.ooo','GraValley'); 

create  table Telefone(
	IdTel int not null primary key auto_increment,
	Telefone int(9),
	IdCliente int not null
);

insert  into Telefone(IdTel,Telefone,IdCliente) values(1,629999,1);

create table ContaCorrente(
	IdCC int not null primary key auto_increment,
	NumConta varchar(20) not null,
	Agencia varchar(10) not null,
	NomeBanco varchar(100) not null,
	IdCliente int not null
);

insert into ContaCorrente(IdCC,NumConta,Agencia,NomeBanco,IdCliente) values(1,'8573','8888','Itau',1);

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
);

create table TelefoneEmpresa(
	IdTelefone int not null primary key auto_increment,
	Telefone int(9) not null,
	IdEmpresa int not null
);

create  table EnderecoEmpresa(
	IdEndereco int not null primary key auto_increment,
	Rua varchar(50) not null,
	Viela varchar(50) not null,
	Bairro varchar(50) not null,
	Complemento varchar(50) not null,
	IdEmpresa int not null
);