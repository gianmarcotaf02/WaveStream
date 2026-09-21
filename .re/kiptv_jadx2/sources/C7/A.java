package C7;

public final class A extends AbstractC0183o {
    public final int j;

    public A(B b9, int i3) {
        super(b9);
        this.j = i3;
    }

    @Override
    public final AbstractC0182n F0(B b9) {
        switch (this.j) {
            case 0:
                return new A(b9, 0);
            default:
                return new A(b9, 1);
        }
    }

    @Override
    public final boolean v0() {
        switch (this.j) {
            case 0:
                return false;
            default:
                return true;
        }
    }
}
