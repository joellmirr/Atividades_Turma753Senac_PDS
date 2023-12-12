/* Lógico_1: */

CREATE TABLE Empresa (
    IdEmpresa INTEGER PRIMARY KEY,
    RazaoSocial VARCHAR(20),
    NomeFantasia VARCHAR(20),
    InscriçãoEstadual  INTEGER,
    CNPJ INTEGER,
    PorteEmpresa VARCHAR(20),
    UnidadeFederativa CHAR,
    Telefone INTEGER,
    Fax VARCHAR(20),
    Site CHAR,
    Observacoes VARCHAR(100)
)engine=InnoDB;

CREATE TABLE Endereco (
    IdEndereco INTEGER PRIMARY KEY,
    Bairro VARCHAR(20),
    CEP INTEGER,
    Cidade VARCHAR(20),
    UnidadFederativa CHAR,
    IdEmpresa INTEGER
)engine=InnoDB;

CREATE TABLE ContComercial (
    IdContComercial INTEGER PRIMARY KEY,
    EmailComercial VARCHAR(20),
    FaxComercial  VARCHAR(20),
    IdEmpresa INTEGER
)engine=InnoDB;

CREATE TABLE ContatoExpedicao (
    IdContExpedicao INTEGER PRIMARY KEY,
    EmailExpedicao VARCHAR(20),
    FaxExpedicao VARCHAR(20),
    IdEmpresa INTEGER
)engine=InnoDB;

CREATE TABLE ContatoFinanceiro (
    IdContFinanceiro INTEGER PRIMARY KEY,
    EmailFinanceiro VARCHAR(20),
    FaxFinanceiro VARCHAR(20),
    IdEmpresa INTEGER
)engine=InnoDB;

CREATE TABLE ReferenciasComerciais (
    IdRefeComerciais INTEGER PRIMARY KEY,
    Nome VARCHAR(20),
    Telefone INTEGER,
    Contato VARCHAR(20),
    IdEmpresa INTEGER
)engine=InnoDB;

CREATE TABLE LocalCobranca (
    IdLocalCobranca INTEGER PRIMARY KEY,
    Endereço VARCHAR(20),
    Bairro VARCHAR(20),
    CEP INTEGER,
    Cidade VARCHAR(20),
    UF CHAR,
    Contato INTEGER,
    Telefone INTEGER,
    IdEmpresa INTEGER
)engine=InnoDB;

CREATE TABLE LocalEntrega (
    IdLocalEntrega INTEGER PRIMARY KEY,
    Endereço VARCHAR(20),
    Bairro VARCHAR(20),
    CEP INTEGER,
    Cidade VARCHAR(20),
    UF CHAR,
    Contato VARCHAR(20),
    Telefone INTEGER,
    Fax VARCHAR(20),
    IdEmpresa INTEGER
)engine=InnoDB;

CREATE TABLE Status (
    IdStatus INTEGER PRIMARY KEY,
    Descricao VARCHAR(20),
    IdData INTEGER
)engine=InnoDB;

CREATE TABLE Dta (
    IdDta INTEGER PRIMARY KEY,
    Dta DATE,
    IdEmpresa INTEGER
)engine=InnoDB;
 
ALTER TABLE Endereco ADD CONSTRAINT FK_Endereco_2
    FOREIGN KEY (IdEmpresa)
    REFERENCES Empresa (IdEmpresa);
 
ALTER TABLE ContComercial ADD CONSTRAINT FK_ContComercial_2
    FOREIGN KEY (IdEmpresa)
    REFERENCES ContComercial (IdContComercial);
 
ALTER TABLE ContatoExpedicao ADD CONSTRAINT FK_ContatoExpedicao_2
    FOREIGN KEY (IdEmpresa)
    REFERENCES ContatoExpedicao (IdContExpedicao);
 
ALTER TABLE ContatoFinanceiro ADD CONSTRAINT FK_ContatoFinanceiro_2
    FOREIGN KEY (IdEmpresa)
    REFERENCES ContatoFinanceiro (IdContFinanceiro);
 
ALTER TABLE ReferenciasComerciais ADD CONSTRAINT FK_ReferenciasComerciais_2
    FOREIGN KEY (IdEmpresa)
    REFERENCES ReferenciasComerciais (IdRefeComerciais);
 
ALTER TABLE LocalCobranca ADD CONSTRAINT FK_LocalCobranca_2
    FOREIGN KEY (IdEmpresa)
    REFERENCES LocalCobranca (IdLocalCobranca);
 
ALTER TABLE LocalEntrega ADD CONSTRAINT FK_LocalEntrega_2
    FOREIGN KEY (IdEmpresa)
    REFERENCES LocalEntrega (IdLocalEntrega);
 
ALTER TABLE Status ADD CONSTRAINT FK_Status_2
    FOREIGN KEY (IdData)
    REFERENCES Status (IdStatus);
 
ALTER TABLE Dta ADD CONSTRAINT FK_Data_2
    FOREIGN KEY (IdEmpresa)
    REFERENCES Dta (IdDta);