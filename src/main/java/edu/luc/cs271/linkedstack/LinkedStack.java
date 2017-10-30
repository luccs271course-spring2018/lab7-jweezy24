package edu.luc.cs271.linkedstack;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class LinkedStack<E> implements IStack<E> {

  /** The topmost node of this stack. The stack gets pushed down from here. */
  private Node<E> top;

  @Override
  public E push(final E obj) {
    Node<E> tempNode = top;
    top = new Node<>(obj);
    top.next = tempNode;

    return obj;
  }

  @Override
  public E peek() {
    if (top != null) {
      return top.data;
    } else {
      throw new NoSuchElementException();
    }
  }

  @Override
  public E pop() {
    if (top != null) {
      Node<E> tempNode = top;
      top = top.next;
      return tempNode.data;
    } else throw new NoSuchElementException();
  }

  @Override
  public boolean isEmpty() {
    if (top == null) return true;

    return false;
  }

  @Override
  public List<E> asList() {
    // TODO implement using an ArrayList preallocated with the right size
    // TODO add any instance variable(s) required to support this
    List<E> list = new ArrayList<E>();
    System.out.println(iter(top, list));

    return list;
  }

  <E> List<E> iter(Node<E> top, List<E> list) {
    if (top != null) {
      list.add(top.data);
      if (top.next != null) iter(top.next, list);
    }
    return list;
  }
}
