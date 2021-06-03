package test;

import static org.junit.Assert.assertEquals;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;
import main.Generics;

public class GenericsTest {
    @Test
    public void shouldReturnTrue_MaxNum_first ()
    {
    	int max=Generics.MaxNum(7,8,9);
        assertEquals( 9 , max );
    }
    @Test
    public void shouldReturnTrue_MaxNum_second ()
    {
    	int max=Generics.MaxNum(4,6,5);
        assertEquals( 6 , max );
    }
    
    @Test
    public void shouldReturnTrue_MaxNum_third ()
    {
    	int max=Generics.MaxNum(11,8,10);
        assertEquals( 11 , max );
    }
}
