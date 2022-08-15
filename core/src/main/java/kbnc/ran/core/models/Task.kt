package com.example.adygall2.data.db_models

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

/**
 * Data класс для использования entity в приложении,
 * Переменные идентичны переменным из [TaskEntity]
 *
 * p.s. Класс имплементирует Parcelable, возможно в дальнейшем придётся передавать таски как аргументы
 *
 * @author Asanov Albek in 15.08.2022
 */
@Parcelize
data class Task(
    val id : Int,

    val taskType : Int,

    val task : String,

    val soundId : Int,

    val levelId : Int,

    val lessonId : Int,

    val exerciseId : Int
    ) : Parcelable