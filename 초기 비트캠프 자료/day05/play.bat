@echo off
set /p filename=filename?
javac -encoding utf8 -d . %filename%.java
java com.bit.day05.%filename%