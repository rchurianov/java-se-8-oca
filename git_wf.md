# Git Cheat Sheet

## Branches

List branches on a project
```
git branch
```

Change branch
```
git checkout <branchname>
```

Differences between the tips of two branches
```
git diff branch_1..branch_2
```

Show differences between tips of two branches
```
git difftool branc_1..branch_2
// two dots between branches' names are important!
```

## Git Commit Workflow

1. Add changed files to the index
```
git add *
```
This will add all changed files as expected.

2. Commit changes with a header message
```
git commit -m "Added this and that. Removed this and that"
```

## Git Merge Two Branches Workflow

1. Switch to the branch you want the result to stay in
```
git checkout master
```

2. Try merge - get conflict to resolve
```
git merge <another_branch>
```

3. Start mergetool to resolve conflicts
```
git mergetool
```

4. Merge files manually with mergetool of choice

5. Commit the changes
```
git commit -m "After merge changes"
```
