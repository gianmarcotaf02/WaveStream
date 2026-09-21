package C5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: C5.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC0098c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final C5.EnumC0098c f1223h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final C5.EnumC0098c f1224i;
    public static final C5.EnumC0098c j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final C5.EnumC0098c f1225k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ C5.EnumC0098c[] f1226l;

    static {
        C5.EnumC0098c enumC0098c = new C5.EnumC0098c("MAIN", 0);
        f1223h = enumC0098c;
        C5.EnumC0098c enumC0098c2 = new C5.EnumC0098c("ENGINE", 1);
        f1224i = enumC0098c2;
        C5.EnumC0098c enumC0098c3 = new C5.EnumC0098c("AUDIO", 2);
        j = enumC0098c3;
        C5.EnumC0098c enumC0098c4 = new C5.EnumC0098c("SUBTITLES", 3);
        f1225k = enumC0098c4;
        C5.EnumC0098c[] enumC0098cArr = {enumC0098c, enumC0098c2, enumC0098c3, enumC0098c4};
        f1226l = enumC0098cArr;
        com.google.crypto.tink.shaded.protobuf.q0.t(enumC0098cArr);
    }

    public static C5.EnumC0098c valueOf(java.lang.String str) {
        return (C5.EnumC0098c) java.lang.Enum.valueOf(C5.EnumC0098c.class, str);
    }

    public static C5.EnumC0098c[] values() {
        return (C5.EnumC0098c[]) f1226l.clone();
    }
}
