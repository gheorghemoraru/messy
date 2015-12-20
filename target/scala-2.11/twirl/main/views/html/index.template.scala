
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object index_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[Form[CreateMessageForm],Messages,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message: Form[CreateMessageForm])(implicit messages: Messages):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import helper._
import views.html.bootstrap._

Seq[Any](format.raw/*1.65*/("""

"""),format.raw/*5.1*/("""
"""),_display_(/*6.2*/main("Welcome to Play")/*6.25*/ {_display_(Seq[Any](format.raw/*6.27*/("""
	"""),format.raw/*7.2*/("""<script type='text/javascript' src='"""),_display_(/*7.39*/routes/*7.45*/.Assets.versioned("javascripts/index.js")),format.raw/*7.86*/("""'></script>

	<ul id="messages"></ul>

  """),_display_(/*11.4*/form(routes.MessageController.addMessage())/*11.47*/ {_display_(Seq[Any](format.raw/*11.49*/("""
  
        """),format.raw/*13.9*/("""<div class="form-group">
		    """),_display_(/*14.8*/text(message("name"), "Name")),format.raw/*14.37*/("""
		"""),format.raw/*15.3*/("""</div>
		<div class="form-group">
		    """),_display_(/*17.8*/textareab(message("body"), "Message")),format.raw/*17.45*/("""
		"""),format.raw/*18.3*/("""</div>
   


		<button type="submit" class="btn btn-primary">Submit</button>
	""")))}),format.raw/*23.3*/("""
""")))}))
      }
    }
  }

  def render(message:Form[CreateMessageForm],messages:Messages): play.twirl.api.HtmlFormat.Appendable = apply(message)(messages)

  def f:((Form[CreateMessageForm]) => (Messages) => play.twirl.api.HtmlFormat.Appendable) = (message) => (messages) => apply(message)(messages)

  def ref: this.type = this

}


}

/**/
object index extends index_Scope0.index
              /*
                  -- GENERATED --
                  DATE: Sun Dec 20 23:29:08 CET 2015
                  SOURCE: /home/ggx/projects/messy/app/views/index.scala.html
                  HASH: 9c2c1a1f96316a19cf4459267a465e30cbacbcb9
                  MATRIX: 553->1|756->64|784->114|811->116|842->139|881->141|909->143|972->180|986->186|1047->227|1115->269|1167->312|1207->314|1246->326|1304->358|1354->387|1384->390|1451->431|1509->468|1539->471|1648->550
                  LINES: 20->1|26->1|28->5|29->6|29->6|29->6|30->7|30->7|30->7|30->7|34->11|34->11|34->11|36->13|37->14|37->14|38->15|40->17|40->17|41->18|46->23
                  -- GENERATED --
              */
          