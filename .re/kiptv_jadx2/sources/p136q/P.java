package p136q;

public abstract class P {

    public static final long[] f26351a = {-9187201950435737345L, -1};

    static {
        new H(0);
    }

    public static final int a(int i3) {
        if (i3 == 7) {
            return 6;
        }
        return i3 - (i3 / 8);
    }

    public static final int b(int i3) {
        if (i3 == 0) {
            return 6;
        }
        return (i3 * 2) + 1;
    }

    public static final int c(int i3) {
        if (i3 > 0) {
            return (-1) >>> Integer.numberOfLeadingZeros(i3);
        }
        return 0;
    }

    public static final int d(int i3) {
        if (i3 == 7) {
            return 8;
        }
        return ((i3 - 1) / 7) + i3;
    }
}
