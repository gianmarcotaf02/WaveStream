package F;

public final class C0344i {

    public final int f3461a;

    public final int f3462b;

    public final InterfaceC0353s f3463c;

    public C0344i(int i3, int i9, InterfaceC0353s interfaceC0353s) {
        this.f3461a = i3;
        this.f3462b = i9;
        this.f3463c = interfaceC0353s;
        if (i3 < 0) {
            A.b.a("startIndex should be >= 0");
        }
        if (i9 > 0) {
            return;
        }
        A.b.a("size should be > 0");
    }
}
