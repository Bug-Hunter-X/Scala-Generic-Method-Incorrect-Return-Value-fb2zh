```scala
class MyClass[T](val value: T) {
  def myMethod(other: MyClass[T])(implicit num: Numeric[T]): T = {
    // Correct return type and logic to add two numeric values
    num.plus(value, other.value)
  }
}

val obj1 = new MyClass[Int](10)
val obj2 = new MyClass[Int](20)

println(obj1.myMethod(obj2)) // Returns 30

val obj3 = new MyClass[Double](10.5)
val obj4 = new MyClass[Double](20.5)
println(obj3.myMethod(obj4)) // Returns 31.0
```