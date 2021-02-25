<form action="VariavelGet.php" method="get">
    <p>Nome: <input type="text" name="nome"></p>
    <p>Idade: <input type="text" name="idade"></p>
    <p><input type="submit" name="submit" value="Submit"></p>
</form>


Bem vindo, <?= $_GET['nome']; ?> <br>
Sua idade: <?= $_GET['idade']; ?>
