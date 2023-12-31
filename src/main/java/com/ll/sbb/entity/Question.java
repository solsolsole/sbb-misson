package com.ll.sbb.entity;

import com.ll.sbb.user.user.entity.SiteUser;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Set;

@Getter
@Setter
@Entity
public class Question {
    @Id  // DB상 primary key와 같다.
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // 일련(고유)번호 자동생성 및 증가
    private Integer id;

    @Column(length = 200)
    private String subject;

    @Column(columnDefinition = "TEXT")  // 속성 "TEXT"
    private String content;

    private LocalDateTime createDate;

    @OneToMany(mappedBy = "question", cascade = CascadeType.REMOVE)
    private List<Answer> answerList;

    @ManyToOne
    private SiteUser author;

    private LocalDateTime modifyDate;

    @ManyToMany
    Set<SiteUser> voter;  // 중복을 허용하지 않는 자료형 set
}