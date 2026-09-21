package androidx.media3.exoplayer.analytics;

import androidx.media3.common.util.Consumer;
import androidx.media3.common.util.ListenerSet;
import androidx.media3.exoplayer.source.LoadEventInfo;
import androidx.media3.exoplayer.source.MediaLoadData;
import androidx.media3.exoplayer.source.MediaSourceEventListener;
import java.io.IOException;

public final class j implements ListenerSet.Event, Consumer {

    public final LoadEventInfo f16544h;

    public final MediaLoadData f16545i;
    public final IOException j;

    public final boolean f16546k;

    public final Object f16547l;

    public j(Object obj, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData, IOException iOException, boolean z6) {
        this.f16547l = obj;
        this.f16544h = loadEventInfo;
        this.f16545i = mediaLoadData;
        this.j = iOException;
        this.f16546k = z6;
    }

    @Override
    public void accept(Object obj) {
        MediaSourceEventListener.EventDispatcher eventDispatcher = (MediaSourceEventListener.EventDispatcher) this.f16547l;
        MediaLoadData mediaLoadData = this.f16545i;
        IOException iOException = this.j;
        eventDispatcher.lambda$loadError$3(this.f16544h, mediaLoadData, iOException, this.f16546k, (MediaSourceEventListener) obj);
    }

    @Override
    public void invoke(Object obj) {
        ((AnalyticsListener) obj).onLoadError((AnalyticsListener.EventTime) this.f16547l, this.f16544h, this.f16545i, this.j, this.f16546k);
    }
}
