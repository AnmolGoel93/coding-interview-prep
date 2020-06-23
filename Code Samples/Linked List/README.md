# Linked List

It is a type of recursive data type. It is made up of nodes.

Each node has :
- an item
- a reference to next node

---

We can referance any object as well, by declaring a ref. of type "Object".

```java
class SListNode {
  public Object item;
  public SListNode next;
}
```

SList class used in [here](./singly-list.java), enforces ADT (Abstract data type) i.e. 2 invarients.
1. size is always correct.
2. list is never circularly linked

Both of these goals are aaccomplished because only SList methods can change the lists.

---

#### Advantages over Arrays
  - inserting item in middle of linked list takes constant time if you have reference to previous nodes.
  - list can keep growing until memory runs out.

#### Disadvantage
  - Finding the nth item of the linked list takes time proportional to n (length of list). { constant time on array list }

  - **Singly Linked List**
    - Insert new item at the beginning of list
    - You cannot represent a empty list. 
      ```java
      x = null
      x.nth(1)
      ```
      Because Java throws Runtime error if you call a method on a null object.

    _Solution_: Seperate SList class maintains head of class.