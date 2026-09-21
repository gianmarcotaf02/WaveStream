package androidx.media3.session;

import android.os.Bundle;
import android.os.IBinder;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.media3.common.BundleListRetriever;
import androidx.media3.common.MediaItem;
import androidx.media3.common.util.BundleCollectionUtil;
import androidx.media3.common.util.Util;
import com.google.android.gms.internal.play_billing.AbstractC1864o0;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Iterator;
import java.util.List;
import p076i4.AbstractC2186b0;

public final class LibraryResult<V> {
    public static final int RESULT_ERROR_BAD_VALUE = -3;
    public static final int RESULT_ERROR_INVALID_STATE = -2;
    public static final int RESULT_ERROR_IO = -5;
    public static final int RESULT_ERROR_NOT_SUPPORTED = -6;
    public static final int RESULT_ERROR_PERMISSION_DENIED = -4;
    public static final int RESULT_ERROR_SESSION_AUTHENTICATION_EXPIRED = -102;
    public static final int RESULT_ERROR_SESSION_CONCURRENT_STREAM_LIMIT = -104;
    public static final int RESULT_ERROR_SESSION_DISCONNECTED = -100;
    public static final int RESULT_ERROR_SESSION_NOT_AVAILABLE_IN_REGION = -106;
    public static final int RESULT_ERROR_SESSION_PARENTAL_CONTROL_RESTRICTED = -105;
    public static final int RESULT_ERROR_SESSION_PREMIUM_ACCOUNT_REQUIRED = -103;
    public static final int RESULT_ERROR_SESSION_SETUP_REQUIRED = -108;
    public static final int RESULT_ERROR_SESSION_SKIP_LIMIT_REACHED = -107;
    public static final int RESULT_ERROR_UNKNOWN = -1;
    public static final int RESULT_INFO_SKIPPED = 1;
    public static final int RESULT_SUCCESS = 0;
    private static final int VALUE_TYPE_ERROR = 4;
    private static final int VALUE_TYPE_ITEM = 2;
    private static final int VALUE_TYPE_ITEM_LIST = 3;
    private static final int VALUE_TYPE_VOID = 1;
    public final long completionTimeMs;
    public final MediaLibraryService.LibraryParams params;
    public final int resultCode;
    public final SessionError sessionError;
    public final V value;
    private final int valueType;
    private static final String FIELD_RESULT_CODE = Util.intToStringMaxRadix(0);
    private static final String FIELD_COMPLETION_TIME_MS = Util.intToStringMaxRadix(1);
    private static final String FIELD_PARAMS = Util.intToStringMaxRadix(2);
    private static final String FIELD_VALUE = Util.intToStringMaxRadix(3);
    private static final String FIELD_VALUE_TYPE = Util.intToStringMaxRadix(4);
    private static final String FIELD_SESSION_ERROR = Util.intToStringMaxRadix(5);

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Code {
    }

    private LibraryResult(int i3, long j, MediaLibraryService.LibraryParams libraryParams, SessionError sessionError, V v6, int i9) {
        this.resultCode = i3;
        this.completionTimeMs = j;
        this.params = libraryParams;
        this.sessionError = sessionError;
        this.value = v6;
        this.valueType = i9;
    }

