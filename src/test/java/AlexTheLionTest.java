import com.example.Feline;
import com.example.AlexTheLion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;


@RunWith(MockitoJUnitRunner.class)
public class AlexTheLionTest {
    
    @Mock
    Feline feline;

    @Test
    public void testGetFriends() throws Exception {
        AlexTheLion alexTheLion = new AlexTheLion(feline);
        List<String> alexFriends = List.of("Марти", "Мелман", "Глория");
        assertEquals(alexFriends, alexTheLion.getFriends());
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