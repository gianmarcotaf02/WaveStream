package S4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: S4.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0868g {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final S4.EnumC0868g f9389h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final S4.EnumC0868g f9390i;
    public static final S4.EnumC0868g j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final S4.EnumC0868g f9391k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ S4.EnumC0868g[] f9392l;

    static {
        S4.EnumC0868g enumC0868g = new S4.EnumC0868g("DEFAULT", 0);
        f9389h = enumC0868g;
        S4.EnumC0868g enumC0868g2 = new S4.EnumC0868g("MOST_RECENT", 1);
        f9390i = enumC0868g2;
        S4.EnumC0868g enumC0868g3 = new S4.EnumC0868g("ALPHABETICAL_ASC", 2);
        j = enumC0868g3;
        S4.EnumC0868g enumC0868g4 = new S4.EnumC0868g("ALPHABETICAL_DESC", 3);
        f9391k = enumC0868g4;
        S4.EnumC0868g[] enumC0868gArr = {enumC0868g, enumC0868g2, enumC0868g3, enumC0868g4};
        f9392l = enumC0868gArr;
        com.google.crypto.tink.shaded.protobuf.q0.t(enumC0868gArr);
    }

    public static S4.EnumC0868g valueOf(java.lang.String str) {
        return (S4.EnumC0868g) java.lang.Enum.valueOf(S4.EnumC0868g.class, str);
    }

    public static S4.EnumC0868g[] values() {
        return (S4.EnumC0868g[]) f9392l.clone();
    }
}
