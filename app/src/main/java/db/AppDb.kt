package db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(
    entities = [JEntity::class],

    version = 1
)
abstract class AppBd: RoomDatabase() {
    abstract val recipeActions: RecipeActions

    companion object {
        @Volatile
        private var instance: AppBd? = null

        fun getInstance(context: Context): AppBd {
            return instance ?: synchronized(this) {
                instance ?: buildDatabase(context)
                    .also { instance = it }
            }
        }

        private fun buildDatabase(context: Context) = Room.databaseBuilder(
            context,AppBd::class.java,"AppBd"
        ).allowMainThreadQueries()
            .fallbackToDestructiveMigration()
            .build()
    }
}