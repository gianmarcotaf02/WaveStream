package p044e7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final p044e7.b f21441h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final p044e7.b f21442i;
    public static final p044e7.b j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ p044e7.b[] f21443k;

    static {
        p044e7.b bVar = new p044e7.b("PROPERTY", 0);
        f21441h = bVar;
        p044e7.b bVar2 = new p044e7.b("BACKING_FIELD", 1);
        f21442i = bVar2;
        p044e7.b bVar3 = new p044e7.b("DELEGATE_FIELD", 2);
        j = bVar3;
        p044e7.b[] bVarArr = {bVar, bVar2, bVar3};
        f21443k = bVarArr;
        com.google.crypto.tink.shaded.protobuf.q0.t(bVarArr);
    }

    public static p044e7.b valueOf(java.lang.String str) {
        return (p044e7.b) java.lang.Enum.valueOf(p044e7.b.class, str);
    }

    public static p044e7.b[] values() {
        return (p044e7.b[]) f21443k.clone();
    }
}
