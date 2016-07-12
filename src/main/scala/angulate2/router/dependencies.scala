//     Project: angulate2
// Description: Defines token traits for Angular2 router dependencies.

// Copyright (c) 2016 Johannes.Kastner <jokade@karchedon.de>
//               Distributed under the MIT License (see included LICENSE file)
package angulate2.router

import scala.scalajs.js
import scala.scalajs.js.annotation.JSExport
import sjsx.SJSXRequire

import scala.scalajs.js.annotation.JSName

/**
 * This trait serves as token to inject all directives required for the router service.
  */
@js.native
@JSName("ng.router.ROUTER_DIRECTIVES")
object ROUTER_DIRECTIVES extends js.Object

/**
 * This trait serves as token to inject all dependencies required for the router service.
 */
@SJSXRequire("ng.router_deprecated","angular2/router")
@JSName("ng.router_deprecated.ROUTER_PROVIDERS")
trait ROUTER_PROVIDERS

/**
 * A router outlet is a placeholder that Angular dynamically fills based on the application's route.
 */
trait RouterOutlet

/**
 * The RouterLink directive lets you link to specific parts of your app.
 */
trait RouterLink