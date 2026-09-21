package p033d3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class w {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final p033d3.w f21228h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ p033d3.w[] f21229i;

    static {
        p033d3.w wVar = new p033d3.w("DEFAULT", 0);
        f21228h = wVar;
        p033d3.w wVar2 = new p033d3.w("UNMETERED_ONLY", 1);
        p033d3.w wVar3 = new p033d3.w("UNMETERED_OR_DAILY", 2);
        p033d3.w wVar4 = new p033d3.w("FAST_IF_RADIO_AWAKE", 3);
        p033d3.w wVar5 = new p033d3.w("NEVER", 4);
        p033d3.w wVar6 = new p033d3.w("UNRECOGNIZED", 5);
        f21229i = new p033d3.w[]{wVar, wVar2, wVar3, wVar4, wVar5, wVar6};
        android.util.SparseArray sparseArray = new android.util.SparseArray();
        sparseArray.put(0, wVar);
        sparseArray.put(1, wVar2);
        sparseArray.put(2, wVar3);
        sparseArray.put(3, wVar4);
        sparseArray.put(4, wVar5);
        sparseArray.put(-1, wVar6);
    }

    public static p033d3.w valueOf(java.lang.String str) {
        return (p033d3.w) java.lang.Enum.valueOf(p033d3.w.class, str);
    }

    public static p033d3.w[] values() {
        return (p033d3.w[]) f21229i.clone();
    }
}
