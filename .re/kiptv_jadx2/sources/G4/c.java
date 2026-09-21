package G4;

public final class c {

    public static final c f3789h;

    public static final c[] f3790i;

    static {
        c cVar = new c("DEFAULT", 0);
        f3789h = cVar;
        f3790i = new c[]{cVar, new c("SIGNED", 1), new c("FIXED", 2)};
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) f3790i.clone();
    }
}
