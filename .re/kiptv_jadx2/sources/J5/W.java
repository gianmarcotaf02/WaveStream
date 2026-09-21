package J5;

import V7.InterfaceC0981g;
import V7.InterfaceC0982h;

public final class W implements InterfaceC0981g {

    public final int f6289h;

    public final V7.W f6290i;

    public W(V7.W w6, int i3) {
        this.f6289h = i3;
        this.f6290i = w6;
    }

    @Override
    public final Object collect(InterfaceC0982h interfaceC0982h, p100l6.c cVar) {
        switch (this.f6289h) {
            case 0:
                this.f6290i.collect(new V(interfaceC0982h, 0), cVar);
                break;
            case 1:
                this.f6290i.collect(new V(interfaceC0982h, 5), cVar);
                break;
            case 2:
                this.f6290i.collect(new V(interfaceC0982h, 8), cVar);
                break;
            default:
                this.f6290i.collect(new V(interfaceC0982h, 9), cVar);
                break;
        }
        return p109m6.a.f25430h;
    }
}
