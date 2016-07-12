//     Project: angulate2 (https://github.com/jokade/angulate2)
// Description: Façade trait for Angular2 router.RouteDefinition

// Copyright (c) 2016 Johannes.Kastner <jokade@karchedon.de>
//               Distributed under the MIT License (see included LICENSE file)
package angulate2.router


import angulate2.impl.JSType

import scala.scalajs.js

@js.native
trait RouteDefinition extends js.Object {
  def path: js.UndefOr[String] = js.native
  def name: js.UndefOr[String] = js.native
  def component: js.UndefOr[JSType] = js.native
  def redirectTo: js.UndefOr[String] = js.native
  def pathMatch: js.UndefOr[String] = js.native
  def useAsDefault: Boolean = js.native
}

object RDef {
  def apply(
    path: js.UndefOr[String] = js.undefined,
    name: js.UndefOr[String] = js.undefined,
    component: js.UndefOr[JSType] = js.undefined,
    redirectTo: js.UndefOr[String] = js.undefined,
    pathMatch: js.UndefOr[String] = js.undefined,
    useAsDefault: Boolean = false
  ) : RouteDefinition = {
    val d = js.Dynamic.literal(
      useAsDefault = useAsDefault
    )

    path.foreach(d.path = _)
    name.foreach(d.name = _)
    component.foreach(d.component = _)
    redirectTo.foreach(d.redirectTo = _)
    pathMatch.foreach(d.pathMatch = _)

    d.asInstanceOf[RouteDefinition]
  }
}
