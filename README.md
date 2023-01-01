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

## Expressions, Statements, and Blocks
1. Operators may be used in building <b>expressions</b>, which compute values.
2. Expressions are the core components of <b>statements</b>.
3. Statements may be grouped into <b>blocks</b>.
4. The following code snippet is an example of a <b>compound</b> expression.
 1 * 2 * 3
5. Statements are roughly equivalent to sentences in natural languages, but instead of ending with a period, a statement ends with a <b>semicolon</b>
6. A block is a group of zero or more statements between balanced <b>braces</b> and can be used anywhere a single statement is allowed.

## Control Flow Statements
1. The most basic control flow statement supported by the Java programming language is the <b>if-then</b> statement.
2. The <b>switch</b> statement allows for any number of possible execution paths.
3. The do-while statement is similar to the while statement, but evaluates its expression at the <b>bottom</b> of the loop.
4. <b>Question:</b> How do you write an infinite loop using the <b>for</b> statement?
<b>Answer:</b><br>
```
for ( ; ; ) {

}
```
5. <b>Question:</b> How do you write an infinite loop using the <b>while</b> statement?
<b>Answer:</b>
```
while (true) {

}
```

# Classes and Objects
## Classes
### Answers to Questions
1. Consider the following class:
```
public class IdentifyMyParts {
    public static int x = 7;
    public int y = 3;
} 
```
<b>a. Question:</b> What are the class variables?

<b>Answer:</b> x

<b>b. Question:</b> What are the instance variables?

<b>Answer:</b> y

<b>c. Question:</b> What is the output from the following code:
```
IdentifyMyParts a = new IdentifyMyParts(); 
IdentifyMyParts b = new IdentifyMyParts(); 
a.y = 5; 
b.y = 6; 
a.x = 1; 
b.x = 2; 
System.out.println("a.y = " + a.y); 
System.out.println("b.y = " + b.y); 
System.out.println("a.x = " + a.x); 
System.out.println("b.x = " + b.x); 
System.out.println("IdentifyMyParts.x = " + IdentifyMyParts.x);
```
<b>Answer:</b> Here is the output:<br>
 a.y = 5<br> 
 b.y = 6<br> 
 a.x = 2<br> 
 b.x = 2<br>
 IdentifyMyParts.x = 2<br><br>
 
Because x is defined as a public static int in the class IdentifyMyParts, every reference to x will have the value that was last assigned because x is a static variable (and therefore a class variable) shared across all instances of the class. That is, there is only one x: when the value of x changes in any instance it affects the value of x for all instances of IdentifyMyParts.

