public class welcome {


    public static void main(String[] args) {
        // main
        //快捷打印 sout

        System.out.println("你好吗,dx");
        Student student = new Student();
        System.out.println(student.age);
//        student.age = 18;
        student.setAge(18);
        System.out.println(student.age);
    }
    //方法定义格式:
    //  修饰符[可多个]+返回值+方法名+(方法参数[可选])+{}
    static public int test(String a){

        return 1;
    }

    static class Student{
        private int age = 22;

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }

}
