import com.example.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.Before;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.assertEquals;




@RunWith(Parameterized.class)
public class ParameterizedLionTest {
    
    
    private String sex;
    private boolean result;
    
    @Mock
    Feline feline;

    public ParameterizedLionTest(String sex, boolean result) {
        this.sex = sex;
        this.result = result;
    }

    @Parameterized.Parameters
    public static Object[][] getParameters() {
        return new Object[][]{
                {"Самец", true},
                {"Самка", false},
        };
    }

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testHasMane() throws Exception {
        Lion lion = new Lion(sex, feline);
        boolean hasMane = lion.doesHaveMane();
        assertEquals(result, hasMane);
    }

}