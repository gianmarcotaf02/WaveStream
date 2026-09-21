package io.github.jan.supabase.auth.providers;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0005HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Lio/github/jan/supabase/auth/providers/Notion;", "Lio/github/jan/supabase/auth/providers/OAuthProvider;", "<init>", "()V", "name", "", "getName", "()Ljava/lang/String;", "equals", "", io.sentry.protocol.Request.JsonKeys.OTHER, "", "hashCode", "", "toString", "auth-kt_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final /* data */ class Notion extends io.github.jan.supabase.auth.providers.OAuthProvider {
    public static final io.github.jan.supabase.auth.providers.Notion INSTANCE = new io.github.jan.supabase.auth.providers.Notion();
    private static final java.lang.String name = "notion";

    private Notion() {
    }

    public boolean equals(java.lang.Object other) {
        return this == other || (other instanceof io.github.jan.supabase.auth.providers.Notion);
    }

    @Override // io.github.jan.supabase.auth.providers.OAuthProvider
    public java.lang.String getName() {
        return name;
    }

    public int hashCode() {
        return -1137752233;
    }

    public java.lang.String toString() {
        return "Notion";
    }
}
