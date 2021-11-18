
/**
 * This class Reverse a String of any size and tipe
 *
 * @author Tadeu Vaccari    
 * @version 18/11/2021
 */
public class ReverseString
{
    private String id;
    
    public ReverseString (String anId)
    {
        id = anId;
    }
    
    public String reverse (String id)
    {
        char [] letters = new char[id.length()];
        int letterIndex = 0;
        for (int i = id.length() -1; i >= 0; i--)
        {
            letters[letterIndex] = id.charAt(i);
            letterIndex++;
        }
        
        String reverse = "";
        for (int i = 0; i < id.length(); i++)
        {
            reverse = reverse + letters[i];
        }
        return reverse;
    }
}
