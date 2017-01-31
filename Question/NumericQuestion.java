
/**
 * Write a description of class NumericQuestion here.
 * 
 * @author gcschmit
 * @version 31 January 2017
 */
public class NumericQuestion extends Question
{
    /*
     * We don't need to define text or answer as instance variables; they
     *      are inherited from Question.
     *      
     * We do need a new instance variable for the answer as a double.
     */
    private double numericAnswer;

    /**
     * The NumericQuestion class is overloading the setAnswer method
     *      defined in the Question class.
     *      
     * Sets the answer for this question.
     * 
     * @param correctResponse the answer
     */
    public void setAnswer( double correctResponse )
    {
        this.numericAnswer = correctResponse;
    }

    /**
     * The NumericQuestion class overrides the checkAnswer method defined
     *      in the Question class.
     * 
     * Checks a given response for correctness.
     * 
     * @param response the response to check
     * @return true if the response was correct, false otherwise
     */
    public boolean checkAnswer(String response)
    {
        double responseAsDouble = Double.parseDouble( response );
        return Math.abs( responseAsDouble - numericAnswer ) <= 0.01;
    }
    
    
    
    