package main;

/**
 * Creates and stores states in memento objects
 *
 * @author Prashanthi Ramesh
 * @version 1.0
 * @since 2019-07-26
 */
public class Originator {

  /**
   * state of the object
   */
  private String state;

  /**
   * Setter for the state of the object
   *
   * @param state state of the object
   */
  public void setState(String state) {
    this.state = state;
  }

  /**
   * Getter for the state of the object
   *
   * @return state of the object
   */
  public String getState() {
    return state;
  }

  /**
   * Saves the state to in the memento
   *
   * @return the memento instance of the state
   */
  public Memento saveStateToMemento() {
    return new Memento(state);
  }

  /**
   * Get the state from the memento instance
   *
   * @param memento instance
   */
  public void getStateFromMemento(Memento memento) {
    state = memento.getState();
  }
}