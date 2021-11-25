package gardenshare

import slinky.hot

import scala.scalajs.LinkingInfo
import scala.scalajs.js.annotation.JSExportTopLevel

object Main {
  if (LinkingInfo.developmentMode) {
    hot.initialize()
  }

  val cjlj = Cache.getItem("federatedInfo").toFuture.value
  println("|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||")
  println(cjlj)
  println("|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||")
  
  @JSExportTopLevel("app")
  val app = App.componentConstructor
}
