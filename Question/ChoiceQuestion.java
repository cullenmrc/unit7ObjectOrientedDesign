import java.util.ArrayList;

/**
A question with multiple choices.
 */
public class ChoiceQuestion extends Question
{
    private ArrayList<String> choices;

    /**
    Constructs a choice question with no choices.
     */
    public ChoiceQuestion()
    {
        /*
         * Java will automatically call the superclass's default constructor
         *      before executing the next line of code.
         *      
         * Like this code was first:
         * super();
         */
        choices = new ArrayList<String>();
    }
    
    /**
     * Constructs a question with the specified question text.
     * 
     * @param questionText the text of this question
     */
    public ChoiceQuestion( String questionText )
    {
        /*
         * Explicitly call the superclass's constructor that takes a
         *      questionText parameter. Calling a superclass's constructor
         *      must be the first line of code in the subclass's constructor
         */
        super( questionText );
        choices = new ArrayList<String>();
    }

    /**
    Adds an answer choice to this question.
    @param choice the choice to add
    @param correct true if this is the correct choice, false otherwise
     */
    public void addChoice(String choice, boolean correct)
    {
        choices.add(choice);
        if (correct) 
        {
            // Convert choices.size() to string
            String choiceString = "" + choices.size();
            setAnswer(choiceString);
        }
    }

    public void display()
    {
        // Display the question text
        super.display();
        // Display the answer choices
        for (int i = 0; i < choices.size(); i++)
        {
            int choiceNumber = i + 1;
            System.out.println(choiceNumber + ": " + choices.get(i));     
        }
    }
    
    public String toString()
    {
        String s = super.toString();
        return s + "choices " + choices;
    }
}

