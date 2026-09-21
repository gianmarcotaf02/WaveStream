package R4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final R4.f f9069h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final R4.f f9070i;
    public static final R4.f j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ R4.f[] f9071k;

    /* JADX INFO: Fake field, exist only in values array */
    R4.f EF0;

    static {
        R4.f fVar = new R4.f("Pending", 0);
        R4.f fVar2 = new R4.f("Running", 1);
        f9069h = fVar2;
        R4.f fVar3 = new R4.f("Completed", 2);
        f9070i = fVar3;
        R4.f fVar4 = new R4.f("Failed", 3);
        j = fVar4;
        R4.f[] fVarArr = {fVar, fVar2, fVar3, fVar4};
        f9071k = fVarArr;
        com.google.crypto.tink.shaded.protobuf.q0.t(fVarArr);
    }

    public static R4.f valueOf(java.lang.String str) {
        return (R4.f) java.lang.Enum.valueOf(R4.f.class, str);
    }

    public static R4.f[] values() {
        return (R4.f[]) f9071k.clone();
    }
}
