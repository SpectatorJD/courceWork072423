package service;

import com.example.courceWork072423.model.Question;
import com.example.courceWork072423.repository.JavaQuestionRepository;
import com.example.courceWork072423.repository.QuestionRepository;
import com.example.courceWork072423.service.JavaQuestionService;
import com.example.courceWork072423.service.QuestionService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.List;
import java.util.Random;

import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.when;

public class JavaQuestionServiceTest {
    private QuestionService javaQuestionService;
    private QuestionRepository questionRepository;
    private Random random;
    @BeforeEach
    public void init(){
        questionRepository = Mockito.mock(QuestionRepository.class);
        random = Mockito.mock(Random.class);
        javaQuestionService = new JavaQuestionService(questionRepository, random);

    }
    @Test
    public void getRandomQuestionTest(){
        Question question1 = new Question("вопрос 1", "отвеет1 ");
        Question question2 = new Question("вопрос 2", "отвеет2 ");
        Question question3 = new Question("вопрос 3", "отвеет3 ");

        when(questionRepository.getAllQuestion()).thenReturn(List.of(question1, question2, question3));
        when(random.nextInt(anyInt())).thenReturn(0);
        Question actual = javaQuestionService.getRandomQuestion();
        Assertions.assertEquals(question1, actual);


    }
}
