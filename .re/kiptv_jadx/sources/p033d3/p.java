package p033d3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final p033d3.p f21222h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ p033d3.p[] f21223i;

    /* JADX INFO: Fake field, exist only in values array */
    p033d3.p EF0;

    static {
        p033d3.p pVar = new p033d3.p("UNKNOWN", 0);
        p033d3.p pVar2 = new p033d3.p("ANDROID_FIREBASE", 1);
        f21222h = pVar2;
        f21223i = new p033d3.p[]{pVar, pVar2};
    }

    public static p033d3.p valueOf(java.lang.String str) {
        return (p033d3.p) java.lang.Enum.valueOf(p033d3.p.class, str);
    }

    public static p033d3.p[] values() {
        return (p033d3.p[]) f21223i.clone();
    }
}
