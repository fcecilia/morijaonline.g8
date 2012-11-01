
package views.txt.account.signup.email

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
object _verify_email_de extends BaseScalaTemplate[play.api.templates.Txt,Format[play.api.templates.Txt]](play.api.templates.TxtFormat) with play.api.templates.Template3[String,String,String,play.api.templates.Txt] {

    /**/
    def apply/*1.2*/(verificationUrl: String, token: String, name: String):play.api.templates.Txt = {
        _display_ {

Seq[Any](format.raw/*1.56*/("""Hey """),_display_(Seq[Any](/*1.61*/name)),format.raw/*1.65*/(""",


Du hast dich kürzlich bei PlayAuthenticate registriert.

Folge diesem Link um dein Konto jetzt zu aktivieren:

"""),_display_(Seq[Any](/*8.2*/verificationUrl)),format.raw/*8.17*/("""

Grüße,
Das PlayAuthenticate-Team"""))}
    }
    
    def render(verificationUrl:String,token:String,name:String) = apply(verificationUrl,token,name)
    
    def f:((String,String,String) => play.api.templates.Txt) = (verificationUrl,token,name) => apply(verificationUrl,token,name)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Nov 01 18:37:15 CET 2012
                    SOURCE: /Users/fred/Downloads/joscha-play-authenticate-905bbcf/samples/java/play-authenticate-usage/app/views/account/signup/email/_verify_email_de.scala.txt
                    HASH: 431045dc5eae76a9ad3964c606dfada62befc005
                    MATRIX: 795->1|925->55|965->60|990->64|1140->180|1176->195
                    LINES: 27->1|30->1|30->1|30->1|37->8|37->8
                    -- GENERATED --
                */
            