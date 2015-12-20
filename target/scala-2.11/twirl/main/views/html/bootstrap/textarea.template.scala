
package views.html.bootstrap

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object textarea_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class textarea extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template5[Field,String,String,String,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(field: Field, label: String = "", rows: String = "5", help: String = "", icon: String = ""):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import play.api.Play.current
import play.api.i18n.Messages.Implicits._

Seq[Any](format.raw/*1.94*/("""

"""),format.raw/*5.1*/(""" 
"""),format.raw/*6.1*/("""<div class="form-group has-feedback """),_display_(/*6.38*/if(field.hasErrors)/*6.57*/ {_display_(Seq[Any](format.raw/*6.59*/("""has-error""")))}),format.raw/*6.69*/("""">
    <label for=""""),_display_(/*7.18*/field/*7.23*/.id),format.raw/*7.26*/("""">"""),_display_(/*7.29*/label),format.raw/*7.34*/("""</label>
    <div>
        <textarea 
            rows=""""),_display_(/*10.20*/rows),format.raw/*10.24*/(""""
            class="form-control input-lg"
            id=""""),_display_(/*12.18*/field/*12.23*/.id),format.raw/*12.26*/(""""
            name=""""),_display_(/*13.20*/field/*13.25*/.name),format.raw/*13.30*/(""""
            placeholder=""""),_display_(/*14.27*/label),format.raw/*14.32*/("""">"""),_display_(/*14.35*/field/*14.40*/.value.getOrElse(" ")),format.raw/*14.61*/(""" """),format.raw/*14.62*/("""dssadsa </textarea>
        <span class="ion-"""),_display_(/*15.27*/icon),format.raw/*15.31*/(""" """),format.raw/*15.32*/("""form-control-feedback"></span>
        <span class="help-block">"""),_display_(/*16.35*/help),format.raw/*16.39*/("""</span>
        <span class="help-block">"""),_display_(/*17.35*/{field.error.map { error => Messages(error.message) }}),format.raw/*17.89*/("""</span>
    </div>
</div>"""))
      }
    }
  }

  def render(field:Field,label:String,rows:String,help:String,icon:String): play.twirl.api.HtmlFormat.Appendable = apply(field,label,rows,help,icon)

  def f:((Field,String,String,String,String) => play.twirl.api.HtmlFormat.Appendable) = (field,label,rows,help,icon) => apply(field,label,rows,help,icon)

  def ref: this.type = this

}


}

/**/
object textarea extends textarea_Scope0.textarea
              /*
                  -- GENERATED --
                  DATE: Sun Dec 20 23:29:08 CET 2015
                  SOURCE: /home/ggx/projects/messy/app/views/bootstrap/textarea.scala.html
                  HASH: 5aba9d9f0c8dbdd533f48e564bf9de5d7eed0388
                  MATRIX: 570->1|827->93|855->168|883->170|946->207|973->226|1012->228|1052->238|1098->258|1111->263|1134->266|1163->269|1188->274|1272->331|1297->335|1385->396|1399->401|1423->404|1471->425|1485->430|1511->435|1566->463|1592->468|1622->471|1636->476|1678->497|1707->498|1780->544|1805->548|1834->549|1926->614|1951->618|2020->660|2095->714
                  LINES: 20->1|26->1|28->5|29->6|29->6|29->6|29->6|29->6|30->7|30->7|30->7|30->7|30->7|33->10|33->10|35->12|35->12|35->12|36->13|36->13|36->13|37->14|37->14|37->14|37->14|37->14|37->14|38->15|38->15|38->15|39->16|39->16|40->17|40->17
                  -- GENERATED --
              */
          