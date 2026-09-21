package androidx.media3.datasource;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Bundle;
import androidx.media3.common.PlaybackException;
import androidx.media3.common.util.Util;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.Objects;

public final class ContentDataSource extends BaseDataSource {
    private AssetFileDescriptor assetFileDescriptor;
    private long bytesRemaining;
    private FileInputStream inputStream;
    private boolean opened;
    private final ContentResolver resolver;
    private Uri uri;

    public static class ContentDataSourceException extends DataSourceException {
        @Deprecated
        public ContentDataSourceException(IOException iOException) {
            this(iOException, 2000);
        }

        public ContentDataSourceException(IOException iOException, int i3) {
            super(iOException, i3);
        }
    }

    public ContentDataSource(Context context) {
        super(false);
        this.resolver = context.getContentResolver();
    }

    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void close() {
        this.uri = null;
        try {
            FileInputStream fileInputStream = this.inputStream;
            if (fileInputStream != null) {
                fileInputStream.close();
            }
            this.inputStream = null;
            try {
                try {
                    AssetFileDescriptor assetFileDescriptor = this.assetFileDescriptor;
                    if (assetFileDescriptor != null) {
                        assetFileDescriptor.close();
                    }
                    this.assetFileDescriptor = null;
                    if (this.opened) {
                        this.opened = false;
                        transferEnded();
                    }
                } catch (IOException e6) {
                    throw new ContentDataSourceException(e6, 2000);
                }
            } catch (Throwable th) {
                this.assetFileDescriptor = null;
                if (this.opened) {
                    this.opened = false;
                    transferEnded();
                }
                throw th;
            }
        } catch (IOException e9) {
            throw new ContentDataSourceException(e9, 2000);
        }
    }

    @Override
    public Uri getUri() {
        return this.uri;
    }

    @Override
    public long open(DataSpec dataSpec) throws ContentDataSourceException {
        int i3;
        AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor;
        try {
            try {
                Uri uriNormalizeScheme = dataSpec.uri.normalizeScheme();
                this.uri = uriNormalizeScheme;
                transferInitializing(dataSpec);
                if (Objects.equals(uriNormalizeScheme.getScheme(), "content")) {
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("android.provider.extra.ACCEPT_ORIGINAL_MEDIA_FORMAT", true);
                    assetFileDescriptorOpenAssetFileDescriptor = this.resolver.openTypedAssetFileDescriptor(uriNormalizeScheme, "*/*", bundle);
                } else {
                    assetFileDescriptorOpenAssetFileDescriptor = this.resolver.openAssetFileDescriptor(uriNormalizeScheme, "r");
                }
                this.assetFileDescriptor = assetFileDescriptorOpenAssetFileDescriptor;
                if (assetFileDescriptorOpenAssetFileDescriptor == null) {
                    i3 = 2000;
                    try {
                        throw new ContentDataSourceException(new IOException("Could not open file descriptor for: " + uriNormalizeScheme), 2000);
                    } catch (IOException e6) {
                        e = e6;
                        throw new ContentDataSourceException(e, e instanceof FileNotFoundException ? PlaybackException.ERROR_CODE_IO_FILE_NOT_FOUND : i3);
                    }
                }
                long length = assetFileDescriptorOpenAssetFileDescriptor.getLength();
                FileInputStream fileInputStream = new FileInputStream(assetFileDescriptorOpenAssetFileDescriptor.getFileDescriptor());
                this.inputStream = fileInputStream;
                if (length != -1 && dataSpec.position > length) {
                    throw new ContentDataSourceException(null, 2008);
                }
                long startOffset = assetFileDescriptorOpenAssetFileDescriptor.getStartOffset();
                long jSkip = fileInputStream.skip(dataSpec.position + startOffset) - startOffset;
                if (jSkip != dataSpec.position) {
                    throw new ContentDataSourceException(null, 2008);
                }
                if (length == -1) {
                    FileChannel channel = fileInputStream.getChannel();
                    long size = channel.size();
                    if (size == 0) {
                        this.bytesRemaining = -1L;
                    } else {
                        long jPosition = size - channel.position();
                        this.bytesRemaining = jPosition;
                        if (jPosition < 0) {
                            throw new ContentDataSourceException(null, 2008);
                        }
                    }
                } else {
                    long j = length - jSkip;
                    this.bytesRemaining = j;
                    if (j < 0) {
                        throw new ContentDataSourceException(null, 2008);
                    }
                }
                long jMin = dataSpec.length;
                if (jMin != -1) {
                    long j9 = this.bytesRemaining;
                    if (j9 != -1) {
                        jMin = Math.min(j9, jMin);
                    }
                    this.bytesRemaining = jMin;
                }
                this.opened = true;
                transferStarted(dataSpec);
                long j10 = dataSpec.length;
                return j10 != -1 ? j10 : this.bytesRemaining;
            } catch (ContentDataSourceException e9) {
                throw e9;
            }
        } catch (IOException e10) {
            e = e10;
            i3 = 2000;
        }
    }

    @Override
    public int read(byte[] bArr, int i3, int i9) throws ContentDataSourceException {
        if (i9 == 0) {
            return 0;
        }
        long j = this.bytesRemaining;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i9 = (int) Math.min(j, i9);
            } catch (IOException e6) {
                throw new ContentDataSourceException(e6, 2000);
            }
        }
        int i10 = ((FileInputStream) Util.castNonNull(this.inputStream)).read(bArr, i3, i9);
        if (i10 == -1) {
            return -1;
        }
        long j9 = this.bytesRemaining;
        if (j9 != -1) {
            this.bytesRemaining = j9 - ((long) i10);
        }
        bytesTransferred(i10);
        return i10;
    }
}
