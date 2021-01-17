<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <title>Aula 2 - POO</title>
    </head>
    <body>
        <?php
            require_once 'Caneta.php';

            $caneta1 = new Caneta(); 

            $caneta1->cor = "Azul";
            $caneta1->ponta = 0.5;
            $caneta1->tampada = false;
            
            $caneta1->rabiscar();

            $caneta1->tampar();

            $caneta1->rabiscar();

            print_r($caneta1)
        ?>
    </bodfgdgvb  >
</html>

