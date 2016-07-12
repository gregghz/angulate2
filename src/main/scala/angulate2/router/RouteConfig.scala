//     Project: angulate2 (https://github.com/jokade/angulate2)
// Description: Angular2 @RouteConfig annotation

// Copyright (c) 2016 Johannes.Kastner <jokade@karchedon.de>
//               Distributed under the MIT License (see included LICENSE file)
package angulate2.router

import sjsx.SJSXRequire

import scala.annotation.StaticAnnotation
import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

@SJSXRequire("ng.router", "@angular/router")
class RouteConfig(defs: RouteDefinition*) extends StaticAnnotation

object RouteConfig {
  @js.native
  @JSName("ng.router_deprecated.RouteConfig")
  class JSAnnot(defs: js.Array[RouteDefinition]) extends js.Object

  def apply(defs: RouteDefinition*): JSAnnot = new JSAnnot(js.Array(defs:_*))
}

@js.native
@JSName("ng.router.RouterConfig")
trait RouterConfig extends js.Object

object RouterConfig {
  def apply(defs: RouteDefinition*): RouterConfig = {
    js.Array(defs: _*).asInstanceOf[RouterConfig]
  }
}