    private static LibraryResult<?> fromBundle(Bundle bundle, Integer num, int i3) {
        SessionError sessionError;
        SessionError sessionError2;
        int i9;
        Bundle bundle2;
        IBinder binder;
        int i10 = bundle.getInt(FIELD_RESULT_CODE, 0);
        long j = bundle.getLong(FIELD_COMPLETION_TIME_MS, SystemClock.elapsedRealtime());
        Bundle bundle3 = bundle.getBundle(FIELD_PARAMS);
        Object objFromBundle = null;
        MediaLibraryService.LibraryParams libraryParamsFromBundle = bundle3 == null ? null : MediaLibraryService.LibraryParams.fromBundle(bundle3);
        Bundle bundle4 = bundle.getBundle(FIELD_SESSION_ERROR);
        if (bundle4 == null) {
            if (i10 != 0) {
                sessionError2 = new SessionError(i10, "no error message provided");
            } else {
                sessionError = null;
            }
            i9 = bundle.getInt(FIELD_VALUE_TYPE);
            if (i9 != 1) {
                if (i9 != 2) {
                    AbstractC1864o0.Y(num != null || num.intValue() == 2);
                    bundle2 = bundle.getBundle(FIELD_VALUE);
                    if (bundle2 != null) {
                        objFromBundle = MediaItem.fromBundle(bundle2, i3);
                    }
                } else if (i9 != 3) {
                    AbstractC1864o0.Y(num != null || num.intValue() == 3);
                    binder = bundle.getBinder(FIELD_VALUE);
                    if (binder != null) {
                        objFromBundle = BundleCollectionUtil.fromBundleList(new C1577f(i3, 7), BundleListRetriever.getList(binder));
                    }
                } else if (i9 != 4) {
                    throw new IllegalStateException();
                }
            }
            return new LibraryResult<>(i10, j, libraryParamsFromBundle, sessionError, objFromBundle, i9);
        }
        sessionError2 = SessionError.fromBundle(bundle4);
        sessionError = sessionError2;
        i9 = bundle.getInt(FIELD_VALUE_TYPE);
        if (i9 != 1) {
            if (i9 != 2) {
                AbstractC1864o0.Y(num != null || num.intValue() == 2);
                bundle2 = bundle.getBundle(FIELD_VALUE);
                if (bundle2 != null) {
                    objFromBundle = MediaItem.fromBundle(bundle2, i3);
                }
            } else if (i9 != 3) {
                AbstractC1864o0.Y(num != null || num.intValue() == 3);
                binder = bundle.getBinder(FIELD_VALUE);
                if (binder != null) {
                    objFromBundle = BundleCollectionUtil.fromBundleList(new C1577f(i3, 7), BundleListRetriever.getList(binder));
                }
            } else if (i9 != 4) {
                throw new IllegalStateException();
            }
        }
        return new LibraryResult<>(i10, j, libraryParamsFromBundle, sessionError, objFromBundle, i9);
    }

    @Deprecated
    public static LibraryResult<MediaItem> fromItemBundle(Bundle bundle) {
        return fromItemBundle(bundle, 9);
    }

    @Deprecated
    public static LibraryResult<AbstractC2186b0> fromItemListBundle(Bundle bundle) {
        return fromItemListBundle(bundle, 9);
    }

    @Deprecated
    public static LibraryResult<?> fromUnknownBundle(Bundle bundle) {
        return fromUnknownBundle(bundle, 9);
    }

    @Deprecated
    public static LibraryResult<Void> fromVoidBundle(Bundle bundle) {
        return fromVoidBundle(bundle, 9);
    }

    public static MediaItem lambda$fromBundle$1(int i3, Bundle bundle) {
        return MediaItem.fromBundle(bundle, i3);
    }

    public static Bundle lambda$toBundle$0(int i3, MediaItem mediaItem) {
        return mediaItem.toBundle(i3);
    }

    public static <V> LibraryResult<V> ofError(int i3) {
        return ofError(new SessionError(i3, "no error message provided", Bundle.EMPTY));
    }

    public static LibraryResult<MediaItem> ofItem(MediaItem mediaItem, MediaLibraryService.LibraryParams libraryParams) {
        verifyMediaItem(mediaItem);
        return new LibraryResult<>(0, SystemClock.elapsedRealtime(), libraryParams, null, mediaItem, 2);
    }

