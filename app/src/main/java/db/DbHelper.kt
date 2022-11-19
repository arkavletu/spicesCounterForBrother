package db

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class DbHelper {
    class BdHelper(
        context: Context,
        bdVersion: Int,
        bdName: String,
        private val DDLs: Array<String>
    ): SQLiteOpenHelper(context,bdName,null,bdVersion) {
        override fun onCreate(bd: SQLiteDatabase) {
            DDLs.forEach ( bd::execSQL )
        }

        override fun onUpgrade(p0: SQLiteDatabase?, p1: Int, p2: Int) {
        }

        override fun onDowngrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {

        }
    }
}