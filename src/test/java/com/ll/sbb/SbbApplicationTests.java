package com.ll.sbb;

import com.ll.sbb.service.QuestionService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SbbApplicationTests {

    @Autowired
    private QuestionService questionService;

    @Test
    void testJpa() {
        for (int i = 0; i <= 300; i++) {
            String subject = String.format("테스트 데이터입니다:[%03d]", i);  // 정수를 세자리로 하고 빈자리는 0으로
            String content = "내용무";
            this.questionService.create(subject, content);
        }
    }
}


