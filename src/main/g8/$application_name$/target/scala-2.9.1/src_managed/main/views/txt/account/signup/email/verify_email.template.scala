
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
object verify_email extends BaseScalaTemplate[play.api.templates.Txt,Format[play.api.templates.Txt]](play.api.templates.TxtFormat) with play.api.templates.Template3[String,String,String,play.api.templates.Txt] {

    /**/
    def apply/*1.2*/(verificationUrl: String, token: String, name: String):play.api.templates.Txt = {
        _display_ {

Seq[Any](_display_(Seq[Any](/*1.57*/defining(lang().code)/*1.78*/ { langcode =>_display_(Seq[Any](format.raw/*1.92*/("""
"""),_display_(Seq[Any](/*2.2*/langcode match/*2.16*/ {/*3.1*/case "de" =>/*3.13*/ {_display_(Seq[Any](_display_(Seq[Any](/*3.16*/_verify_email_de(verificationUrl,token,name)))))}/*4.1*/case "pl" =>/*4.13*/ {_display_(Seq[Any](_display_(Seq[Any](/*4.16*/_verify_email_pl(verificationUrl,token,name)))))}/*5.1*/case _ =>/*5.10*/ {_display_(Seq[Any](_display_(Seq[Any](/*5.13*/_verify_email_en(verificationUrl,token,name)))))}}))))})))}
    }
    
    def render(verificationUrl:String,token:String,name:String) = apply(verificationUrl,token,name)
    
    def f:((String,String,String) => play.api.templates.Txt) = (verificationUrl,token,name) => apply(verificationUrl,token,name)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Nov 01 18:37:16 CET 2012
                    SOURCE: /Users/fred/Downloads/joscha-play-authenticate-905bbcf/samples/java/play-authenticate-usage/app/views/account/signup/email/verify_email.scala.txt
                    HASH: 518a08bca545904abfa0ed3b6dbd2ec03bc7c77f
                    MATRIX: 791->1|930->56|959->77|1010->91|1046->93|1068->107|1077->110|1097->122|1145->125|1201->171|1221->183|1269->186|1325->232|1342->241|1390->244
                    LINES: 27->1|30->1|30->1|30->1|31->2|31->2|31->3|31->3|31->3|31->4|31->4|31->4|31->5|31->5|31->5
                    -- GENERATED --
                */
            