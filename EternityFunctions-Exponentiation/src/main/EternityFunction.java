package main;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * The Eternity Function application performs the basic four arithmetic operations and also
 * calculates the power of 2 real numbers.
 *
 * @author Prashanthi Ramesh
 * @version 1.0
 * @since 2019-07-26
 */
public class EternityFunction {

  /**
   * Java Swing instances.
   */
  private JPanel calculatorView;
  private JButton buttonClear;
  private JButton button7;
  private JButton buttonAbsolute;
  private JButton button8;
  private JButton buttonPower;
  private JButton buttonDivide;
  private JButton button9;
  private JButton buttonMultiply;
  private JButton button4;
  private JButton button5;
  private JButton button6;
  private JButton buttonSubtract;
  private JButton button1;
  private JButton button2;
  private JButton button3;
  private JButton buttonAdd;
  private JButton button0;
  private JButton buttonDot;
  private JButton buttonEquals;
  private JButton historyButton;
  private JTextField textFieldResults;

  /**
   * Originator instance.
   */
  private Originator originator;

  /**
   * Caretaker instance.
   */
  private CareTaker careTaker;

  /**
   * first real operand.
   */
  private Double firstRealNumber;

  /**
   * second real operand.
   */
  private Double secondRealNumber;

  /**
   * result of the operation.
   */
  private Double result;

  /**
   * operator.
   */
  private String operator;

  /**
   * number of operations stored in memento.
   */
  private static int historyCount = 0;

  /**
   * current text of the text field.
   */
  private String textFieldResultsText = "";

  /**
   * flag to check if first operand is real number or not.
   */
  private static boolean firstNotRealNumber = false;

  /**
   * flag to check if second operand is real number or not.
   */
  private static boolean secondNotRealNumber = false;

  /**
   * Setter for the results text field.
   *
   * @param textFieldResultsText text for the results text field
   */
  public void setTextFieldResultsText(String textFieldResultsText) {
    this.textFieldResultsText = textFieldResultsText;
  }

  /**
   * Setter for the first real operand.
   *
   * @param firstRealNumber first real operand
   */
  public void setFirstRealNumber(Double firstRealNumber) {
    this.firstRealNumber = firstRealNumber;
  }

  /**
   * Setter for the second real operand.
   *
   * @param secondRealNumber second real operand
   */
  public void setSecondRealNumber(Double secondRealNumber) {
    this.secondRealNumber = secondRealNumber;
  }

  /**
   * Getter for the flag of first real operand.
   *
   * @return boolean flag to specify if first operand is real number
   */
  public boolean isFirstNotRealNumber() {
    return firstNotRealNumber;
  }


  /**
   * Getter for the flag of second real operand.
   *
   * @return flag of second real operand
   */
  public boolean isSecondNotRealNumber() {
    return secondNotRealNumber;
  }
  
  /**
   * Setter for the operator.
   *
   * @param operator operator
   */
  public void setOperator(String operator) {
    this.operator = operator;
  }

