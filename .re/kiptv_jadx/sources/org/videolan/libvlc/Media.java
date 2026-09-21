package org.videolan.libvlc;

/* JADX INFO: loaded from: classes4.dex */
public class Media extends org.videolan.libvlc.VLCObject<org.videolan.libvlc.interfaces.IMedia.Event> implements org.videolan.libvlc.interfaces.IMedia {
    private static final int PARSE_STATUS_INIT = 0;
    private static final int PARSE_STATUS_PARSED = 2;
    private static final int PARSE_STATUS_PARSING = 1;
    private static final java.lang.String TAG = "LibVLC/Media";
    private boolean mCodecOptionSet;
    private long mDuration;
    private boolean mFileCachingSet;
    private final java.lang.String[] mNativeMetas;
    private boolean mNetworkCachingSet;
    private int mParseStatus;
    private org.videolan.libvlc.MediaList mSubItems;
    private int mType;
    private android.net.Uri mUri;

    public Media(org.videolan.libvlc.interfaces.ILibVLC iLibVLC, java.lang.String str) {
        super(iLibVLC);
        this.mUri = null;
        this.mSubItems = null;
        this.mParseStatus = 0;
        this.mNativeMetas = new java.lang.String[25];
        this.mDuration = -1L;
        this.mType = -1;
        this.mCodecOptionSet = false;
        this.mFileCachingSet = false;
        this.mNetworkCachingSet = false;
        nativeNewFromPath(iLibVLC, str);
        this.mUri = org.videolan.libvlc.util.VLCUtil.UriFromMrl(nativeGetMrl());
    }

    private static org.videolan.libvlc.interfaces.IMedia.Track createAudioTrackFromNative(java.lang.String str, java.lang.String str2, boolean z6, java.lang.String str3, java.lang.String str4, int i3, int i9, int i10, int i11, java.lang.String str5, java.lang.String str6, int i12, int i13) {
        return new org.videolan.libvlc.interfaces.IMedia.AudioTrack(str, str2, z6, str3, str4, i3, i9, i10, i11, str5, str6, i12, i13);
    }

    private static org.videolan.libvlc.interfaces.IMedia.Slave createSlaveFromNative(int i3, int i9, java.lang.String str) {
        return new org.videolan.libvlc.interfaces.IMedia.Slave(i3, i9, str);
    }

    private static org.videolan.libvlc.interfaces.IMedia.Stats createStatsFromNative(long j, float f9, long j9, float f10, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, float f11) {
        return new org.videolan.libvlc.interfaces.IMedia.Stats(j, f9, j9, f10, j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, f11);
    }

    private static org.videolan.libvlc.interfaces.IMedia.Track createSubtitleTrackFromNative(java.lang.String str, java.lang.String str2, boolean z6, java.lang.String str3, java.lang.String str4, int i3, int i9, int i10, int i11, java.lang.String str5, java.lang.String str6, java.lang.String str7) {
        return new org.videolan.libvlc.interfaces.IMedia.SubtitleTrack(str, str2, z6, str3, str4, i3, i9, i10, i11, str5, str6, str7);
    }

    private static org.videolan.libvlc.interfaces.IMedia.Track createUnknownTrackFromNative(java.lang.String str, java.lang.String str2, boolean z6, java.lang.String str3, java.lang.String str4, int i3, int i9, int i10, int i11, java.lang.String str5, java.lang.String str6) {
        return new org.videolan.libvlc.interfaces.IMedia.UnknownTrack(str, str2, z6, str3, str4, i3, i9, i10, i11, str5, str6);
    }

    private static org.videolan.libvlc.interfaces.IMedia.Track createVideoTrackFromNative(java.lang.String str, java.lang.String str2, boolean z6, java.lang.String str3, java.lang.String str4, int i3, int i9, int i10, int i11, java.lang.String str5, java.lang.String str6, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
        return new org.videolan.libvlc.interfaces.IMedia.VideoTrack(str, str2, z6, str3, str4, i3, i9, i10, i11, str5, str6, i12, i13, i14, i15, i16, i17, i18, i19);
    }

    private static java.lang.String getMediaCodecModule() {
        return "mediacodec_ndk";
    }

    private native void nativeAddOption(java.lang.String str);

    private native void nativeAddSlave(int i3, int i9, java.lang.String str);

    private native void nativeClearSlaves();

    private native long nativeGetDuration();

    private native java.lang.String nativeGetMeta(int i3);

    private native java.lang.String nativeGetMrl();

    private native org.videolan.libvlc.interfaces.IMedia.Slave[] nativeGetSlaves();

    private native org.videolan.libvlc.interfaces.IMedia.Stats nativeGetStats();

