#!/bin/bash

# instalando Steam
flatpak install flathub com.valvesoftware.Steam # steam via flatpak
echo 'alias steam="flatpak run com.valvesoftware.Steam"' >> ~/.zshrc
echo 'alias steam="flatpak run com.valvesoftware.Steam"' >> ~/.bashrc

# instalando Unity (versão de linux)
flatpak install flathub com.unity.UnityHub
echo 'alias unityhub="flatpak run com.unity.UnityHub"' >> ~/.zshrc
echo 'alias unityhub="flatpak run com.unity.UnityHub"' >> ~/.bashrc
