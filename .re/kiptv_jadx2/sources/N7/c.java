package N7;

import java.util.Iterator;

public final class c implements m {

    public final int f7434a;

    public final m f7435b;

    public final p194x6.j f7436c;

    public c(m sequence, p194x6.j jVar, int i3) {
        this.f7434a = i3;
        switch (i3) {
            case 1:
                kotlin.jvm.internal.m.e(sequence, "sequence");
                this.f7435b = sequence;
                this.f7436c = jVar;
                break;
            default:
                this.f7435b = sequence;
                this.f7436c = jVar;
                break;
        }
    }

    @Override
    public final Iterator iterator() {
        switch (this.f7434a) {
            case 0:
                return new b(this.f7435b.iterator(), this.f7436c);
            default:
                return new h(this);
        }
    }
}
