import javax.swing.text.StyledEditorKit.BoldAction;

import apple.laf.JRSUIUtils.Tree;

public class LogicalOperators {

    public static void main(String[] args) {
        
        boolean firstValue = true;
        boolean secondValue = false;
        boolean thirdValue = false;
        boolean fourthValue = true;

        // && and -> true when both equal
        System.out.println(firstValue && secondValue);
        System.out.println(firstValue && fourthValue);

        // || or -> true when only one is equal true 
        System.out.println(firstValue || secondValue); 
        System.out.println(secondValue || thirdValue);

        // ! not - used to invert the boolean value of an expression
        System.out.println(!firstValue);
        System.out.println(!thirdValue);
        System.out.println(!(firstValue && secondValue));
    }
}
