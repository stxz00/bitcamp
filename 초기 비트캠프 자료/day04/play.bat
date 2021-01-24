@echo off
set /p filename=name?
javac -encoding utf8 -d . %filename%.java
java com.bit.day04.%filename%