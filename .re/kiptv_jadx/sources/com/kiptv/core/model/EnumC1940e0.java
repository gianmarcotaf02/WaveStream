package com.kiptv.core.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: com.kiptv.core.model.e0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC1940e0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ com.kiptv.core.model.EnumC1940e0[] f20749h;

    /* JADX INFO: Fake field, exist only in values array */
    com.kiptv.core.model.EnumC1940e0 EF5;

    static {
        com.kiptv.core.model.EnumC1940e0[] enumC1940e0Arr = {new com.kiptv.core.model.EnumC1940e0("NotAuthenticated", 0), new com.kiptv.core.model.EnumC1940e0("NotFound", 1), new com.kiptv.core.model.EnumC1940e0("ValidationFailed", 2), new com.kiptv.core.model.EnumC1940e0("PlaylistLimitReached", 3), new com.kiptv.core.model.EnumC1940e0("DuplicateName", 4)};
        f20749h = enumC1940e0Arr;
        com.google.crypto.tink.shaded.protobuf.q0.t(enumC1940e0Arr);
    }

    public static com.kiptv.core.model.EnumC1940e0 valueOf(java.lang.String str) {
        return (com.kiptv.core.model.EnumC1940e0) java.lang.Enum.valueOf(com.kiptv.core.model.EnumC1940e0.class, str);
    }

    public static com.kiptv.core.model.EnumC1940e0[] values() {
        return (com.kiptv.core.model.EnumC1940e0[]) f20749h.clone();
    }
}
