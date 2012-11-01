
package views.html.account.signup.email

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
object _verify_email_de extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template3[String,String,String,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(verificationUrl: String, token: String, name: String):play.api.templates.Html = {
        _display_ {

Seq[Any](format.raw/*1.56*/("""
Hey """),_display_(Seq[Any](/*2.6*/name)),format.raw/*2.10*/(""",
<br />
<br />
<p>
	Du hast dich kürzlich bei PlayAuthenticate registriert.<br />
	<br />
	Folge diesem Link um dein Konto <a href=""""),_display_(Seq[Any](/*8.44*/verificationUrl)),format.raw/*8.59*/("""">jetzt zu aktivieren</a>.
</p>
<br />
<p>
	Grüße,<br /> 
	<i>Das PlayAuthenticate-Team</i>
</p>"""))}
    }
    
    def render(verificationUrl:String,token:String,name:String) = apply(verificationUrl,token,name)
    
    def f:((String,String,String) => play.api.templates.Html) = (verificationUrl,token,name) => apply(verificationUrl,token,name)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Nov 01 18:37:15 CET 2012
                    SOURCE: /Users/fred/Downloads/joscha-play-authenticate-905bbcf/samples/java/play-authenticate-usage/app/views/account/signup/email/_verify_email_de.scala.html
                    HASH: 5baf86fee0d46432a5fa32c9740b11ca325c428d
                    MATRIX: 801->1|932->55|972->61|997->65|1166->199|1202->214
                    LINES: 27->1|30->1|31->2|31->2|37->8|37->8
                    -- GENERATED --
                */
            