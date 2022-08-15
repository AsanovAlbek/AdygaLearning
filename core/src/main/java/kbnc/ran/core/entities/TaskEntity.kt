package com.example.adygall2.data.room.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.adygall2.data.room.consts.RoomConst.EXERCISE
import com.example.adygall2.data.room.consts.RoomConst.ID
import com.example.adygall2.data.room.consts.RoomConst.LESSON
import com.example.adygall2.data.room.consts.RoomConst.LEVEL
import com.example.adygall2.data.room.consts.RoomConst.SOUND
import com.example.adygall2.data.room.consts.RoomConst.TASK
import com.example.adygall2.data.room.consts.RoomConst.TASKS_TABLE_NAME
import com.example.adygall2.data.room.consts.RoomConst.TASK_TYPE

/**
 * Entity класс для хранения данных из таблицы Tasks
 * @param taskType - тип задания, берётся из [TaskType]
 * @param task - текст вопроса
 * @param soundId - звук для заданий с прослушиванием аудиофайла, в иных случаях равен 0
 * @param levelId - id уровня, в котором находится данное задание
 * @param lessonId - id урока, в котором находится данное задание
 *
 * @author Asanov Albek in 15.08.2022
 */
@Entity(tableName = TASKS_TABLE_NAME)
data class TaskEntity(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = ID)
    val id : Int = 0,

    @ColumnInfo(name = TASK_TYPE)
    val taskType : Int,

    @ColumnInfo(name = TASK)
    val task : String,

    @ColumnInfo(name = SOUND)
    val soundId : Int,

    @ColumnInfo(name = LEVEL)
    val levelId : Int,

    @ColumnInfo(name = LESSON)
    val lessonId : Int,

    @ColumnInfo(name = EXERCISE)
    val exerciseId : Int
)
