package com.example.prilojenie;

public class Question {
    public String questions[] = {
            "Какая столица Украины?",
            "Сколько будет 2+2*2?",
            "Самый богатый человек на земле?"
    };

    public String choices[][] = {
            {"Винница", "Харьков", "Львов", "Киев"},
            {"0", "4", "6", "8"},
            {"Илон Маск", "Джефф Безос", "Билл Гейтс", "Марк Цукерберг"}
    };

    public String correctAnswer[] = {
            "Киев",
            "6",
            "Илон Маск"
    };

    public String getQuestion(int a){
        String question = questions[a];
        return question;
    }

    public String getchoice1(int a){
        String choice = choices[a][0];
        return choice;
    }

    public String getchoice2(int a){
        String choice = choices[a][1];
        return choice;
    }

    public String getchoice3(int a){
        String choice = choices[a][2];
        return choice;
    }

    public String getchoice4(int a){
        String choice = choices[a][3];
        return choice;
    }

    public String getCorrectAnswer(int a){
        String answer = correctAnswer[a];
        return answer;
    }

}
