package service;

import com.example.courceWork072423.exception.NotQuestionException;
import com.example.courceWork072423.model.Question;
import com.example.courceWork072423.service.ExaminerServiceImp;
import com.example.courceWork072423.service.QuestionService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Collection;
import java.util.List;

import static org.mockito.Mockito.*;

public class ExaminerServiceImpTest {
    private ExaminerServiceImp examinerService;
    private QuestionService questionService;

    @BeforeEach
    public  void init(){
        questionService = Mockito.mock(QuestionService.class);

        examinerService = new ExaminerServiceImp(questionService);
    }
    @Test
    public void shouldThrowExceptionWhenNotQuestion(){
        Question question1 = new Question("вопрос 1" , "ответ1");
        Question question2 = new Question("вопрос 2" , "ответ2");
        Question question3 = new Question("вопрос 3" , "ответ3");

        when(questionService.getAllQuestion()).thenReturn(List.of(question1,question2,question3));

        Assertions.assertThrows(NotQuestionException.class, () -> examinerService.getQuestion(6));
    }
    @Test
    public void shouldReturnUniqueQuestion(){
        Question question1 = new Question("вопрос 1" , "ответ1");
        Question question2 = new Question("вопрос 2" , "ответ2");
        Question question3 = new Question("вопрос 3" , "ответ3");
        when(questionService.getAllQuestion()).thenReturn(List.of(question1,question2,question3));
        when(questionService.getRandomQuestion())
                .thenReturn(question1)
                .thenReturn(question2)
                .thenReturn(question1)
                .thenReturn(question3);

        Collection<Question> questions = examinerService.getQuestion(3);

        Assertions.assertEquals(3, questions.size());
        verify(questionService, times(4)).getRandomQuestion();

    }
}
