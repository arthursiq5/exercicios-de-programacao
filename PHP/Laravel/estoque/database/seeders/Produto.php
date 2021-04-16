<?php

namespace Database\Seeders;

use Illuminate\Database\Seeder;
use Illuminate\Support\Facades\DB;
use Illuminate\Support\Str;

class Produto extends Seeder
{
    /**
     * Run the database seeds.
     *
     * @return void
     */
    public function run()
    {
        DB::table('produtos')->insert([
            'nome' => 'Geladeira',
            'valor' => 5900.00,
            'descricao' => 'Side by Side com gelo na porta',
            'quantidade' => 2
        ]);

        DB::table('produtos')->insert([
            'nome' => 'Fogão',
            'valor' => 950.00,
            'descricao' => 'Painel automático e forno elétrico',
            'quantidade' => 5
        ]);

        DB::table('produtos')->insert([
            'nome' => 'Microondas',
            'valor' => 1520.00,
            'descricao' => 'Manda SMS quando termina de esquentar',
            'quantidade' => 1
        ]);
    }
}
