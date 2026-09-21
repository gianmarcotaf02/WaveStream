package p099l5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class z {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final p099l5.z f24813h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final p099l5.z f24814i;
    public static final p099l5.z j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final p099l5.z f24815k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ p099l5.z[] f24816l;

    /* JADX INFO: Fake field, exist only in values array */
    p099l5.z EF0;

    static {
        p099l5.z zVar = new p099l5.z("AtmosActive", 0);
        p099l5.z zVar2 = new p099l5.z("AtmosCompatible", 1);
        f24813h = zVar2;
        p099l5.z zVar3 = new p099l5.z("SurroundFallback", 2);
        f24814i = zVar3;
        p099l5.z zVar4 = new p099l5.z("StereoFallback", 3);
        j = zVar4;
        p099l5.z zVar5 = new p099l5.z("NotVerifiable", 4);
        f24815k = zVar5;
        p099l5.z[] zVarArr = {zVar, zVar2, zVar3, zVar4, zVar5};
        f24816l = zVarArr;
        com.google.crypto.tink.shaded.protobuf.q0.t(zVarArr);
    }

    public static p099l5.z valueOf(java.lang.String str) {
        return (p099l5.z) java.lang.Enum.valueOf(p099l5.z.class, str);
    }

    public static p099l5.z[] values() {
        return (p099l5.z[]) f24816l.clone();
    }
}
