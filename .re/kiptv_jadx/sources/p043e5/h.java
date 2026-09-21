package p043e5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final p043e5.h f21437h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ p043e5.h[] f21438i;
    public static final /* synthetic */ p126o6.b j;

    /* JADX INFO: Fake field, exist only in values array */
    p043e5.h EF0;

    static {
        p043e5.h hVar = new p043e5.h("IOS", 0);
        p043e5.h hVar2 = new p043e5.h("TVOS", 1);
        p043e5.h hVar3 = new p043e5.h("ANDROID", 2);
        f21437h = hVar3;
        p043e5.h[] hVarArr = {hVar, hVar2, hVar3};
        f21438i = hVarArr;
        j = com.google.crypto.tink.shaded.protobuf.q0.t(hVarArr);
    }

    public static p043e5.h valueOf(java.lang.String str) {
        return (p043e5.h) java.lang.Enum.valueOf(p043e5.h.class, str);
    }

    public static p043e5.h[] values() {
        return (p043e5.h[]) f21438i.clone();
    }
}
