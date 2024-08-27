package com.abhishek.gitmasterclass

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}
/*
    Git Course
    git log = Showing all commits.
    git status = Showing status of commits and working on project.
    git add <filename> = Adding file to staging area.
    git commit -m "commit message" = Committing changes to the repository.
    git branch <branchname> = Creating a new branch.
    git checkout <branchname> = Switching to a different branch.
    git merge <branchname> = Merging a branch into current branch.

    // Working Tree Clean Means not Changes on main branch to local branch.

    git diff <branchname> = Show Differences between parents and children.

    git diff --staged =
    git reset --soft HEAD^ = Undo last commit but keep changes.

    Check Git Undo Commit Added Changes

    After Creating a new branch


*
*
*
* */