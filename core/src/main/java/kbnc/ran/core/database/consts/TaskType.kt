package com.example.adygall2.data.room.consts

/**
 * Object класс для хранения типов заданий в виде констант
 * [IMAGE] - задание с картинками
 * [THREE_WORDS] - задание с тремя словами
 * [SENTENCE_BUILD] - задание с построением предложения из услышанного
 * [TRANSLATE_SENTENCE] - задание с построением предложения из написанного
 * [TYPE_THAT_YOUR_HEARD] - задание с написанием в EditText услышанного
 * [SELECT_PAIRS_OF_WORDS] - задание с выбором соответствующих друг другу пар слов и их переводов
 * [FILL_IN_THE_PASS] - задание с заполнением одного пробела в предложении предложенными ниже словами
 * [FILL_IN_THE_GAPS] - задание с заполнением одного или нескольких пробелов в предложении вводом текста
 *
 * @author Asanov Albek in 15.08.2022
 */
object TaskType {
    const val IMAGE = 1
    const val THREE_WORDS = 2
    const val SENTENCE_BUILD = 3
    const val TRANSLATE_SENTENCE = 4
    const val TYPE_THAT_YOUR_HEARD = 5
    const val SELECT_PAIRS_OF_WORDS = 6
    const val FILL_IN_THE_PASS = 7
    const val FILL_IN_THE_GAPS = 8
}