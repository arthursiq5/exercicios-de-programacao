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

            $caneta1->modelo = 'BIC cristal';
            $caneta1->cor = 'vermelho';

            $caneta1->destampar();

            $caneta1->rabiscar();

            $caneta1->tampar();

            $caneta1->rabiscar();

            print_r($caneta1);            

        ?>
    </bodfgdgvb  >
</html>

