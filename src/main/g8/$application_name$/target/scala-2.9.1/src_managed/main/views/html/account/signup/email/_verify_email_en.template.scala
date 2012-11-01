
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
object _verify_email_en extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template3[String,String,String,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(verificationUrl: String, token: String, name: String):play.api.templates.Html = {
        _display_ {

Seq[Any](format.raw/*1.56*/("""
Howdy """),_display_(Seq[Any](/*2.8*/name)),format.raw/*2.12*/(""",
<br />
<br />
<p>
	You recently signed up for PlayAuthenticate.<br />
	<br />
	Follow this link to <a href=""""),_display_(Seq[Any](/*8.32*/verificationUrl)),format.raw/*8.47*/("""">activate your account</a> now.
</p>
<br />
<p>
	Cheers,<br /> 
	<i>The PlayAuthenticate Team</i>
</p>"""))}
    }
    
    def render(verificationUrl:String,token:String,name:String) = apply(verificationUrl,token,name)
    
    def f:((String,String,String) => play.api.templates.Html) = (verificationUrl,token,name) => apply(verificationUrl,token,name)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Nov 01 18:37:16 CET 2012
                    SOURCE: /Users/fred/Downloads/joscha-play-authenticate-905bbcf/samples/java/play-authenticate-usage/app/views/account/signup/email/_verify_email_en.scala.html
                    HASH: decd7bc680b651595365135434dc399c4763aebe
                    MATRIX: 801->1|932->55|974->63|999->67|1145->178|1181->193
                    LINES: 27->1|30->1|31->2|31->2|37->8|37->8
                    -- GENERATED --
                */
            