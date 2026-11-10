#!/usr/bin/env bash
# Compila todo el proyecto en la carpeta out/
set -e
cd "$(dirname "$0")/.."

mkdir -p out
find src -name "*.java" > out/fuentes.txt

javac -encoding UTF-8 -d out -cp "libs/*" @out/fuentes.txt

echo "Compilacion OK -> out/"
