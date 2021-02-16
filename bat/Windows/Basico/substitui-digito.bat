@echo off

:: colocar a declaração das variáveis entre aspas permite que se use
:: símbolos especiais de atribuição ou outros na mensagem sem quebrar
:: o programa
set /p "usuario=Usuario> "

echo %usuario:a=x%

:: o >nul redireciona a saída do pause para nulo
pause >nul

