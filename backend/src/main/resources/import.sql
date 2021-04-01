

INSERT INTO cidade (nome, uf) VALUES ('Curitiba', 'PR');
INSERT INTO cidade (nome, uf) VALUES ('Londrina', 'PR');
INSERT INTO cidade (nome, uf) VALUES ('Maringa', 'PR');
INSERT INTO cidade (nome, uf) VALUES ('Sao Paulo', 'SP');
INSERT INTO cidade (nome, uf) VALUES ('Fortaleza', 'CE');
INSERT INTO cidade (nome, uf) VALUES ('Salvador', 'BA');
INSERT INTO cidade (nome, uf) VALUES ('Foz do Iguacu', 'PR');
INSERT INTO cidade (nome, uf) VALUES ('Florianopolis', 'SC');
INSERT INTO cidade (nome, uf) VALUES ('Cascavel', 'PR');
INSERT INTO cidade (nome, uf) VALUES ('Camboriu', 'SC');

INSERT INTO endereco (logradouro, numero, cep, gps, cidade_id) VALUES ('Rua Mato Grosso',123 , '86010-180', 'gps123456', 2 );
INSERT INTO endereco (logradouro, numero, cep, gps, cidade_id) VALUES ('Avenida maringa',465 , '86061-959', 'gps123456', 2 );
INSERT INTO endereco (logradouro, numero, cep, gps, cidade_id) VALUES ('Rua Espírito Santo',1081 , '86010-510', 'gps123456', 2 );
INSERT INTO endereco (logradouro, numero, cep, gps, cidade_id) VALUES ('Rua Belo Horizonte',650 , '86020-901', 'gps123456', 2 );
INSERT INTO endereco (logradouro, numero, cep, gps, cidade_id) VALUES ('Rua Belo Horizonte', 720, '86020-901', 'gps123456', 2 );
INSERT INTO endereco (logradouro, numero, cep, gps, cidade_id) VALUES ('Rua Belo Horizonte',890 , '86020-901', 'gps123456', 2 );
INSERT INTO endereco (logradouro, numero, cep, gps, cidade_id) VALUES ('Rua XV de Novembro', 1226, '80060-905', 'gps123456', 1 );
INSERT INTO endereco (logradouro, numero, cep, gps, cidade_id) VALUES ('Rua XV de Novembro', 2232, '80045-270', 'gps123456', 1 );
INSERT INTO endereco (logradouro, numero, cep, gps, cidade_id) VALUES ('Rua XV de Novembro', 620, '80020-924', 'gps123456', 1 );
INSERT INTO endereco (logradouro, numero, cep, gps, cidade_id) VALUES ('Rua XV de Novembro',1345 , '80060-000', 'gps123456', 1 );

INSERT INTO cadastro (tipo_cadastro, cargo, entidade_associada, identificacao, nome, telefone_celular, telefone_fixo, foto, endereco_id) VALUES (1,1,1 , 'RG, CPF, CNPJ', 'CENTRAL SIATE 1', 'XXXXXXXXX', '503-38556', 'FOTO',1 );
INSERT INTO cadastro (tipo_cadastro, cargo, entidade_associada, identificacao, nome, telefone_celular, telefone_fixo, foto, endereco_id) VALUES (1,1, 1, 'RG, CPF, CNPJ', 'CENTRAL SIATE 2', 'XXXXXXXXX', '634-20020', 'FOTO',2);
INSERT INTO cadastro (tipo_cadastro, cargo, entidade_associada, identificacao, nome, telefone_celular, telefone_fixo, foto, endereco_id) VALUES (2,1, 1, 'RG, CPF, CNPJ', 'H U', 'XXXXXXXXX', '993-04228', 'FOTO',4);
INSERT INTO cadastro (tipo_cadastro, cargo, entidade_associada, identificacao, nome, telefone_celular, telefone_fixo, foto, endereco_id) VALUES (2, 1,1 , 'RG, CPF, CNPJ', 'H EVANGELICO', 'XXXXXXXXX', '556-50794', 'FOTO',8);
INSERT INTO cadastro (tipo_cadastro, cargo, entidade_associada, identificacao, nome, telefone_celular, telefone_fixo, foto, endereco_id) VALUES (3,6,2, 'RG, CPF, CNPJ', 'ARNALDO RIBEIRO', '987654321', 'XXXXXXXXX', 'FOTO',1);
INSERT INTO cadastro (tipo_cadastro, cargo, entidade_associada, identificacao, nome, telefone_celular, telefone_fixo, foto, endereco_id) VALUES (3,6,3, 'RG, CPF, CNPJ', 'ALCIDES CUNHA', '998562345', 'XXXXXXXXX', 'FOTO',7);
INSERT INTO cadastro (tipo_cadastro, cargo, entidade_associada, identificacao, nome, telefone_celular, telefone_fixo, foto, endereco_id) VALUES (3,3,2, 'RG, CPF, CNPJ', 'MARCOS MACEDO', '998321475', 'XXXXXXXXX', 'FOTO',1);
INSERT INTO cadastro (tipo_cadastro, cargo, entidade_associada, identificacao, nome, telefone_celular, telefone_fixo, foto, endereco_id) VALUES (3,3,3, 'RG, CPF, CNPJ', 'PEDRO CARDOSO', '988476525', 'XXXXXXXXX', 'FOTO',9);
INSERT INTO cadastro (tipo_cadastro, cargo, entidade_associada, identificacao, nome, telefone_celular, telefone_fixo, foto, endereco_id) VALUES (4,1,1, 'RG, CPF, CNPJ', 'ANALIA FRANCO DA SILVA', '996325541', 'XXXXXXXXX', 'FOTO',2);
INSERT INTO cadastro (tipo_cadastro, cargo, entidade_associada, identificacao, nome, telefone_celular, telefone_fixo, foto, endereco_id) VALUES (4,1,1, 'RG, CPF, CNPJ', 'JULIO DE OLIVEIRA', '998564712', 'XXXXXXXXX', 'FOTO',6);
 