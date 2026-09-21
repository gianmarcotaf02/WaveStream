package p033d3;

public final class p {

    public static final p f21222h;

    public static final p[] f21223i;

    p EF0;

    static {
        p pVar = new p("UNKNOWN", 0);
        p pVar2 = new p("ANDROID_FIREBASE", 1);
        f21222h = pVar2;
        f21223i = new p[]{pVar, pVar2};
    }

    public static p valueOf(String str) {
        return (p) Enum.valueOf(p.class, str);
    }

    public static p[] values() {
        return (p[]) f21223i.clone();
    }
}
