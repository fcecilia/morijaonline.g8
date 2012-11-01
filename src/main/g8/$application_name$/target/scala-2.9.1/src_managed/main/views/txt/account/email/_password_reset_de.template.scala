
package views.txt.account.email

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
import views.txt._
/**/
object _password_reset_de extends BaseScalaTemplate[play.api.templates.Txt,Format[play.api.templates.Txt]](play.api.templates.TxtFormat) with play.api.templates.Template3[String,String,String,play.api.templates.Txt] {

    /**/
    def apply/*1.2*/(url: String, token: String, name: String):play.api.templates.Txt = {
        _display_ {

Seq[Any](format.raw/*1.44*/("""Hey """),_display_(Seq[Any](/*1.49*/name)),format.raw/*1.53*/(""",


du oder jemand anderes hat die Möglichkeit zum Zurücksetzen deines Passwortes genutzt.
Falls dies nicht du selbst oder deine Absicht war, kannst du diese E-Mail einfach ignorieren.

Falls du dein Passwort zurücksetzen möchtest, musst du nur diesem Link folgen:

"""),_display_(Seq[Any](/*9.2*/url)),format.raw/*9.5*/("""

Grüße,
Das PlayAuthenticate-Team"""))}
    }
    
    def render(url:String,token:String,name:String) = apply(url,token,name)
    
    def f:((String,String,String) => play.api.templates.Txt) = (url,token,name) => apply(url,token,name)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Nov 01 18:37:15 CET 2012
                    SOURCE: /Users/fred/Downloads/joscha-play-authenticate-905bbcf/samples/java/play-authenticate-usage/app/views/account/email/_password_reset_de.scala.txt
                    HASH: 71676bd3fc08861f11e0eafd7093cc7527f1af83
                    MATRIX: 790->1|908->43|948->48|973->52|1274->319|1297->322
                    LINES: 27->1|30->1|30->1|30->1|38->9|38->9
                    -- GENERATED --
                */
            