package p070h6;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class i {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final p070h6.i f22536h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final p070h6.i f22537i;
    public static final p070h6.i j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ p070h6.i[] f22538k;

    static {
        p070h6.i iVar = new p070h6.i("SYNCHRONIZED", 0);
        f22536h = iVar;
        p070h6.i iVar2 = new p070h6.i("PUBLICATION", 1);
        f22537i = iVar2;
        p070h6.i iVar3 = new p070h6.i("NONE", 2);
        j = iVar3;
        p070h6.i[] iVarArr = {iVar, iVar2, iVar3};
        f22538k = iVarArr;
        com.google.crypto.tink.shaded.protobuf.q0.t(iVarArr);
    }

    public static p070h6.i valueOf(java.lang.String str) {
        return (p070h6.i) java.lang.Enum.valueOf(p070h6.i.class, str);
    }

    public static p070h6.i[] values() {
        return (p070h6.i[]) f22538k.clone();
    }
}
