package p162s8;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final p162s8.b f27385h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final p162s8.b f27386i;
    public static final /* synthetic */ p162s8.b[] j;

    static {
        p162s8.b bVar = new p162s8.b("WHITESPACE_SEPARATED", 0);
        f27385h = bVar;
        p162s8.b bVar2 = new p162s8.b("ARRAY_WRAPPED", 1);
        f27386i = bVar2;
        p162s8.b[] bVarArr = {bVar, bVar2, new p162s8.b("AUTO_DETECT", 2)};
        j = bVarArr;
        com.google.crypto.tink.shaded.protobuf.q0.t(bVarArr);
    }

    public static p162s8.b valueOf(java.lang.String str) {
        return (p162s8.b) java.lang.Enum.valueOf(p162s8.b.class, str);
    }

    public static p162s8.b[] values() {
        return (p162s8.b[]) j.clone();
    }
}
