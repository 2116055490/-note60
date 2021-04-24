package xiangmu;

/**
 * @author xujinwei
 * @date 2021/3/30 20:16
 */
public class demo001 {
    public static void main(String[] args) {
        Student laLaLa = new Student();
        //属性的赋值
        laLaLa.name = "啦啦啦";
        laLaLa.age = 18;
        laLaLa.set = '男';
        laLaLa.high = 188.88;
        laLaLa.height = 88.88;

        //属性的调用
        System.out.println(laLaLa.name);
        System.out.println(laLaLa.age);
        System.out.println(laLaLa.set);
        System.out.println(laLaLa.high);
        System.out.println(laLaLa.height);

        //方法的调用
        laLaLa.eat();
        laLaLa.play();
        laLaLa.sleep();

    }
}
