public class Object01
{
	public static void main(String[] args) 
	{
	/* ʹ��OOP(Object oriented programming)�������ķ�ʽ�������è����
	����ʵ����һֻè��Ҳ�д���һֻè����
	�����
	1. ��new Cat()����һֻè
	2. Cat cat1 = new cat(); �Ѵ�����è����cat1*/
		Cat cat1 = new Cat();
		cat1.name = "С��";
		cat1.age = 3;
		cat1.color = "��ɫ";
		cat1.weight = 10;

		// �����ڶ�֧è������cat2
		// cat2Ҳ��һ��è����
		Cat cat2 = new Cat();
		cat2.name = "С��";
		cat2.age = 5;
		cat2.color = "��ɫ";
		cat2.weight = 15;

		//��ô���ʶ����������
		System.out.println("��1ֻè��Ϣ:" + cat1.name + " " 
			+ cat1.age + " " 
			+ cat1.color + " " + cat1.weight);

		System.out.println("��2ֻè��Ϣ:" + cat2.name + " " 
			+ cat2.age + " " 
			+ cat2.color + " " + cat2.weight);

	}
}

// ʹ���������ķ�ʽ�������è����
// ����һ��è�� Cat���Զ������������
class Cat 
//è������(����Ҳ�г�Ա����)������ ���� ��ɫ ����
	{
		String name;
		int age;
		String color;
		double weight;
	}