git add .

pause

set /p commit_message="Ingrese el mensaje de commit: "
git commit -m "%commit_message%"

git push