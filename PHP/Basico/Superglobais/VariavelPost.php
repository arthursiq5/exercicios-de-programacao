<form action="VariavelPost.php" method="post">
    <p>Nome: <input type="text" name="nome"></p>
    <p>Idade: <input type="text" name="idade"></p>
    <p><input type="submit" name="submit" value="Submit"></p>
</form>


Bem vindo, <?= $_POST['nome']; ?> <br>
Sua idade: <?= $_POST['idade']; ?>
