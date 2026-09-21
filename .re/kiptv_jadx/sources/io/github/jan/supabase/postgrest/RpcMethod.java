package io.github.jan.supabase.postgrest;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'HEAD' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:399)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:364)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:349)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:315)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:288)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:160)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lio/github/jan/supabase/postgrest/RpcMethod;", "", "httpMethod", "Lio/ktor/http/HttpMethod;", "<init>", "(Ljava/lang/String;ILio/ktor/http/HttpMethod;)V", "getHttpMethod", "()Lio/ktor/http/HttpMethod;", "HEAD", androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist.Interstitial.CUE_TRIGGER_POST, "GET", "postgrest-kt_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class RpcMethod {
    private static final /* synthetic */ p126o6.a $ENTRIES;
    private static final /* synthetic */ io.github.jan.supabase.postgrest.RpcMethod[] $VALUES;
    public static final io.github.jan.supabase.postgrest.RpcMethod GET;
    public static final io.github.jan.supabase.postgrest.RpcMethod HEAD;
    public static final io.github.jan.supabase.postgrest.RpcMethod POST;
    private final io.ktor.http.HttpMethod httpMethod;

    private static final /* synthetic */ io.github.jan.supabase.postgrest.RpcMethod[] $values() {
        return new io.github.jan.supabase.postgrest.RpcMethod[]{HEAD, POST, GET};
    }

    static {
        io.ktor.http.HttpMethod.Companion companion = io.ktor.http.HttpMethod.INSTANCE;
        HEAD = new io.github.jan.supabase.postgrest.RpcMethod("HEAD", 0, companion.getHead());
        POST = new io.github.jan.supabase.postgrest.RpcMethod(androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist.Interstitial.CUE_TRIGGER_POST, 1, companion.getPost());
        GET = new io.github.jan.supabase.postgrest.RpcMethod("GET", 2, companion.getGet());
        io.github.jan.supabase.postgrest.RpcMethod[] rpcMethodArr$values = $values();
        $VALUES = rpcMethodArr$values;
        $ENTRIES = com.google.crypto.tink.shaded.protobuf.q0.t(rpcMethodArr$values);
    }

    private RpcMethod(java.lang.String str, int i3, io.ktor.http.HttpMethod httpMethod) {
        super(str, i3);
        this.httpMethod = httpMethod;
    }

    public static p126o6.a getEntries() {
        return $ENTRIES;
    }

    public static io.github.jan.supabase.postgrest.RpcMethod valueOf(java.lang.String str) {
        return (io.github.jan.supabase.postgrest.RpcMethod) java.lang.Enum.valueOf(io.github.jan.supabase.postgrest.RpcMethod.class, str);
    }

    public static io.github.jan.supabase.postgrest.RpcMethod[] values() {
        return (io.github.jan.supabase.postgrest.RpcMethod[]) $VALUES.clone();
    }

    public final io.ktor.http.HttpMethod getHttpMethod() {
        return this.httpMethod;
    }
}
