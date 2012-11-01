
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
object _password_reset_pl extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template3[String,String,String,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(url: String, token: String, name: String):play.api.templates.Html = {
        _display_ {

Seq[Any](format.raw/*1.44*/("""
Cześć """),_display_(Seq[Any](/*2.8*/name)),format.raw/*2.12*/(""",
<br />
<br />
<p>
    Poproszono o zmianę hasła dla Twojego konta.<br />
    Jeśli to nie Ty, zrelaksuj się i zignoruj tę wiadomość.<br />
</p>
<p>
    Jeśli jednak naprawdę chcesz zmienić hasło <a href=""""),_display_(Seq[Any](/*10.58*/url)),format.raw/*10.61*/("""">skorzystaj z tego linku aby to zrobić</a>.
</p>
<p>
    Pozdrawiamy,<br />
    <i>Ekipa PlayAuthenticate</i>
</p>"""))}
    }
    
    def render(url:String,token:String,name:String) = apply(url,token,name)
    
    def f:((String,String,String) => play.api.templates.Html) = (url,token,name) => apply(url,token,name)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Nov 01 18:37:15 CET 2012
                    SOURCE: /Users/fred/Downloads/joscha-play-authenticate-905bbcf/samples/java/play-authenticate-usage/app/views/account/email/_password_reset_pl.scala.html
                    HASH: c7f485abb20fb4fe6efcf11e5f280ab6667fcc83
                    MATRIX: 796->1|915->43|957->51|982->55|1225->262|1250->265
                    LINES: 27->1|30->1|31->2|31->2|39->10|39->10
                    -- GENERATED --
                */
            