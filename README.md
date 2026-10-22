Calculator and DateChecker are split into two different maven project folders; you can probably discern out which is which. <br />
Both projects are tested with JUnit 5.11.4, and compiled using JDK 27. <br />
# Calculator
Division by zero is handled by throwing an invalid argument exception.<br />
# DateChecker
February is currently handled by returning false; this pattern should remain the same regardless of any implementation of leap <br />
year, so please ensure that future versions of DateChecker maintains this behavior. Additionally, passing in null for has31Days <br />
will return a InvalidArgumentException.
