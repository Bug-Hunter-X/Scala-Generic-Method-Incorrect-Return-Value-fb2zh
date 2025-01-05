```scala
class MyClass[T](val value: T) {
  def myMethod(other: MyClass[T]): T = {
    // Some logic here
    value // Incorrect return
  }
}

val obj1 = new MyClass[Int](10)
val obj2 = new MyClass[Int](20)

println(obj1.myMethod(obj2)) // Returns 10, instead of a result of some logic
```