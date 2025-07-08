package com.quetionApplication.QuestionQuizApplication.Service;
import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.boot.model.relational.Sequence;

@Data
@Entity//mark a Java class as a JPA entity, which means it will be mapped to a table in the database.


@Table(name = "quizquestionsdb") // Handles case sensitivity for the table name
//@Getter
//@Setter
public class Questions {

    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    //@GeneratedValue(strategy = GenerationType.IDENTITY)//You need to create DATABASE using SERIAL : CREATE TABLE quizquestionsdb (
    //    id SERIAL PRIMARY KEY  only in this case @GeneratedValue will work If not  we were not able to insert any records hence we removed this line
    private Integer id;
    private String category;
    private String difficultylevel;
    private String option1;
    private String option2;
    private String option3;
    private String option4;
    private String questionTitle;
    private String rightAnswer;

}
