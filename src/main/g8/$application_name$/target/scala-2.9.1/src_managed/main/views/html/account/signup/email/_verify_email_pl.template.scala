
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
object _verify_email_pl extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template3[String,String,String,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(verificationUrl: String, token: String, name: String):play.api.templates.Html = {
        _display_ {

Seq[Any](format.raw/*1.56*/("""
Cześć """),_display_(Seq[Any](/*2.8*/name)),format.raw/*2.12*/(""",
<br />
<br />
<p>
    Twoje konto w PlayAuthenticate zostało utworzone.<br />
    <br />
    Użyj ten link, <a href=""""),_display_(Seq[Any](/*8.30*/verificationUrl)),format.raw/*8.45*/("""">aby je aktywować</a> natychmiast.
</p>
<br />
<p>
    Pozdrawiamy,<br />
    <i>Ekipa PlayAuthenticate</i>
</p>"""))}
    }
    
    def render(verificationUrl:String,token:String,name:String) = apply(verificationUrl,token,name)
    
    def f:((String,String,String) => play.api.templates.Html) = (verificationUrl,token,name) => apply(verificationUrl,token,name)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Nov 01 18:37:16 CET 2012
                    SOURCE: /Users/fred/Downloads/joscha-play-authenticate-905bbcf/samples/java/play-authenticate-usage/app/views/account/signup/email/_verify_email_pl.scala.html
                    HASH: 79a0b8cd56369eefc9b3459e686e5b8c6388183f
                    MATRIX: 801->1|932->55|974->63|999->67|1154->187|1190->202
                    LINES: 27->1|30->1|31->2|31->2|37->8|37->8
                    -- GENERATED --
                */
            