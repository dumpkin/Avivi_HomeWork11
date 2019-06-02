public class Triple<First, Second, Third> {

    private First first;
    private Second second;
    private Third third;
    private Operations param;


    public Triple(First first, Second second, Third third, Operations param) {
        this.first = first;
        this.second = second;
        this.third = third;
        this.param = param;
    }

    public Triple(First first, Second second, Third third) {
        this.first = first;
        this.second = second;
        this.third = third;
        this.param = null;
    }

    @Override
    public String toString() {

        if (param != null) {
            String ret = "Class Tripple\n"
                    + "first type: " + first.getClass().getSimpleName() + '=' + first
                    + "\nsecond type: " + second.getClass().getSimpleName() + '=' + second
                    + "\nthrid type: " + third.getClass().getSimpleName() + '=' + third
                    + "\nWhat " + param.getClass().getSimpleName() + "we had to do: " + param;
            return ret;
        } else {
            String ret = "Class Pair\n"
                    + "first type: " + first.getClass().getSimpleName() + '=' + first
                    + "\nsecond type: " + second.getClass().getSimpleName() + '=' + second
                    + "\nthrid type: " + third.getClass().getSimpleName() + '=' + third;

            return ret;
        }
    }

}
