package k3;

public final class d {

    public static final d f24446h;

    public static final d f24447i;
    public static final d j;

    public static final d[] f24448k;

    static {
        d dVar = new d("NETWORK_UNMETERED", 0);
        f24446h = dVar;
        d dVar2 = new d("DEVICE_IDLE", 1);
        f24447i = dVar2;
        d dVar3 = new d("DEVICE_CHARGING", 2);
        j = dVar3;
        f24448k = new d[]{dVar, dVar2, dVar3};
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) f24448k.clone();
    }
}
