package com.example.adygall2.data.db_models

/**
 * Data класс для использования entity в приложении,
 * Переменные идентичны переменным из [AnswerEntity]
 *
 * @author Asanov Albek in 15.08.2022
 */
data class Answer(
    val id : Int,

    val taskId : Int,

    val answer : String,

    val correctAnswer : String,

    val pictureId : Int,

    val soundId : Int
) {
    constructor() : this(0, 0, "", "false", 0, 0)
}
