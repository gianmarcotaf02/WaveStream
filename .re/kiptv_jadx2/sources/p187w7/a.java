package p187w7;

import C7.AbstractC0191x;
import D1.AbstractC0220e0;
import N6.InterfaceC0688b;
import N6.InterfaceC0691e;
import N6.InterfaceC0698l;
import Q6.AbstractC0805n;
import kotlin.jvm.internal.m;
import p101l7.e;

public final class a extends AbstractC0220e0 implements d {

    public final int f30471i = 1;
    public final e j;

    public final InterfaceC0698l f30472k;

    public a(InterfaceC0688b interfaceC0688b, AbstractC0191x receiverType, e eVar) {
        super(receiverType);
        m.e(receiverType, "receiverType");
        this.f30472k = (AbstractC0805n) interfaceC0688b;
        this.j = eVar;
    }

    public final e E0() {
        switch (this.f30471i) {
            case 0:
                break;
        }
        return this.j;
    }

    public final String toString() {
        switch (this.f30471i) {
            case 0:
                return getType() + ": Ctx { " + ((InterfaceC0691e) this.f30472k) + " }";
            default:
                return "Cxt { " + ((AbstractC0805n) this.f30472k) + " }";
        }
    }

    public a(InterfaceC0691e interfaceC0691e, AbstractC0191x receiverType, e eVar) {
        super(receiverType);
        m.e(receiverType, "receiverType");
        this.f30472k = interfaceC0691e;
        this.j = eVar;
    }
}
