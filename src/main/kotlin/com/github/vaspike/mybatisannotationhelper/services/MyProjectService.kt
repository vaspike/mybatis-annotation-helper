package com.github.vaspike.mybatisannotationhelper.services

import com.intellij.openapi.project.Project
import com.github.vaspike.mybatisannotationhelper.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
