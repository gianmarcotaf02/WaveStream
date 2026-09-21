package androidx.media3.common.text;

/* JADX INFO: loaded from: classes.dex */
public final class VoiceSpan {
    private static final java.lang.String FIELD_NAME = androidx.media3.common.util.Util.intToStringMaxRadix(0);
    public final java.lang.String name;

    public VoiceSpan(java.lang.String str) {
        this.name = str;
    }

    public static androidx.media3.common.text.VoiceSpan fromBundle(android.os.Bundle bundle) {
        java.lang.String string = bundle.getString(FIELD_NAME);
        string.getClass();
        return new androidx.media3.common.text.VoiceSpan(string);
    }

    public android.os.Bundle toBundle() {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString(FIELD_NAME, this.name);
        return bundle;
    }
}
