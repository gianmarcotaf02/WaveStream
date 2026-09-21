package P5;

import J5.V;
import V7.InterfaceC0981g;
import V7.InterfaceC0982h;
import p070h6.A;

public final class d implements InterfaceC0981g {

    public final int f8149h;

    public final InterfaceC0981g f8150i;

    public d(InterfaceC0981g interfaceC0981g, int i3) {
        this.f8149h = i3;
        this.f8150i = interfaceC0981g;
    }

    @Override
    public final Object collect(InterfaceC0982h interfaceC0982h, p100l6.c cVar) {
        switch (this.f8149h) {
            case 0:
                Object objCollect = this.f8150i.collect(new V(interfaceC0982h, 2), cVar);
                return objCollect == p109m6.a.f25430h ? objCollect : A.f22523a;
            case 1:
                Object objCollect2 = this.f8150i.collect(new V(interfaceC0982h, 3), cVar);
                return objCollect2 == p109m6.a.f25430h ? objCollect2 : A.f22523a;
            default:
                Object objCollect3 = this.f8150i.collect(new V(interfaceC0982h, 7), cVar);
                return objCollect3 == p109m6.a.f25430h ? objCollect3 : A.f22523a;
        }
    }
}
