package principles.open_closedPrinciples.demo;

/**
 * @ClassName: ChildrenClass
 * @date: 2022/3/21 23:05
 * @author: chenrui
 * @Description: 子类实现1
 * @Version: 1.0
 */
public class ChildrenClass extends AbstractClass{
    @Override
    public void play() {
        System.out.printf("子类实现1");
    }
}
