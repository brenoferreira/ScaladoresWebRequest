package request

/**
 * Created with IntelliJ IDEA.
 * User: brenoferreira
 * Date: 8/6/13
 * Time: 8:09 PM
 * To change this template use File | Settings | File Templates.
 */


object $ {
  def get(url:String) =
    url match {
      case "google" => "<h1>Busque alguma coisa...</h1>"
      case "g1" => "<h1>Suas noticias</h1"
      case _ => "<h1>Erro</h1>"
    }

  def post(url:String, body:Map[String, String]) = {
    "{" +
      body
        .map(par => par._1 + ":" + "\"" + par._2 + "\"")
        .reduceRight((prop, acc) => acc + "," + prop) + "}"
  }
}