package p187w7;

import C7.AbstractC0191x;
import D1.AbstractC0220e0;
import N6.InterfaceC0688b;
import Q6.AbstractC0805n;

public final class b extends AbstractC0220e0 {

    public final AbstractC0805n f30473i;

    public b(InterfaceC0688b interfaceC0688b, AbstractC0191x abstractC0191x) {
        super(abstractC0191x);
        if (abstractC0191x == null) {
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "receiverType", "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/ExtensionReceiver", "<init>"));
        }
        this.f30473i = (AbstractC0805n) interfaceC0688b;
    }

    public final String toString() {
        return getType() + ": Ext {" + this.f30473i + "}";
    }
}
