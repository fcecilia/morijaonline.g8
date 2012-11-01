
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
object verify_email extends BaseScalaTemplate[play.api.templates.Txt,Format[play.api.templates.Txt]](play.api.templates.TxtFormat) with play.api.templates.Template4[String,String,String,String,play.api.templates.Txt] {

    /**/
    def apply/*1.2*/(verificationUrl: String, token: String, name: String, email: String):play.api.templates.Txt = {
        _display_ {

Seq[Any](_display_(Seq[Any](/*1.72*/defining(lang().code)/*1.93*/ { langcode =>_display_(Seq[Any](format.raw/*1.107*/("""
"""),_display_(Seq[Any](/*2.2*/langcode match/*2.16*/ {/*3.1*/case "de" =>/*3.13*/ {_display_(Seq[Any](_display_(Seq[Any](/*3.16*/_verify_email_de(verificationUrl,token,name,email)))))}/*4.1*/case "pl" =>/*4.13*/ {_display_(Seq[Any](_display_(Seq[Any](/*4.16*/_verify_email_pl(verificationUrl,token,name,email)))))}/*5.1*/case _ =>/*5.10*/ {_display_(Seq[Any](_display_(Seq[Any](/*5.13*/_verify_email_en(verificationUrl,token,name,email)))))}}))))})))}
    }
    
    def render(verificationUrl:String,token:String,name:String,email:String) = apply(verificationUrl,token,name,email)
    
    def f:((String,String,String,String) => play.api.templates.Txt) = (verificationUrl,token,name,email) => apply(verificationUrl,token,name,email)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Nov 01 18:37:15 CET 2012
                    SOURCE: /Users/fred/Downloads/joscha-play-authenticate-905bbcf/samples/java/play-authenticate-usage/app/views/account/email/verify_email.scala.txt
                    HASH: 57d040006e931736501afb28c1580fd513271c07
                    MATRIX: 791->1|945->71|974->92|1026->106|1062->108|1084->122|1093->125|1113->137|1161->140|1223->192|1243->204|1291->207|1353->259|1370->268|1418->271
                    LINES: 27->1|30->1|30->1|30->1|31->2|31->2|31->3|31->3|31->3|31->4|31->4|31->4|31->5|31->5|31->5
                    -- GENERATED --
                */
            