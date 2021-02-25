<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <form action="./PrimeiroForm.php" method="get">
        Valor: <input type="number" name="valor">

        <br><br>

        <input type="submit" value="Calcular Raiz">

        <br><hr><br>

        <?php
            $valor = $_GET["valor"];
            echo 'A raiz de ' . $valor . ' é igual a ' . sqrt($valor) . '<br>' . PHP_EOL;
        ?>
    </form>
</body>
</html>
