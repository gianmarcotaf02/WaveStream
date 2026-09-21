package androidx.media3.exoplayer.source.chunk;

/* JADX INFO: loaded from: classes.dex */
public abstract class DataChunk extends androidx.media3.exoplayer.source.chunk.Chunk {
    private static final int READ_GRANULARITY = 16384;
    private byte[] data;
    private volatile boolean loadCanceled;

    public DataChunk(androidx.media3.datasource.DataSource dataSource, androidx.media3.datasource.DataSpec dataSpec, int i3, androidx.media3.common.Format format, int i9, java.lang.Object obj, byte[] bArr) {
        super(dataSource, dataSpec, i3, format, i9, obj, androidx.media3.common.C.TIME_UNSET, androidx.media3.common.C.TIME_UNSET);
        this.data = bArr == null ? androidx.media3.common.util.Util.EMPTY_BYTE_ARRAY : bArr;
    }

    private void maybeExpandData(int i3) {
        byte[] bArr = this.data;
        if (bArr.length < i3 + 16384) {
            this.data = java.util.Arrays.copyOf(bArr, bArr.length + 16384);
        }
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.Loadable
    public final void cancelLoad() {
        this.loadCanceled = true;
    }

    public abstract void consume(byte[] bArr, int i3);

    public byte[] getDataHolder() {
        return this.data;
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.Loadable
    public final void load() {
        try {
            this.dataSource.open(this.dataSpec);
            int i3 = 0;
            int i9 = 0;
            while (i3 != -1 && !this.loadCanceled) {
                maybeExpandData(i9);
                i3 = this.dataSource.read(this.data, i9, 16384);
                if (i3 != -1) {
                    i9 += i3;
                }
            }
            if (!this.loadCanceled) {
                consume(this.data, i9);
            }
        } finally {
            androidx.media3.datasource.DataSourceUtil.closeQuietly(this.dataSource);
        }
    }
}
