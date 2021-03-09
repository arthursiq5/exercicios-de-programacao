CREATE TABLE modulos (
    id INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(255),
    categoria VARCHAR(32)
);

INSERT INTO modulos (nome, categoria)
    VALUES ('Geografia', 'Ensino Médio');
