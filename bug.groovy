```groovy
def myMethod(param) {
  if (param == null) {
    return 0 //This line will cause NullPointerException if param is a collection
  }
  // ... rest of the method
}

myMethod(myList)
```