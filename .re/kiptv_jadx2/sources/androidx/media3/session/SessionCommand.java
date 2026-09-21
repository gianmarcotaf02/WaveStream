package androidx.media3.session;

import android.os.Bundle;
import android.text.TextUtils;
import androidx.media3.common.util.Util;
import com.google.android.gms.internal.play_billing.AbstractC1864o0;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Objects;
import p076i4.AbstractC2186b0;
import p076i4.AbstractC2230y;

public final class SessionCommand {
    public static final int COMMAND_CODE_CUSTOM = 0;
    public static final int COMMAND_CODE_LIBRARY_GET_CHILDREN = 50003;
    public static final int COMMAND_CODE_LIBRARY_GET_ITEM = 50004;
    public static final int COMMAND_CODE_LIBRARY_GET_LIBRARY_ROOT = 50000;
    public static final int COMMAND_CODE_LIBRARY_GET_SEARCH_RESULT = 50006;
    public static final int COMMAND_CODE_LIBRARY_SEARCH = 50005;
    public static final int COMMAND_CODE_LIBRARY_SUBSCRIBE = 50001;
    public static final int COMMAND_CODE_LIBRARY_UNSUBSCRIBE = 50002;
    private static final String FIELD_COMMAND_CODE;
    private static final String FIELD_CUSTOM_ACTION;
    private static final String FIELD_CUSTOM_EXTRAS;
    static final AbstractC2186b0 LIBRARY_COMMANDS;
    public final int commandCode;
    public final String customAction;
    public final Bundle customExtras;
    public static final int COMMAND_CODE_SESSION_SET_RATING = 40010;
    static final AbstractC2186b0 SESSION_COMMANDS = AbstractC2186b0.y(Integer.valueOf(COMMAND_CODE_SESSION_SET_RATING));

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface CommandCode {
    }

    static {
        Object[] objArr = {50000, Integer.valueOf(COMMAND_CODE_LIBRARY_SUBSCRIBE), Integer.valueOf(COMMAND_CODE_LIBRARY_UNSUBSCRIBE), Integer.valueOf(COMMAND_CODE_LIBRARY_GET_CHILDREN), Integer.valueOf(COMMAND_CODE_LIBRARY_GET_ITEM), Integer.valueOf(COMMAND_CODE_LIBRARY_SEARCH), Integer.valueOf(COMMAND_CODE_LIBRARY_GET_SEARCH_RESULT)};
        AbstractC2230y.b(objArr, 7);
        LIBRARY_COMMANDS = AbstractC2186b0.r(objArr, 7);
        FIELD_COMMAND_CODE = Util.intToStringMaxRadix(0);
        FIELD_CUSTOM_ACTION = Util.intToStringMaxRadix(1);
        FIELD_CUSTOM_EXTRAS = Util.intToStringMaxRadix(2);
    }

    public SessionCommand(int i3) {
        AbstractC1864o0.M(i3 != 0, "commandCode shouldn't be COMMAND_CODE_CUSTOM");
        this.commandCode = i3;
        this.customAction = "";
        this.customExtras = Bundle.EMPTY;
    }

    public static SessionCommand fromBundle(Bundle bundle) {
        int i3 = bundle.getInt(FIELD_COMMAND_CODE, 0);
        if (i3 != 0) {
            return new SessionCommand(i3);
        }
        String string = bundle.getString(FIELD_CUSTOM_ACTION);
        string.getClass();
        Bundle bundleConvertToNullIfInvalid = Util.convertToNullIfInvalid(bundle.getBundle(FIELD_CUSTOM_EXTRAS));
        if (bundleConvertToNullIfInvalid == null) {
            bundleConvertToNullIfInvalid = Bundle.EMPTY;
        }
        return new SessionCommand(string, bundleConvertToNullIfInvalid);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof SessionCommand)) {
            return false;
        }
        SessionCommand sessionCommand = (SessionCommand) obj;
        return this.commandCode == sessionCommand.commandCode && TextUtils.equals(this.customAction, sessionCommand.customAction);
    }

    public int hashCode() {
        return Objects.hash(this.customAction, Integer.valueOf(this.commandCode));
    }

    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putInt(FIELD_COMMAND_CODE, this.commandCode);
        bundle.putString(FIELD_CUSTOM_ACTION, this.customAction);
        bundle.putBundle(FIELD_CUSTOM_EXTRAS, this.customExtras);
        return bundle;
    }

    public SessionCommand(String str, Bundle bundle) {
        this.commandCode = 0;
        str.getClass();
        this.customAction = str;
        bundle.getClass();
        this.customExtras = new Bundle(bundle);
    }
}
