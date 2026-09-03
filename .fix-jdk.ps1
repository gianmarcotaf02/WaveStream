$oldJdk  = [Environment]::GetEnvironmentVariable('JAVA_HOME','User')
$oldPath = [Environment]::GetEnvironmentVariable('Path','User')

# Backup
$backup = "JAVA_HOME=$oldJdk`r`nPATH=$oldPath"
Set-Content -Path "$env:USERPROFILE\env-backup-jdk.txt" -Value $backup -Encoding UTF8

# JAVA_HOME -> JBR 21 completo
[Environment]::SetEnvironmentVariable('JAVA_HOME','C:\Users\Gianmarco\.jdks\jbr-21.0.11','User')

# PATH utente: sostituisci l'entry jdk-11.0.2\bin con il nuovo JDK
$newPath = $oldPath -replace [regex]::Escape('C:\Users\Gianmarco\AppData\Local\jdk-11.0.2\bin'), 'C:\Users\Gianmarco\.jdks\jbr-21.0.11\bin'
[Environment]::SetEnvironmentVariable('Path', $newPath, 'User')

Write-Output '--- NUOVO JAVA_HOME (User) ---'
[Environment]::GetEnvironmentVariable('JAVA_HOME','User')
Write-Output '--- ENTRY JDK NEL PATH (User) ---'
([Environment]::GetEnvironmentVariable('Path','User') -split ';') | Where-Object { $_ -match 'jdk|jbr' }
Write-Output "--- Backup salvato in: $env:USERPROFILE\env-backup-jdk.txt ---"
