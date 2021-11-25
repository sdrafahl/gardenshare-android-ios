package gardenshare

import slinky.core._
import slinky.core.annotations.react
import slinky.native._
import scala.scalajs.js.Dynamic.literal
import scala.scalajs.js.annotation.JSExportTopLevel
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js
import cats.effect.Async

@js.native
@JSImport("aws-amplify", JSImport.Namespace)
object Cache extends js.Object {
  def getItem(key: String): js.Promise[js.Object] = js.native
}

// abstract class GetAccessToken[F[_]] {
//   def getAccessTokenFromCache: F[AccessToken]
// }

// object GetAccessToken {
//   implicit def createGetAccessToken[F[_]: Async] = new GetAccessToken[F] {
//     def getAccessTokenFromCache: F[AccessToken] = Cache. ???
//   }
// }
