package io.sentry.android.replay.capture;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.o;
import p070h6.A;
import p194x6.n;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"T", "Lh6/A;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 6, 0})
public final class BaseCaptureStrategy$persistableAtomicNullable$2$setValue$1 extends o implements Function0 {
    final T $oldValue;
    final n $onChange;
    final String $propertyName;
    final T $value;

    public BaseCaptureStrategy$persistableAtomicNullable$2$setValue$1(n nVar, String str, T t9, T t10) {
        super(0);
        this.$onChange = nVar;
        this.$propertyName = str;
        this.$oldValue = t9;
        this.$value = t10;
    }

    @Override
    public Object invoke() {
        m511invoke();
        return A.f22523a;
    }

    public final void m511invoke() {
        this.$onChange.invoke(this.$propertyName, this.$oldValue, this.$value);
    }
}
