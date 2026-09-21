package N6;

import C7.AbstractC0191x;

public final class Q implements p187w7.d, P {

    public static final Q f7378i = new Q(0);
    public static final Q j = new Q(1);

    public final int f7379h;

    public Q(int i3) {
        this.f7379h = i3;
    }

    @Override
    public AbstractC0191x getType() {
        switch (this.f7379h) {
            case 2:
                throw new IllegalStateException("This method should not be called");
            case 3:
                throw new IllegalStateException("This method should not be called");
            default:
                throw new IllegalStateException("This method should not be called");
        }
    }

    public String toString() {
        switch (this.f7379h) {
            case 7:
                return "NO_SOURCE";
            default:
                return super.toString();
        }
    }
}
