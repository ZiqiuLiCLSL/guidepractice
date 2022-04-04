import java.util.Scanner;
public class SeqSearch
{
	public static void main(String[] args) 
	{
		Scanner myScanner = new Scanner(System.in);
		String colors[] = {"red", "blue", "pink", "yellow", "green"};
		int len = colors.length;

		System.out.println("Plz enter the color you want to find:");
		String yourColor = myScanner.nextLine();
		for(int i = 0; i < len; i++)
		{
			if(colors[i].equals(yourColor))
			{
				System.out.println("We found it! Its index number is: " + i);
			}
			else
			{
				if(i == len - 1)
				{
					System.out.println("We dont find it");
				}
			}

			/*关于如果在遍历了array后没有找到输入的值怎么办：
			老师的写法见doc中的截图*/
		}


	}
}