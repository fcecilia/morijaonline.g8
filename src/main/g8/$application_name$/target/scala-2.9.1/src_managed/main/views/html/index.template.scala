
package views.html

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.api.templates.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import com.avaje.ebean._
import play.mvc.Http.Context.Implicit._
import views.html._
/**/
object index extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.Html] {

    /**/
    def apply():play.api.templates.Html = {
        _display_ {

Seq[Any](_display_(Seq[Any](/*2.2*/main(Messages("playauthenticate.index.title"))/*2.48*/ {_display_(Seq[Any](format.raw/*2.50*/("""
      <!-- Main hero unit for a primary marketing message or call to action -->
      <div class="hero-unit">
        <h1>"""),_display_(Seq[Any](/*5.14*/Messages("playauthenticate.index.intro"))),format.raw/*5.54*/("""</h1>
        <p>"""),_display_(Seq[Any](/*6.13*/Messages("playauthenticate.index.intro_2"))),format.raw/*6.55*/(""" <br/>"""),_display_(Seq[Any](/*6.62*/Messages("playauthenticate.index.intro_3"))),format.raw/*6.104*/("""</p>
      </div>

      <!-- Example row of columns -->
      <div class="row">
        <div class="span4">
          <h2>"""),_display_(Seq[Any](/*12.16*/Messages("playauthenticate.index.heading"))),format.raw/*12.58*/("""</h2>
           <p>Cupcake ipsum dolor sit amet. Pastry pie powder biscuit bear claw. Jelly-o chocolate bar sweet roll sugar plum chocolate. Biscuit brownie chupa chups macaroon ice cream halvah sugar plum oat cake ice cream.</p>
          <p><a class="btn" href="#">"""),_display_(Seq[Any](/*14.39*/Messages("playauthenticate.index.details"))),format.raw/*14.81*/(""" &raquo;</a></p>
        </div>
        <div class="span4">
          <h2>Heading</h2>
           <p>Applicake macaroon caramels gummi bears pastry. Cake liquorice carrot cake chocolate lollipop dessert. Halvah fruitcake marshmallow pie gummi bears pie marzipan.</p>
          <p><a class="btn" href="#">"""),_display_(Seq[Any](/*19.39*/Messages("playauthenticate.index.details"))),format.raw/*19.81*/(""" &raquo;</a></p>
       </div>
        <div class="span4">
          <h2>Heading</h2>
          <p>Wafer halvah jujubes lollipop liquorice jelly-o pastry. Pie halvah toffee. Candy canes donut sugar plum. Chocolate cake powder tart liquorice cotton candy pudding sweet.</p>
          <p><a class="btn" href="#">"""),_display_(Seq[Any](/*24.39*/Messages("playauthenticate.index.details"))),format.raw/*24.81*/(""" &raquo;</a></p>
        </div>
      </div>
    """)))})))}
    }
    
    def render() = apply()
    
    def f:(() => play.api.templates.Html) = () => apply()
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Nov 01 18:37:15 CET 2012
                    SOURCE: /Users/fred/Downloads/joscha-play-authenticate-905bbcf/samples/java/play-authenticate-usage/app/views/index.scala.html
                    HASH: dbac83e28f2eca255cd4a06b0105ad519d7f207d
                    MATRIX: 828->2|882->48|921->50|1080->174|1141->214|1194->232|1257->274|1299->281|1363->323|1523->447|1587->489|1892->758|1956->800|2297->1105|2361->1147|2708->1458|2772->1500
                    LINES: 30->2|30->2|30->2|33->5|33->5|34->6|34->6|34->6|34->6|40->12|40->12|42->14|42->14|47->19|47->19|52->24|52->24
                    -- GENERATED --
                */
            