package Z7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Z7.b f13029h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Z7.b f13030i;
    public static final Z7.b j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Z7.b f13031k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final Z7.b f13032l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ Z7.b[] f13033m;

    static {
        Z7.b bVar = new Z7.b("CPU_ACQUIRED", 0);
        f13029h = bVar;
        Z7.b bVar2 = new Z7.b("BLOCKING", 1);
        f13030i = bVar2;
        Z7.b bVar3 = new Z7.b("PARKING", 2);
        j = bVar3;
        Z7.b bVar4 = new Z7.b("DORMANT", 3);
        f13031k = bVar4;
        Z7.b bVar5 = new Z7.b("TERMINATED", 4);
        f13032l = bVar5;
        Z7.b[] bVarArr = {bVar, bVar2, bVar3, bVar4, bVar5};
        f13033m = bVarArr;
        com.google.crypto.tink.shaded.protobuf.q0.t(bVarArr);
    }

    public static Z7.b valueOf(java.lang.String str) {
        return (Z7.b) java.lang.Enum.valueOf(Z7.b.class, str);
    }

    public static Z7.b[] values() {
        return (Z7.b[]) f13033m.clone();
    }
}
