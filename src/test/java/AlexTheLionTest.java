import com.example.Feline;
import com.example.AlexTheLion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals; //МОЖНО УБРАТЬ ЛИШНИЙ ИМПОРТ ЧЕРЕЗ *



@RunWith(MockitoJUnitRunner.class)
public class AlexTheLionTest {
    
    @Mock
    Feline feline;

    @Test
    public void testGetFriends() throws Exception {
        AlexTheLion alexTheLion = new AlexTheLion(feline);
        List<String> AlexFriends = List.of("Марти", "Мелман", "Глория");
        assertEquals(AlexFriends, alexTheLion.getFriends());
    }

    @Test
    public void testGetHabitat() throws Exception {
        AlexTheLion alexTheLion = new AlexTheLion(feline);
        assertEquals("Нью-Йоркский зоопарк", alexTheLion.getHabitat());
    }

    @Test
    public void testGetKittens() throws Exception {
        AlexTheLion alexTheLion = new AlexTheLion(feline);
        assertEquals(0, alexTheLion.getKittens());
    }
}