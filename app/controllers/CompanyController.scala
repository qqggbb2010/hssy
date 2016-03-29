package controllers

import javax.inject._
import play.api._
import play.api.mvc._

/**
  * Created by Administrator on 2016/3/20.
  */
/**
  * This controller creates an `Action` to handle HTTP requests to the
  * application's home page.
  */
@Singleton
class CompanyController @Inject() extends Controller {

  /**
    * Create an Action to render an HTML page with a welcome message.
    * The configuration in the `routes` file means that this method
    * will be called when the application receives a `GET` request with
    * a path of `/`.
    */
  def comHistory = Action {
    Ok(views.html.comHistory())
  }

  def comBusiness = Action {
    Ok(views.html.comBusiness())
  }

  def comStructure = Action {
    Ok(views.html.comStructure())
  }

  def comGlory = Action {
    Ok(views.html.comGlory())
  }


  def comManagement = Action {
    Ok(views.html.comManagement())
  }

  def joinUs = Action {
    Ok(views.html.joinUs())
  }

  def communication = Action {
    Ok(views.html.communication())
  }

  def cooperation = Action {
    Ok(views.html.cooperation())
  }

  def adCooperation = Action {
    Ok(views.html.adCooperation())
  }



  def filmMaking = Action {
    Ok(views.html.filmMaking())
  }

}
