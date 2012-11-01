
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
object _password_reset_en extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template3[String,String,String,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(url: String, token: String, name: String):play.api.templates.Html = {
        _display_ {

Seq[Any](format.raw/*1.44*/("""
Howdy """),_display_(Seq[Any](/*2.8*/name)),format.raw/*2.12*/(""",
<br />
<br />
<p>
	You or someone else requested a password reset for your account.<br />
	If that was not you or your intention, just relax and ignore this email.<br />
</p>
<p>
	If you wish to reset your password, all you need to do is <a href=""""),_display_(Seq[Any](/*10.70*/url)),format.raw/*10.73*/("""">follow this link to reset your password</a>.
</p>
<p>
	Cheers,<br /> 
	<i>The PlayAuthenticate Team</i>
</p>"""))}
    }
    
    def render(url:String,token:String,name:String) = apply(url,token,name)
    
    def f:((String,String,String) => play.api.templates.Html) = (url,token,name) => apply(url,token,name)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Nov 01 18:37:15 CET 2012
                    SOURCE: /Users/fred/Downloads/joscha-play-authenticate-905bbcf/samples/java/play-authenticate-usage/app/views/account/email/_password_reset_en.scala.html
                    HASH: 6f62f96909fe2b08d2f84bab759de12af90f3052
                    MATRIX: 796->1|915->43|957->51|982->55|1268->305|1293->308
                    LINES: 27->1|30->1|31->2|31->2|39->10|39->10
                    -- GENERATED --
                */
            