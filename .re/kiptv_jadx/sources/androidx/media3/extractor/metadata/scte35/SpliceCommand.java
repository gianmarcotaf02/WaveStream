package androidx.media3.extractor.metadata.scte35;

/* JADX INFO: loaded from: classes.dex */
public abstract class SpliceCommand implements androidx.media3.common.Metadata.Entry {
    public java.lang.String toString() {
        return "SCTE-35 splice command: type=".concat(getClass().getSimpleName());
    }
}
