package androidx.appcompat.widget;

/* JADX INFO: loaded from: classes.dex */
public class SearchView$SearchAutoComplete extends p103m.C2578n {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f15736l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f15737m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final B3.r f15738n;

    public SearchView$SearchAutoComplete(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f15738n = new B3.r(13, this);
        this.f15736l = getThreshold();
    }

    private int getSearchViewTextMinWidthDp() {
        android.content.res.Configuration configuration = getResources().getConfiguration();
        int i3 = configuration.screenWidthDp;
        int i9 = configuration.screenHeightDp;
        if (i3 >= 960 && i9 >= 720 && configuration.orientation == 2) {
            return 256;
        }
        if (i3 >= 600) {
            return androidx.media3.extractor.ts.PsExtractor.AUDIO_STREAM;
        }
        if (i3 < 640 || i9 < 480) {
            return 160;
        }
        return androidx.media3.extractor.ts.PsExtractor.AUDIO_STREAM;
    }

    @Override // android.widget.AutoCompleteTextView
    public final boolean enoughToFilter() {
        return this.f15736l <= 0 || super.enoughToFilter();
    }

    @Override // p103m.C2578n, android.widget.TextView, android.view.View
    public final android.view.inputmethod.InputConnection onCreateInputConnection(android.view.inputmethod.EditorInfo editorInfo) {
        android.view.inputmethod.InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (this.f15737m) {
            B3.r rVar = this.f15738n;
            removeCallbacks(rVar);
            post(rVar);
        }
        return inputConnectionOnCreateInputConnection;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        setMinWidth((int) android.util.TypedValue.applyDimension(1, getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z6, int i3, android.graphics.Rect rect) {
        super.onFocusChanged(z6, i3, rect);
        throw null;
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final boolean onKeyPreIme(int i3, android.view.KeyEvent keyEvent) {
        if (i3 == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                android.view.KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                if (keyDispatcherState != null) {
                    keyDispatcherState.startTracking(keyEvent, this);
                }
                return true;
            }
            if (keyEvent.getAction() == 1) {
                android.view.KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
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

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onWindowFocusChanged(boolean z6) {
        super.onWindowFocusChanged(z6);
        if (z6) {
            throw null;
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public final void performCompletion() {
    }

    @Override // android.widget.AutoCompleteTextView
    public final void replaceText(java.lang.CharSequence charSequence) {
    }

    public void setImeVisibility(boolean z6) {
        android.view.inputmethod.InputMethodManager inputMethodManager = (android.view.inputmethod.InputMethodManager) getContext().getSystemService("input_method");
        B3.r rVar = this.f15738n;
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

    @Override // android.widget.AutoCompleteTextView
    public void setThreshold(int i3) {
        super.setThreshold(i3);
        this.f15736l = i3;
    }

    public void setSearchView(p103m.M0 m8) {
    }
}
