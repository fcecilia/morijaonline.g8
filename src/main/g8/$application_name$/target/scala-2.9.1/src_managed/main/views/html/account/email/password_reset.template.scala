
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
object password_reset extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template3[String,String,String,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(url: String, token: String, name: String):play.api.templates.Html = {
        _display_ {

Seq[Any](_display_(Seq[Any](/*1.45*/defining(lang().code)/*1.66*/ { langcode =>_display_(Seq[Any](format.raw/*1.80*/("""
"""),_display_(Seq[Any](/*2.2*/langcode match/*2.16*/ {/*3.1*/case "de" =>/*3.13*/ {_display_(Seq[Any](_display_(Seq[Any](/*3.16*/_password_reset_de(url,token,name)))))}/*4.1*/case "pl" =>/*4.13*/ {_display_(Seq[Any](_display_(Seq[Any](/*4.16*/_password_reset_pl(url,token,name)))))}/*5.1*/case _ =>/*5.10*/ {_display_(Seq[Any](_display_(Seq[Any](/*5.13*/_password_reset_en(url,token,name)))))}}))))})))}
    }
    
    def render(url:String,token:String,name:String) = apply(url,token,name)
    
    def f:((String,String,String) => play.api.templates.Html) = (url,token,name) => apply(url,token,name)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Nov 01 18:37:15 CET 2012
                    SOURCE: /Users/fred/Downloads/joscha-play-authenticate-905bbcf/samples/java/play-authenticate-usage/app/views/account/email/password_reset.scala.html
                    HASH: 1ace983febab07faa802ecba4832ca8c8a785b54
                    MATRIX: 792->1|920->44|949->65|1000->79|1036->81|1058->95|1067->98|1087->110|1135->113|1181->149|1201->161|1249->164|1295->200|1312->209|1360->212
                    LINES: 27->1|30->1|30->1|30->1|31->2|31->2|31->3|31->3|31->3|31->4|31->4|31->4|31->5|31->5|31->5
                    -- GENERATED --
                */
            