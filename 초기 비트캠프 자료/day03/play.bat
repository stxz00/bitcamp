@echo off
set /p classname=ClassName?
del %classname%.class
cls
javac -encoding utf8 %classname%.java
java %classname%
