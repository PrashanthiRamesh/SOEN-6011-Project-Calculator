import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class EternityFunction {

  private JTextField textFieldResults;
  private JPanel calculatorView;
  private JButton buttonClear;
  private JButton a7Button;
  private JButton buttonAbsolute;
  private JButton a8Button;
  private JButton buttonPower;
  private JButton buttonDivide;
  private JButton a9Button;
  private JButton buttonMultiply;
  private JButton a4Button;
  private JButton a5Button;
  private JButton a6Button;
  private JButton buttonSubtract;
  private JButton a1Button;
  private JButton a2Button;
  private JButton a3Button;
  private JButton buttonAdd;
  private JButton a0Button;
  private JButton buttonDot;
  private JButton buttonEquals;
  private Double firstRealNumber;
  private Double secondRealNumber;
  private Double result;
  private String operator;

  public EternityFunction() {
    buttonAdd.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        // get the value of text box, validate it for a real number, if it is ok append operand1 with operator
        try {
          firstRealNumber = Double.parseDouble(textFieldResults.getText());
          textFieldResults.setText(firstRealNumber + "+");
          operator = "+";
        } catch (NumberFormatException exception) {
          JOptionPane
              .showMessageDialog(null, "Invalid Operand! Please enter a double precision value "
                      + "between 4.94065645841246544e-324d and 1.79769313486231570e+308d", "Error",
                  JOptionPane.ERROR_MESSAGE);

        }
      }
    });

    buttonSubtract.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        // get the value of text box, validate it for a real number, if it is ok append operand1 with operator
        try {
          firstRealNumber = Double.parseDouble(textFieldResults.getText());
          textFieldResults.setText(firstRealNumber + "-");
          operator = "-";
        } catch (NumberFormatException exception) {
          JOptionPane
              .showMessageDialog(null, "Invalid Operand! Please enter a double precision value "
                      + "between 4.94065645841246544e-324d and 1.79769313486231570e+308d", "Error",
                  JOptionPane.ERROR_MESSAGE);

        }
      }
    });

    buttonMultiply.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        // get the value of text box, validate it for a real number, if it is ok append operand1 with operator
        try {
          firstRealNumber = Double.parseDouble(textFieldResults.getText());
          textFieldResults.setText(firstRealNumber + "*");
          operator = "*";
        } catch (NumberFormatException exception) {
          JOptionPane
              .showMessageDialog(null, "Invalid Operand! Please enter a double precision value "
                      + "between 4.94065645841246544e-324d and 1.79769313486231570e+308d", "Error",
                  JOptionPane.ERROR_MESSAGE);

        }
      }
    });

    buttonDivide.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        // get the value of text box, validate it for a real number, if it is ok append operand1 with operator
        try {
          firstRealNumber = Double.parseDouble(textFieldResults.getText());
          textFieldResults.setText(firstRealNumber + "/");
          operator = "/";
        } catch (NumberFormatException exception) {
          JOptionPane
              .showMessageDialog(null, "Invalid Operand! Please enter a double precision value "
                      + "between 4.94065645841246544e-324d and 1.79769313486231570e+308d", "Error",
                  JOptionPane.ERROR_MESSAGE);

        }
      }
    });

    buttonPower.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        // get the value of text box, validate it for a real number, if it is ok append operand1 with operator
        try {
          firstRealNumber = Double.parseDouble(textFieldResults.getText());
          textFieldResults.setText(firstRealNumber + "^");
          operator = "^";
        } catch (NumberFormatException exception) {
          JOptionPane
              .showMessageDialog(null, "Invalid Operand! Please enter a double precision value "
                      + "between 4.94065645841246544e-324d and 1.79769313486231570e+308d", "Error",
                  JOptionPane.ERROR_MESSAGE);

        }
      }
    });

    buttonAbsolute.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        // get the value of text box, validate it for a real number, if it is ok perform absolute operation
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
        //get the value of textbox..fetch only values after operator..validate the number..if ok...perform operation

        String textValue = textFieldResults.getText();
        String subTextValue = textValue.substring(textValue.indexOf(operator) + 1);
        try {
          secondRealNumber = Double.parseDouble(subTextValue);
          switch (operator) {
            case "+":
              result = firstRealNumber + secondRealNumber;
              break;
            case "-":
              result = firstRealNumber - secondRealNumber;
              break;
            case "*":
              result = firstRealNumber * secondRealNumber;
              break;
            case "/":
              result = firstRealNumber / secondRealNumber;
              break;
            case "^":
              Exponentiation exponentiation=new Exponentiation();
              result=exponentiation.pow(firstRealNumber,secondRealNumber);
              break;
            default:
              JOptionPane.showMessageDialog(null, "Invalid Operator! Please start over !", "Error",
                  JOptionPane.ERROR_MESSAGE);
          }
          textFieldResults.setText(textFieldResults.getText() + "=" + result);
        } catch (NumberFormatException exception) {
          JOptionPane
              .showMessageDialog(null, "Invalid Operand! Please enter a double precision value "
                      + "between 4.94065645841246544e-324d and 1.79769313486231570e+308d", "Error",
                  JOptionPane.ERROR_MESSAGE);

        }
        //TODO: use memento pattern to save the results
      }
    });

    a0Button.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        String enteredNumber = textFieldResults.getText() + a0Button.getText();
        textFieldResults.setText(enteredNumber);
      }
    });

    a1Button.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        String enteredNumber = textFieldResults.getText() + a1Button.getText();
        textFieldResults.setText(enteredNumber);
      }
    });
    a2Button.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        String enteredNumber = textFieldResults.getText() + a2Button.getText();
        textFieldResults.setText(enteredNumber);
      }
    });

    a3Button.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        String enteredNumber = textFieldResults.getText() + a3Button.getText();
        textFieldResults.setText(enteredNumber);
      }
    });

    a4Button.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        String enteredNumber = textFieldResults.getText() + a4Button.getText();
        textFieldResults.setText(enteredNumber);
      }
    });

    a5Button.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        String enteredNumber = textFieldResults.getText() + a5Button.getText();
        textFieldResults.setText(enteredNumber);
      }
    });

    a6Button.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        String enteredNumber = textFieldResults.getText() + a6Button.getText();
        textFieldResults.setText(enteredNumber);
      }
    });

    a7Button.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        String enteredNumber = textFieldResults.getText() + a7Button.getText();
        textFieldResults.setText(enteredNumber);
      }
    });

    a8Button.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        String enteredNumber = textFieldResults.getText() + a8Button.getText();
        textFieldResults.setText(enteredNumber);
      }
    });

    a9Button.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        String enteredNumber = textFieldResults.getText() + a9Button.getText();
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
  }

  public static void main(String[] args) {
    JFrame frame = new JFrame("Eternity Function- x^y");
    frame.setContentPane(new EternityFunction().calculatorView);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.pack();
    frame.setSize(350, 350);
    frame.setVisible(true);
  }
}
