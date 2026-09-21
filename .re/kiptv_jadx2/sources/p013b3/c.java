package p013b3;

public final class c {

    public static final c f17869h;

    public static final c f17870i;
    public static final c j;

    public static final c[] f17871k;

    static {
        c cVar = new c("DEFAULT", 0);
        f17869h = cVar;
        c cVar2 = new c("VERY_LOW", 1);
        f17870i = cVar2;
        c cVar3 = new c("HIGHEST", 2);
        j = cVar3;
        f17871k = new c[]{cVar, cVar2, cVar3};
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) f17871k.clone();
    }
}
