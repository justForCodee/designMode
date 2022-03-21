package principles.open_closedPrinciples.demo;

/**
 * @ClassName: Garden
 * @date: 2022/3/21 23:06
 * @author: chenrui
 * @Description: TODO
 * @Version: 1.0
 */
public class Garden {
    private AbstractClass abstractClass;

    public void setAbstractClass(AbstractClass abstractClass) {
        this.abstractClass = abstractClass;
    }

    public void play() {
        abstractClass.play();
    }
}
