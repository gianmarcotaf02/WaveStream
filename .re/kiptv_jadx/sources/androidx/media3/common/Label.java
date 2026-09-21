package androidx.media3.common;

/* JADX INFO: loaded from: classes.dex */
public class Label {
    private static final java.lang.String FIELD_LANGUAGE_INDEX = androidx.media3.common.util.Util.intToStringMaxRadix(0);
    private static final java.lang.String FIELD_VALUE_INDEX = androidx.media3.common.util.Util.intToStringMaxRadix(1);
    public final java.lang.String language;
    public final java.lang.String value;

    public Label(java.lang.String str, java.lang.String str2) {
        this.language = androidx.media3.common.util.Util.normalizeLanguageCode(str);
        this.value = str2;
    }

    public static androidx.media3.common.Label fromBundle(android.os.Bundle bundle) {
        java.lang.String string = bundle.getString(FIELD_LANGUAGE_INDEX);
        java.lang.String string2 = bundle.getString(FIELD_VALUE_INDEX);
        string2.getClass();
        return new androidx.media3.common.Label(string, string2);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            androidx.media3.common.Label label = (androidx.media3.common.Label) obj;
            if (java.util.Objects.equals(this.language, label.language) && java.util.Objects.equals(this.value, label.value)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = this.value.hashCode() * 31;
        java.lang.String str = this.language;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public android.os.Bundle toBundle() {
        android.os.Bundle bundle = new android.os.Bundle();
        java.lang.String str = this.language;
        if (str != null) {
            bundle.putString(FIELD_LANGUAGE_INDEX, str);
        }
        bundle.putString(FIELD_VALUE_INDEX, this.value);
        return bundle;
    }
}
