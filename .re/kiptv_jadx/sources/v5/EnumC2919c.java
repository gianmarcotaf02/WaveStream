package v5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: v5.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC2919c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final v5.EnumC2919c f29411h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final v5.EnumC2919c f29412i;
    public static final /* synthetic */ v5.EnumC2919c[] j;

    static {
        v5.EnumC2919c enumC2919c = new v5.EnumC2919c("Channel", 0);
        f29411h = enumC2919c;
        v5.EnumC2919c enumC2919c2 = new v5.EnumC2919c("Programs", 1);
        f29412i = enumC2919c2;
        v5.EnumC2919c[] enumC2919cArr = {enumC2919c, enumC2919c2};
        j = enumC2919cArr;
        com.google.crypto.tink.shaded.protobuf.q0.t(enumC2919cArr);
    }

    public static v5.EnumC2919c valueOf(java.lang.String str) {
        return (v5.EnumC2919c) java.lang.Enum.valueOf(v5.EnumC2919c.class, str);
    }

    public static v5.EnumC2919c[] values() {
        return (v5.EnumC2919c[]) j.clone();
    }
}
