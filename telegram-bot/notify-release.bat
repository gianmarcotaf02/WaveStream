@echo off
rem Annuncia una release WaveStream agli iscritti del bot Telegram.
rem Uso: notify-release.bat [tag|latest] [--dry-run] [--force] [--to <id>] [--text "msg"]
title WaveStream - notifica release
setlocal
cd /d "%~dp0"

node src\notify-release.mjs %*
set EXITCODE=%ERRORLEVEL%
echo.

if "%~1"=="" (
  echo Suggerimenti:
  echo   notify-release.bat latest --dry-run     anteprima senza inviare
  echo   notify-release.bat                      invia l'ultima release non annunciata
  echo   notify-release.bat 1.1.12               invia una release specifica
  echo.
  pause
)

exit /b %EXITCODE%
