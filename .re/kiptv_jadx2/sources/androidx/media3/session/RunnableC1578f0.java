package androidx.media3.session;

import androidx.media3.session.legacy.MediaSessionManager;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public final class RunnableC1578f0 implements Runnable {

    public final int f17018h = 0;

    public final int f17019i;
    public final Object j;

    public final Object f17020k;

    public final Object f17021l;

    public final Object f17022m;

    public RunnableC1578f0(MediaControllerImplLegacy mediaControllerImplLegacy, AtomicInteger atomicInteger, List list, ArrayList arrayList, int i3) {
        this.j = mediaControllerImplLegacy;
        this.f17020k = atomicInteger;
        this.f17021l = list;
        this.f17022m = arrayList;
        this.f17019i = i3;
    }

    @Override
    public final void run() {
        switch (this.f17018h) {
            case 0:
                ((MediaControllerImplLegacy) this.j).lambda$addQueueItems$4((AtomicInteger) this.f17020k, (List) this.f17021l, (ArrayList) this.f17022m, this.f17019i);
                break;
            default:
                ((MediaSessionLegacyStub) this.j).lambda$dispatchSessionTaskWithSessionCommandInternal$22((SessionCommand) this.f17020k, this.f17019i, (MediaSessionManager.RemoteUserInfo) this.f17021l, (MediaSessionLegacyStub.SessionTask) this.f17022m);
                break;
        }
    }

    public RunnableC1578f0(MediaSessionLegacyStub mediaSessionLegacyStub, SessionCommand sessionCommand, int i3, MediaSessionManager.RemoteUserInfo remoteUserInfo, MediaSessionLegacyStub.SessionTask sessionTask) {
        this.j = mediaSessionLegacyStub;
        this.f17020k = sessionCommand;
        this.f17019i = i3;
        this.f17021l = remoteUserInfo;
        this.f17022m = sessionTask;
    }
}
