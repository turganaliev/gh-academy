#!/bin/bash

REPO_DIR="/Users/izat/Documents/code/gh-academy/computer-systems-and-industrial-programming"

cd "$REPO_DIR"
    
STATUS=$(git status --porcelain)
    
if [ -n "$STATUS" ]; then

    echo "Changes detected, pushing to GitHub..."
    git add .
    git commit -m "auto-update"
    git push
    echo "✓ Pushed successfully!"

else
    echo "No changes detected."
fi
