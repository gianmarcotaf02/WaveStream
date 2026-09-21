package androidx.media3.common;

import androidx.media3.datasource.DataSource;
import androidx.media3.exoplayer.dash.manifest.Representation;
import androidx.media3.exoplayer.dash.offline.DashDownloader;
import java.util.List;
import p068h4.v;

public final class n implements v {

    public final int f16429h = 0;

    public final int f16430i;
    public final Object j;

    public final Object f16431k;

    public final Object f16432l;

    public n(SimpleBasePlayer simpleBasePlayer, SimpleBasePlayer.State state, List list, int i3) {
        this.j = simpleBasePlayer;
        this.f16431k = state;
        this.f16432l = list;
        this.f16430i = i3;
    }

    @Override
    public final Object get() {
        switch (this.f16429h) {
            case 0:
                return ((SimpleBasePlayer) this.j).lambda$addMediaItems$3((SimpleBasePlayer.State) this.f16431k, (List) this.f16432l, this.f16430i);
            default:
                return ((DashDownloader) this.j).lambda$getSegmentIndex$0((DataSource) this.f16431k, this.f16430i, (Representation) this.f16432l);
        }
    }

    public n(DashDownloader dashDownloader, DataSource dataSource, int i3, Representation representation) {
        this.j = dashDownloader;
        this.f16431k = dataSource;
        this.f16430i = i3;
        this.f16432l = representation;
    }
}
