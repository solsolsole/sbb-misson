package com.ll.sbb.service;

import com.ll.sbb.entity.Answer;
import com.ll.sbb.entity.Question;
import com.ll.sbb.repository.AnswerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@RequiredArgsConstructor
@Service
public class AnswerService {

    private final AnswerRepository answerRepository;

    public void create(Question question, String content){
        Answer answer = new Answer();
        answer.setContent(content);
        answer.setCreatDate(LocalDateTime.now());
        answer.setQuestion(question);
        this.answerRepository.save(answer);
    }

}
