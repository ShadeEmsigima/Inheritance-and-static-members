public class LoneClass implements IMyInterface{
    @Override
    public void whine() {
        System.out.println("I was forced to override IMyInterface's parent's method :(");
    }
}
