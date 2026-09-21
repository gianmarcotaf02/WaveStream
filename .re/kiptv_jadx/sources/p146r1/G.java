package p146r1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class G {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final p146r1.G f26720h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final p146r1.G f26721i;
    public static final /* synthetic */ p146r1.G[] j;

    static {
        p146r1.G g = new p146r1.G("Inherit", 0);
        f26720h = g;
        p146r1.G g9 = new p146r1.G("SecureOn", 1);
        f26721i = g9;
        p146r1.G[] gArr = {g, g9, new p146r1.G("SecureOff", 2)};
        j = gArr;
        com.google.crypto.tink.shaded.protobuf.q0.t(gArr);
    }

    public static p146r1.G valueOf(java.lang.String str) {
        return (p146r1.G) java.lang.Enum.valueOf(p146r1.G.class, str);
    }

    public static p146r1.G[] values() {
        return (p146r1.G[]) j.clone();
    }
}
