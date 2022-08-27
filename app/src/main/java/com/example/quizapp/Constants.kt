package com.example.quizapp

object Constants{

    const val USER_NAME: String = "username"
    const val TOTAL_QUESTIONS: String = "total_question"
    const val CORRECT_ANSWER: String = "correct_answer"

    fun getQuestions(): ArrayList<Question>{
        val questionsList = ArrayList<Question>()

        val que1= Question(
            1,
            "What model this gun is?",
            R.drawable.ic_walther_pp,
            "Makarov 9x18",
            "Walther P38",
            "Walther PPK",
            "Walther PP", 4
        )
        questionsList.add(que1)

        val que2= Question(
            2,
            "What model this gun is?",
            R.drawable.ic_mp41,
            "MP-38/40",
            "MP-18",
            "MP-41",
            "MP-28.II", 3
        )
        questionsList.add(que2)

        val que3= Question(
            3,
            "What model this gun is?",
            R.drawable.ic_lebel1886,
            "Lebel M1886",
            "Mauser M1889",
            "Mosin-Nagant M1891",
            "Berdan M1870", 1
        )
        questionsList.add(que3)

        val que4= Question(
            4,
            "What round does Nagant M1895 use?",
            R.drawable.ic_nagant_revolver,
            "7.62x38mmR",
            "9x18mm Makarov",
            "9x19mm Parabellum",
            ".38 special", 1
        )
        questionsList.add(que4)

        val que5= Question(
            5,
            "What model this gun is?",
            R.drawable.ic_vz58,
            "AKM",
            "Rk-62",
            "Type 56",
            "Sa vz.58", 4
        )
        questionsList.add(que5)

        val que6= Question(
            6,
            "What model this gun is?",
            R.drawable.ic_ar18,
            "FN FAL",
            "AR-18",
            "H&K G3",
            "H&K G11", 2
        )
        questionsList.add(que6)

        val que7= Question(
            7,
            "What model this gun is?",
            R.drawable.ic_kord,
            "PKM 7.62x54mmR",
            "Kord 12.7mm",
            "NSV Utyos 12.7mm",
            "DShK 1938 12.7mm", 2
        )
        questionsList.add(que7)

        val que8= Question(
            8,
            "What year was original AK adopted into service?",
            R.drawable.ic_ak47,
            "1947",
            "1948",
            "1949",
            "1950", 3
        )
        questionsList.add(que8)

        val que9= Question(
            9,
            "What model this gun is?",
            R.drawable.ic_sr3,
            "VSK-94",
            "AS VAL",
            "9a-91",
            "SR-3 Vikhr", 4
        )
        questionsList.add(que9)

        val que10= Question(
            10,
            "What model this gun is?",
            R.drawable.ic_thompson_m1921,
            "Thompson M1921",
            "Thompson M1928",
            "Thompson M1",
            "Thompson M1A1", 1
        )
        questionsList.add(que10)

        return questionsList
    }
}