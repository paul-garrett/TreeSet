# TreeSet from CompSci2

### Write a program that reads words from a text file and creates a TreeSet of all of the unique words in the file.

### Use a TreeSet to store the words. A TreeSet will store the words in a natural (alphabetical) ordering.

### Because you are using a TreeSet, it will not store duplicate words. A Set only stores unique values.

### The tree aspect of the data structure allows for inserting, removing, and searching in log(n) time. Explain, in a comment, why those three operations are so fast for a tree data structure.

### You can use the line of code below to remove  unwanted punctuation from a word (commas, periods, etc.). It will also convert the word to lowercase so that duplicates like "The" and "the" do not occur.

```java
String word = word.replaceAll("[^a-zA-Z' ]", "").toLowerCase();
```

### The regular expression [^a-zA-Z ] matches on and replaces any character that is:
### -  ^ (not)
### - lowercase a-z
### - uppercase A-Z
### - an apostrophe '
### - a single space.

### Finally, your program should write out the list of unique words to a separate file. Decide which Writer object makes more sense for this program. Write your explanation for your choice of Writer in a comment.

### The "Flights" story can be found here:

https://www.nobelprize.org/prizes/literature/2018/tokarczuk/prose/
