
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/maithili/Desktop/final-ob/ms-mongodb/conf/app.routes
// @DATE:Tue May 10 19:27:30 BST 2016

package controllers;

import app.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseAssets Assets = new controllers.ReverseAssets(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseMongoService MongoService = new controllers.ReverseMongoService(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseAssets Assets = new controllers.javascript.ReverseAssets(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseMongoService MongoService = new controllers.javascript.ReverseMongoService(RoutesPrefix.byNamePrefix());
  }

}
