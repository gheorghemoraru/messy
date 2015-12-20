
package views.html.bootstrap

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object text_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class text extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template4[Field,String,String,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(field: Field, label: String = "", help: String = "", icon: String = ""):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import play.api.Play.current
import play.api.i18n.Messages.Implicits._

Seq[Any](format.raw/*1.74*/("""

"""),format.raw/*5.1*/(""" 
"""),format.raw/*6.1*/("""<div class="form-group has-feedback """),_display_(/*6.38*/if(field.hasErrors)/*6.57*/ {_display_(Seq[Any](format.raw/*6.59*/("""has-error""")))}),format.raw/*6.69*/("""">
    <label for=""""),_display_(/*7.18*/field/*7.23*/.id),format.raw/*7.26*/("""">"""),_display_(/*7.29*/label),format.raw/*7.34*/("""</label>
    <div>
        <input type="text"
            class="form-control input-lg"
            id=""""),_display_(/*11.18*/field/*11.23*/.id),format.raw/*11.26*/(""""
            name=""""),_display_(/*12.20*/field/*12.25*/.name),format.raw/*12.30*/(""""
            value=""""),_display_(/*13.21*/field/*13.26*/.value.getOrElse("")),format.raw/*13.46*/(""""
            placeholder=""""),_display_(/*14.27*/label),format.raw/*14.32*/("""" />
        <span class="ion-"""),_display_(/*15.27*/icon),format.raw/*15.31*/(""" """),format.raw/*15.32*/("""form-control-feedback"></span>
        <span class="help-block">"""),_display_(/*16.35*/help),format.raw/*16.39*/("""</span>
        <span class="help-block">"""),_display_(/*17.35*/{field.error.map { error => Messages(error.message) }}),format.raw/*17.89*/("""</span>
    </div>
</div>"""))
      }
    }
  }

  def render(field:Field,label:String,help:String,icon:String): play.twirl.api.HtmlFormat.Appendable = apply(field,label,help,icon)

  def f:((Field,String,String,String) => play.twirl.api.HtmlFormat.Appendable) = (field,label,help,icon) => apply(field,label,help,icon)

  def ref: this.type = this

}


}

/**/
object text extends text_Scope0.text
              /*
                  -- GENERATED --
                  DATE: Sun Dec 20 23:29:08 CET 2015
                  SOURCE: /home/ggx/projects/messy/app/views/bootstrap/text.scala.html
                  HASH: fabf4c073a845c97e71f097b7e3ca5148974e57d
                  MATRIX: 555->1|792->73|820->148|848->150|911->187|938->206|977->208|1017->218|1063->238|1076->243|1099->246|1128->249|1153->254|1285->359|1299->364|1323->367|1371->388|1385->393|1411->398|1460->420|1474->425|1515->445|1570->473|1596->478|1654->509|1679->513|1708->514|1800->579|1825->583|1894->625|1969->679
                  LINES: 20->1|26->1|28->5|29->6|29->6|29->6|29->6|29->6|30->7|30->7|30->7|30->7|30->7|34->11|34->11|34->11|35->12|35->12|35->12|36->13|36->13|36->13|37->14|37->14|38->15|38->15|38->15|39->16|39->16|40->17|40->17
                  -- GENERATED --
              */
          