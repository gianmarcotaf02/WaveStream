@echo off
rem Configura nome, descrizioni, comandi e foto del bot Telegram via API.
title WaveStream - setup profilo bot
setlocal
cd /d "%~dp0"

node src\setup-bot.mjs %*
echo.
pause
