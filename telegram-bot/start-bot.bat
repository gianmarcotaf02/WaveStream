@echo off
rem Avvia il bot Telegram di WaveStream (long polling + notifiche release)
title WaveStream Telegram Bot
setlocal
cd /d "%~dp0"

where node >nul 2>nul
if errorlevel 1 (
  echo [ERRORE] Node.js non trovato nel PATH. Installa Node 18+ da https://nodejs.org
  pause
  exit /b 1
)

node src\bot.mjs
set EXITCODE=%ERRORLEVEL%

echo.
if not "%EXITCODE%"=="0" (
  echo [ERRORE] Il bot e' terminato con codice %EXITCODE%.
) else (
  echo Bot terminato.
)
pause
exit /b %EXITCODE%
