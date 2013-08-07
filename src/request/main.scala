package request

/**
 * Created with IntelliJ IDEA.
 * User: brenoferreira
 * Date: 8/6/13
 * Time: 8:21 PM
 * To change this template use File | Settings | File Templates.
 */
object App {
  def main(args: Array[String]) {
    println($ get "google")

    val body = Map("Nome" -> "Breno", "Idade" -> "24")
    println($.post("teste", body))
  }
}
