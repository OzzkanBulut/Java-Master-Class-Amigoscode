**Difference Between Wildcards and Bounded Type Parameters**
-
- What is the difference ?
  - Wildcards can only have one bound.Bounded type can be multiple for example:
                  
        static <T extends Comparable<T> & A & B>
  - Bounded type parameters dont have upper or lower bounds.İn wildcards we can use super keyword but in bounded types we cant use.
  - Bounded type parameters allows us to capture the parameters that goes inside of our methods or classes.
  - We can reference the type in bounded type like T.get() or something.
  - But in wildcards you can not write ?.get()  !
  
  