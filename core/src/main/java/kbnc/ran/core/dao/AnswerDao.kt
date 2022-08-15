package com.example.adygall2.data.room.dao

import androidx.room.Dao
import androidx.room.Query
import com.example.adygall2.data.room.consts.RoomConst.ANSWER_TABLE_NAME
import com.example.adygall2.data.room.entities.AnswerEntity

/**
 * DAO класс для взаимодействия с таблицей answers
 *
 * @author Asanov Albek in 15.08.2022
 */
@Dao
abstract class AnswerDao {
    @Query("SELECT * FROM $ANSWER_TABLE_NAME WHERE task_id = :taskId")
    abstract fun getTaskAnswers(taskId : Int) : List<AnswerEntity>

    @Query("SELECT * FROM $ANSWER_TABLE_NAME")
    abstract fun getAllAnswers() : List<AnswerEntity>
}