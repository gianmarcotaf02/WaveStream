package io.ktor.http.content;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'OK' uses external variables
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
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lio/ktor/http/content/VersionCheckResult;", "", "Lio/ktor/http/HttpStatusCode;", "statusCode", "<init>", "(Ljava/lang/String;ILio/ktor/http/HttpStatusCode;)V", "Lio/ktor/http/HttpStatusCode;", "getStatusCode", "()Lio/ktor/http/HttpStatusCode;", "OK", "NOT_MODIFIED", "PRECONDITION_FAILED", "ktor-http"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class VersionCheckResult {
    private static final /* synthetic */ p126o6.a $ENTRIES;
    private static final /* synthetic */ io.ktor.http.content.VersionCheckResult[] $VALUES;
    public static final io.ktor.http.content.VersionCheckResult NOT_MODIFIED;
    public static final io.ktor.http.content.VersionCheckResult OK;
    public static final io.ktor.http.content.VersionCheckResult PRECONDITION_FAILED;
    private final io.ktor.http.HttpStatusCode statusCode;

    private static final /* synthetic */ io.ktor.http.content.VersionCheckResult[] $values() {
        return new io.ktor.http.content.VersionCheckResult[]{OK, NOT_MODIFIED, PRECONDITION_FAILED};
    }

    static {
        io.ktor.http.HttpStatusCode.Companion companion = io.ktor.http.HttpStatusCode.INSTANCE;
        OK = new io.ktor.http.content.VersionCheckResult("OK", 0, companion.getOK());
        NOT_MODIFIED = new io.ktor.http.content.VersionCheckResult("NOT_MODIFIED", 1, companion.getNotModified());
        PRECONDITION_FAILED = new io.ktor.http.content.VersionCheckResult("PRECONDITION_FAILED", 2, companion.getPreconditionFailed());
        io.ktor.http.content.VersionCheckResult[] versionCheckResultArr$values = $values();
        $VALUES = versionCheckResultArr$values;
        $ENTRIES = com.google.crypto.tink.shaded.protobuf.q0.t(versionCheckResultArr$values);
    }

    private VersionCheckResult(java.lang.String str, int i3, io.ktor.http.HttpStatusCode httpStatusCode) {
        super(str, i3);
        this.statusCode = httpStatusCode;
    }

    public static p126o6.a getEntries() {
        return $ENTRIES;
    }

    public static io.ktor.http.content.VersionCheckResult valueOf(java.lang.String str) {
        return (io.ktor.http.content.VersionCheckResult) java.lang.Enum.valueOf(io.ktor.http.content.VersionCheckResult.class, str);
    }

    public static io.ktor.http.content.VersionCheckResult[] values() {
        return (io.ktor.http.content.VersionCheckResult[]) $VALUES.clone();
    }

    public final io.ktor.http.HttpStatusCode getStatusCode() {
        return this.statusCode;
    }
}
