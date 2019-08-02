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
   * Getter to get the text of results text field.
   *
   * @return the text of the results text field
   */
  public String getTextFieldResultsText() {
    return textFieldResultsText;
  }

  /**
   * Setter for the results text field.
   *
   * @param textFieldResultsText text for the results text field
   */
  public void setTextFieldResultsText(String textFieldResultsText) {
    this.textFieldResultsText = textFieldResultsText;
  }

  /**
   * Getter for the first real operand.
   *
   * @return first real operand
   */
  public Double getFirstRealNumber() {
    return firstRealNumber;
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
   * Getter for the second real operand.
   *
   * @return second real operand
   */
  public Double getSecondRealNumber() {
    return secondRealNumber;
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
   * Setter for the flag of first real operand.
   *
   * @param firstNotRealNumber first real operand
   */
  public void setFirstNotRealNumber(boolean firstNotRealNumber) {
    EternityFunction.firstNotRealNumber = firstNotRealNumber;
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
   * Setter for the flag of second real operand.
   *
   * @param secondNotRealNumber second real operand
   */
  public void setSecondNotRealNumber(boolean secondNotRealNumber) {
    EternityFunction.secondNotRealNumber = secondNotRealNumber;
  }

  /**
   * Getter for the operator.
   *
   * @return operator
   */
  public String getOperator() {
    return operator;
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

  {
// GUI initializer generated by IntelliJ IDEA GUI Designer
// >>> IMPORTANT!! <<<
// DO NOT EDIT OR ADD ANY CODE HERE!
    $$$setupUI$$$();
  }

  /**
   * Method generated by IntelliJ IDEA GUI Designer >>> IMPORTANT!! <<< DO NOT edit this method OR
   * call it in your code!
   *
   * @noinspection ALL
   */
  private void $$$setupUI$$$() {
    calculatorView = new JPanel();
    calculatorView.setLayout(
        new com.intellij.uiDesigner.core.GridLayoutManager(6, 4, new Insets(0, 0, 0, 0), -1, -1));
    textFieldResults = new JTextField();
    calculatorView.add(textFieldResults,
        new com.intellij.uiDesigner.core.GridConstraints(0, 0, 1, 4,
            com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST,
            com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL,
            com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW,
            com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null,
            new Dimension(150, -1), null, 0, false));
    buttonClear = new JButton();
    buttonClear.setText("AC");
    calculatorView.add(buttonClear, new com.intellij.uiDesigner.core.GridConstraints(1, 0, 1, 1,
        com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER,
        com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL,
        com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK
            | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW,
        com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
    button7 = new JButton();
    button7.setText("7");
    calculatorView.add(button7, new com.intellij.uiDesigner.core.GridConstraints(2, 0, 1, 1,
        com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER,
        com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL,
        com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK
            | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW,
        com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
    buttonAbsolute = new JButton();
    buttonAbsolute.setText("+/-");
    calculatorView.add(buttonAbsolute, new com.intellij.uiDesigner.core.GridConstraints(1, 1, 1, 1,
        com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER,
        com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL,
        com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK
            | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW,
        com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
    button8 = new JButton();
    button8.setText("8");
    calculatorView.add(button8, new com.intellij.uiDesigner.core.GridConstraints(2, 1, 1, 1,
        com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER,
        com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL,
        com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK
            | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW,
        com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
    buttonPower = new JButton();
    buttonPower.setBackground(new Color(-6185815));
    buttonPower.setText("x^y");
    calculatorView.add(buttonPower, new com.intellij.uiDesigner.core.GridConstraints(1, 2, 1, 1,
        com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER,
        com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL,
        com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK
            | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW,
        com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
    buttonDivide = new JButton();
    buttonDivide.setText("/");
    calculatorView.add(buttonDivide, new com.intellij.uiDesigner.core.GridConstraints(1, 3, 1, 1,
        com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER,
        com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL,
        com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK
            | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW,
        com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
    button9 = new JButton();
    button9.setText("9");
    calculatorView.add(button9, new com.intellij.uiDesigner.core.GridConstraints(2, 2, 1, 1,
        com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER,
        com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL,
        com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK
            | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW,
        com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
    buttonMultiply = new JButton();
    buttonMultiply.setText("X");
    calculatorView.add(buttonMultiply, new com.intellij.uiDesigner.core.GridConstraints(2, 3, 1, 1,
        com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER,
        com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL,
        com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK
            | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW,
        com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
    button4 = new JButton();
    button4.setText("4");
    calculatorView.add(button4, new com.intellij.uiDesigner.core.GridConstraints(3, 0, 1, 1,
        com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER,
        com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL,
        com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK
            | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW,
        com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
    button5 = new JButton();
    button5.setText("5");
    calculatorView.add(button5, new com.intellij.uiDesigner.core.GridConstraints(3, 1, 1, 1,
        com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER,
        com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL,
        com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK
            | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW,
        com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
    button6 = new JButton();
    button6.setText("6");
    calculatorView.add(button6, new com.intellij.uiDesigner.core.GridConstraints(3, 2, 1, 1,
        com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER,
        com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL,
        com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK
            | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW,
        com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
    buttonSubtract = new JButton();
    buttonSubtract.setText("-");
    calculatorView.add(buttonSubtract, new com.intellij.uiDesigner.core.GridConstraints(3, 3, 1, 1,
        com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER,
        com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL,
        com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK
            | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW,
        com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
    button1 = new JButton();
    button1.setText("1");
    calculatorView.add(button1, new com.intellij.uiDesigner.core.GridConstraints(4, 0, 1, 1,
        com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER,
        com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL,
        com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK
            | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW,
        com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
    button2 = new JButton();
    button2.setText("2");
    calculatorView.add(button2, new com.intellij.uiDesigner.core.GridConstraints(4, 1, 1, 1,
        com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER,
        com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL,
        com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK
            | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW,
        com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
    button3 = new JButton();
    button3.setText("3");
    calculatorView.add(button3, new com.intellij.uiDesigner.core.GridConstraints(4, 2, 1, 1,
        com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER,
        com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL,
        com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK
            | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW,
        com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
    buttonAdd = new JButton();
    buttonAdd.setText("+");
    calculatorView.add(buttonAdd, new com.intellij.uiDesigner.core.GridConstraints(4, 3, 1, 1,
        com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER,
        com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL,
        com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK
            | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW,
        com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
    button0 = new JButton();
    button0.setText("0");
    calculatorView.add(button0, new com.intellij.uiDesigner.core.GridConstraints(5, 0, 1, 1,
        com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER,
        com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL,
        com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK
            | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW,
        com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
    buttonDot = new JButton();
    buttonDot.setText(".");
    calculatorView.add(buttonDot, new com.intellij.uiDesigner.core.GridConstraints(5, 2, 1, 1,
        com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER,
        com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL,
        com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK
            | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW,
        com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
    buttonEquals = new JButton();
    buttonEquals.setText("=");
    calculatorView.add(buttonEquals, new com.intellij.uiDesigner.core.GridConstraints(5, 3, 1, 1,
        com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER,
        com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL,
        com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK
            | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW,
        com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
    historyButton = new JButton();
    historyButton.setText("history");
    calculatorView.add(historyButton, new com.intellij.uiDesigner.core.GridConstraints(5, 1, 1, 1,
        com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER,
        com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL,
        com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK
            | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW,
        com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
  }

  /**
   * @noinspection ALL
   */
  public JComponent $$$getRootComponent$$$() {
    return calculatorView;
  }
}
