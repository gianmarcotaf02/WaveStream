package j$.time.zone;

public final class d {
    public static final d STANDARD;
    public static final d UTC;
    public static final d WALL;

    public static final d[] f23843a;

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) f23843a.clone();
    }

    static {
        d dVar = new d("UTC", 0);
        UTC = dVar;
        d dVar2 = new d("WALL", 1);
        WALL = dVar2;
        d dVar3 = new d("STANDARD", 2);
        STANDARD = dVar3;
        f23843a = new d[]{dVar, dVar2, dVar3};
    }
}
