#!/bin/bash
test_directory="/c/Users/hepat/Downloads/Sauna-main (1)/Sauna-main"
test_files=$(find "$test_directory" -type f -name "*.test.ts")
for file in $test_files; do
  npx playwright test "$file"
done
