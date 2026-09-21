package androidx.media3.datasource;

/* JADX INFO: loaded from: classes.dex */
public interface DataSink {

    public interface Factory {
        androidx.media3.datasource.DataSink createDataSink();
    }

    void close();

    void open(androidx.media3.datasource.DataSpec dataSpec);

    void write(byte[] bArr, int i3, int i9);
}
