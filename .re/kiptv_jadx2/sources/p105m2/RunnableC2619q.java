package p105m2;

import java.util.ArrayList;

public final class RunnableC2619q implements Runnable {

    public final int f25352h;

    public final C2604b f25353i;
    public final C2617o j;

    public final ArrayList f25354k;

    public final AbstractC2620s f25355l;

    public RunnableC2619q(AbstractC2620s abstractC2620s, C2604b c2604b, C2617o c2617o, ArrayList arrayList, int i3) {
        this.f25352h = i3;
        this.f25355l = abstractC2620s;
        this.f25353i = c2604b;
        this.j = c2617o;
        this.f25354k = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f25352h) {
            case 0:
                ArrayList arrayList = this.f25354k;
                this.f25353i.a(this.f25355l, this.j, arrayList);
                break;
            default:
                this.f25353i.a(this.f25355l, this.j, this.f25354k);
                break;
        }
    }
}
