import java.io.*;
class Dog implements Serializable
{
transient int i=10;
int j=20;
}
class Cat implements Serializable
{
int i=30;
int j=40;
}
class Rat implements Serializable
{
int i=50;
int j=60;
}

class SerializeDemo
{
public static void main(String args[])throws Exception
{
Dog d1=new Dog();
Cat c1=new Cat();
Rat r1=new Rat();
FileOutputStream fos=new FileOutputStream("ab.ser");
ObjectOutputStream oos=new ObjectOutputStream(fos);
oos.writeObject(d1);
oos.writeObject(c1);
oos.writeObject(r1);

FileInputStream fis=new FileInputStream("ab.ser");
ObjectInputStream ois=new ObjectInputStream(fis);
Dog d2=(Dog)ois.readObject();
Cat c2=(Cat)ois.readObject();
Rat r2=(Rat)ois.readObject();

System.out.println(d2.i);
System.out.println(d2.j);
System.out.println(c2.i);
System.out.println(c2.j);
System.out.println(r2.i);
System.out.println(r2.j);
}
}

