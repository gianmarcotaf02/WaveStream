package U;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: U.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0949w {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final U.EnumC0949w f10090h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ U.EnumC0949w[] f10091i;

    static {
        U.EnumC0949w enumC0949w = new U.EnumC0949w("EditableText", 0);
        f10090h = enumC0949w;
        U.EnumC0949w[] enumC0949wArr = {enumC0949w, new U.EnumC0949w("StaticText", 1)};
        f10091i = enumC0949wArr;
        com.google.crypto.tink.shaded.protobuf.q0.t(enumC0949wArr);
    }

    public static U.EnumC0949w valueOf(java.lang.String str) {
        return (U.EnumC0949w) java.lang.Enum.valueOf(U.EnumC0949w.class, str);
    }

    public static U.EnumC0949w[] values() {
        return (U.EnumC0949w[]) f10091i.clone();
    }
}
