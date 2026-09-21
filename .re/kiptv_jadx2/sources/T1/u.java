package T1;

import android.os.Build;
import android.text.Editable;
import android.text.SpanWatcher;
import android.text.Spannable;
import android.text.TextWatcher;
import java.util.concurrent.atomic.AtomicInteger;

public final class u implements TextWatcher, SpanWatcher {

    public final Object f9716h;

    public final AtomicInteger f9717i = new AtomicInteger(0);

    public u(Object obj) {
        this.f9716h = obj;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        ((TextWatcher) this.f9716h).afterTextChanged(editable);
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i3, int i9, int i10) {
        ((TextWatcher) this.f9716h).beforeTextChanged(charSequence, i3, i9, i10);
    }

    @Override
    public final void onSpanAdded(Spannable spannable, Object obj, int i3, int i9) {
        if (this.f9717i.get() <= 0 || !(obj instanceof x)) {
            ((SpanWatcher) this.f9716h).onSpanAdded(spannable, obj, i3, i9);
        }
    }

    @Override
    public final void onSpanChanged(Spannable spannable, Object obj, int i3, int i9, int i10, int i11) {
        int i12;
        int i13;
        if (this.f9717i.get() <= 0 || !(obj instanceof x)) {
            if (Build.VERSION.SDK_INT >= 28) {
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
            ((SpanWatcher) this.f9716h).onSpanChanged(spannable, obj, i12, i9, i13, i11);
        }
    }

    @Override
    public final void onSpanRemoved(Spannable spannable, Object obj, int i3, int i9) {
        if (this.f9717i.get() <= 0 || !(obj instanceof x)) {
            ((SpanWatcher) this.f9716h).onSpanRemoved(spannable, obj, i3, i9);
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i3, int i9, int i10) {
        ((TextWatcher) this.f9716h).onTextChanged(charSequence, i3, i9, i10);
    }
}
