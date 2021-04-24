package xiangmu;

import java.util.Scanner;

/**
 * @author xujinwei
 * @date 2021/3/27 21:52
 */
public class demo01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String xuanze = "";
        String name = "";
        String password = "";

        int max = 9999;
        int min = 1000;
        int cardNumber = (int)(Math.random()*(max-min))+min;
        do {
            System.out.println("*****欢迎进入奖客富翁系统*****");
            System.out.println("\t\t\t1.注册");
            System.out.println("\t\t\t2.登录");
            System.out.println("\t\t\t3.抽奖");
            System.out.println("**************************");
            System.out.println("请输入菜单:");
            int bianHao = scanner.nextInt();
            switch (bianHao) {
                case 1:
                    System.out.println("[奖客富翁系统 > 注册]");
                    System.out.println("继续吗？（y/n）");
                    xuanze = scanner.next();
                    if ("n".equals(xuanze)) {
                        break;
                    }

                    System.out.println("请填写个人注册信息:");
                    System.out.println("用户名:");
                    name = scanner.next();
                    System.out.println("密码:");
                    password = scanner.next();
                    System.out.println("注册成功，请记好您的会员卡号");
                    System.out.println("用户名\t\t\t 密码\t\t\t会员卡号");
                    System.out.println(name+"\t\t\t"+password+"\t\t\t"+cardNumber);
                    System.out.println("继续吗？（y/n）");
                    xuanze = scanner.next();
                    if("n".equals(xuanze)){
                        break;
                    }


                    break;
                case 2:
                    System.out.println("[奖客富翁系统 > 登录]");
                    for(int i=3;i>0;i--){
                        System.out.println("请输入用户名:");
                        String usName = scanner.next();
                        System.out.println("请输入密码:");
                        String usPassword = scanner.next();
                        if(usName.equals(name) && usPassword.equals(password)){
                            System.out.println("欢迎您:"+name);
                            break;
                        }else{
                            System.out.println("用户名或密码错误！今日剩余次数:"+(i-1));
                        }
                    }

                    break;
                case 3:
                    System.out.println("[奖客富翁系统 > 抽奖]");
                    System.out.println("请输入您的卡号:");
                    int card = scanner.nextInt();

                    break;
                default:
                    System.out.println("您的输入有误");
                    break;
            }
        } while ("y".equals(xuanze));
        System.out.println("系统退出");
    }
}
