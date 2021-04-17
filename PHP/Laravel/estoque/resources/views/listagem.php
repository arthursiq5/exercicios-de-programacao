<html>
<head>
    <link rel="stylesheet" href="./css/app.css">
    <title>Controle de Estoque</title>
</head>
<body>
    <h1>Listagem de produtos com Laravel</h1>
    <table class="table table-striped table-bordered table-hover">
        <?php foreach ($produtos as $produto): ?>
        <tr>
            <td><?= $produto->nome ?></td>
            <td><?= $produto->valor ?></td>
            <td><?= $produto->descricao ?></td>
            <td><?= $produto->quantidade ?></td>
        </tr>
        <?php endforeach ?>
    </table>
</body>
</html>
