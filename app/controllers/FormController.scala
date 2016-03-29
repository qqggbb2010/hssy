package controllers

import javax.inject._
import play.api._
import play.api.mvc._
import models.Message
import play.api.Play.current
import play.api.i18n.Messages.Implicits._
/**
  * Created by Administrator on 2016/3/18.
  */
class FormController @Inject() extends Controller {
  //显示留言列表和发言表单
  def m = Action {
    println( "mmmmmmm " )
    Ok(views.html.msgboard(Message.list, Message.form))
  }

  //处理发言
  def postMsg = Action {
    implicit request =>
      Message.form.bindFromRequest.fold(
        //处理错误
        errors => BadRequest(views.html.msgboard(Message.list, errors)), {
          case (name, content) =>
            //发言
            Message.post(name, content)
            //重新定向到显示留言列表和发言表单页面
            Redirect(routes.FormController.m)
        }
      )
  }


    def name = Action{

      Ok(views.html.index("aaa"))
    }
}
