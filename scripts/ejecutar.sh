#!/usr/bin/env bash
# Compila (si hace falta) y ejecuta el menu principal.
set -e
cd "$(dirname "$0")/.."

if [ ! -d out ]; then
    bash scripts/compilar.sh
fi

java -cp "out:libs/*" Main
