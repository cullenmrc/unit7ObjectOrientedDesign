import java.util.ArrayList;

/**
A question with multiple choices.
 */
public class ChoiceQuestion extends Question
{
    private int numberOfChoices;

    /**
    Constructs a choice question with no choices.
     */
    public ChoiceQuestion()
    {
        /*
         * Java will automatically call the Question class's default
         *      constructor before executing the next line of code.
         */
        numberOfChoices = 0;
    }
    
    /**
     * Constructs a choice question with the specified question text
     */
    public ChoiceQuestion( String questionText )
    {
        /*
         * Explicitly call the Question class's constructor that takes
         *      a questionText parameter. Calling a superclass's constructor
         *      must be the first line of code in the subclass's constructor
         */
        super( questionText );
        numberOfChoices = 0;
    }

    /**
    Adds an answer choice to this question.
    @param choice the choice to add
    @param correct true if this is the correct choice, false otherwise
     */
    public void addChoice(String choice, boolean correct)
    {
        numberOfChoices++;
        addText( "\n" + numberOfChoices + ")" + choice );
        if (correct) 
        {
            String choiceString = "" + numberOfChoices;
            setAnswer(choiceString);
        }
    }

    public String toString()
    {
        /*
         *  The Question class's implementation of the toString method returns
         *      a string containing the text and answer. Call the superclass's
         *      toString method first and then concatenate this class's
         *      instance variables.
         */
        String s = super.toString();
        return s + " numberOfChoices [" + numberOfChoices + "]";
    }
}