    public static LibraryResult<AbstractC2186b0> ofItemList(List<MediaItem> list, MediaLibraryService.LibraryParams libraryParams) {
        Iterator<MediaItem> it = list.iterator();
        while (it.hasNext()) {
            verifyMediaItem(it.next());
        }
        return new LibraryResult<>(0, SystemClock.elapsedRealtime(), libraryParams, null, AbstractC2186b0.u(list), 3);
    }

    public static LibraryResult<Void> ofVoid() {
        return new LibraryResult<>(0, SystemClock.elapsedRealtime(), null, null, null, 1);
    }

    private static void verifyMediaItem(MediaItem mediaItem) {
        AbstractC1864o0.M(!TextUtils.isEmpty(mediaItem.mediaId), "mediaId must not be empty");
        AbstractC1864o0.M(mediaItem.mediaMetadata.isBrowsable != null, "mediaMetadata must specify isBrowsable");
        AbstractC1864o0.M(mediaItem.mediaMetadata.isPlayable != null, "mediaMetadata must specify isPlayable");
    }

    @Deprecated
    public Bundle toBundle() {
        return toBundle(9);
    }

    public static LibraryResult<MediaItem> fromItemBundle(Bundle bundle, int i3) {
        return fromBundle(bundle, 2, i3);
    }

    public static LibraryResult<AbstractC2186b0> fromItemListBundle(Bundle bundle, int i3) {
        return fromBundle(bundle, 3, i3);
    }

    public static LibraryResult<?> fromUnknownBundle(Bundle bundle, int i3) {
        return fromBundle(bundle, null, i3);
    }

    public static LibraryResult<Void> fromVoidBundle(Bundle bundle, int i3) {
        return fromUnknownBundle(bundle, i3);
    }

    public static <V> LibraryResult<V> ofError(int i3, MediaLibraryService.LibraryParams libraryParams) {
        return new LibraryResult<>(i3, SystemClock.elapsedRealtime(), libraryParams, new SessionError(i3, "no error message provided", Bundle.EMPTY), null, 4);
    }

    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Bundle toBundle(int i3) {
        Bundle bundle = new Bundle();
        bundle.putInt(FIELD_RESULT_CODE, this.resultCode);
        bundle.putLong(FIELD_COMPLETION_TIME_MS, this.completionTimeMs);
        MediaLibraryService.LibraryParams libraryParams = this.params;
        if (libraryParams != null) {
            bundle.putBundle(FIELD_PARAMS, libraryParams.toBundle());
        }
        SessionError sessionError = this.sessionError;
        if (sessionError != null) {
            bundle.putBundle(FIELD_SESSION_ERROR, sessionError.toBundle());
        }
        bundle.putInt(FIELD_VALUE_TYPE, this.valueType);
        V v6 = this.value;
        if (v6 != null) {
            int i9 = this.valueType;
            if (i9 != 1) {
                if (i9 == 2) {
                    bundle.putBundle(FIELD_VALUE, ((MediaItem) v6).toBundle(i3));
                    return bundle;
                }
                if (i9 == 3) {
                    bundle.putBinder(FIELD_VALUE, new BundleListRetriever(BundleCollectionUtil.toBundleList((AbstractC2186b0) this.value, new C1577f(i3, 8))));
                    return bundle;
                }
            }
            throw new IllegalStateException();
        }
        return bundle;
    }

    public static LibraryResult<Void> ofVoid(MediaLibraryService.LibraryParams libraryParams) {
        return new LibraryResult<>(0, SystemClock.elapsedRealtime(), libraryParams, null, null, 1);
    }

    public static <V> LibraryResult<V> ofError(SessionError sessionError) {
        return new LibraryResult<>(sessionError.code, SystemClock.elapsedRealtime(), null, sessionError, null, 4);
    }

    public static <V> LibraryResult<V> ofError(SessionError sessionError, MediaLibraryService.LibraryParams libraryParams) {
        return new LibraryResult<>(sessionError.code, SystemClock.elapsedRealtime(), libraryParams, sessionError, null, 4);
    }
}