    private native org.videolan.libvlc.interfaces.IMedia.Track[] nativeGetTracks(int i3);

    private native int nativeGetType();

    private native void nativeNewFromFd(org.videolan.libvlc.interfaces.ILibVLC iLibVLC, java.io.FileDescriptor fileDescriptor);

    private native void nativeNewFromFdWithOffsetLength(org.videolan.libvlc.interfaces.ILibVLC iLibVLC, java.io.FileDescriptor fileDescriptor, long j, long j9);

    private native void nativeNewFromLocation(org.videolan.libvlc.interfaces.ILibVLC iLibVLC, java.lang.String str);

    private native void nativeNewFromMediaList(org.videolan.libvlc.interfaces.IMediaList iMediaList, int i3);

    private native void nativeNewFromPath(org.videolan.libvlc.interfaces.ILibVLC iLibVLC, java.lang.String str);

    private native boolean nativeParse(int i3);

    private native boolean nativeParseAsync(int i3, int i9);

    private native void nativeRelease();

    private synchronized void postParse() {
        int i3 = this.mParseStatus;
        if ((i3 & 2) != 0) {
            return;
        }
        this.mParseStatus = (i3 & (-2)) | 2;
        this.mDuration = -1L;
        this.mType = -1;
    }

    @Override // org.videolan.libvlc.interfaces.IMedia
    public void addOption(java.lang.String str) {
        synchronized (this) {
            try {
                if (!this.mCodecOptionSet && str.startsWith(":codec=")) {
                    this.mCodecOptionSet = true;
                }
                if (!this.mNetworkCachingSet && str.startsWith(":network-caching=")) {
                    this.mNetworkCachingSet = true;
                }
                if (!this.mFileCachingSet && str.startsWith(":file-caching=")) {
                    this.mFileCachingSet = true;
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        nativeAddOption(str);
    }

    @Override // org.videolan.libvlc.interfaces.IMedia
    public void addSlave(org.videolan.libvlc.interfaces.IMedia.Slave slave) {
        nativeAddSlave(slave.type, slave.priority, slave.uri);
    }

    @Override // org.videolan.libvlc.interfaces.IMedia
    public void clearSlaves() {
        nativeClearSlaves();
    }

    @Override // org.videolan.libvlc.interfaces.IMedia
    public long getDuration() {
        synchronized (this) {
            try {
                long j = this.mDuration;
                if (j != -1) {
                    return j;
                }
                if (isReleased()) {
                    return 0L;
                }
                long jNativeGetDuration = nativeGetDuration();
                synchronized (this) {
                    this.mDuration = jNativeGetDuration;
                }
                return jNativeGetDuration;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    @Override // org.videolan.libvlc.VLCObject
    public /* bridge */ /* synthetic */ long getInstance() {
        return super.getInstance();
    }

    @Override // org.videolan.libvlc.VLCObject, org.videolan.libvlc.interfaces.IVLCObject
    public /* bridge */ /* synthetic */ org.videolan.libvlc.interfaces.ILibVLC getLibVLC() {
        return super.getLibVLC();
    }

    @Override // org.videolan.libvlc.interfaces.IMedia
    public java.lang.String getMeta(int i3) {
        return getMeta(i3, false);
    }

    @Override // org.videolan.libvlc.interfaces.IMedia
    public org.videolan.libvlc.interfaces.IMedia.Slave[] getSlaves() {
        return nativeGetSlaves();
    }

    @Override // org.videolan.libvlc.interfaces.IMedia
    public org.videolan.libvlc.interfaces.IMedia.Stats getStats() {
        return nativeGetStats();
    }

    @Override // org.videolan.libvlc.interfaces.IMedia
    public org.videolan.libvlc.interfaces.IMedia.Track[] getTracks(int i3) {
        synchronized (this) {
            try {
                if (isReleased()) {
                    return null;
                }
                return nativeGetTracks(i3);
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    @Override // org.videolan.libvlc.interfaces.IMedia
    public int getType() {
        synchronized (this) {
            try {
                int i3 = this.mType;
                if (i3 != -1) {
                    return i3;
                }
                if (isReleased()) {
                    return 0;
                }
                int iNativeGetType = nativeGetType();
                synchronized (this) {
                    this.mType = iNativeGetType;
                }
                return iNativeGetType;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    @Override // org.videolan.libvlc.interfaces.IMedia
    public synchronized android.net.Uri getUri() {
        return this.mUri;
    }

    @Override // org.videolan.libvlc.interfaces.IMedia
    public synchronized boolean isParsed() {
        return (this.mParseStatus & 2) != 0;
    }

    @Override // org.videolan.libvlc.VLCObject, org.videolan.libvlc.interfaces.IVLCObject
    public /* bridge */ /* synthetic */ boolean isReleased() {
        return super.isReleased();
    }

    @Override // org.videolan.libvlc.VLCObject
    public void onReleaseNative() {
        org.videolan.libvlc.MediaList mediaList = this.mSubItems;
        if (mediaList != null) {
            mediaList.release();
        }
        nativeRelease();
    }

    @Override // org.videolan.libvlc.interfaces.IMedia
    public boolean parse(int i3) {
        boolean z6;
        synchronized (this) {
            try {
                int i9 = this.mParseStatus;
                if ((i9 & 3) == 0) {
                    this.mParseStatus = i9 | 1;
                    z6 = true;
                } else {
                    z6 = false;
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        if (!z6 || !nativeParse(i3)) {
            return false;
        }
        postParse();
        return true;
    }

    @Override // org.videolan.libvlc.interfaces.IMedia
    public boolean parseAsync(int i3, int i9) {
        boolean z6;
        synchronized (this) {
            try {
                int i10 = this.mParseStatus;
                if ((i10 & 3) == 0) {
                    this.mParseStatus = i10 | 1;
                    z6 = true;
                } else {
                    z6 = false;
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        return z6 && nativeParseAsync(i3, i9);
    }

    @Override // org.videolan.libvlc.interfaces.IMedia
    public void setDefaultMediaPlayerOptions() {
        boolean z6;
        if (org.videolan.libvlc.LibVLC.majorVersion() == 3) {
            synchronized (this) {
                z6 = this.mCodecOptionSet;
                this.mCodecOptionSet = true;
            }
            if (!z6) {
                setHWDecoderEnabled(true, false);
            }
        }
        android.net.Uri uri = this.mUri;
        if (uri == null || uri.getScheme() == null || this.mUri.getScheme().equalsIgnoreCase("file") || this.mUri.getLastPathSegment() == null || !this.mUri.getLastPathSegment().toLowerCase().endsWith(".iso")) {
            return;
        }
        addOption(":demux=dvdnav,any");
    }

    @Override // org.videolan.libvlc.interfaces.IMedia
    public void setEventListener(org.videolan.libvlc.interfaces.IMedia.EventListener eventListener) {
        super.setEventListener((org.videolan.libvlc.interfaces.AbstractVLCEvent.Listener) eventListener);
    }

    @Override // org.videolan.libvlc.interfaces.IMedia
    public void setHWDecoderEnabled(boolean z6, boolean z9) {
        if (z6) {
            return;
        }
        addOption(":no-hw-dec");
    }

    @Override // org.videolan.libvlc.interfaces.IMedia
    public java.lang.String getMeta(int i3, boolean z6) {
        if (i3 < 0 || i3 >= 25) {
            return null;
        }
        if (!z6) {
            synchronized (this) {
                try {
                    java.lang.String str = this.mNativeMetas[i3];
                    if (str != null) {
                        return str;
                    }
                    if (isReleased()) {
                        return null;
                    }
                } catch (java.lang.Throwable th) {
                    throw th;
                }
            }
        }
        java.lang.String strNativeGetMeta = nativeGetMeta(i3);
        synchronized (this) {
            this.mNativeMetas[i3] = strNativeGetMeta;
        }
        return strNativeGetMeta;
    }

    @Override // org.videolan.libvlc.VLCObject
    public synchronized org.videolan.libvlc.interfaces.IMedia.Event onEventNative(int i3, long j, long j9, float f9, java.lang.String str) {
        try {
            if (i3 == 0) {
                int i9 = (int) j;
                if (i9 >= 0 && i9 < 25) {
                    this.mNativeMetas[i9] = null;
                }
                return new org.videolan.libvlc.interfaces.IMedia.Event(i3, j);
            }
            if (i3 == 2) {
                this.mDuration = -1L;
            } else if (i3 == 3) {
                postParse();
                return new org.videolan.libvlc.interfaces.IMedia.Event(i3, j);
            }
            return new org.videolan.libvlc.interfaces.IMedia.Event(i3);
        } catch (java.lang.Throwable th) {
            throw th;
        }
    }

    @Override // org.videolan.libvlc.interfaces.IMedia
    public org.videolan.libvlc.MediaList subItems() {
        org.videolan.libvlc.MediaList mediaList;
        synchronized (this) {
            try {
                org.videolan.libvlc.MediaList mediaList2 = this.mSubItems;
                if (mediaList2 != null) {
                    mediaList2.retain();
                    return this.mSubItems;
                }
                org.videolan.libvlc.MediaList mediaList3 = new org.videolan.libvlc.MediaList(this);
                synchronized (this) {
                    this.mSubItems = mediaList3;
                    mediaList3.retain();
                    mediaList = this.mSubItems;
                }
                return mediaList;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    @Override // org.videolan.libvlc.interfaces.IMedia
    public org.videolan.libvlc.interfaces.IMedia.Track[] getTracks() {
        synchronized (this) {
            try {
                if (isReleased()) {
                    return null;
                }
                org.videolan.libvlc.interfaces.IMedia.Track[][] trackArr = new org.videolan.libvlc.interfaces.IMedia.Track[4][];
                int length = 0;
                for (int i3 = 0; i3 < 4; i3++) {
                    org.videolan.libvlc.interfaces.IMedia.Track[] trackArrNativeGetTracks = nativeGetTracks(i3 - 1);
                    trackArr[i3] = trackArrNativeGetTracks;
                    length += trackArrNativeGetTracks != null ? trackArrNativeGetTracks.length : 0;
                }
                if (length == 0) {
                    return null;
                }
                org.videolan.libvlc.interfaces.IMedia.Track[] trackArr2 = new org.videolan.libvlc.interfaces.IMedia.Track[length];
                int length2 = 0;
                for (int i9 = 0; i9 < 4; i9++) {
                    org.videolan.libvlc.interfaces.IMedia.Track[] trackArr3 = trackArr[i9];
                    if (trackArr3 != null) {
                        java.lang.System.arraycopy(trackArr3, 0, trackArr2, length2, trackArr3.length);
                        length2 += trackArr[i9].length;
                    }
                }
                return trackArr2;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    @Override // org.videolan.libvlc.interfaces.IMedia
    public boolean parseAsync(int i3) {
        return parseAsync(i3, -1);
    }

    @Override // org.videolan.libvlc.interfaces.IMedia
    public boolean parse() {
        return parse(8);
    }

    @Override // org.videolan.libvlc.interfaces.IMedia
    public boolean parseAsync() {
        return parseAsync(8);
    }

    public Media(org.videolan.libvlc.interfaces.ILibVLC iLibVLC, android.net.Uri uri) {
        super(iLibVLC);
        this.mUri = null;
        this.mSubItems = null;
        this.mParseStatus = 0;
        this.mNativeMetas = new java.lang.String[25];
        this.mDuration = -1L;
        this.mType = -1;
        this.mCodecOptionSet = false;
        this.mFileCachingSet = false;
        this.mNetworkCachingSet = false;
        nativeNewFromLocation(iLibVLC, org.videolan.libvlc.util.VLCUtil.encodeVLCUri(uri));
        this.mUri = uri;
    }

    public Media(org.videolan.libvlc.interfaces.ILibVLC iLibVLC, java.io.FileDescriptor fileDescriptor) {
        super(iLibVLC);
        this.mUri = null;
        this.mSubItems = null;
        this.mParseStatus = 0;
        this.mNativeMetas = new java.lang.String[25];
        this.mDuration = -1L;
        this.mType = -1;
        this.mCodecOptionSet = false;
        this.mFileCachingSet = false;
        this.mNetworkCachingSet = false;
        nativeNewFromFd(iLibVLC, fileDescriptor);
        this.mUri = org.videolan.libvlc.util.VLCUtil.UriFromMrl(nativeGetMrl());
    }

    public Media(org.videolan.libvlc.interfaces.ILibVLC iLibVLC, android.content.res.AssetFileDescriptor assetFileDescriptor) {
        super(iLibVLC);
        this.mUri = null;
        this.mSubItems = null;
        this.mParseStatus = 0;
        this.mNativeMetas = new java.lang.String[25];
        this.mDuration = -1L;
        this.mType = -1;
        this.mCodecOptionSet = false;
        this.mFileCachingSet = false;
        this.mNetworkCachingSet = false;
        nativeNewFromFdWithOffsetLength(iLibVLC, assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
        this.mUri = org.videolan.libvlc.util.VLCUtil.UriFromMrl(nativeGetMrl());
    }

    public Media(org.videolan.libvlc.interfaces.IMediaList iMediaList, int i3) {
        super(iMediaList);
        this.mUri = null;
        this.mSubItems = null;
        this.mParseStatus = 0;
        this.mNativeMetas = new java.lang.String[25];
        this.mDuration = -1L;
        this.mType = -1;
        this.mCodecOptionSet = false;
        this.mFileCachingSet = false;
        this.mNetworkCachingSet = false;
        if (iMediaList != null && !iMediaList.isReleased()) {
            if (iMediaList.isLocked()) {
                nativeNewFromMediaList(iMediaList, i3);
                this.mUri = org.videolan.libvlc.util.VLCUtil.UriFromMrl(nativeGetMrl());
                return;
            }
            throw new java.lang.IllegalStateException("MediaList should be locked");
        }
        throw new java.lang.IllegalArgumentException("MediaList is null or released");
    }
}
