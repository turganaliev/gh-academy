#!/bin/bash

cd /Users/study/Desktop/GHAcademy/CS_IP/week3_scripting/

git checkout master

fswatch -0 . | while read -d "" file
do
    if [ -f "$file" ]; then
        echo "New file detected: $file"

        git add "$file"

        git commit -m "Auto-commit new file: $file"

        git push origin master

        echo "Pushed $file to remote repository"
    fi
done

