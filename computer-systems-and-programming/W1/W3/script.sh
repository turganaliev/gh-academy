#!/bin/bash

REPO_DIR="/Users/izat/Documents/code/gh-academy/computer-systems-and-industrial-programming/W3"

if ! command -v fswatch &> /dev/null; then
    echo "ERROR: 'fswatch' is not found. Please install via 'brew install fswatch'."
    exit 1
fi

echo "--- Starting real-time file monitoring on $REPO_DIR ---"

fswatch -r -l 0.5 "$REPO_DIR" |
while read FILE_PATH
do
    echo "Change detected in: $FILE_PATH at $(date +%H:%M:%S)"
    
    cd "$REPO_DIR"
    
    git add .
    
    if git diff --cached --exit-code; then
        echo "No new commit needed."
    else
        COMMIT_MSG="Auto-update: $(basename "$FILE_PATH")"
        git commit -m "$COMMIT_MSG"
        git push origin main
        echo "Successfully pushed: $COMMIT_MSG"
    fi
    
    sleep 1
done
