#!/usr/bin/env bash

if [ "$#" -ne 1 ]; then
    echo "Usage: $(basename "$0") <file>"
    exit 1
fi

if [ ! -f "$1" ]; then
    echo "Could not find $1"
    exit 1
fi

SOURCE="$1"
CLASS="${1%.java}"

echo "Compiling..."
javac "$SOURCE"

echo "Starting..."
java "$CLASS"

