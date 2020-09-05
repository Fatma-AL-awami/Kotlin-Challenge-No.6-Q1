
fun main() {
    val obj_web=WebDeveloper("Fatma AL_Awami",25,100.000);
    obj_web.website();
    val obj_androidDev=androidDeveloper("Noor ALhuda",26,300.000);
    obj_androidDev.addroid();
    val obj_iOSDev=iOSDeveloper("Nada Ali",21,250.000);
    obj_iOSDev.iosapp();

}

abstract class Employee
{
   abstract var name:String
   abstract var age:Int

  abstract  fun name()
  abstract  fun age()
  abstract fun salary()

}
class WebDeveloper( override var name: String,  override var age: Int,var salary:Double) : Employee()
{
    init{
        name() ;  age(); salary();
    }

    override fun name() { print("Name = $name  << ")}
    override fun age() {  print("Age = $age  << ")}
    override fun salary() {  print("Salary = $salary   ...")}

    fun website(){ println("This is a web Developer employee")}

}


class androidDeveloper(override var name: String,  override var age: Int, var salary:Double): Employee()
{
    init{
        name() ; age(); salary();
    }
    override fun name() {print("Name = $name  << ") }
    override fun age() {print("Age = $age  << ") }
    override fun salary() { print("Salary = $salary   ...") }
    fun addroid(){println("This is a android Developer employee") }


}
class iOSDeveloper(override var name: String, override var age: Int, var salary:Double) : Employee() {

    init {
        name() ; age(); salary();
    }
    override fun name() {print("Name = $name  << ") }
    override fun age() {print("Age = $age  << ") }
    override fun salary() { print("Salary = $salary  ... ") }
    fun iosapp() {println("This is a  iOS Developer employee") }
}
