#!/usr/bin/env bash

echo "TESTING\n"
echo "The secret variable secret1 = $SECRET1"
if [ $SECRET1 == "New-secret" ]
then
    echo "Got correct secret!"
fi