package k3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final k3.d f24446h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final k3.d f24447i;
    public static final k3.d j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ k3.d[] f24448k;

    static {
        k3.d dVar = new k3.d("NETWORK_UNMETERED", 0);
        f24446h = dVar;
        k3.d dVar2 = new k3.d("DEVICE_IDLE", 1);
        f24447i = dVar2;
        k3.d dVar3 = new k3.d("DEVICE_CHARGING", 2);
        j = dVar3;
        f24448k = new k3.d[]{dVar, dVar2, dVar3};
    }

    public static k3.d valueOf(java.lang.String str) {
        return (k3.d) java.lang.Enum.valueOf(k3.d.class, str);
    }

    public static k3.d[] values() {
        return (k3.d[]) f24448k.clone();
    }
}
