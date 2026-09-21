package androidx.media3.session;

/* JADX INFO: loaded from: classes.dex */
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
    public final androidx.media3.session.MediaLibraryService.LibraryParams params;
    public final int resultCode;
    public final androidx.media3.session.SessionError sessionError;
    public final V value;
    private final int valueType;
    private static final java.lang.String FIELD_RESULT_CODE = androidx.media3.common.util.Util.intToStringMaxRadix(0);
    private static final java.lang.String FIELD_COMPLETION_TIME_MS = androidx.media3.common.util.Util.intToStringMaxRadix(1);
    private static final java.lang.String FIELD_PARAMS = androidx.media3.common.util.Util.intToStringMaxRadix(2);
    private static final java.lang.String FIELD_VALUE = androidx.media3.common.util.Util.intToStringMaxRadix(3);
    private static final java.lang.String FIELD_VALUE_TYPE = androidx.media3.common.util.Util.intToStringMaxRadix(4);
    private static final java.lang.String FIELD_SESSION_ERROR = androidx.media3.common.util.Util.intToStringMaxRadix(5);

    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface Code {
    }

    private LibraryResult(int i3, long j, androidx.media3.session.MediaLibraryService.LibraryParams libraryParams, androidx.media3.session.SessionError sessionError, V v6, int i9) {
        this.resultCode = i3;
        this.completionTimeMs = j;
        this.params = libraryParams;
        this.sessionError = sessionError;
        this.value = v6;
        this.valueType = i9;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0043  */
    /* JADX WARN: Code duplicated, block: B:17:0x0046  */
    /* JADX WARN: Code duplicated, block: B:19:0x0049  */
    /* JADX WARN: Code duplicated, block: B:22:0x004d  */
    /* JADX WARN: Code duplicated, block: B:24:0x0053  */
    /* JADX WARN: Code duplicated, block: B:27:0x005b  */
    /* JADX WARN: Code duplicated, block: B:31:0x0068  */
    /* JADX WARN: Code duplicated, block: B:33:0x0078  */
    /* JADX WARN: Code duplicated, block: B:36:0x0080  */
    /* JADX WARN: Code duplicated, block: B:40:0x008d  */
    private static androidx.media3.session.LibraryResult<?> fromBundle(android.os.Bundle bundle, java.lang.Integer num, int i3) {
        androidx.media3.session.SessionError sessionError;
        androidx.media3.session.SessionError sessionError2;
        int i9;
        android.os.Bundle bundle2;
        android.os.IBinder binder;
        int i10 = bundle.getInt(FIELD_RESULT_CODE, 0);
        long j = bundle.getLong(FIELD_COMPLETION_TIME_MS, android.os.SystemClock.elapsedRealtime());
        android.os.Bundle bundle3 = bundle.getBundle(FIELD_PARAMS);
        java.lang.Object objFromBundle = null;
        androidx.media3.session.MediaLibraryService.LibraryParams libraryParamsFromBundle = bundle3 == null ? null : androidx.media3.session.MediaLibraryService.LibraryParams.fromBundle(bundle3);
        android.os.Bundle bundle4 = bundle.getBundle(FIELD_SESSION_ERROR);
        if (bundle4 == null) {
            if (i10 != 0) {
                sessionError2 = new androidx.media3.session.SessionError(i10, "no error message provided");
            } else {
                sessionError = null;
            }
            i9 = bundle.getInt(FIELD_VALUE_TYPE);
            if (i9 != 1) {
                if (i9 != 2) {
                    com.google.android.gms.internal.play_billing.AbstractC1864o0.Y(num != null || num.intValue() == 2);
                    bundle2 = bundle.getBundle(FIELD_VALUE);
                    if (bundle2 != null) {
                        objFromBundle = androidx.media3.common.MediaItem.fromBundle(bundle2, i3);
                    }
                } else if (i9 != 3) {
                    com.google.android.gms.internal.play_billing.AbstractC1864o0.Y(num != null || num.intValue() == 3);
                    binder = bundle.getBinder(FIELD_VALUE);
                    if (binder != null) {
                        objFromBundle = androidx.media3.common.util.BundleCollectionUtil.fromBundleList(new androidx.media3.session.C1577f(i3, 7), androidx.media3.common.BundleListRetriever.getList(binder));
                    }
                } else if (i9 != 4) {
                    throw new java.lang.IllegalStateException();
                }
            }
            return new androidx.media3.session.LibraryResult<>(i10, j, libraryParamsFromBundle, sessionError, objFromBundle, i9);
        }
        sessionError2 = androidx.media3.session.SessionError.fromBundle(bundle4);
        sessionError = sessionError2;
        i9 = bundle.getInt(FIELD_VALUE_TYPE);
        if (i9 != 1) {
            if (i9 != 2) {
                com.google.android.gms.internal.play_billing.AbstractC1864o0.Y(num != null || num.intValue() == 2);
                bundle2 = bundle.getBundle(FIELD_VALUE);
                if (bundle2 != null) {
                    objFromBundle = androidx.media3.common.MediaItem.fromBundle(bundle2, i3);
                }
            } else if (i9 != 3) {
                com.google.android.gms.internal.play_billing.AbstractC1864o0.Y(num != null || num.intValue() == 3);
                binder = bundle.getBinder(FIELD_VALUE);
                if (binder != null) {
                    objFromBundle = androidx.media3.common.util.BundleCollectionUtil.fromBundleList(new androidx.media3.session.C1577f(i3, 7), androidx.media3.common.BundleListRetriever.getList(binder));
                }
            } else if (i9 != 4) {
                throw new java.lang.IllegalStateException();
            }
        }
        return new androidx.media3.session.LibraryResult<>(i10, j, libraryParamsFromBundle, sessionError, objFromBundle, i9);
    }

    @java.lang.Deprecated
    public static androidx.media3.session.LibraryResult<androidx.media3.common.MediaItem> fromItemBundle(android.os.Bundle bundle) {
        return fromItemBundle(bundle, 9);
    }

    @java.lang.Deprecated
    public static androidx.media3.session.LibraryResult<p076i4.AbstractC2186b0> fromItemListBundle(android.os.Bundle bundle) {
        return fromItemListBundle(bundle, 9);
    }

    @java.lang.Deprecated
    public static androidx.media3.session.LibraryResult<?> fromUnknownBundle(android.os.Bundle bundle) {
        return fromUnknownBundle(bundle, 9);
    }

    @java.lang.Deprecated
    public static androidx.media3.session.LibraryResult<java.lang.Void> fromVoidBundle(android.os.Bundle bundle) {
        return fromVoidBundle(bundle, 9);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ androidx.media3.common.MediaItem lambda$fromBundle$1(int i3, android.os.Bundle bundle) {
        return androidx.media3.common.MediaItem.fromBundle(bundle, i3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ android.os.Bundle lambda$toBundle$0(int i3, androidx.media3.common.MediaItem mediaItem) {
        return mediaItem.toBundle(i3);
    }

    public static <V> androidx.media3.session.LibraryResult<V> ofError(int i3) {
        return ofError(new androidx.media3.session.SessionError(i3, "no error message provided", android.os.Bundle.EMPTY));
    }

    public static androidx.media3.session.LibraryResult<androidx.media3.common.MediaItem> ofItem(androidx.media3.common.MediaItem mediaItem, androidx.media3.session.MediaLibraryService.LibraryParams libraryParams) {
        verifyMediaItem(mediaItem);
        return new androidx.media3.session.LibraryResult<>(0, android.os.SystemClock.elapsedRealtime(), libraryParams, null, mediaItem, 2);
    }

    public static androidx.media3.session.LibraryResult<p076i4.AbstractC2186b0> ofItemList(java.util.List<androidx.media3.common.MediaItem> list, androidx.media3.session.MediaLibraryService.LibraryParams libraryParams) {
        java.util.Iterator<androidx.media3.common.MediaItem> it = list.iterator();
        while (it.hasNext()) {
            verifyMediaItem(it.next());
        }
        return new androidx.media3.session.LibraryResult<>(0, android.os.SystemClock.elapsedRealtime(), libraryParams, null, p076i4.AbstractC2186b0.u(list), 3);
    }

    public static androidx.media3.session.LibraryResult<java.lang.Void> ofVoid() {
        return new androidx.media3.session.LibraryResult<>(0, android.os.SystemClock.elapsedRealtime(), null, null, null, 1);
    }

    private static void verifyMediaItem(androidx.media3.common.MediaItem mediaItem) {
        com.google.android.gms.internal.play_billing.AbstractC1864o0.M(!android.text.TextUtils.isEmpty(mediaItem.mediaId), "mediaId must not be empty");
        com.google.android.gms.internal.play_billing.AbstractC1864o0.M(mediaItem.mediaMetadata.isBrowsable != null, "mediaMetadata must specify isBrowsable");
        com.google.android.gms.internal.play_billing.AbstractC1864o0.M(mediaItem.mediaMetadata.isPlayable != null, "mediaMetadata must specify isPlayable");
    }

    @java.lang.Deprecated
    public android.os.Bundle toBundle() {
        return toBundle(9);
    }

    public static androidx.media3.session.LibraryResult<androidx.media3.common.MediaItem> fromItemBundle(android.os.Bundle bundle, int i3) {
        return fromBundle(bundle, 2, i3);
    }

    public static androidx.media3.session.LibraryResult<p076i4.AbstractC2186b0> fromItemListBundle(android.os.Bundle bundle, int i3) {
        return fromBundle(bundle, 3, i3);
    }

    public static androidx.media3.session.LibraryResult<?> fromUnknownBundle(android.os.Bundle bundle, int i3) {
        return fromBundle(bundle, null, i3);
    }

    public static androidx.media3.session.LibraryResult<java.lang.Void> fromVoidBundle(android.os.Bundle bundle, int i3) {
        return fromUnknownBundle(bundle, i3);
    }

    public static <V> androidx.media3.session.LibraryResult<V> ofError(int i3, androidx.media3.session.MediaLibraryService.LibraryParams libraryParams) {
        return new androidx.media3.session.LibraryResult<>(i3, android.os.SystemClock.elapsedRealtime(), libraryParams, new androidx.media3.session.SessionError(i3, "no error message provided", android.os.Bundle.EMPTY), null, 4);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0045, code lost:
    
        if (r2 != 4) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public android.os.Bundle toBundle(int i3) {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt(FIELD_RESULT_CODE, this.resultCode);
        bundle.putLong(FIELD_COMPLETION_TIME_MS, this.completionTimeMs);
        androidx.media3.session.MediaLibraryService.LibraryParams libraryParams = this.params;
        if (libraryParams != null) {
            bundle.putBundle(FIELD_PARAMS, libraryParams.toBundle());
        }
        androidx.media3.session.SessionError sessionError = this.sessionError;
        if (sessionError != null) {
            bundle.putBundle(FIELD_SESSION_ERROR, sessionError.toBundle());
        }
        bundle.putInt(FIELD_VALUE_TYPE, this.valueType);
        V v6 = this.value;
        if (v6 != null) {
            int i9 = this.valueType;
            if (i9 != 1) {
                if (i9 == 2) {
                    bundle.putBundle(FIELD_VALUE, ((androidx.media3.common.MediaItem) v6).toBundle(i3));
                    return bundle;
                }
                if (i9 == 3) {
                    bundle.putBinder(FIELD_VALUE, new androidx.media3.common.BundleListRetriever(androidx.media3.common.util.BundleCollectionUtil.toBundleList((p076i4.AbstractC2186b0) this.value, new androidx.media3.session.C1577f(i3, 8))));
                    return bundle;
                }
            }
            throw new java.lang.IllegalStateException();
        }
        return bundle;
    }

    public static androidx.media3.session.LibraryResult<java.lang.Void> ofVoid(androidx.media3.session.MediaLibraryService.LibraryParams libraryParams) {
        return new androidx.media3.session.LibraryResult<>(0, android.os.SystemClock.elapsedRealtime(), libraryParams, null, null, 1);
    }

    public static <V> androidx.media3.session.LibraryResult<V> ofError(androidx.media3.session.SessionError sessionError) {
        return new androidx.media3.session.LibraryResult<>(sessionError.code, android.os.SystemClock.elapsedRealtime(), null, sessionError, null, 4);
    }

    public static <V> androidx.media3.session.LibraryResult<V> ofError(androidx.media3.session.SessionError sessionError, androidx.media3.session.MediaLibraryService.LibraryParams libraryParams) {
        return new androidx.media3.session.LibraryResult<>(sessionError.code, android.os.SystemClock.elapsedRealtime(), libraryParams, sessionError, null, 4);
    }
}
