package T3;

public enum t implements InterfaceC0910a {
    RS256(-257),
    RS384(-258),
    RS512(-259),
    LEGACY_RS1(-262),
    PS256(-37),
    PS384(-38),
    PS512(-39),
    RS1(-65535);


    public final int f9805h;

    t(int i3) {
        this.f9805h = i3;
    }

    @Override
    public final int a() {
        return this.f9805h;
    }
}
