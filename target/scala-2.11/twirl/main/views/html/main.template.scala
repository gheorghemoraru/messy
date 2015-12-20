
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object main_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class main extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.32*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>

<html>
    <head>
        <title>"""),_display_(/*7.17*/title),format.raw/*7.22*/("""</title>
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*8.59*/routes/*8.65*/.Assets.versioned("images/favicon.png")),format.raw/*8.104*/(""""/>
        <link rel="stylesheet" href=""""),_display_(/*9.39*/routes/*9.45*/.Assets.versioned("stylesheets/main.css")),format.raw/*9.86*/(""""/>
        <link rel="stylesheet" href=""""),_display_(/*10.39*/routes/*10.45*/.Assets.versioned("stylesheets/bootstrap.min.css")),format.raw/*10.95*/(""""/>
        <script src=""""),_display_(/*11.23*/routes/*11.29*/.Assets.versioned("javascripts/jquery-1.11.3.min.js")),format.raw/*11.82*/("""" type="text/javascript"></script>
        <style>
            /* Remove the navbar's default margin-bottom and rounded borders */ 
            .navbar """),format.raw/*14.21*/("""{"""),format.raw/*14.22*/("""
              """),format.raw/*15.15*/("""margin-bottom: 0;
              border-radius: 0;
            """),format.raw/*17.13*/("""}"""),format.raw/*17.14*/("""
            

            """),format.raw/*20.13*/("""/* Set gray background color and 100% height */
            .sidenav """),format.raw/*21.22*/("""{"""),format.raw/*21.23*/("""
              """),format.raw/*22.15*/("""padding-top: 20px;
              background-color: #f1f1f1;
              height: 100%;
            """),format.raw/*25.13*/("""}"""),format.raw/*25.14*/("""
            
            """),format.raw/*27.13*/("""/* Set black background color, white text and some padding */
            footer """),format.raw/*28.20*/("""{"""),format.raw/*28.21*/("""
              """),format.raw/*29.15*/("""margin-top: 10px;
              background-color: #555;
              color: white;
              padding: 15px;
            """),format.raw/*33.13*/("""}"""),format.raw/*33.14*/("""

        """),format.raw/*35.9*/("""</style>
    </head>
    <body>
        <nav class="navbar navbar-inverse">
          <div class="container-fluid">
            <div class="navbar-header">
              <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>                        
              </button>
              <a class="navbar-brand" href="#">Logo</a>
            </div>
            <div class="collapse navbar-collapse" id="myNavbar">
              <ul class="nav navbar-nav">
                <li class="active"><a href="#">Messaging</a></li>
                <li><a href="#">Discover</a></li>
              </ul>
              <ul class="nav navbar-nav navbar-right">
                <li><a href="#"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
              </ul>
            </div>
          </div>
        </nav>
        <div class="container-fluid text-center">    
          <div class="row content">
            <div class="col-sm-2 sidenav">
              <p><a href="#">TODO</a></p>
            </div>
            <div class="col-sm-8 text-left"> 
                """),_display_(/*65.18*/content),format.raw/*65.25*/("""
            """),format.raw/*66.13*/("""</div>
            <div class="col-sm-2 sidenav">
              <div class="well">
                <p>TODO</p>
              </div>
            </div>
          </div>
        </div>
        
        <footer class="container-fluid text-center">
          <p>Footer Text</p>
        </footer>
    </body>
</html>
"""))
      }
    }
  }

  def render(title:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)

  def ref: this.type = this

}


}

/**/
object main extends main_Scope0.main
              /*
                  -- GENERATED --
                  DATE: Sun Dec 20 23:29:08 CET 2015
                  SOURCE: /home/ggx/projects/messy/app/views/main.scala.html
                  HASH: da91024b9678d3f3fb7819ef399699017a1005ae
                  MATRIX: 530->1|655->31|683->33|760->84|785->89|878->156|892->162|952->201|1020->243|1034->249|1095->290|1164->332|1179->338|1250->388|1303->414|1318->420|1392->473|1572->625|1601->626|1644->641|1734->703|1763->704|1818->731|1915->800|1944->801|1987->816|2115->916|2144->917|2198->943|2307->1024|2336->1025|2379->1040|2532->1165|2561->1166|2598->1176|3873->2424|3901->2431|3942->2444
                  LINES: 20->1|25->1|27->3|31->7|31->7|32->8|32->8|32->8|33->9|33->9|33->9|34->10|34->10|34->10|35->11|35->11|35->11|38->14|38->14|39->15|41->17|41->17|44->20|45->21|45->21|46->22|49->25|49->25|51->27|52->28|52->28|53->29|57->33|57->33|59->35|89->65|89->65|90->66
                  -- GENERATED --
              */
          