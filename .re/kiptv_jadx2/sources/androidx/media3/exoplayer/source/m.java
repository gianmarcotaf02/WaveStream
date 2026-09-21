package androidx.media3.exoplayer.source;

import androidx.media3.common.util.Consumer;
import androidx.media3.datasource.DataSource;
import p068h4.v;

public final class m implements v {

    public final int f16748h;

    public final Object f16749i;
    public final Object j;

    public m(Object obj, Object obj2, int i3) {
        this.f16748h = i3;
        this.f16749i = obj;
        this.j = obj2;
    }

    @Override
    public final Object get() {
        switch (this.f16748h) {
            case 0:
                return ProgressiveMediaSource.Factory.lambda$setDownloadExecutor$1((v) this.f16749i, (Consumer) this.j);
            case 1:
                return SingleSampleMediaSource.Factory.lambda$setDownloadExecutor$0((v) this.f16749i, (Consumer) this.j);
            default:
                return ((DefaultMediaSourceFactory.DelegateFactoryLoader) this.f16749i).lambda$loadSupplier$4((DataSource.Factory) this.j);
        }
    }
}
