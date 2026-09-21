package p162s8;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final p162s8.a f27383h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final p162s8.a f27384i;
    public static final /* synthetic */ p162s8.a[] j;

    static {
        p162s8.a aVar = new p162s8.a("NONE", 0);
        f27383h = aVar;
        p162s8.a aVar2 = new p162s8.a("ALL_JSON_OBJECTS", 1);
        p162s8.a aVar3 = new p162s8.a("POLYMORPHIC", 2);
        f27384i = aVar3;
        p162s8.a[] aVarArr = {aVar, aVar2, aVar3};
        j = aVarArr;
        com.google.crypto.tink.shaded.protobuf.q0.t(aVarArr);
    }

    public static p162s8.a valueOf(java.lang.String str) {
        return (p162s8.a) java.lang.Enum.valueOf(p162s8.a.class, str);
    }

    public static p162s8.a[] values() {
        return (p162s8.a[]) j.clone();
    }
}
