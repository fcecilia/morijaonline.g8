
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
object _verify_email_pl extends BaseScalaTemplate[play.api.templates.Txt,Format[play.api.templates.Txt]](play.api.templates.TxtFormat) with play.api.templates.Template4[String,String,String,String,play.api.templates.Txt] {

    /**/
    def apply/*1.2*/(verificationUrl: String, token: String, name: String, email: String):play.api.templates.Txt = {
        _display_ {

Seq[Any](format.raw/*1.71*/("""Cześć """),_display_(Seq[Any](/*1.78*/name)),format.raw/*1.82*/(""",


Aby zweryfikować konto, użyj ten link
"""),_display_(Seq[Any](/*5.2*/verificationUrl)),format.raw/*5.17*/("""

Pozdrawiamy,
Ekipa PlayAuthenticate"""))}
    }
    
    def render(verificationUrl:String,token:String,name:String,email:String) = apply(verificationUrl,token,name,email)
    
    def f:((String,String,String,String) => play.api.templates.Txt) = (verificationUrl,token,name,email) => apply(verificationUrl,token,name,email)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Nov 01 18:37:15 CET 2012
                    SOURCE: /Users/fred/Downloads/joscha-play-authenticate-905bbcf/samples/java/play-authenticate-usage/app/views/account/email/_verify_email_pl.scala.txt
                    HASH: 3f45c7aab9b770a7c2ed24c6b3a1aacdd73f177d
                    MATRIX: 795->1|940->70|982->77|1007->81|1084->124|1120->139
                    LINES: 27->1|30->1|30->1|30->1|34->5|34->5
                    -- GENERATED --
                */
            