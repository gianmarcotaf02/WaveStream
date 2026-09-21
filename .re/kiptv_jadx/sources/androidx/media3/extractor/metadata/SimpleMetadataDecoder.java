package androidx.media3.extractor.metadata;

/* JADX INFO: loaded from: classes.dex */
public abstract class SimpleMetadataDecoder implements androidx.media3.extractor.metadata.MetadataDecoder {
    @Override // androidx.media3.extractor.metadata.MetadataDecoder
    public final androidx.media3.common.Metadata decode(androidx.media3.extractor.metadata.MetadataInputBuffer metadataInputBuffer) {
        java.nio.ByteBuffer byteBuffer = metadataInputBuffer.data;
        byteBuffer.getClass();
        com.google.android.gms.internal.play_billing.AbstractC1864o0.L(byteBuffer.position() == 0 && byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0);
        return decode(metadataInputBuffer, byteBuffer);
    }

    public abstract androidx.media3.common.Metadata decode(androidx.media3.extractor.metadata.MetadataInputBuffer metadataInputBuffer, java.nio.ByteBuffer byteBuffer);
}
