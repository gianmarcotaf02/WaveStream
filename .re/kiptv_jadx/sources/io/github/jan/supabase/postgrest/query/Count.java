package io.github.jan.supabase.postgrest.query;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lio/github/jan/supabase/postgrest/query/Count;", "", io.sentry.protocol.ViewHierarchyNode.JsonKeys.IDENTIFIER, "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getIdentifier", "()Ljava/lang/String;", "EXACT", "PLANNED", "ESTIMATED", "postgrest-kt_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public enum Count {
    EXACT("exact"),
    PLANNED("planned"),
    ESTIMATED("estimated");

    private static final /* synthetic */ p126o6.a $ENTRIES = com.google.crypto.tink.shaded.protobuf.q0.t(values());
    private final java.lang.String identifier;

    Count(java.lang.String str) {
        this.identifier = str;
    }

    public static p126o6.a getEntries() {
        return $ENTRIES;
    }

    public final java.lang.String getIdentifier() {
        return this.identifier;
    }
}
