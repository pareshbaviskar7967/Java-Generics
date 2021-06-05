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
    
    @Test
    public void shouldReturnTrue_MaxString_first ()
    {
    	String max = Generics.MaxString("AstonMartin","GMC","Cadi");
        assertEquals( "AstonMartin" , max );
    }
    
    @Test
    public void shouldReturnTrue_MaxString_second()
    {
    	String max = Generics.MaxString("GMC","AstonMartin","Cadi");
        assertEquals( "AstonMartin" , max );
    }
    
    @Test
    public void shouldReturnTrue_MaxString_third()
    {
    	String max = Generics.MaxString("GMC","Cadi","AstonMartin");
        assertEquals( "AstonMartin" , max );
    }
    
    @Test
    public void shouldReturnTrue_MaxNum_first_Mul()
    {
    	int max = Generics.getMax(8,3,4);
        assertEquals( 8 , max );
    }
    
    @Test
    public void shouldReturnTrue_MaxNum_second_Mul()
    {
    	int max = Generics.getMax(8,9,7);
        assertEquals( 9 , max );
    }
    
    @Test
    public void shouldReturnTrue_MaxNum_third_Mul()
    {
    	int max = Generics.getMax(4,5,7);
        assertEquals( 7 , max );
    }
    
    @Test
    public void shouldReturnTrue_MaxDouble_first_Mul()
    {
    	double max = Generics.getMax(5.1,1.3,2.8);
        assertEquals( 5.1 , max , 0);
    }
    
    @Test
    public void shouldReturnTrue_MaxDouble_second_Mul()
    {
    	double max = Generics.getMax(1.3,5.1,2.8);
        assertEquals( 5.1 , max , 0 );
    }
    
    @Test
    public void shouldReturnTrue_MaxDouble_third_Mul()
    {
    	double max = Generics.getMax(1.3,2.8,5.1);
        assertEquals( 5.1 , max , 0 );
    }
    
    @Test
    public void shouldReturnTrue_MaxString_first_Mul()
    {
    	String max = Generics.getMax("Peach","Apple","Banana");
        assertEquals( "Peach" , max );
    }
    
    @Test
    public void shouldReturnTrue_MaxString_second_Mul()
    {
    	String max = Generics.getMax("Apple","Peach","Banana");
        assertEquals( "Peach" , max );
    }
    
    @Test
    public void shouldReturnTrue_MaxString_third_Mul()
    {
    	String max = Generics.getMax("Apple","Banana","Peach");
        assertEquals( "Peach" , max );
    }
}
