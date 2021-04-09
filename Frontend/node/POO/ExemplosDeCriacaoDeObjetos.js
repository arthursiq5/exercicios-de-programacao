var pessoa = {
    nome: 'Sérgio',
    altura: 1.72,
    nascimento: new Date(1969, 1, 4)
};

console.log('Criação usando sintaxe de chaves: ');
console.log(pessoa);
console.log("\n\n");

function objetoPessoa() {
    this.nome = 'Sérgio';
    this.altura = 1.72;
    this.nascimento = new Date(1969, 1, 4);
}
var pessoa = new objetoPessoa();
console.log('Criação usando sintaxe de function: ');
console.log(pessoa);
console.log("\n\n");
