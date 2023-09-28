package com.jetbrains.handson.kmm.shared.cache

// copied from Android. Todo ALL. check how to do it in JVM

//
//import android.content.Context
//import com.squareup.sqldelight.android.AndroidSqliteDriver
//import com.squareup.sqldelight.db.SqlDriver
//
//actual class DatabaseDriverFactory(private val context: Context) {
//    actual fun createDriver(): SqlDriver {
//        return AndroidSqliteDriver(AppDatabase.Schema, context, "test.db")
//    }
//}