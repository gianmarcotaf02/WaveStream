package io.sentry.cache;

import java.util.Map;

public final class e implements Runnable {

    public final int f23485h;

    public final PersistingScopeObserver f23486i;
    public final Map j;

    public e(PersistingScopeObserver persistingScopeObserver, Map map, int i3) {
        this.f23485h = i3;
        this.f23486i = persistingScopeObserver;
        this.j = map;
    }

    @Override
    public final void run() {
        switch (this.f23485h) {
            case 0:
                this.f23486i.lambda$setTags$2(this.j);
                break;
            default:
                this.f23486i.lambda$setExtras$3(this.j);
                break;
        }
    }
}
