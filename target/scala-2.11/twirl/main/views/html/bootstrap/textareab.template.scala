
package views.html.bootstrap

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object textareab_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class textareab extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template5[Field,String,String,String,String,play.twirl.api.HtmlFormat.Appendable] {

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
            placeholder=""""),_display_(/*14.27*/label),format.raw/*14.32*/("""">"""),_display_(/*14.35*/field/*14.40*/.value.getOrElse("")),format.raw/*14.60*/("""</textarea>
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
object textareab extends textareab_Scope0.textareab
              /*
                  -- GENERATED --
                  DATE: Sun Dec 20 23:29:08 CET 2015
                  SOURCE: /home/ggx/projects/messy/app/views/bootstrap/textareab.scala.html
                  HASH: 7abb255f4d04de8ca97ca1295218300dba937042
                  MATRIX: 572->1|829->93|857->168|885->170|948->207|975->226|1014->228|1054->238|1100->258|1113->263|1136->266|1165->269|1190->274|1274->331|1299->335|1387->396|1401->401|1425->404|1473->425|1487->430|1513->435|1568->463|1594->468|1624->471|1638->476|1679->496|1744->534|1769->538|1798->539|1890->604|1915->608|1984->650|2059->704
                  LINES: 20->1|26->1|28->5|29->6|29->6|29->6|29->6|29->6|30->7|30->7|30->7|30->7|30->7|33->10|33->10|35->12|35->12|35->12|36->13|36->13|36->13|37->14|37->14|37->14|37->14|37->14|38->15|38->15|38->15|39->16|39->16|40->17|40->17
                  -- GENERATED --
              */
          