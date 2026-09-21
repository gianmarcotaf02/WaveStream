package T1;

/* JADX INFO: loaded from: classes.dex */
public final class u implements android.text.TextWatcher, android.text.SpanWatcher {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.lang.Object f9716h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicInteger f9717i = new java.util.concurrent.atomic.AtomicInteger(0);

    public u(java.lang.Object obj) {
        this.f9716h = obj;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(android.text.Editable editable) {
        ((android.text.TextWatcher) this.f9716h).afterTextChanged(editable);
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(java.lang.CharSequence charSequence, int i3, int i9, int i10) {
        ((android.text.TextWatcher) this.f9716h).beforeTextChanged(charSequence, i3, i9, i10);
    }

    @Override // android.text.SpanWatcher
    public final void onSpanAdded(android.text.Spannable spannable, java.lang.Object obj, int i3, int i9) {
        if (this.f9717i.get() <= 0 || !(obj instanceof T1.x)) {
            ((android.text.SpanWatcher) this.f9716h).onSpanAdded(spannable, obj, i3, i9);
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001c A[PHI: r11
  0x001c: PHI (r11v1 int) = (r11v0 int), (r11v3 int) binds: [B:8:0x0011, B:12:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.text.SpanWatcher
    public final void onSpanChanged(android.text.Spannable spannable, java.lang.Object obj, int i3, int i9, int i10, int i11) {
        int i12;
        int i13;
        if (this.f9717i.get() <= 0 || !(obj instanceof T1.x)) {
            if (android.os.Build.VERSION.SDK_INT >= 28) {
                i12 = i3;
                i13 = i10;
            } else {
                if (i3 > i9) {
                    i3 = 0;
                }
                if (i10 > i11) {
                    i12 = i3;
                    i13 = 0;
                } else {
                    i12 = i3;
                    i13 = i10;
                }
            }
            ((android.text.SpanWatcher) this.f9716h).onSpanChanged(spannable, obj, i12, i9, i13, i11);
        }
    }

    @Override // android.text.SpanWatcher
    public final void onSpanRemoved(android.text.Spannable spannable, java.lang.Object obj, int i3, int i9) {
        if (this.f9717i.get() <= 0 || !(obj instanceof T1.x)) {
            ((android.text.SpanWatcher) this.f9716h).onSpanRemoved(spannable, obj, i3, i9);
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(java.lang.CharSequence charSequence, int i3, int i9, int i10) {
        ((android.text.TextWatcher) this.f9716h).onTextChanged(charSequence, i3, i9, i10);
    }
}
