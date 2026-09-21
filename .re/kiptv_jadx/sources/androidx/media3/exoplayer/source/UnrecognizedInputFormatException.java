package androidx.media3.exoplayer.source;

/* JADX INFO: loaded from: classes.dex */
public class UnrecognizedInputFormatException extends androidx.media3.common.ParserException {
    public final p076i4.AbstractC2186b0 sniffFailures;
    public final android.net.Uri uri;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @java.lang.Deprecated
    public UnrecognizedInputFormatException(java.lang.String str, android.net.Uri uri) {
        this(str, uri, p076i4.S0.f22832l);
        p076i4.Z z6 = p076i4.AbstractC2186b0.f22868i;
    }

    @Override // androidx.media3.common.ParserException, java.lang.Throwable
    public java.lang.String getMessage() {
        java.lang.String message = super.getMessage();
        if (this.sniffFailures.isEmpty()) {
            return message;
        }
        java.lang.StringBuilder sbN = Y6.f.n(message, "\nsniff failures: ");
        sbN.append(this.sniffFailures);
        return sbN.toString();
    }

    public UnrecognizedInputFormatException(java.lang.String str, android.net.Uri uri, java.util.List<? extends androidx.media3.extractor.SniffFailure> list) {
        super(str, null, false, 1);
        this.uri = uri;
        this.sniffFailures = p076i4.AbstractC2186b0.u(list);
    }
}
