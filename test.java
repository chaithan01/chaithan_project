import org.junit.*;


public class test {

     NumberstoWord convetrnum = new NumberstoWord();
    
     @Test
    public void UnitToUnits() {
       
    	 Assert.assertEquals( "8" , "Eight" , convetrnum.numtowordconvert(8)); 
    }

    @Test
    public void TenToTens() {
      
        Assert.assertEquals( "45" , "Forty Five" , convetrnum.numtowordconvert(45));
      
    }

    @Test
    public void HundredToHundreds() {
      
        Assert.assertEquals( "645" , "Six Hundred Forty Five" , convetrnum.numtowordconvert(645));
        
    }

    @Test
    public void Invalid() {
    
    Assert.assertEquals( "1000" , "Invalid" , convetrnum.numtowordconvert(1000));
    
    }
}
