package p101l7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class i {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final p101l7.i f24867h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final p101l7.i f24868i;
    public static final p101l7.i j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ p101l7.i[] f24869k;

    static {
        p101l7.i iVar = new p101l7.i("BEGINNING", 0);
        f24867h = iVar;
        p101l7.i iVar2 = new p101l7.i("MIDDLE", 1);
        f24868i = iVar2;
        p101l7.i iVar3 = new p101l7.i("AFTER_DOT", 2);
        j = iVar3;
        p101l7.i[] iVarArr = {iVar, iVar2, iVar3};
        f24869k = iVarArr;
        com.google.crypto.tink.shaded.protobuf.q0.t(iVarArr);
    }

    public static p101l7.i valueOf(java.lang.String str) {
        return (p101l7.i) java.lang.Enum.valueOf(p101l7.i.class, str);
    }

    public static p101l7.i[] values() {
        return (p101l7.i[]) f24869k.clone();
    }
}
