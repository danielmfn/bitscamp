delete from tb_loja;
delete from tb_usuario;
delete from tb_categoria_usuario;
delete from tb_perfil_cliente;

ALTER SEQUENCE tb_usuario_id_usuario_seq RESTART WITH 1;
ALTER SEQUENCE tb_perfil_cliente_id_perfil_cliente_seq RESTART WITH 1;
ALTER SEQUENCE tb_loja_id_loja_seq RESTART WITH 1;
ALTER SEQUENCE tb_categoria_usuario_id_categoria_usuario_seq RESTART WITH 1;

INSERT INTO tb_perfil_cliente
(perfil_cliente)
VALUES('Gamer Casual'),
      ('Desenvolvedor'),
      ('Gamer Hight'),
      ('Entusiasta'),
      ('Produtor Audiovisual'),
      ('Designer Gráfico');

INSERT INTO tb_categoria_usuario
(categoria_usuario)
VALUES('Administrador'),
      ('Cliente'),
      ('Funcionário'),
      ('Desenvolvedor');


INSERT INTO tb_usuario(id_categoria_usuario, nome_usuario, email_usuario, cep_usuario, endereco_usuario, telefone_usuario, senha_usuario, id_perfil_cliente, municipio_usuario, id_estado)
VALUES(1, 'Victória Andrade', 'victoria.andrade@bitscamp.com.br', 72451478, 'Rua 01', 61986352220, '', 1, 'Brasília', 4),
      (1, 'Guilherme Santos', 'guilherme.s354@gmail.com', 72451478, 'Rua 02', 61986352225, '', 2, 'Goiania', 2),
      (2, 'Everton Rodrigues', 'h3v3rton@gmail.com', 72451414, 'Rua 03', 61986352214, '', 1, 'Brasília', 11),
      (1, 'Telmo Silva', 'telmosilvah4@outlook.com', 72451419, 'Rua 04', 61986352217, '', 1, 'São Paulo', 7),
      (2, 'Marcelo Fernandes', 'm78@gmail.com', 72451357, 'Rua 05', 61986352240, '', 1, 'Brasília', 3),
      (2, 'Pedro Henrrique', 'pedro.henrrique@bitscamp.com.br', 72451365, 'Rua 06', 61986352257, '', 1, 'Brasília', 1),
      (1, 'Helena Maria', 'h.elena@hotmail.com', 72451111, 'Rua 07', 61986352247, '', 1, 'Brasília', 10),
      (2, 'Maria Eduarda', 'duda87@gmail.com', 72451225, 'Rua 08', 61986352365, '', 1, 'Santos', 8);

INSERT INTO tb_loja
(cnpj_loja, nome_loja, telefone_loja, email_loja, municipio_loja, id_estado, cep_loja, endereco_loja)
VALUES(78965412365411, 'Loja 01', 61986325487, 'comercial@loja1.com.br', 'Rio de Janeiro', 7, 72365531, 'Avenida 01'),
      (78965412365422, 'Loja 02', 61986325488, 'comercial@loja2.com.br', 'Brasília', 5, 72365544, 'Avenida 02'),
      (78965412365433, 'Loja 03', 61986325489, 'comercial@loja3.com.br', 'Goiania', 3, 72365546, 'Avenida 03'),
      (78965412365444, 'Loja 04', 61986325490, 'comercial@loja4.com.br', 'Belo Horizonte', 1, 72365521, 'Avenida 04'),
      (78965412365455, 'Loja 05', 61986325491, 'comercial@loja5.com.br', 'São Paulo', 12, 72365511, 'Avenida 05');

