package com.example.adygall2.data.db_models

/**
 * Data класс для использования entity в приложении,
 * Переменные идентичны переменным из [SoundEntity]
 *
 * @author Asanov Albek in 15.08.2022
 */
data class Sound (
    val id : Int,
    val name : String,
    val audioByteArray : ByteArray
    ) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Sound

        if (id != other.id) return false
        if (name != other.name) return false
        if (!audioByteArray.contentEquals(other.audioByteArray)) return false

        return true
    }

    override fun hashCode(): Int {
        var result = id
        result = 31 * result + name.hashCode()
        result = 31 * result + audioByteArray.contentHashCode()
        return result
    }
}