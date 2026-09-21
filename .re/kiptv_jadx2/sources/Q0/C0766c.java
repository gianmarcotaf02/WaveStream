package Q0;

public final class C0766c implements p175v0.r {

    public static final C0766c f8394a = new C0766c();

    public static Boolean f8395b;

    @Override
    public final boolean b() {
        Boolean bool = f8395b;
        if (bool != null) {
            return bool.booleanValue();
        }
        throw p121o0.p.h("canFocus is read before it is written");
    }

    @Override
    public final void e(boolean z6) {
        f8395b = Boolean.valueOf(z6);
    }
}
