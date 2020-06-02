package vnpt;


import static org.junit.Assert.assertEquals;

import org.junit.Test;

import junit.framework.Assert;

@SuppressWarnings("deprecation")
public class MathUtilTest {
	@Test 
	public void chia_6_2_kq_3() 
	{
		final int expected = 3;
		final int actual = MathUtil.chia(2,6);
		Assert.assertEquals(expected, actual);
		
	}
	  
	@Test  
	public void testChia()
	  {
		  assertEquals(0,MathUtil.chia(0, 2)); 
	  }
	
	  @Test 
	  public void testCong()
	  {
		  
		  assertEquals(4,MathUtil.cong(2, 2));
	  }
	  @Test
	  public void testTru()
	  {
		  assertEquals(2,MathUtil.tru(5, 3));
		  
	  }

}
