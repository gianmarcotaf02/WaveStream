package io.ktor.http.content;

import androidx.media3.container.NalUnitUtil;
import com.google.crypto.tink.shaded.protobuf.q0;
import io.ktor.http.HttpStatusCode;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lio/ktor/http/content/VersionCheckResult;", "", "Lio/ktor/http/HttpStatusCode;", "statusCode", "<init>", "(Ljava/lang/String;ILio/ktor/http/HttpStatusCode;)V", "Lio/ktor/http/HttpStatusCode;", "getStatusCode", "()Lio/ktor/http/HttpStatusCode;", "OK", "NOT_MODIFIED", "PRECONDITION_FAILED", "ktor-http"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class VersionCheckResult {
    private static final p126o6.a $ENTRIES;
    private static final VersionCheckResult[] $VALUES;
    public static final VersionCheckResult NOT_MODIFIED;
    public static final VersionCheckResult OK;
    public static final VersionCheckResult PRECONDITION_FAILED;
    private final HttpStatusCode statusCode;

    private static final VersionCheckResult[] $values() {
        return new VersionCheckResult[]{OK, NOT_MODIFIED, PRECONDITION_FAILED};
    }

    static {
        HttpStatusCode.Companion companion = HttpStatusCode.INSTANCE;
        OK = new VersionCheckResult("OK", 0, companion.getOK());
        NOT_MODIFIED = new VersionCheckResult("NOT_MODIFIED", 1, companion.getNotModified());
        PRECONDITION_FAILED = new VersionCheckResult("PRECONDITION_FAILED", 2, companion.getPreconditionFailed());
        VersionCheckResult[] versionCheckResultArr$values = $values();
        $VALUES = versionCheckResultArr$values;
        $ENTRIES = q0.t(versionCheckResultArr$values);
    }

    private VersionCheckResult(String str, int i3, HttpStatusCode httpStatusCode) {
        super(str, i3);
        this.statusCode = httpStatusCode;
    }

    public static p126o6.a getEntries() {
        return $ENTRIES;
    }

    public static VersionCheckResult valueOf(String str) {
        return (VersionCheckResult) Enum.valueOf(VersionCheckResult.class, str);
    }

    public static VersionCheckResult[] values() {
        return (VersionCheckResult[]) $VALUES.clone();
    }

    public final HttpStatusCode getStatusCode() {
        return this.statusCode;
    }
}
