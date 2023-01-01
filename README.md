# Object-Oriented Programming Concepts
1. Real-world objects contain <b>state</b> and <b>behavior</b>.
2. A software object's state is stored in <b>fields</b>.
3. A software object's behavior is exposed through <b>methods</b>.
4. Hiding internal data from the outside world, and accessing it only through publicly exposed methods is known as data <b>encapsulation</b>.
5. A blueprint for a software object is called a <b>class</b>.
6. Common behavior can be defined in a superclass and inherited into a subclass using the <b>extends</b> keyword.
7. A collection of methods with no implementation is called an <b>interface</b>.
8. A namespace that organizes classes and interfaces by functionality is called a <b>package</b>.
9. The term API stands for <b>Application Programming Interface</b>.

# Language Basics
## Variables
1. The term "instance variable" is another name for <b>non-static field</b>.
2. The term "class variable" is another name for <b>static field</b>.
3. A local variable stores temporary state; it is declared inside a <b>method</b>.
4. A variable declared within the opening and closing parenthesis of a method is called a <b>parameter</b>.
5. What are the eight primitive data types supported by the Java programming language? <b>byte, short, int, long, float, double, boolean, char</b>
6. Character strings are represented by the class <b>java.lang.String</b>.
7. An <b>array</b> is a container object that holds a fixed number of values of a single type.

## Operations
### Answers to Questions
1. Consider the following code snippet:
arrayOfInts[j] > arrayOfInts[j+1]<br>
<b>Question:</b> What operators does the code contain?<br>
<b>Answer:</b> >, +<br>
2. Consider the following code snippet:<br>
int i = 10;<br>
int n = i++%5;<br>
a. <b>Question:</b> What are the values of i and n after the code is executed?<br>
<b>Answer:</b> i is 11, and n is 0.<br><br>
b. <b>Question:</b> What are the final values of i and n if instead of using the postfix increment operator (i++), you use the prefix version (++i))?<br>
<b>Answer:</b> i is 11, and n is 1.<br><br>
3. <b>Question:</b> To invert the value of a boolean, which operator would you use?<br>
<b>Answer:</b> The logical complement operator "!".<br><br>
4. <b>Question:</b> Which operator is used to compare two values, = or == ?<br>
<b>Answer:</b> The == operator is used for comparison, and = is used for assignment.<br><br>
5. <b>Question:</b> Explain the following code sample: result = someCondition ? value1 : value2;<br>
<b>Answer:</b> This code should be read as: "If someCondition is true, assign the value of value1 to result. Otherwise, assign the value of value2 to result."
