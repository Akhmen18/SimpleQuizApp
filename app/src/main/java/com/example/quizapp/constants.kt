package com.example.quizapp

object Constants{

    const val USER_NAME = "USERNAME"
    const val TOTAL_QUESTION:String = "total questions"
    const val CORRECT_ANS:String = "correct answers"
    fun getQuestions():ArrayList<Question>{
        val questionsList = ArrayList<Question>()
        val que1 = Question(1,
            "What country does the Flag belong to?",
            R.drawable.ic_flag_of_argentina,
            "Argentina",
            "Australia",
            "India",
            "None",
            1)

        questionsList.add(que1)

        val que2 = Question(1,
            "What country does the Flag belong to?",
            R.drawable.ic_flag_of_fiji,
            "Kuwait",
            "Fiji",
            "None",
            "Czech",
            2)

        questionsList.add(que2)

        val que3 = Question(1,
            "What country does the Flag belong to?",
            R.drawable.ic_flag_of_denmark,
            "Brazil",
            "Denmark",
            "India",
            "Czech",
            2)

        questionsList.add(que3)

        val que4 = Question(1,
            "What country does the Flag belong to?",
            R.drawable.ic_flag_of_australia,
            "US",
            "China",
            "UK",
            "Australia",
            4)

        questionsList.add(que4)

        val que5 = Question(1,
            "What country does the Flag belong to?",
            R.drawable.ic_flag_of_belgium,
            "Sri Lanka",
            "China",
            "Belgium",
            "None",
            3)

        questionsList.add(que5)


        return questionsList
    }
}