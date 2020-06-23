# Arrays

#### Disadvantages

  - Insert item at the beginning or middle ~~> time proportional to length of array
  - Arrays have a fixed length. (to extend size new array has to be allocated)

## Python

### Time Complexity

Method       | Time       | Other Info.
:----------- | :--------: | :----------
sorted()     | O(nlog(n)) | Uses Tim sort
list.sort    | O(nlog(n)) | Uses Tim sort
max(), min() | O(n)       | Use if condition, if possible than these
in           | O(n)
len()        | O(1)       | Avoid using this inside a loop rather use local var
set()        | O(n)       | Uses Hashmap to convert from list to set. Iterating over a list is O(n) and adding each element to the hash set is O(1) , so the total operation is O(n)

Look up: https://wiki.python.org/moin/TimeComplexity