#!/bin/bash

# instalando VS Code
flatpak install flathub com.visualstudio.code
echo 'alias code="flatpak run com.visualstudio.code"' >> ~/.zshrc
echo 'alias code="flatpak run com.visualstudio.code"' >> ~/.bashrc
