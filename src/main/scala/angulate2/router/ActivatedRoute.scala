package angulate2.router

import rxjs.core.IObservable
import scala.scalajs.js
import scala.scalajs.js.annotation.JSName
import scala.scalajs.js.|

@js.native
trait Subscription extends js.Object {
  def unsubscribe(): js.Any = js.native
}

@js.native
trait UrlPathWithParams extends js.Object {
  val path: String = js.native
  val parameters: Map[String, String] = js.native
}

//@JSName("ng.core.Type")
@js.native
trait Type extends js.Object

//@JSName("ng.router.ActivatedRouteSnapshot")
@js.native
trait ActivatedRouteSnapshot extends js.Object {
  val url: js.Array[UrlPathWithParams] = js.native
  val params: js.Dynamic = js.native
  val data: js.Any = js.native
  val outlet: String = js.native
  val component: Type | String = js.native
}

@js.native
@JSName("ng.router.ActivatedRoute")
trait ActivatedRoute extends js.Object {
  val snapshot: ActivatedRouteSnapshot = js.native
  val url: IObservable[UrlPathWithParams] = js.native
  val params: IObservable[js.Dynamic] = js.native
  val data: IObservable[js.Any] = js.native
  val outlet: String = js.native
  val component: Type | String = js.native
}
