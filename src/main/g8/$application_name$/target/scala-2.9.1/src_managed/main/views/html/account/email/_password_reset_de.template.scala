
package views.html.account.email

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
object _password_reset_de extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template3[String,String,String,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(url: String, token: String, name: String):play.api.templates.Html = {
        _display_ {

Seq[Any](format.raw/*1.44*/("""
Hey """),_display_(Seq[Any](/*2.6*/name)),format.raw/*2.10*/(""",
<br />
<br />
<p>
	du oder jemand anderes hat die Möglichkeit zum Zurücksetzen deines Passwortes genutzt.<br />
	Falls dies nicht du selbst oder deine Absicht war, kannst du diese E-Mail einfach ignorieren.<br />
</p>
<p>
	Falls du dein Passwort zurücksetzen möchtest, <a href=""""),_display_(Seq[Any](/*10.58*/url)),format.raw/*10.61*/("""">musst du nur diesem Link folgen</a>.
</p>
<p>
	Grüße,<br /> 
	<i>Das PlayAuthenticate-Team</i>
</p>"""))}
    }
    
    def render(url:String,token:String,name:String) = apply(url,token,name)
    
    def f:((String,String,String) => play.api.templates.Html) = (url,token,name) => apply(url,token,name)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Nov 01 18:37:15 CET 2012
                    SOURCE: /Users/fred/Downloads/joscha-play-authenticate-905bbcf/samples/java/play-authenticate-usage/app/views/account/email/_password_reset_de.scala.html
                    HASH: 24290d5fb18f2745f1038ce6d9faeff00c282417
                    MATRIX: 796->1|915->43|955->49|980->53|1297->334|1322->337
                    LINES: 27->1|30->1|31->2|31->2|39->10|39->10
                    -- GENERATED --
                */
            