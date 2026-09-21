package androidx.media3.datasource;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import androidx.media3.common.util.BitmapLoader;
import androidx.media3.common.util.Util;
import com.google.android.gms.internal.play_billing.V0;
import com.google.common.util.concurrent.J;
import com.google.common.util.concurrent.K;
import com.google.common.util.concurrent.L;
import com.google.common.util.concurrent.P;
import java.util.concurrent.Executors;
import p068h4.v;

public final class DataSourceBitmapLoader implements BitmapLoader {
    public static final v DEFAULT_EXECUTOR_SERVICE = V0.x(new a());
    private final DataSource.Factory dataSourceFactory;
    private final K listeningExecutorService;
    private final boolean makeShared;
    private final int maximumOutputDimension;
    private final BitmapFactory.Options options;

    public static final class Builder {
        private final Context context;
        private DataSource.Factory dataSourceFactory;
        private K listeningExecutorService;
        private boolean makeShared;
        private int maximumOutputDimension = -1;
        private BitmapFactory.Options options;

        public Builder(Context context) {
            this.context = context;
        }

        public DataSourceBitmapLoader build() {
            return new DataSourceBitmapLoader(this);
        }

        public Builder setBitmapFactoryOptions(BitmapFactory.Options options) {
            this.options = options;
            return this;
        }

        public Builder setDataSourceFactory(DataSource.Factory factory) {
            this.dataSourceFactory = factory;
            return this;
        }

        public Builder setExecutorService(K k9) {
            this.listeningExecutorService = k9;
            return this;
        }

        public Builder setMakeShared(boolean z6) {
            this.makeShared = z6;
            return this;
        }

        public Builder setMaximumOutputDimension(int i3) {
            this.maximumOutputDimension = i3;
            return this;
        }
    }

    public Bitmap lambda$decodeBitmap$1(byte[] bArr) {
        return maybeAsShared(this.makeShared, BitmapUtil.decode(bArr, bArr.length, this.options, this.maximumOutputDimension));
    }

    public Bitmap lambda$loadBitmap$2(Uri uri) {
        return load(this.dataSourceFactory.createDataSource(), uri, this.options, this.maximumOutputDimension, this.makeShared);
    }

    public static K lambda$static$0() {
        return P.j0(Executors.newSingleThreadExecutor());
    }

    private static Bitmap load(DataSource dataSource, Uri uri, BitmapFactory.Options options, int i3, boolean z6) {
        try {
            dataSource.open(new DataSpec(uri));
            byte[] toEnd = DataSourceUtil.readToEnd(dataSource);
            return maybeAsShared(z6, BitmapUtil.decode(toEnd, toEnd.length, options, i3));
        } finally {
            dataSource.close();
        }
    }

    private static Bitmap maybeAsShared(boolean z6, Bitmap bitmap) {
        return z6 ? BitmapUtil.makeShared(bitmap) : bitmap;
    }

    @Override
    public J decodeBitmap(byte[] bArr) {
        return ((L) this.listeningExecutorService).b(new b(this, bArr, 0));
    }

    @Override
    public J loadBitmap(Uri uri) {
        return ((L) this.listeningExecutorService).b(new b(this, uri, 1));
    }

    @Override
    public boolean supportsMimeType(String str) {
        return Util.isBitmapFactorySupportedMimeType(str);
    }

    @Deprecated
    public DataSourceBitmapLoader(Context context) {
        this(new Builder(context));
    }

    @Deprecated
    public DataSourceBitmapLoader(Context context, int i3) {
        this(new Builder(context).setMaximumOutputDimension(i3));
    }

    @Deprecated
    public DataSourceBitmapLoader(K k9, DataSource.Factory factory) {
        this(k9, factory, null);
    }

    @Deprecated
    public DataSourceBitmapLoader(K k9, DataSource.Factory factory, BitmapFactory.Options options) {
        this(k9, factory, options, -1);
    }

    @Deprecated
    public DataSourceBitmapLoader(K k9, DataSource.Factory factory, BitmapFactory.Options options, int i3) {
        this.listeningExecutorService = k9;
        this.dataSourceFactory = factory;
        this.options = options;
        this.maximumOutputDimension = i3;
        this.makeShared = false;
    }

    private DataSourceBitmapLoader(Builder builder) {
        DataSource.Factory factory;
        K k9;
        if (builder.dataSourceFactory != null) {
            factory = builder.dataSourceFactory;
        } else {
            factory = new DefaultDataSource.Factory(builder.context);
        }
        this.dataSourceFactory = factory;
        if (builder.listeningExecutorService != null) {
            k9 = builder.listeningExecutorService;
        } else {
            k9 = (K) DEFAULT_EXECUTOR_SERVICE.get();
            k9.getClass();
        }
        this.listeningExecutorService = k9;
        this.options = builder.options;
        this.maximumOutputDimension = builder.maximumOutputDimension;
        this.makeShared = builder.makeShared;
    }
}
