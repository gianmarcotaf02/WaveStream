package p080i8;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.o;

public final class s extends o implements Function0 {

    public final t f23281h;

    public final char f23282i;

    public s(t tVar, char c9) {
        super(0);
        this.f23281h = tVar;
        this.f23282i = c9;
    }

    @Override
    public final Object invoke() {
        return "Expected " + this.f23281h.f23284b + " but got " + this.f23282i;
    }
}
