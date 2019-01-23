
# Git configuration on Windows

## Set default editor of choice

1. Navigate to your .gitconfig file
Usually resides in C:\Users\<username>\

2. Edit the file. Add the lines or edit [core] section
```
[core]
	editor = 'C:/Program Files/Sublime Text 3/sublime_text.exe' --wait
```
Note:
- single quotes around the path to the executable. Double qoutes will not work.
- forward slashes in the path instead of standard Windows backslashes
- --wait - this option is important because it will make git wait until you save and close the file with the message