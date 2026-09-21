package p035d7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class g {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final p035d7.g f21262h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final p035d7.g f21263i;
    public static final p035d7.g j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ p035d7.g[] f21264k;

    static {
        p035d7.g gVar = new p035d7.g("FORCE_FLEXIBILITY", 0);
        f21262h = gVar;
        p035d7.g gVar2 = new p035d7.g("NULLABLE", 1);
        f21263i = gVar2;
        p035d7.g gVar3 = new p035d7.g("NOT_NULL", 2);
        j = gVar3;
        p035d7.g[] gVarArr = {gVar, gVar2, gVar3};
        f21264k = gVarArr;
        com.google.crypto.tink.shaded.protobuf.q0.t(gVarArr);
    }

    public static p035d7.g valueOf(java.lang.String str) {
        return (p035d7.g) java.lang.Enum.valueOf(p035d7.g.class, str);
    }

    public static p035d7.g[] values() {
        return (p035d7.g[]) f21264k.clone();
    }
}
