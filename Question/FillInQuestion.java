import java.util.Scanner;

/**
 * A fill-in question specifies the answer in the question text denoted by
 *      '_' characters. For example:
 *      
 *      "The inventor of Java was _James Gosling_."
 * 
 * @author gcschmit
 * @version 31 January 2017
 */
public class FillInQuestion extends Question
{
    /**
     * FillInQuestion overrides the setText method defined in Question
     * 
     * Sets the question text.
     * 
     * @param questionText the text of this question
     */
    public void setText(String questionText)
    {
        Scanner parser = new Scanner( questionText );
        parser.useDelimiter( "_" );
        String question = parser.next();
        String answer = parser.next();
        question += "_____" + parser.next();
        
        
    }
}
