package com.jetbrains.handson.androidApp

import android.app.Application
import android.content.Context
import com._rootApplication

class RootApplication : Application() {

    override fun attachBaseContext(base: Context) {
        super.attachBaseContext(base)
        _rootApplication = this
    }
}
