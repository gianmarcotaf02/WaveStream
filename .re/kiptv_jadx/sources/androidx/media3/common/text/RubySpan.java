package androidx.media3.common.text;

/* JADX INFO: loaded from: classes.dex */
public final class RubySpan implements androidx.media3.common.text.LanguageFeatureSpan {
    public final int position;
    public final java.lang.String rubyText;
    private static final java.lang.String FIELD_TEXT = androidx.media3.common.util.Util.intToStringMaxRadix(0);
    private static final java.lang.String FIELD_POSITION = androidx.media3.common.util.Util.intToStringMaxRadix(1);

    public RubySpan(java.lang.String str, int i3) {
        this.rubyText = str;
        this.position = i3;
    }

    public static androidx.media3.common.text.RubySpan fromBundle(android.os.Bundle bundle) {
        java.lang.String string = bundle.getString(FIELD_TEXT);
        string.getClass();
        return new androidx.media3.common.text.RubySpan(string, bundle.getInt(FIELD_POSITION));
    }

    public android.os.Bundle toBundle() {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString(FIELD_TEXT, this.rubyText);
        bundle.putInt(FIELD_POSITION, this.position);
        return bundle;
    }
}
