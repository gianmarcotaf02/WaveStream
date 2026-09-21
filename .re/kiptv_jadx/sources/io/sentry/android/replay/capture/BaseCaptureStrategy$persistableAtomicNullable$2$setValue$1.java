package io.sentry.android.replay.capture;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"T", "Lh6/A;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 6, 0})
public final class BaseCaptureStrategy$persistableAtomicNullable$2$setValue$1 extends kotlin.jvm.internal.o implements kotlin.jvm.functions.Function0 {
    final /* synthetic */ T $oldValue;
    final /* synthetic */ p194x6.n $onChange;
    final /* synthetic */ java.lang.String $propertyName;
    final /* synthetic */ T $value;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseCaptureStrategy$persistableAtomicNullable$2$setValue$1(p194x6.n nVar, java.lang.String str, T t9, T t10) {
        super(0);
        this.$onChange = nVar;
        this.$propertyName = str;
        this.$oldValue = t9;
        this.$value = t10;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ java.lang.Object invoke() {
        m511invoke();
        return p070h6.A.f22523a;
    }

    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
    public final void m511invoke() {
        this.$onChange.invoke(this.$propertyName, this.$oldValue, this.$value);
    }
}
