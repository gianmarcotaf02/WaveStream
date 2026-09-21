package p160s6;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class j {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final p160s6.j f27373h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ p160s6.j[] f27374i;

    /* JADX INFO: Fake field, exist only in values array */
    p160s6.j EF0;

    static {
        p160s6.j jVar = new p160s6.j("TOP_DOWN", 0);
        p160s6.j jVar2 = new p160s6.j("BOTTOM_UP", 1);
        f27373h = jVar2;
        p160s6.j[] jVarArr = {jVar, jVar2};
        f27374i = jVarArr;
        com.google.crypto.tink.shaded.protobuf.q0.t(jVarArr);
    }

    public static p160s6.j valueOf(java.lang.String str) {
        return (p160s6.j) java.lang.Enum.valueOf(p160s6.j.class, str);
    }

    public static p160s6.j[] values() {
        return (p160s6.j[]) f27374i.clone();
    }
}
