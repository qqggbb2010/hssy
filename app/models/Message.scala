package models
import play.api._
import play.api.data._
import play.api.data.Forms._

//每条留言的数据模型：包括两个字符串，分别存储名字和内容
case class Message(name: String, content: String)

//全部留言的数据操作
object Message {

  //用于存储全部留言的列表
  var list: List[Message] = Nil

  //将留言追加在用于存储全部留言的列表前面
  def post(name: String, content: String) {
    list :::=  List(Message(name, content))

  }

  //定义表单及其校验要求，nonEmptyText表示该项内容不得为空
  val form = Form(tuple(
    "name" -> nonEmptyText,
    "content" -> nonEmptyText
  ))



}