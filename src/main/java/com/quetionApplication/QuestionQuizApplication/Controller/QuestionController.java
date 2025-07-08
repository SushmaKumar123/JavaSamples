package com.quetionApplication.QuestionQuizApplication.Controller;


import com.quetionApplication.QuestionQuizApplication.Service.QuestionService;
import com.quetionApplication.QuestionQuizApplication.Service.Questions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/question")
public class QuestionController {

    @Autowired
    QuestionService service;
    //http://localhost:8080/question/AllQuizQuestion
    @GetMapping("/AllQuizQuestion")
    public List<Questions> AllQuestions(){

        return service.allQuestionList();
    }

    @GetMapping("/addition")
    public int addTwoNum(){
        return service.add(5,6);
    }

    @GetMapping("/addition3Nums")
    public int addition3Num(){
        return service.addtn3Num(5,8,10000);
    }

    //http://localhost:8080/question/Category/Python
    @GetMapping("/Category/{category}")
    public List<Questions> QuestionsOnCategory(@PathVariable String category){
        return service.QuestionOnCategory(category);

    }

    //http://localhost:8080/question/DifficultyLevel/Easy
    @GetMapping("/DifficultyLevel/{DifficultyLevel}")
    public List<Questions> QuestionsByDifficultyLevel(@PathVariable String DifficultyLevel){
        return service.DisplayQuestionByDifficultyLevel(DifficultyLevel);

    }

    //http://localhost:8080/question/add- in postman JSON you have to provide JSON input
    /*{
        "id": 11,
        "category": "Python",
        "difficultylevel": "Medium",
        "option1": "ZeroDivisionError",
        "option2": "ValueError",
        "option3": "TypeError",
        "option4": "NameError",
        "questionTitle": "What error is raised when dividing by zero in Python?",
        "rightAnswer": "ZeroDivisionError"
    }*/

    @PostMapping("/add")
    public String AddQuestions(@RequestBody Questions question){
        return service.AddQuestion(question);

    }

    //http://localhost:8080/question/delete/11
    /*@DeleteMapping("/delete/{id}")
    public String DeleteRecordById(@PathVariable int id){
        return service.DeleteRecordByIdService(id);

    }*/

    //http://localhost:8080/question/delete?id=10
    @DeleteMapping("/delete")
    public String DeleteRecordById(@RequestParam int id){
        return service.DeleteRecordByIdService(id);

    }


}
