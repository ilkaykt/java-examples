/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package infixto;

import java.util.Stack;

/**
 *
 * @author Ilkay
 */
public class Infixto {
private static boolean isOperator(char c)
{
    return c == '+' || c == '-' || c == '*' || c == '/' || c == '^'
            || c == '(' || c == ')';
}

private static boolean isLowerPrecedence(char op1, char op2)
{
    switch (op1)
    {
        case '+':
        case '-':
            return !(op2 == '+' || op2 == '-');

        case '*':
        case '/':
            return op2 == '^' || op2 == '(';

        case '^':
            return op2 == '(';

        case '(':
            return true;

        default:
            return false;
    }
}

public static String convertToPostfix(String infix)
{
    Stack<Character> stack = new Stack<Character>();
    StringBuffer postfix = new StringBuffer(infix.length());
    char c;

    for (int i = 0; i < infix.length(); i++)
    {
        c = infix.charAt(i);

        if (!isOperator(c))
        {
            postfix.append(c);
        }

        else
        {
            if (c == ')')
            {

                while (!stack.isEmpty() && stack.peek() != '(')
                {
                    postfix.append(stack.pop());
                }
                if (!stack.isEmpty())
                {
                    stack.pop();
                }
            }

            else
            {
                if (!stack.isEmpty() && !isLowerPrecedence(c, stack.peek()))
                {
                    stack.push(c);
                }
                else
                {
                    while (!stack.isEmpty() && isLowerPrecedence(c, stack.peek()))
                    {
                        Character pop = stack.pop();
                        if (c != '(')
                        {
                            postfix.append(pop);
                        } else {
                          c = pop;
                        }
                    }
                    stack.push(c);
                }

            }
        }
    }
    while (!stack.isEmpty()) {
      postfix.append(stack.pop());
    }
    return postfix.toString();
}


    public static void main(String[] args) {
        
{
    System.out.println(convertToPostfix("A*B-(C+D)+E"));
}
    }
    
}
