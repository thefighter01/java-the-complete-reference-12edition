#! /usr/bin/bash

echo "enter the commit message"

read commit_message

git add .

git commit -m "$commit_message"

git push origin main