  /**
   * Creates an Eternity Function.
   */
  public EternityFunction() {

    originator = new Originator();
    careTaker = new CareTaker();

    buttonAdd.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        textFieldResultsText = textFieldResults.getText();
        actionPerformedByOperators("+");
      }
    });

    buttonSubtract.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        textFieldResultsText = textFieldResults.getText();
        actionPerformedByOperators("-");
      }
    });

    buttonMultiply.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        textFieldResultsText = textFieldResults.getText();
        actionPerformedByOperators("*");
      }
    });

    buttonDivide.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        textFieldResultsText = textFieldResults.getText();
        actionPerformedByOperators("/");
      }
    });

    buttonPower.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        textFieldResultsText = textFieldResults.getText();
        actionPerformedByOperators("^");
      }
    });

    buttonAbsolute.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        try {
          firstRealNumber = Double.parseDouble(textFieldResults.getText());
          textFieldResults.setText(Double.toString(-firstRealNumber));
        } catch (NumberFormatException exception) {
          JOptionPane
              .showMessageDialog(null, "Invalid Operand! Please enter a double precision value "
                      + "between 4.94065645841246544e-324d and 1.79769313486231570e+308d", "Error",
                  JOptionPane.ERROR_MESSAGE);

        }
      }
    });

    buttonClear.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        firstRealNumber = 0.0;
        secondRealNumber = 0.0;
        operator = "";
        textFieldResults.setText("");
      }
    });

    buttonEquals.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        textFieldResultsText = textFieldResults.getText();
        actionPerformedByEqualsOperator();
      }
    });

    button0.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        String enteredNumber = textFieldResults.getText() + button0.getText();
        textFieldResults.setText(enteredNumber);
      }
    });

    button1.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        String enteredNumber = textFieldResults.getText() + button1.getText();
        textFieldResults.setText(enteredNumber);
      }
    });
    button2.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        String enteredNumber = textFieldResults.getText() + button2.getText();
        textFieldResults.setText(enteredNumber);
      }
    });

    button3.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        String enteredNumber = textFieldResults.getText() + button3.getText();
        textFieldResults.setText(enteredNumber);
      }
    });

    button4.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        String enteredNumber = textFieldResults.getText() + button4.getText();
        textFieldResults.setText(enteredNumber);
      }
    });

    button5.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        String enteredNumber = textFieldResults.getText() + button5.getText();
        textFieldResults.setText(enteredNumber);
      }
    });

    button6.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        String enteredNumber = textFieldResults.getText() + button6.getText();
        textFieldResults.setText(enteredNumber);
      }
    });

    button7.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        String enteredNumber = textFieldResults.getText() + button7.getText();
        textFieldResults.setText(enteredNumber);
      }
    });

    button8.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        String enteredNumber = textFieldResults.getText() + button8.getText();
        textFieldResults.setText(enteredNumber);
      }
    });

    button9.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        String enteredNumber = textFieldResults.getText() + button9.getText();
        textFieldResults.setText(enteredNumber);
      }
    });

    buttonDot.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        String enteredNumber = textFieldResults.getText() + buttonDot.getText();
        textFieldResults.setText(enteredNumber);
      }
    });

    historyButton.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        textFieldResults.setText("");
        if (careTaker.getSize() == historyCount) {
          historyCount = 0;
        }
        if (careTaker.getSize() > 0) {
          originator.getStateFromMemento(careTaker.get(historyCount++));
          textFieldResults.setText(originator.getState());
        }

      }
    });

  }

  /**
   * Get the value of the text field and validate the number to perform the operation.
   */
  public void actionPerformedByEqualsOperator() {
    String subTextValue = textFieldResultsText
        .substring(textFieldResultsText.indexOf(operator) + 1);
    try {
      secondRealNumber = Double.parseDouble(subTextValue);
      secondNotRealNumber = false;
      BasicArithmeticOps basicArithmeticOps = new BasicArithmeticOps(firstRealNumber,
          secondRealNumber);
      switch (operator) {
        case "+":
          result = basicArithmeticOps.add();
          break;
        case "-":
          result = basicArithmeticOps.subtract();
          break;
        case "*":
          result = basicArithmeticOps.multiply();
          break;
        case "/":
          result = basicArithmeticOps.divide();
          break;
        case "^":
          if (isaNegativeValue()) {
            JOptionPane.showMessageDialog(null,
                "Invalid Operand! Enter a value greater than or equal to 0 for y (second operand)!",
                "Error",
                JOptionPane.ERROR_MESSAGE);
          } else {
            Exponentiation exponentiation = new Exponentiation(firstRealNumber, secondRealNumber);
            result = exponentiation.power();
          }
          break;
        default:
          JOptionPane.showMessageDialog(null, "Invalid Operator! Please start over !", "Error",
              JOptionPane.ERROR_MESSAGE);
      }
      String finalResult = textFieldResults.getText() + "=" + result;
      textFieldResults.setText(finalResult);
      originator.setState(finalResult);
      careTaker.add(originator.saveStateToMemento());
    } catch (NumberFormatException exception) {
      secondNotRealNumber = true;
      JOptionPane
          .showMessageDialog(null, "Invalid Operand! Please enter a double precision value "
                  + "between 4.94065645841246544e-324d and 1.79769313486231570e+308d", "Error",
              JOptionPane.ERROR_MESSAGE);

    }
  }

  /**
   * Checks if second operand is a negative value or not.
   *
   * @return
   */
  public boolean isaNegativeValue() {
    return secondRealNumber < 0;
  }

  /**
   * Get the value of the text field and validate to append operand to operator.
   *
   * @param operator current operator
   */
  public void actionPerformedByOperators(String operator) {
    try {
      firstRealNumber = Double.parseDouble(textFieldResultsText);
      textFieldResults.setText(firstRealNumber + operator);
      this.operator = operator;
      firstNotRealNumber = false;
    } catch (NumberFormatException exception) {
      firstNotRealNumber = true;
      JOptionPane
          .showMessageDialog(null, "Invalid Operand! Please enter a double precision value "
                  + "between 4.94065645841246544e-324d and 1.79769313486231570e+308d", "Error",
              JOptionPane.ERROR_MESSAGE);

    }
  }

  /**
   * Creates the Calculator view and initiates the application.
   *
   * @param args command line arguments
   */
  public static void main(String[] args) {
    JFrame frame = new JFrame("Eternity Function- x^y");
    frame.setContentPane(new EternityFunction().calculatorView);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.pack();
    frame.setSize(350, 350);
    frame.setVisible(true);
  }

}
