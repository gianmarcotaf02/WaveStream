package androidx.media3.exoplayer.hls;

import androidx.media3.datasource.DataSource;

public final class DefaultHlsDataSourceFactory implements HlsDataSourceFactory {
    private final DataSource.Factory dataSourceFactory;

    public DefaultHlsDataSourceFactory(DataSource.Factory factory) {
        this.dataSourceFactory = factory;
    }

    @Override
    public DataSource createDataSource(int i3) {
        return this.dataSourceFactory.createDataSource();
    }
}
