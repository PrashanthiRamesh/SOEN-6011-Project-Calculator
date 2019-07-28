package main;

import java.util.ArrayList;
import java.util.List;

/**
 * Responsible to restore object state from Memento
 *
 * @author Prashanthi Ramesh
 * @version 1.0
 * @since 2019-07-26
 */
public class CareTaker {

  /**
   * list of states stored
   */
  private List<Memento> mementoList = new ArrayList<Memento>();

  /**
   * Add state to the memento List
   * @param state current state
   */
  public void add(Memento state) {
    mementoList.add(state);
  }

  /**
   * Get the state based on the index value
   * @param index position in the list
   * @return state of the object
   */
  public Memento get(int index) {
    return mementoList.get(index);
  }

  /**
   * Get the size of the memento list
   * @return size of the memento list
   */
  int getSize() {
    return mementoList.size();
  }
}