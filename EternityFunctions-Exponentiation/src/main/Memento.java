package main;

/**
 * Contains the state of the object to be restored
 *
 * @author Prashanthi Ramesh
 * @version 1.0
 * @since 2019-07-26
 */
class Memento {

  /**
   * State of the object
   */
  private String state;

  /**
   * Creates a storage of the current state
   *
   * @param state state of the object
   */
  Memento(String state) {
    this.state = state;
  }

  /**
   * Getter of the current state
   *
   * @return state of the object
   */
  String getState() {
    return state;
  }
}