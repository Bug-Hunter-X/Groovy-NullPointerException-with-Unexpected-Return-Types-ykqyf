```groovy
def myMethod(param) {
  if (param == null) {
    return null // Return null to explicitly handle the null case
  }
  //Some logic here
  return someValue //Return a value of the expected type
}

//Alternatively if you don't want to return null
def myMethod(param) {
  def defaultValue = 0 //or some other default value
  if (param == null) {
    return defaultValue 
  }
  //Some logic here
  return someValue //Return a value of the expected type
}
```