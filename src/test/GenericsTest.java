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
    
    @Test
    public void shouldReturnTrue_MaxDouble_first ()
    {
    	double max=Generics.MaxDouble(5.1,1.3,2.8);
        assertEquals( 5.1 , max , 0);
    }
    
    @Test
    public void shouldReturnTrue_MaxDouble_second()
    {
    	double max=Generics.MaxDouble(1.3,5.1,2.8);
        assertEquals( 5.1 , max , 0 );
    }
    
    @Test
    public void shouldReturnTrue_MaxDouble_third()
    {
    	double max=Generics.MaxDouble(1.3,2.8,5.1);
        assertEquals( 5.1 , max , 0 );
    }
}
