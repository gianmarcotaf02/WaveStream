package androidx.media3.exoplayer.upstream;

/* JADX INFO: loaded from: classes.dex */
public final class ParsingLoadable<T> implements androidx.media3.exoplayer.upstream.Loader.Loadable {
    private final androidx.media3.datasource.StatsDataSource dataSource;
    public final androidx.media3.datasource.DataSpec dataSpec;
    public final long loadTaskId;
    private final androidx.media3.exoplayer.upstream.ParsingLoadable.Parser<? extends T> parser;
    private volatile T result;
    public final int type;

    public interface Parser<T> {
        T parse(android.net.Uri uri, java.io.InputStream inputStream);
    }

    public ParsingLoadable(androidx.media3.datasource.DataSource dataSource, android.net.Uri uri, int i3, androidx.media3.exoplayer.upstream.ParsingLoadable.Parser<? extends T> parser) {
        this(dataSource, new androidx.media3.datasource.DataSpec.Builder().setUri(uri).setFlags(1).build(), i3, parser);
    }

    public static <T> T load(androidx.media3.datasource.DataSource dataSource, androidx.media3.exoplayer.upstream.ParsingLoadable.Parser<? extends T> parser, android.net.Uri uri, int i3) {
        androidx.media3.exoplayer.upstream.ParsingLoadable parsingLoadable = new androidx.media3.exoplayer.upstream.ParsingLoadable(dataSource, uri, i3, parser);
        parsingLoadable.load();
        T t9 = (T) parsingLoadable.getResult();
        t9.getClass();
        return t9;
    }

    public long bytesLoaded() {
        return this.dataSource.getBytesRead();
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.Loadable
    public final void cancelLoad() {
    }

    public java.util.Map<java.lang.String, java.util.List<java.lang.String>> getResponseHeaders() {
        return this.dataSource.getLastResponseHeaders();
    }

    public final T getResult() {
        return this.result;
    }

    public android.net.Uri getUri() {
        return this.dataSource.getLastOpenedUri();
    }

    public ParsingLoadable(androidx.media3.datasource.DataSource dataSource, androidx.media3.datasource.DataSpec dataSpec, int i3, androidx.media3.exoplayer.upstream.ParsingLoadable.Parser<? extends T> parser) {
        this.dataSource = new androidx.media3.datasource.StatsDataSource(dataSource);
        this.dataSpec = dataSpec;
        this.type = i3;
        this.parser = parser;
        this.loadTaskId = androidx.media3.exoplayer.source.LoadEventInfo.getNewId();
    }

    public static <T> T load(androidx.media3.datasource.DataSource dataSource, androidx.media3.exoplayer.upstream.ParsingLoadable.Parser<? extends T> parser, androidx.media3.datasource.DataSpec dataSpec, int i3) {
        androidx.media3.exoplayer.upstream.ParsingLoadable parsingLoadable = new androidx.media3.exoplayer.upstream.ParsingLoadable(dataSource, dataSpec, i3, parser);
        parsingLoadable.load();
        T t9 = (T) parsingLoadable.getResult();
        t9.getClass();
        return t9;
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.Loadable
    public final void load() {
        this.dataSource.resetBytesRead();
        androidx.media3.datasource.DataSourceInputStream dataSourceInputStream = new androidx.media3.datasource.DataSourceInputStream(this.dataSource, this.dataSpec);
        try {
            dataSourceInputStream.open();
            android.net.Uri uri = this.dataSource.getUri();
            uri.getClass();
            this.result = this.parser.parse(uri, dataSourceInputStream);
        } finally {
            androidx.media3.common.util.Util.closeQuietly(dataSourceInputStream);
        }
    }
}
