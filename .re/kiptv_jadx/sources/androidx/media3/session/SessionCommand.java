package androidx.media3.session;

/* JADX INFO: loaded from: classes.dex */
public final class SessionCommand {
    public static final int COMMAND_CODE_CUSTOM = 0;
    public static final int COMMAND_CODE_LIBRARY_GET_CHILDREN = 50003;
    public static final int COMMAND_CODE_LIBRARY_GET_ITEM = 50004;
    public static final int COMMAND_CODE_LIBRARY_GET_LIBRARY_ROOT = 50000;
    public static final int COMMAND_CODE_LIBRARY_GET_SEARCH_RESULT = 50006;
    public static final int COMMAND_CODE_LIBRARY_SEARCH = 50005;
    public static final int COMMAND_CODE_LIBRARY_SUBSCRIBE = 50001;
    public static final int COMMAND_CODE_LIBRARY_UNSUBSCRIBE = 50002;
    private static final java.lang.String FIELD_COMMAND_CODE;
    private static final java.lang.String FIELD_CUSTOM_ACTION;
    private static final java.lang.String FIELD_CUSTOM_EXTRAS;
    static final p076i4.AbstractC2186b0 LIBRARY_COMMANDS;
    public final int commandCode;
    public final java.lang.String customAction;
    public final android.os.Bundle customExtras;
    public static final int COMMAND_CODE_SESSION_SET_RATING = 40010;
    static final p076i4.AbstractC2186b0 SESSION_COMMANDS = p076i4.AbstractC2186b0.y(java.lang.Integer.valueOf(COMMAND_CODE_SESSION_SET_RATING));

    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface CommandCode {
    }

    static {
        java.lang.Object[] objArr = {50000, java.lang.Integer.valueOf(COMMAND_CODE_LIBRARY_SUBSCRIBE), java.lang.Integer.valueOf(COMMAND_CODE_LIBRARY_UNSUBSCRIBE), java.lang.Integer.valueOf(COMMAND_CODE_LIBRARY_GET_CHILDREN), java.lang.Integer.valueOf(COMMAND_CODE_LIBRARY_GET_ITEM), java.lang.Integer.valueOf(COMMAND_CODE_LIBRARY_SEARCH), java.lang.Integer.valueOf(COMMAND_CODE_LIBRARY_GET_SEARCH_RESULT)};
        p076i4.AbstractC2230y.b(objArr, 7);
        LIBRARY_COMMANDS = p076i4.AbstractC2186b0.r(objArr, 7);
        FIELD_COMMAND_CODE = androidx.media3.common.util.Util.intToStringMaxRadix(0);
        FIELD_CUSTOM_ACTION = androidx.media3.common.util.Util.intToStringMaxRadix(1);
        FIELD_CUSTOM_EXTRAS = androidx.media3.common.util.Util.intToStringMaxRadix(2);
    }

    public SessionCommand(int i3) {
        com.google.android.gms.internal.play_billing.AbstractC1864o0.M(i3 != 0, "commandCode shouldn't be COMMAND_CODE_CUSTOM");
        this.commandCode = i3;
        this.customAction = "";
        this.customExtras = android.os.Bundle.EMPTY;
    }

    public static androidx.media3.session.SessionCommand fromBundle(android.os.Bundle bundle) {
        int i3 = bundle.getInt(FIELD_COMMAND_CODE, 0);
        if (i3 != 0) {
            return new androidx.media3.session.SessionCommand(i3);
        }
        java.lang.String string = bundle.getString(FIELD_CUSTOM_ACTION);
        string.getClass();
        android.os.Bundle bundleConvertToNullIfInvalid = androidx.media3.common.util.Util.convertToNullIfInvalid(bundle.getBundle(FIELD_CUSTOM_EXTRAS));
        if (bundleConvertToNullIfInvalid == null) {
            bundleConvertToNullIfInvalid = android.os.Bundle.EMPTY;
        }
        return new androidx.media3.session.SessionCommand(string, bundleConvertToNullIfInvalid);
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof androidx.media3.session.SessionCommand)) {
            return false;
        }
        androidx.media3.session.SessionCommand sessionCommand = (androidx.media3.session.SessionCommand) obj;
        return this.commandCode == sessionCommand.commandCode && android.text.TextUtils.equals(this.customAction, sessionCommand.customAction);
    }

    public int hashCode() {
        return java.util.Objects.hash(this.customAction, java.lang.Integer.valueOf(this.commandCode));
    }

    public android.os.Bundle toBundle() {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt(FIELD_COMMAND_CODE, this.commandCode);
        bundle.putString(FIELD_CUSTOM_ACTION, this.customAction);
        bundle.putBundle(FIELD_CUSTOM_EXTRAS, this.customExtras);
        return bundle;
    }

    public SessionCommand(java.lang.String str, android.os.Bundle bundle) {
        this.commandCode = 0;
        str.getClass();
        this.customAction = str;
        bundle.getClass();
        this.customExtras = new android.os.Bundle(bundle);
    }
}
