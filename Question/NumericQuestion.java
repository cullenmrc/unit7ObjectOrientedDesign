
/**
 * Write a description of class NumericQuestion here.
 * 
 * @author gcschmit
 * @version 31 January 2017
 */
public class NumericQuestion extends Question
{
    /* NumericQuestion inherits text and answer; do not redefine here
    However, NumericQuestion cannot directly access text and answer;
    accessor methods must be used. */

    private double numericAnswer;

    /**
     * This is an example of overloading a method. Question defines
     *      the setAnswer method taking a String; NumericQuestion defines
     *      the setAnswer method taking a double.
     *
     * @param  correctAnswer   the answer
     */
    public void setAnswer(double correctAnswer)
    {
        numericAnswer = correctAnswer;
    }

    /**
     * This is an example of overriding a method. The NumericQuestion class
     *      defines the checkAnswer method with exactly the same signature
     *      as the Question class.
     * 
     * Checks a given response for correctness.
     * 
     * @param response  the response to check
     * @return true if the response was correct, false otherwise
     */
    public boolean checkAnswer(String response)
    {
        double responseAsDouble = Double.parseDouble( response );
        return Math.abs( responseAsDouble - numericAnswer ) <= 0.01;
    }

}
