package com.samiran.quizapp.dao;

import com.samiran.quizapp.model.Question;
import com.samiran.quizapp.model.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface Quizdao extends JpaRepository<Quiz,Integer> {

}
