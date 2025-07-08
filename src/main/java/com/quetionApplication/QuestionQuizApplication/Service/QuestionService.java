package com.quetionApplication.QuestionQuizApplication.Service;

import com.quetionApplication.QuestionQuizApplication.DAO.QuestionDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionService {

    @Autowired
    QuestionDao qstnDAO;

    public List<Questions> allQuestionList() {
        return qstnDAO.findAll();
    }


    public List<Questions> QuestionOnCategory(String category) {
        return qstnDAO.findByCategory(category);
    }

    public List<Questions> DisplayQuestionByDifficultyLevel(String difficultyLevel) {
        return qstnDAO.findBydifficultylevel(difficultyLevel);
    }

    public String AddQuestion(Questions question) {
        qstnDAO.save(question);//save will work for both update and insert records into DB
        return "Successfully added question";
    }

    public String DeleteRecordByIdService(int id) {
        qstnDAO.deleteById(id);
        return "Successfully deleted record of Id=" +id;
    }

    public int add(int i, int i1) {
        int sum=i+i1;
        return sum;
    }

    public int addtn3Num(int a,int b,int c){
        return a+b+c;
    }
}
