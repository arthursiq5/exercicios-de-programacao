#!/bin/bash

# instala os pacotes que eu mais uso em distros baseadas em Debian e Ubuntu
# pra alguns pacotes eu preferi usar a versão de flatpak que se configura automaticamente no lugar da versão de apt, tudo depende o contexto

apt update
apt upgrade
apt dist-upgrade

apt install flatpak -y # gerenciador de pacotes flatpak
apt install git vim zsh chromium -y # pacotes úteis

# instalando oh-my-zsh
sh -c "$(curl -fsSL https://raw.githubusercontent.com/robbyrussell/oh-my-zsh/master/tools/install.sh)"
