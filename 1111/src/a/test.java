package a;
/**@文件名: test.java
 * @类功能说明: 
 * @作者: HeGuangYao
 * @Email: 105302097@qq.com
 * @日期: 2019年11月11日下午5:52:44
 * @修改说明:<br> 
 * <pre>
 * 	 <li>作者: HeGuangYao</li> 
 * 	 <li>日期: 2019年11月11日下午5:52:44</li> 
 *	 <li>内容: </li>
 * </pre>
 */
public class test {

	public static void main(String[] args) {
		System.out.println(sum(100));
	}
	public static int sum(int i) {
	int sum=0;
	if (i == 1) {
	return 1;
	}else {
	sum = i + sum(i - 1);
	}
	return sum;
	}
}
