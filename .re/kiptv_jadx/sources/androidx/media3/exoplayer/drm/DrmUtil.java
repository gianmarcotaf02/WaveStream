package androidx.media3.exoplayer.drm;

/* JADX INFO: loaded from: classes.dex */
public final class DrmUtil {
    public static final int ERROR_SOURCE_EXO_MEDIA_DRM = 1;
    public static final int ERROR_SOURCE_LICENSE_ACQUISITION = 2;
    public static final int ERROR_SOURCE_PROVISIONING = 3;
    private static final int MAX_MANUAL_REDIRECTS = 5;

    @java.lang.annotation.Target({java.lang.annotation.ElementType.FIELD, java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.PARAMETER, java.lang.annotation.ElementType.LOCAL_VARIABLE, java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface ErrorSource {
    }

    private DrmUtil() {
    }

    public static androidx.media3.exoplayer.drm.MediaDrmCallback.Response executePost(androidx.media3.datasource.DataSource dataSource, java.lang.String str, byte[] bArr, java.util.Map<java.lang.String, java.lang.String> map) throws java.lang.Throwable {
        androidx.media3.datasource.DataSpec dataSpec;
        androidx.media3.datasource.DataSourceInputStream dataSourceInputStream;
        androidx.media3.datasource.StatsDataSource statsDataSource = new androidx.media3.datasource.StatsDataSource(dataSource);
        androidx.media3.datasource.DataSpec dataSpecBuild = new androidx.media3.datasource.DataSpec.Builder().setUri(str).setHttpRequestHeaders(map).setHttpMethod(2).setHttpBody(bArr).setFlags(1).build();
        int i3 = 0;
        androidx.media3.datasource.DataSpec dataSpecBuild2 = dataSpecBuild;
        while (true) {
            try {
                androidx.media3.datasource.DataSourceInputStream dataSourceInputStream2 = new androidx.media3.datasource.DataSourceInputStream(statsDataSource, dataSpecBuild2);
                try {
                    byte[] bArrB = p084j4.g.b(dataSourceInputStream2);
                    try {
                        dataSpec = dataSpecBuild;
                        dataSourceInputStream = dataSourceInputStream2;
                        try {
                            androidx.media3.exoplayer.drm.MediaDrmCallback.Response responseBuild = new androidx.media3.exoplayer.drm.MediaDrmCallback.Response.Builder(bArrB).setLoadEventInfo(new androidx.media3.exoplayer.source.LoadEventInfo(-1L, dataSpec, statsDataSource.getLastOpenedUri(), statsDataSource.getLastResponseHeaders(), android.os.SystemClock.elapsedRealtime(), 0L, bArrB.length)).build();
                            androidx.media3.common.util.Util.closeQuietly(dataSourceInputStream);
                            return responseBuild;
                        } catch (androidx.media3.datasource.HttpDataSource.InvalidResponseCodeException e6) {
                            e = e6;
                            try {
                                java.lang.String redirectUrl = getRedirectUrl(e, i3);
                                if (redirectUrl == null) {
                                    throw e;
                                }
                                i3++;
                                dataSpecBuild2 = dataSpecBuild2.buildUpon().setUri(redirectUrl).build();
                                try {
                                    androidx.media3.common.util.Util.closeQuietly(dataSourceInputStream);
                                    dataSpecBuild = dataSpec;
                                } catch (java.lang.Exception e9) {
                                    e = e9;
                                    throw new androidx.media3.exoplayer.drm.MediaDrmCallbackException(dataSpec, statsDataSource.getLastOpenedUri(), statsDataSource.getResponseHeaders(), statsDataSource.getBytesRead(), e);
                                }
                            } catch (java.lang.Throwable th) {
                                th = th;
                                androidx.media3.common.util.Util.closeQuietly(dataSourceInputStream);
                                throw th;
                            }
                        }
                    } catch (androidx.media3.datasource.HttpDataSource.InvalidResponseCodeException e10) {
                        e = e10;
                        dataSpec = dataSpecBuild;
                        dataSourceInputStream = dataSourceInputStream2;
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        dataSourceInputStream = dataSourceInputStream2;
                        androidx.media3.common.util.Util.closeQuietly(dataSourceInputStream);
                        throw th;
                    }
                } catch (androidx.media3.datasource.HttpDataSource.InvalidResponseCodeException e11) {
                    e = e11;
                    dataSourceInputStream = dataSourceInputStream2;
                    dataSpec = dataSpecBuild;
                } catch (java.lang.Throwable th3) {
                    th = th3;
                    dataSourceInputStream = dataSourceInputStream2;
                }
                dataSpecBuild = dataSpec;
            } catch (java.lang.Exception e12) {
                e = e12;
                dataSpec = dataSpecBuild;
            }
        }
    }

    public static int getErrorCodeForMediaDrmException(java.lang.Throwable th, int i3) {
        if (th instanceof android.media.MediaDrm.MediaDrmStateException) {
            return androidx.media3.common.util.Util.getErrorCodeForMediaDrmErrorCode(androidx.media3.common.util.Util.getErrorCodeFromPlatformDiagnosticsInfo(((android.media.MediaDrm.MediaDrmStateException) th).getDiagnosticInfo()));
        }
        if (th instanceof android.media.MediaDrmResetException) {
            return androidx.media3.common.PlaybackException.ERROR_CODE_DRM_SYSTEM_ERROR;
        }
        if ((th instanceof android.media.NotProvisionedException) || isFailureToConstructNotProvisionedException(th)) {
            return androidx.media3.common.PlaybackException.ERROR_CODE_DRM_PROVISIONING_FAILED;
        }
        if (th instanceof android.media.DeniedByServerException) {
            return androidx.media3.common.PlaybackException.ERROR_CODE_DRM_DEVICE_REVOKED;
        }
        if (th instanceof androidx.media3.exoplayer.drm.UnsupportedDrmException) {
            return androidx.media3.common.PlaybackException.ERROR_CODE_DRM_SCHEME_UNSUPPORTED;
        }
        if (th instanceof androidx.media3.exoplayer.drm.DefaultDrmSessionManager.MissingSchemeDataException) {
            return androidx.media3.common.PlaybackException.ERROR_CODE_DRM_CONTENT_ERROR;
        }
        if (th instanceof androidx.media3.exoplayer.drm.KeysExpiredException) {
            return androidx.media3.common.PlaybackException.ERROR_CODE_DRM_LICENSE_EXPIRED;
        }
        if (i3 == 1) {
            return androidx.media3.common.PlaybackException.ERROR_CODE_DRM_SYSTEM_ERROR;
        }
        if (i3 == 2) {
            return androidx.media3.common.PlaybackException.ERROR_CODE_DRM_LICENSE_ACQUISITION_FAILED;
        }
        if (i3 == 3) {
            return androidx.media3.common.PlaybackException.ERROR_CODE_DRM_PROVISIONING_FAILED;
        }
        throw new java.lang.IllegalArgumentException();
    }

    private static java.lang.String getRedirectUrl(androidx.media3.datasource.HttpDataSource.InvalidResponseCodeException invalidResponseCodeException, int i3) {
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> map;
        java.util.List<java.lang.String> list;
        int i9 = invalidResponseCodeException.responseCode;
        if ((i9 != 307 && i9 != 308) || i3 >= 5 || (map = invalidResponseCodeException.headerFields) == null || (list = map.get("Location")) == null || list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public static boolean isFailureToConstructNotProvisionedException(java.lang.Throwable th) {
        return android.os.Build.VERSION.SDK_INT == 34 && (th instanceof java.lang.NoSuchMethodError) && th.getMessage() != null && th.getMessage().contains("Landroid/media/NotProvisionedException;.<init>(");
    }

    public static boolean isFailureToConstructResourceBusyException(java.lang.Throwable th) {
        return android.os.Build.VERSION.SDK_INT == 34 && (th instanceof java.lang.NoSuchMethodError) && th.getMessage() != null && th.getMessage().contains("Landroid/media/ResourceBusyException;.<init>(");
    }
}
