//     Project: angulate2 (https://github.com/jokade/angulate2)
// Description: Façade trait for Angular2 router.Router

// Copyright (c) 2016 Johannes.Kastner <jokade@karchedon.de>
//               Distributed under the MIT License (see included LICENSE file)
package angulate2.router

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

/**
 * The Router is responsible for mapping URLs to components.
 *
 * @see [[https://angular.io/docs/ts/latest/api/router/Router-class.html]]
 */
@js.native
@JSName("ng.router.Router")
trait Router extends js.Object {
  def navigating : Boolean = js.native
  def lastNavigationAttempt : String = js.native
  //def registry : RouteRegistry = js.native
  def parent : Router = js.native
  def hostComponent : js.Any = js.native
  def childRouter(hostComponent: js.Any) : Router = js.native
  def auxRouter(hostComponent: js.Any) : Router = js.native
  //def isRouteActive(instruction: Instruction) : Boolean
  def navigate(linkParams: js.Array[js.Any]): js.Promise[js.Any]
  def navigateByUrl(url: String, skipLocationChange: Boolean = false) : js.Promise[js.Any]
}

object Router {
  implicit class RichRouter(val r: Router) extends AnyVal {
    def navigate(to: String, params: (String,_)*): js.Promise[js.Any] =
      r.navigate(js.Array(to,js.Dictionary(params:_*)))
  }


}

@js.native
@JSName("ng.router.provideRouter")
object provideRouter extends js.Object {
  @js.native
  def apply(config: RouterConfig): js.Any = js.native
}

@js.native
@JSName("ng.router.RouterModule")
object RouterModule extends js.Object {
  @js.native
  def forRoot(routes: js.Any): js.Any = js.native
}