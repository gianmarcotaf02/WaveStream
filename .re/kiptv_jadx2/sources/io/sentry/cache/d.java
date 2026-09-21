package io.sentry.cache;

import java.util.Collection;

public final class d implements Runnable {

    public final int f23483h;

    public final PersistingScopeObserver f23484i;
    public final Collection j;

    public d(PersistingScopeObserver persistingScopeObserver, Collection collection, int i3) {
        this.f23483h = i3;
        this.f23484i = persistingScopeObserver;
        this.j = collection;
    }

    @Override
    public final void run() {
        switch (this.f23483h) {
            case 0:
                this.f23484i.lambda$setBreadcrumbs$1(this.j);
                break;
            default:
                this.f23484i.lambda$setFingerprint$5(this.j);
                break;
        }
    }
}
