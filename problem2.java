import java.io.*
import java.math.*
import java.security.*
import java.text.*
import java.util.*
import java.util.concurrent.*
import java.util.function.*
import java.util.regex.*
import java.util.stream.*
import kotlin.collections.*
import kotlin.comparisons.*
import kotlin.io.*
import kotlin.jvm.*
Import kotlin.jvm.functions.*
import kotlin.jvm.internal.*
import kotlin.ranges.*
import kotlin.sequences.*
import kotlin.text.*// Complete the pairs function below.
fun pairs(k: Int, arr: Array<Int>): Int {
  // solution below
  val set = HashSet<Int>()
  var count = 0

  for (num in arr) {
    if (set.contains(num - k)) {
      count++
    }
    if (set.contains(num + k)) {
      count++
    }
    set.add(num)
  }

  return count
}
fun main(args: Array<String>) {
  val scan = Scanner(System.`in`)
  val nk = scan.nextLine().split(" ")
  val n = nk[0].trim().toInt()
  val k = nk[1].trim().toInt()
  val arr = scan.nextLine().split(" ").map{ 
    it.trim().toInt()
  }.toTypedArray()
  val result = pairs(k, arr)
  println(result)
}