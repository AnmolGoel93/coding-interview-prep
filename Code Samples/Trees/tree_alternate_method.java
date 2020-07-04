import java.util.*;

class SubTree {
  SubTreeNode root;
  int size;
}

class SubTreeNode {
  Object item;
  SubTreeNode parent;
  SubTreeNode firstChild;
  SubTreeNode nextSibling;

  public void preorder() {
    this.visit();
    if (firstChild != null) {
      firstChild.preorder();
    }
    if (nextSibling != null) {
      nextSibling.preorder();
    }
  }

  public void postorder() {
    if (firstChild != null) {
      firstChild.postorder();
    }
    this.visit();
    if (nextSibling != null) {
      nextSibling.postorder();
    }
  }
}
