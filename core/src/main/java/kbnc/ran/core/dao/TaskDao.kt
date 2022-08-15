package com.example.adygall2.data.room.dao

import androidx.room.Dao
import androidx.room.Query
import com.example.adygall2.data.db_models.Sound
import com.example.adygall2.data.room.consts.RoomConst.TASKS_TABLE_NAME
import com.example.adygall2.data.room.entities.SoundEntity
import com.example.adygall2.data.room.entities.TaskEntity

/**
 * DAO класс для взаимодействия с таблицей tasks
 *
 * @author Asanov Albek in 15.08.2022
 */
@Dao
abstract class TaskDao {
    @Query("SELECT * FROM $TASKS_TABLE_NAME WHERE task_type = :taskType")
    abstract fun getTaskByType(taskType : Int) : List<TaskEntity>

    @Query("SELECT * FROM $TASKS_TABLE_NAME WHERE id = :taskId")
    abstract fun getTaskById(taskId : Int) : TaskEntity
}