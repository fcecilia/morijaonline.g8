
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
object verify_email extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template4[String,String,String,String,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(verificationUrl: String, token: String, name: String, email: String):play.api.templates.Html = {
        _display_ {

Seq[Any](_display_(Seq[Any](/*1.72*/defining(lang().code)/*1.93*/ { langcode =>_display_(Seq[Any](format.raw/*1.107*/("""
"""),_display_(Seq[Any](/*2.2*/langcode match/*2.16*/ {/*3.1*/case "de" =>/*3.13*/ {_display_(Seq[Any](_display_(Seq[Any](/*3.16*/_verify_email_de(verificationUrl,token,name,email)))))}/*4.1*/case "pl" =>/*4.13*/ {_display_(Seq[Any](_display_(Seq[Any](/*4.16*/_verify_email_pl(verificationUrl,token,name,email)))))}/*5.1*/case _ =>/*5.10*/ {_display_(Seq[Any](_display_(Seq[Any](/*5.13*/_verify_email_en(verificationUrl,token,name,email)))))}}))))})))}
    }
    
    def render(verificationUrl:String,token:String,name:String,email:String) = apply(verificationUrl,token,name,email)
    
    def f:((String,String,String,String) => play.api.templates.Html) = (verificationUrl,token,name,email) => apply(verificationUrl,token,name,email)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Nov 01 18:37:15 CET 2012
                    SOURCE: /Users/fred/Downloads/joscha-play-authenticate-905bbcf/samples/java/play-authenticate-usage/app/views/account/email/verify_email.scala.html
                    HASH: 57d040006e931736501afb28c1580fd513271c07
                    MATRIX: 797->1|952->71|981->92|1033->106|1069->108|1091->122|1100->125|1120->137|1168->140|1230->192|1250->204|1298->207|1360->259|1377->268|1425->271
                    LINES: 27->1|30->1|30->1|30->1|31->2|31->2|31->3|31->3|31->3|31->4|31->4|31->4|31->5|31->5|31->5
                    -- GENERATED --
                */
            