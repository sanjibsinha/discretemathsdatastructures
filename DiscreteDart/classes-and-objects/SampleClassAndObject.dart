void main(){

  var appOne = AppToDo("AppToDo One");
  var appTwo = AppToDo("AppToDo Two");
  var john = Person("John");
  var mac = Person("Mac");
  john.taskToDo = appOne;
  mac.taskToDo = appTwo;
  print("${john.name} gets ${john.taskToDo.name}.");
  print("${mac.name} gets ${mac.taskToDo.name}");
  /*
  John gets AppToDo One.
  Mac gets AppToDo Two
   */
  print("${john.name} is entering tasks.");
  john.taskToDo.task = "Going to market to get some vegetables";
  john.taskToDo.type = "Marketing";
  john.taskToDo.enterTask();
  // we presume that every task is important
  john.getTaskFinished(appOne);
  print("${mac.name} is entering tasks.");
  mac.taskToDo.task = "Going out with friends";
  mac.taskToDo.type = "Outing";
  mac.taskToDo.enterTask();
  // in some cases, the task may not be so important
  appTwo.isImportant = false;
  mac.getTaskFinished(appTwo);
}

class AppToDo{

  String name;
  String task;
  String type;
  bool isImportant = true;

  AppToDo(String name){
    this.name = name;
  }

  void enterTask(){
    print("I want to finish this task - ${task}. It belongs to this type - ${type}.");
  }
}

class Person{
  String name;
  AppToDo taskToDo;

  Person(String name){
    this.name = name;
  }

  void getTaskFinished(AppToDo taskToDo){
    this.taskToDo = taskToDo;
    if(taskToDo.isImportant){
      print("This task - ${taskToDo.task} is important, and need to be finished.");
    } else {
      print("It can be avoided, it is not so important");
    }
  }
}
/*
John gets AppToDo One.
Mac gets AppToDo Two
John is entering tasks.
I want to finish this task - Going to market to get some vegetables. It belongs to this type - Marketing.
This task - Going to market to get some vegetables is important, and need to be finished.
Mac is entering tasks.
I want to finish this task - Going out with friends. It belongs to this type - Outing.
It can be avoided, it is not so important
 */