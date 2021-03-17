package com.csw;

/**
 * function:
 *
 * @author ChEnSv
 * @create 2021/3/16 23:02
 */
@FunctionalInterface
public interface LambdaExpress {

    /**
     * 带参数跟返回值的方法
     */
    int method(int i,int j);

    /**
     * 静态方式实现
     */
    static int staticMethod(int i, int j){
        return i-j;
    }

    /**
     * 方法的默认实现
     */
    default int defaultMethod(int i,int j){
        return i + j;
    }

    /**
     * 没有参数跟返回值的方法
     */
    // void method();

}
class LambdaDemo{
    public static void main(String[] args) {
        /* 匿名内部类方式的接口实现
        LambdaExpress lambdaExpress = new LambdaExpress() {
            @Override
            public void method() {
                System.out.println("lambda express test");
            }
        };*/
        // lambda表达式的实现方式
        /*LambdaExpress lambdaExpress = () -> {
            System.out.println("lambda express test");
        };
        lambdaExpress.method();*/
        LambdaExpress lambdaExpress = (i,j) -> {
            System.out.println("lambda express test");
            return i * j;
        };
        System.out.println(lambdaExpress.method(1, 2));
        //方法的默认实现
        System.out.println(lambdaExpress.defaultMethod(1, 2));
        // 静态方法实现
        System.out.println(LambdaExpress.staticMethod(1, 2));
    }
}
