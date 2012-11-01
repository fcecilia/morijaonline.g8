
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
object _password_reset_en extends BaseScalaTemplate[play.api.templates.Txt,Format[play.api.templates.Txt]](play.api.templates.TxtFormat) with play.api.templates.Template3[String,String,String,play.api.templates.Txt] {

    /**/
    def apply/*1.2*/(url: String, token: String, name: String):play.api.templates.Txt = {
        _display_ {

Seq[Any](format.raw/*1.44*/("""Howdy """),_display_(Seq[Any](/*1.51*/name)),format.raw/*1.55*/(""",


You or someone else requested a password reset for your account.
If this was not you or your intention, just relax and ignore this email.

If you wish to reset your password, all you need to do is follow this link to reset your password:
"""),_display_(Seq[Any](/*8.2*/url)),format.raw/*8.5*/("""

Cheers,
The PlayAuthenticate Team"""))}
    }
    
    def render(url:String,token:String,name:String) = apply(url,token,name)
    
    def f:((String,String,String) => play.api.templates.Txt) = (url,token,name) => apply(url,token,name)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Nov 01 18:37:15 CET 2012
                    SOURCE: /Users/fred/Downloads/joscha-play-authenticate-905bbcf/samples/java/play-authenticate-usage/app/views/account/email/_password_reset_en.scala.txt
                    HASH: 25d104846f97c3aff888d07debb31edb34a24079
                    MATRIX: 790->1|908->43|950->50|975->54|1252->297|1275->300
                    LINES: 27->1|30->1|30->1|30->1|37->8|37->8
                    -- GENERATED --
                */
            