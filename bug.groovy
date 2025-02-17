```groovy
def myMethod(param) {
  if (param == null) {
    return 0 //This will cause error if the expected return type is not primitive type like int
  }
  //Some logic
}
```