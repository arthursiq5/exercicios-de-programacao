<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Conecta MySQL</title>
</head>
<body>
    <?php
        // realiza conexão à base de dados
        $conexao = mysqli_connect("localhost", "root", "root")
            or die("Não foi possível conectar");
        // seleciona a database desejada
        mysqli_select_db($conexao, "curso")
            or die("Não foi possível selecionar o banco de dados");
            $consulta = "SELECT * FROM modulos";
        $resultado = mysqli_query($conexao, $consulta)
            or die("Falha na execução da consulta: " . mysqli_error($conexao));
        echo "Consulta executada com sucesso";
    ?>
</body>
</html>
