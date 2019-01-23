## Welcome to GitHub Pages

You can use the [editor on GitHub](https://github.com/rchurianov/nuovo-buendfa.github.io/edit/master/index.md) to maintain and preview the content for your website in Markdown files.

Whenever you commit to this repository, GitHub Pages will run [Jekyll](https://jekyllrb.com/) to rebuild the pages in your site, from the content in your Markdown files.

### Markdown

Markdown is a lightweight and easy-to-use syntax for styling your writing. It includes conventions for

```markdown
Syntax highlighted code block

# Header 1
## Header 2
### Header 3

- Bulleted
- List

1. Numbered
2. List

**Bold** and _Italic_ and `Code` text

[Link](url) and ![Image](src)
```

For more details see [GitHub Flavored Markdown](https://guides.github.com/features/mastering-markdown/).

### Jekyll Themes

Your Pages site will use the layout and styles from the Jekyll theme you have selected in your [repository settings](https://github.com/rchurianov/nuovo-buendfa.github.io/settings). The name of this theme is saved in the Jekyll `_config.yml` configuration file.

### Support or Contact

Having trouble with Pages? Check out our [documentation](https://help.github.com/categories/github-pages-basics/) or [contact support](https://github.com/contact) and we’ll help you sort it out.

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
