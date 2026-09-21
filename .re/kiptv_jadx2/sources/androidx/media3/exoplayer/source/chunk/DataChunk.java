package androidx.media3.exoplayer.source.chunk;

import androidx.media3.common.C;
import androidx.media3.common.Format;
import androidx.media3.common.util.Util;
import androidx.media3.datasource.DataSource;
import androidx.media3.datasource.DataSourceUtil;
import androidx.media3.datasource.DataSpec;
import java.util.Arrays;

public abstract class DataChunk extends Chunk {
    private static final int READ_GRANULARITY = 16384;
    private byte[] data;
    private volatile boolean loadCanceled;

    public DataChunk(DataSource dataSource, DataSpec dataSpec, int i3, Format format, int i9, Object obj, byte[] bArr) {
        super(dataSource, dataSpec, i3, format, i9, obj, C.TIME_UNSET, C.TIME_UNSET);
        this.data = bArr == null ? Util.EMPTY_BYTE_ARRAY : bArr;
    }

    private void maybeExpandData(int i3) {
        byte[] bArr = this.data;
        if (bArr.length < i3 + 16384) {
            this.data = Arrays.copyOf(bArr, bArr.length + 16384);
        }
    }

    @Override
    public final void cancelLoad() {
        this.loadCanceled = true;
    }

    public abstract void consume(byte[] bArr, int i3);

    public byte[] getDataHolder() {
        return this.data;
    }

    @Override
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
            DataSourceUtil.closeQuietly(this.dataSource);
        }
    }
}
