
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/ggx/projects/messy/conf/routes
// @DATE:Sun Dec 20 23:24:11 CET 2015

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseMessageController MessageController = new controllers.ReverseMessageController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseAssets Assets = new controllers.ReverseAssets(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseMessageController MessageController = new controllers.javascript.ReverseMessageController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseAssets Assets = new controllers.javascript.ReverseAssets(RoutesPrefix.byNamePrefix());
  }

}
