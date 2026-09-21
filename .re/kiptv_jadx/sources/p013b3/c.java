package p013b3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final p013b3.c f17869h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final p013b3.c f17870i;
    public static final p013b3.c j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ p013b3.c[] f17871k;

    static {
        p013b3.c cVar = new p013b3.c("DEFAULT", 0);
        f17869h = cVar;
        p013b3.c cVar2 = new p013b3.c("VERY_LOW", 1);
        f17870i = cVar2;
        p013b3.c cVar3 = new p013b3.c("HIGHEST", 2);
        j = cVar3;
        f17871k = new p013b3.c[]{cVar, cVar2, cVar3};
    }

    public static p013b3.c valueOf(java.lang.String str) {
        return (p013b3.c) java.lang.Enum.valueOf(p013b3.c.class, str);
    }

    public static p013b3.c[] values() {
        return (p013b3.c[]) f17871k.clone();
    }
}
