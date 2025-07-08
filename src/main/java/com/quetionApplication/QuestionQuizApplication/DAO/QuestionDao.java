package com.quetionApplication.QuestionQuizApplication.DAO;

import com.quetionApplication.QuestionQuizApplication.Service.Questions;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuestionDao extends JpaRepository<Questions, Integer> {//<TableyouwantToDisplay,PrimaryKey DataType>

    List<Questions> findByCategory(String category);
    List<Questions> findBydifficultylevel(String difficultylevel);
}
