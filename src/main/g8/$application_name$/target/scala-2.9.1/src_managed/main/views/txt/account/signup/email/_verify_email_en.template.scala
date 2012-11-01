
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
object _verify_email_en extends BaseScalaTemplate[play.api.templates.Txt,Format[play.api.templates.Txt]](play.api.templates.TxtFormat) with play.api.templates.Template3[String,String,String,play.api.templates.Txt] {

    /**/
    def apply/*1.2*/(verificationUrl: String, token: String, name: String):play.api.templates.Txt = {
        _display_ {

Seq[Any](format.raw/*1.56*/("""Howdy """),_display_(Seq[Any](/*1.63*/name)),format.raw/*1.67*/(""",


You recently signed up for PlayAuthenticate.

To activate your account, follow this link now:
"""),_display_(Seq[Any](/*7.2*/verificationUrl)),format.raw/*7.17*/("""

Cheers,
The PlayAuthenticate Team"""))}
    }
    
    def render(verificationUrl:String,token:String,name:String) = apply(verificationUrl,token,name)
    
    def f:((String,String,String) => play.api.templates.Txt) = (verificationUrl,token,name) => apply(verificationUrl,token,name)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Nov 01 18:37:16 CET 2012
                    SOURCE: /Users/fred/Downloads/joscha-play-authenticate-905bbcf/samples/java/play-authenticate-usage/app/views/account/signup/email/_verify_email_en.scala.txt
                    HASH: 06b4b07b964d9dac13f2f4c01da926a8311c17d6
                    MATRIX: 795->1|925->55|967->62|992->66|1125->165|1161->180
                    LINES: 27->1|30->1|30->1|30->1|36->7|36->7
                    -- GENERATED --
                */
            