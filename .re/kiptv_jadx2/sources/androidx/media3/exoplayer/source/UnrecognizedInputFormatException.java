package androidx.media3.exoplayer.source;

import android.net.Uri;
import androidx.media3.common.ParserException;
import androidx.media3.extractor.SniffFailure;
import java.util.List;
import p076i4.AbstractC2186b0;
import p076i4.S0;
import p076i4.Z;

public class UnrecognizedInputFormatException extends ParserException {
    public final AbstractC2186b0 sniffFailures;
    public final Uri uri;

    @Deprecated
    public UnrecognizedInputFormatException(String str, Uri uri) {
        this(str, uri, S0.f22832l);
        Z z6 = AbstractC2186b0.f22868i;
    }

    @Override
    public String getMessage() {
        String message = super.getMessage();
        if (this.sniffFailures.isEmpty()) {
            return message;
        }
        StringBuilder sbN = Y6.f.n(message, "\nsniff failures: ");
        sbN.append(this.sniffFailures);
        return sbN.toString();
    }

    public UnrecognizedInputFormatException(String str, Uri uri, List<? extends SniffFailure> list) {
        super(str, null, false, 1);
        this.uri = uri;
        this.sniffFailures = AbstractC2186b0.u(list);
    }
}
