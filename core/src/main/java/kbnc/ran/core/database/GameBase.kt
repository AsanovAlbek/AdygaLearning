package kbnc.ran.core.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.adygall2.data.room.consts.RoomConst.TEST_BASE
import com.example.adygall2.data.room.dao.AnswerDao
import com.example.adygall2.data.room.dao.OrderDao
import com.example.adygall2.data.room.dao.PictureDao
import com.example.adygall2.data.room.dao.SoundEffectDao
import com.example.adygall2.data.room.dao.SoundsDao
import com.example.adygall2.data.room.dao.TaskDao
import com.example.adygall2.data.room.entities.AnswerEntity
import com.example.adygall2.data.room.entities.OrderEntity
import com.example.adygall2.data.room.entities.PictureEntity
import com.example.adygall2.data.room.entities.SoundEffectEntity
import com.example.adygall2.data.room.entities.SoundEntity
import com.example.adygall2.data.room.entities.TaskEntity

/**
 * Класс, отвечающий за создание базы Room
 * entities - классы, хранящие данные из таблиц
 * version - версия базы данных
 * [AnswerEntity] класс для хранения данных из таблицы answers
 * [OrderEntity] класс для хранения данных из таблицы orders
 * [PictureEntity] класс для хранения данных из таблицы pictures
 * [TaskEntity] класс для хранения данных из таблицы tasks
 * [SoundEntity] класс для хранения данных из таблицы sounds
 * [SoundEffectEntity] класс для хранения данных из таблицы SoundEffectEntity
 *
 * @author Asanov Albek in 15.08.2022
 */
@Database(
    entities = [
        AnswerEntity::class,
        OrderEntity::class,
        PictureEntity::class,
        TaskEntity::class,
        SoundEntity::class,
        SoundEffectEntity::class
    ], version = 5, exportSchema = false
)
abstract class GameBase : RoomDatabase() {

    /**
     * Статический метод для создания базы данных из файла в папке assets/database_files/
     * Все строковые значения, связанные с базой данных хранятся в object классе [RoomConst]
     */
    companion object {
        fun buildDatabase(context : Context) =
            Room.databaseBuilder(context, GameBase::class.java, "game_database").
                    fallbackToDestructiveMigration().createFromAsset(TEST_BASE).build()
    }

    /**
     * Методы для вызова dao различных entity, с целью получения данных из таблиц
     */
    abstract fun getAnswerDao() : AnswerDao
    abstract fun getOrderDao() : OrderDao
    abstract fun getPictureDao() : PictureDao
    abstract fun getTaskDao() : TaskDao
    abstract fun getSoundsDao() : SoundsDao
    abstract fun getSoundsEffectDao() : SoundEffectDao
}