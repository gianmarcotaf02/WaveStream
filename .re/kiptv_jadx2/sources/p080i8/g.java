package p080i8;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.y;

public final class g extends o implements Function0 {

    public final int f23260h = 1;

    public final String f23261i;
    public final int j;

    public final o f23262k;

    public final Object f23263l;

    public g(v vVar, String str, int i3, y yVar) {
        super(0);
        this.f23262k = vVar;
        this.f23261i = str;
        this.j = i3;
        this.f23263l = yVar;
    }

    @Override
    public final Object invoke() {
        switch (this.f23260h) {
            case 0:
                return "Can not interpret the string '" + this.f23261i + "' as " + ((d) ((h) this.f23262k).f23264a.get(this.j)).f23258b + ": " + ((f) this.f23263l).a();
            default:
                return "Expected " + ((v) this.f23262k).f23288b + " but got " + this.f23261i.subSequence(this.j, ((y) this.f23263l).f24555h).toString();
        }
    }

    public g(String str, h hVar, int i3, f fVar) {
        super(0);
        this.f23261i = str;
        this.f23262k = hVar;
        this.j = i3;
        this.f23263l = fVar;
    }
}
