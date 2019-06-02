public class Pair<One,Two> {
private One one;
private Two two;

    public Pair(One one, Two two) {
        this.one = one;
        this.two = two;
    }

    public One getOne() {
        return one;
    }

    public void setOne(One one) {
        this.one = one;
    }

    public Two getTwo() {
        return two;
    }

    public void setTwo(Two two) {
        this.two = two;
    }

    @Override
    public String toString() {
       String ret= "Class Pair\n"+"first type: " + one.getClass().getSimpleName() +
               '='+one+"\nsecond type: " + two.getClass().getSimpleName() +'='+two;
        return ret;
    }
}
