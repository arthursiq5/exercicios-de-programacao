@echo off

:: parâmetros do taskkill:
:: /f  = forçar
:: /t  = fecha os processos filhos
:: /im = mata o processo
taskkill /f /t /im chrome.exe

exit

