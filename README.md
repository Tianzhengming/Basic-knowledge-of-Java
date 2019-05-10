# Basic-knowledge-of-Java
## 1.java反射机制
  ### java的反射机制分为以下几个部分进行介绍：
    1）java反射机制的概述跟应用场景；
    2）java反射机制的细节与Class对象；
    3）java反射机制中获取Class对象的三种方式；
    4）java反射机制中获取Class中的构造函数；
    5）java反射机制中获取Class中的字段；
    6）java反射机制中获取Class中的方法；
    7）java反射机制的练习。
    
  java反射机制的概述与应用场景：  
  概述：java的放射机制是在运行状态中对于任意一个类都能知道这个类的属性跟方法；对于任意一个对象都能调用他的任意一个方法和属性；这种动态获取的信息及  动态调用对象的方法的功能称为java语言的反射机制。通俗点讲：就是动态获取类中的信息，就是java的反射，可以理解为对类的解剖。  
  应用场景：如果想要对指定名称的字节码文件进行加载并获取其中的内容并调用，怎么可以实现呢？这个时候就用到了java的反射机制。例如：tomcat提供了处理请  求与应答的方式。因为具体的处理动作不同，所以对外提供了接口，由开发者来实现具体请求和应答处理。  
  开发者写了一个servlet实现了Servlet接口在其中定义了处理请求跟应答的方式。但是tomact服务器如何使用你实现的servlet呢？此时就可以直接在tomcat  
  的web.xml文件中写入实现的servlet的类路径，此时只要tomcat一启动，开发者定义的servlet就直接启动运行了。此时用到的就是java的反射机制，tomact服务  器就通过类路径获得开发者定义的servlet类的字节码文件，就可以直接使用开发者定义的servlet类中的字段跟方法了。  
  
  java反射机制的细节与Class对象：    
  在java程序中基本上是万物皆对象，对于类也是一样，所有的类都有一个共性：都有l类名称、字段、方法、构造函数，因此，我们也可以将其向上抽取，抽取为一个   Class类为class Class{类的名称；字段；构造函数；一般函数；}。想要对一个类文件进行解剖，只要获取到该类的字节码文件对象即可。  
  
  java反射机制中获取Class对象的三种方式：  
  如果想要对一个类文件进行解剖，必须要有字节码文件对象，任何数据类型都具备一个静态的属性。获取字节码文件对象的方式有以下三种：  
  方式一：  
  public static void getClassObject1(){
    Person p=new Person();
    Class clazz=p.getClass();
  }
  、、、
  缺点：想要用这种方式，必须要明确具体的类，并非创建对象。
  方式二：  
  public static void getClassObject2(){
    Class clazz=Person.class;
  }
  、、、
  缺点：相对简单，但是还是要明确类名，不够扩展。  
  方式三：  
  public static void getClassObject3(){
    String className="Person";//类名称一定要带包名
    Class clazz=Class.forName(className);
  }
  、、、
  
    
