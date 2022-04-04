public class Object01
{
	public static void main(String[] args) 
	{
	/* 使用OOP(Object oriented programming)面向对象的方式来解决养猫问题
	首先实例化一只猫，也叫创建一只猫对象
	解读：
	1. 用new Cat()创建一只猫
	2. Cat cat1 = new cat(); 把创建的猫赋给cat1*/
		Cat cat1 = new Cat();
		cat1.name = "小白";
		cat1.age = 3;
		cat1.color = "白色";
		cat1.weight = 10;

		// 创建第二支猫并赋给cat2
		// cat2也是一个猫对象
		Cat cat2 = new Cat();
		cat2.name = "小花";
		cat2.age = 5;
		cat2.color = "花色";
		cat2.weight = 15;

		//怎么访问对象的属性呢
		System.out.println("第1只猫信息:" + cat1.name + " " 
			+ cat1.age + " " 
			+ cat1.color + " " + cat1.weight);

		System.out.println("第2只猫信息:" + cat2.name + " " 
			+ cat2.age + " " 
			+ cat2.color + " " + cat2.weight);

	}
}

// 使用面向对象的方式来解决养猫问题
// 定义一个猫类 Cat：自定义的数据类型
class Cat 
//猫的属性(属性也叫成员变量)有名字 年龄 颜色 体重
	{
		String name;
		int age;
		String color;
		double weight;
	}