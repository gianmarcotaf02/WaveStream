package p152r7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final p152r7.a f26886h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ p152r7.a[] f26887i;

    /* JADX INFO: Fake field, exist only in values array */
    p152r7.a EF0;

    static {
        p152r7.a aVar = new p152r7.a("WARNING", 0);
        p152r7.a aVar2 = new p152r7.a("ERROR", 1);
        f26886h = aVar2;
        p152r7.a[] aVarArr = {aVar, aVar2, new p152r7.a("HIDDEN", 2)};
        f26887i = aVarArr;
        com.google.crypto.tink.shaded.protobuf.q0.t(aVarArr);
    }

    public static p152r7.a valueOf(java.lang.String str) {
        return (p152r7.a) java.lang.Enum.valueOf(p152r7.a.class, str);
    }

    public static p152r7.a[] values() {
        return (p152r7.a[]) f26887i.clone();
    }
}
