class DListNode {
  Object item;
  DListNode next;
  DListNode prev;
}

class DList {
  private DListNode head;
  private DListNode tail;
  private int size;

  public void removeBack() {
    tail.prev.next = null;
    tail = tail.prev;
  }
}