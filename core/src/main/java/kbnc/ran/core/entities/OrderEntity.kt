package com.example.adygall2.data.room.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.adygall2.data.room.consts.RoomConst.ID
import com.example.adygall2.data.room.consts.RoomConst.ORDER_TABLE_NAME
import com.example.adygall2.data.room.consts.RoomConst.TASK_NUM

/**
 * Entity класс для хранения данных из таблицы orders
 * Orders нужны для построения в очередь заданий
 * @param taskNum - номер задания
 *
 * @author Asanov Albek in 15.08.2022
 */
@Entity(tableName = ORDER_TABLE_NAME)
data class OrderEntity(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = ID)
    val id : Int = 0,

    @ColumnInfo(name = TASK_NUM)
    val taskNum : Int
)
