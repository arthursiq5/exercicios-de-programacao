<?php

namespace App\Test\Loja;

use App\Loja\CarrinhoDeCompras;
use App\Loja\Produto;
use PHPUnit\Framework\TestCase;

class CarrinhoDeComprasTest extends TestCase
{
    private CarrinhoDeCompras $carrinhoDeCompras;
    private array $compras;

    public function setUp(): void
    {
        $this->carrinhoDeCompras = new CarrinhoDeCompras();

        $geladeira = new Produto("Geladeira", 450.00);
        $liquidificador = new Produto("Liquidificador", 250.00);
        $jogoDePratos = new Produto("Jogo de pratos", 70.00);

        $this->compras = [
            $geladeira,
            $liquidificador,
            $jogoDePratos
        ];

        $this->carrinhoDeCompras->adiciona($geladeira);
        $this->carrinhoDeCompras->adiciona($liquidificador);
        $this->carrinhoDeCompras->adiciona($jogoDePratos);
    }

    public function testProdutosCompras()
    {
        $this->assertEquals($this->compras, $this->carrinhoDeCompras->getProdutos());
        foreach ($this->carrinhoDeCompras->getProdutos() as $produto) {
            $this->assertInstanceOf('App\\Loja\\Produto', $produto);
        }
    }
    
    public function testGetMaiorValor()
    {
        $this->assertEquals($this->compras[0]->getValor(), $this->carrinhoDeCompras->maiorValor());
    }
}