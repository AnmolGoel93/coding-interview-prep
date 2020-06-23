class ListNode {
  int item;
  ListNode next;

  public ListNode(int item, ListNode next) {
    this.item = item;
    this.next = next;
  }

  public ListNode(int item) {
    this(item, null);
  }

  public void insertAfter(int item) {
    next = new ListNode(item, next);
  }

  // Recursive way to walk through lists
  public ListNode nth(int position) {
    if (position == 1) {
      return this;
    } else if( (position < 1) || (next == null)) {
      return null;
    } else {
      return next.nth(position - 1);
    }
  }
}

class Main {
  public static void main(String[] args) {
    ListNode l3 = new ListNode(6);
    ListNode l2 = new ListNode(0,l3);
    ListNode l1 = new ListNode(7,l2);
    // l1.item = 7;
    // l2.item = 0;
    // l3.item = 6;
    // l1.next = l2;
    // l2.next = l3;
    // l3.next = null;

    l2.insertAfter(3);
    System.out.println(l1.nth(3).item);
  }
}
