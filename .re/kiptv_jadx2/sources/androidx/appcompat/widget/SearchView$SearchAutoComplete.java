package androidx.appcompat.widget;

import B3.r;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import androidx.media3.extractor.ts.PsExtractor;
import p103m.C2578n;
import p103m.M0;

public class SearchView$SearchAutoComplete extends C2578n {

    public int f15736l;

    public boolean f15737m;

    public final r f15738n;

    public SearchView$SearchAutoComplete(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f15738n = new r(13, this);
        this.f15736l = getThreshold();
    }

    private int getSearchViewTextMinWidthDp() {
        Configuration configuration = getResources().getConfiguration();
        int i3 = configuration.screenWidthDp;
        int i9 = configuration.screenHeightDp;
        if (i3 >= 960 && i9 >= 720 && configuration.orientation == 2) {
            return 256;
        }
        if (i3 >= 600) {
            return PsExtractor.AUDIO_STREAM;
        }
        if (i3 < 640 || i9 < 480) {
            return 160;
        }
        return PsExtractor.AUDIO_STREAM;
    }

    @Override
    public final boolean enoughToFilter() {
        return this.f15736l <= 0 || super.enoughToFilter();
    }

    @Override
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (this.f15737m) {
            r rVar = this.f15738n;
            removeCallbacks(rVar);
            post(rVar);
        }
        return inputConnectionOnCreateInputConnection;
    }

    @Override
    public final void onFinishInflate() {
        super.onFinishInflate();
        setMinWidth((int) TypedValue.applyDimension(1, getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
    }

    @Override
    public final void onFocusChanged(boolean z6, int i3, Rect rect) {
        super.onFocusChanged(z6, i3, rect);
        throw null;
    }

    @Override
    public final boolean onKeyPreIme(int i3, KeyEvent keyEvent) {
        if (i3 == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                if (keyDispatcherState != null) {
                    keyDispatcherState.startTracking(keyEvent, this);
                }
                return true;
            }
            if (keyEvent.getAction() == 1) {
                KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                if (keyDispatcherState2 != null) {
                    keyDispatcherState2.handleUpEvent(keyEvent);
                }
                if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                    throw null;
                }
            }
        }
        return super.onKeyPreIme(i3, keyEvent);
    }

    @Override
    public final void onWindowFocusChanged(boolean z6) {
        super.onWindowFocusChanged(z6);
        if (z6) {
            throw null;
        }
    }

    @Override
    public final void performCompletion() {
    }

    @Override
    public final void replaceText(CharSequence charSequence) {
    }

    public void setImeVisibility(boolean z6) {
        InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
        r rVar = this.f15738n;
        if (!z6) {
            this.f15737m = false;
            removeCallbacks(rVar);
            inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
        } else {
            if (!inputMethodManager.isActive(this)) {
                this.f15737m = true;
                return;
            }
            this.f15737m = false;
            removeCallbacks(rVar);
            inputMethodManager.showSoftInput(this, 0);
        }
    }

    @Override
    public void setThreshold(int i3) {
        super.setThreshold(i3);
        this.f15736l = i3;
    }

    public void setSearchView(M0 m8) {
    }
}
