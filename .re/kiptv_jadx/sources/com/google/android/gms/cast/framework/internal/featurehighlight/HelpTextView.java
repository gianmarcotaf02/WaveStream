package com.google.android.gms.cast.framework.internal.featurehighlight;

/* JADX INFO: loaded from: classes.dex */
public class HelpTextView extends android.widget.LinearLayout {
    android.widget.TextView bodyTextView;
    android.widget.TextView headerTextView;

    public HelpTextView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    private void setTextAndVisibility(android.widget.TextView textView, java.lang.CharSequence charSequence) {
        textView.setText(charSequence);
        textView.setVisibility(true != android.text.TextUtils.isEmpty(charSequence) ? 0 : 8);
    }

    public android.view.View asView() {
        return this;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.kiptv.tv.R.id.cast_featurehighlight_help_text_header_view);
        textView.getClass();
        this.headerTextView = textView;
        android.widget.TextView textView2 = (android.widget.TextView) findViewById(com.kiptv.tv.R.id.cast_featurehighlight_help_text_body_view);
        textView2.getClass();
        this.bodyTextView = textView2;
    }

    public void setText(java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2) {
        setTextAndVisibility(this.headerTextView, charSequence);
        setTextAndVisibility(this.bodyTextView, charSequence2);
    }
}
