package org.videolan.libvlc;

import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import java.io.FileDescriptor;
import org.videolan.libvlc.interfaces.AbstractVLCEvent;
import org.videolan.libvlc.interfaces.ILibVLC;
import org.videolan.libvlc.interfaces.IMedia;
import org.videolan.libvlc.interfaces.IMediaList;
import org.videolan.libvlc.util.VLCUtil;

public class Media extends VLCObject<IMedia.Event> implements IMedia {
    private static final int PARSE_STATUS_INIT = 0;
    private static final int PARSE_STATUS_PARSED = 2;
    private static final int PARSE_STATUS_PARSING = 1;
    private static final String TAG = "LibVLC/Media";
    private boolean mCodecOptionSet;
    private long mDuration;
    private boolean mFileCachingSet;
    private final String[] mNativeMetas;
    private boolean mNetworkCachingSet;
    private int mParseStatus;
    private MediaList mSubItems;
    private int mType;
    private Uri mUri;

    public Media(ILibVLC iLibVLC, String str) {
        super(iLibVLC);
        this.mUri = null;
        this.mSubItems = null;
        this.mParseStatus = 0;
        this.mNativeMetas = new String[25];
        this.mDuration = -1L;
        this.mType = -1;
        this.mCodecOptionSet = false;
        this.mFileCachingSet = false;
        this.mNetworkCachingSet = false;
        nativeNewFromPath(iLibVLC, str);
        this.mUri = VLCUtil.UriFromMrl(nativeGetMrl());
    }

    private static IMedia.Track createAudioTrackFromNative(String str, String str2, boolean z6, String str3, String str4, int i3, int i9, int i10, int i11, String str5, String str6, int i12, int i13) {
        return new IMedia.AudioTrack(str, str2, z6, str3, str4, i3, i9, i10, i11, str5, str6, i12, i13);
    }

    private static IMedia.Slave createSlaveFromNative(int i3, int i9, String str) {
        return new IMedia.Slave(i3, i9, str);
    }

    private static IMedia.Stats createStatsFromNative(long j, float f9, long j9, float f10, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, float f11) {
        return new IMedia.Stats(j, f9, j9, f10, j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, f11);
    }

    private static IMedia.Track createSubtitleTrackFromNative(String str, String str2, boolean z6, String str3, String str4, int i3, int i9, int i10, int i11, String str5, String str6, String str7) {
        return new IMedia.SubtitleTrack(str, str2, z6, str3, str4, i3, i9, i10, i11, str5, str6, str7);
    }

    private static IMedia.Track createUnknownTrackFromNative(String str, String str2, boolean z6, String str3, String str4, int i3, int i9, int i10, int i11, String str5, String str6) {
        return new IMedia.UnknownTrack(str, str2, z6, str3, str4, i3, i9, i10, i11, str5, str6);
    }

    private static IMedia.Track createVideoTrackFromNative(String str, String str2, boolean z6, String str3, String str4, int i3, int i9, int i10, int i11, String str5, String str6, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
        return new IMedia.VideoTrack(str, str2, z6, str3, str4, i3, i9, i10, i11, str5, str6, i12, i13, i14, i15, i16, i17, i18, i19);
    }

    private static String getMediaCodecModule() {
        return "mediacodec_ndk";
    }

    private native void nativeAddOption(String str);

    private native void nativeAddSlave(int i3, int i9, String str);

    private native void nativeClearSlaves();

    private native long nativeGetDuration();

    private native String nativeGetMeta(int i3);

    private native String nativeGetMrl();

    private native IMedia.Slave[] nativeGetSlaves();

    private native IMedia.Stats nativeGetStats();

    private native IMedia.Track[] nativeGetTracks(int i3);

    private native int nativeGetType();

    private native void nativeNewFromFd(ILibVLC iLibVLC, FileDescriptor fileDescriptor);

    private native void nativeNewFromFdWithOffsetLength(ILibVLC iLibVLC, FileDescriptor fileDescriptor, long j, long j9);

    private native void nativeNewFromLocation(ILibVLC iLibVLC, String str);

    private native void nativeNewFromMediaList(IMediaList iMediaList, int i3);

    private native void nativeNewFromPath(ILibVLC iLibVLC, String str);

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

    @Override
    public void addOption(String str) {
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
            } catch (Throwable th) {
                throw th;
            }
        }
        nativeAddOption(str);
    }

    @Override
    public void addSlave(IMedia.Slave slave) {
        nativeAddSlave(slave.type, slave.priority, slave.uri);
    }

    @Override
    public void clearSlaves() {
        nativeClearSlaves();
    }

    @Override
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
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override
    public long getInstance() {
        return super.getInstance();
    }

    @Override
    public ILibVLC getLibVLC() {
        return super.getLibVLC();
    }

    @Override
    public String getMeta(int i3) {
        return getMeta(i3, false);
    }

    @Override
    public IMedia.Slave[] getSlaves() {
        return nativeGetSlaves();
    }

    @Override
    public IMedia.Stats getStats() {
        return nativeGetStats();
    }

    @Override
    public IMedia.Track[] getTracks(int i3) {
        synchronized (this) {
            try {
                if (isReleased()) {
                    return null;
                }
                return nativeGetTracks(i3);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override
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
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override
    public synchronized Uri getUri() {
        return this.mUri;
    }

    @Override
    public synchronized boolean isParsed() {
        return (this.mParseStatus & 2) != 0;
    }

    @Override
    public boolean isReleased() {
        return super.isReleased();
    }

    @Override
    public void onReleaseNative() {
        MediaList mediaList = this.mSubItems;
        if (mediaList != null) {
            mediaList.release();
        }
        nativeRelease();
    }

    @Override
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
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!z6 || !nativeParse(i3)) {
            return false;
        }
        postParse();
        return true;
    }

    @Override
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
            } catch (Throwable th) {
                throw th;
            }
        }
        return z6 && nativeParseAsync(i3, i9);
    }

    @Override
    public void setDefaultMediaPlayerOptions() {
        boolean z6;
        if (LibVLC.majorVersion() == 3) {
            synchronized (this) {
                z6 = this.mCodecOptionSet;
                this.mCodecOptionSet = true;
            }
            if (!z6) {
                setHWDecoderEnabled(true, false);
            }
        }
        Uri uri = this.mUri;
        if (uri == null || uri.getScheme() == null || this.mUri.getScheme().equalsIgnoreCase("file") || this.mUri.getLastPathSegment() == null || !this.mUri.getLastPathSegment().toLowerCase().endsWith(".iso")) {
            return;
        }
        addOption(":demux=dvdnav,any");
    }

    @Override
    public void setEventListener(IMedia.EventListener eventListener) {
        super.setEventListener((AbstractVLCEvent.Listener) eventListener);
    }

    @Override
    public void setHWDecoderEnabled(boolean z6, boolean z9) {
        if (z6) {
            return;
        }
        addOption(":no-hw-dec");
    }

    @Override
    public String getMeta(int i3, boolean z6) {
        if (i3 < 0 || i3 >= 25) {
            return null;
        }
        if (!z6) {
            synchronized (this) {
                try {
                    String str = this.mNativeMetas[i3];
                    if (str != null) {
                        return str;
                    }
                    if (isReleased()) {
                        return null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        String strNativeGetMeta = nativeGetMeta(i3);
        synchronized (this) {
            this.mNativeMetas[i3] = strNativeGetMeta;
        }
        return strNativeGetMeta;
    }

    @Override
    public synchronized IMedia.Event onEventNative(int i3, long j, long j9, float f9, String str) {
        try {
            if (i3 == 0) {
                int i9 = (int) j;
                if (i9 >= 0 && i9 < 25) {
                    this.mNativeMetas[i9] = null;
                }
                return new IMedia.Event(i3, j);
            }
            if (i3 == 2) {
                this.mDuration = -1L;
            } else if (i3 == 3) {
                postParse();
                return new IMedia.Event(i3, j);
            }
            return new IMedia.Event(i3);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override
    public MediaList subItems() {
        MediaList mediaList;
        synchronized (this) {
            try {
                MediaList mediaList2 = this.mSubItems;
                if (mediaList2 != null) {
                    mediaList2.retain();
                    return this.mSubItems;
                }
                MediaList mediaList3 = new MediaList(this);
                synchronized (this) {
                    this.mSubItems = mediaList3;
                    mediaList3.retain();
                    mediaList = this.mSubItems;
                }
                return mediaList;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override
    public IMedia.Track[] getTracks() {
        synchronized (this) {
            try {
                if (isReleased()) {
                    return null;
                }
                IMedia.Track[][] trackArr = new IMedia.Track[4][];
                int length = 0;
                for (int i3 = 0; i3 < 4; i3++) {
                    IMedia.Track[] trackArrNativeGetTracks = nativeGetTracks(i3 - 1);
                    trackArr[i3] = trackArrNativeGetTracks;
                    length += trackArrNativeGetTracks != null ? trackArrNativeGetTracks.length : 0;
                }
                if (length == 0) {
                    return null;
                }
                IMedia.Track[] trackArr2 = new IMedia.Track[length];
                int length2 = 0;
                for (int i9 = 0; i9 < 4; i9++) {
                    IMedia.Track[] trackArr3 = trackArr[i9];
                    if (trackArr3 != null) {
                        System.arraycopy(trackArr3, 0, trackArr2, length2, trackArr3.length);
                        length2 += trackArr[i9].length;
                    }
                }
                return trackArr2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override
    public boolean parseAsync(int i3) {
        return parseAsync(i3, -1);
    }

    @Override
    public boolean parse() {
        return parse(8);
    }

    @Override
    public boolean parseAsync() {
        return parseAsync(8);
    }

    public Media(ILibVLC iLibVLC, Uri uri) {
        super(iLibVLC);
        this.mUri = null;
        this.mSubItems = null;
        this.mParseStatus = 0;
        this.mNativeMetas = new String[25];
        this.mDuration = -1L;
        this.mType = -1;
        this.mCodecOptionSet = false;
        this.mFileCachingSet = false;
        this.mNetworkCachingSet = false;
        nativeNewFromLocation(iLibVLC, VLCUtil.encodeVLCUri(uri));
        this.mUri = uri;
    }

    public Media(ILibVLC iLibVLC, FileDescriptor fileDescriptor) {
        super(iLibVLC);
        this.mUri = null;
        this.mSubItems = null;
        this.mParseStatus = 0;
        this.mNativeMetas = new String[25];
        this.mDuration = -1L;
        this.mType = -1;
        this.mCodecOptionSet = false;
        this.mFileCachingSet = false;
        this.mNetworkCachingSet = false;
        nativeNewFromFd(iLibVLC, fileDescriptor);
        this.mUri = VLCUtil.UriFromMrl(nativeGetMrl());
    }

    public Media(ILibVLC iLibVLC, AssetFileDescriptor assetFileDescriptor) {
        super(iLibVLC);
        this.mUri = null;
        this.mSubItems = null;
        this.mParseStatus = 0;
        this.mNativeMetas = new String[25];
        this.mDuration = -1L;
        this.mType = -1;
        this.mCodecOptionSet = false;
        this.mFileCachingSet = false;
        this.mNetworkCachingSet = false;
        nativeNewFromFdWithOffsetLength(iLibVLC, assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
        this.mUri = VLCUtil.UriFromMrl(nativeGetMrl());
    }

    public Media(IMediaList iMediaList, int i3) {
        super(iMediaList);
        this.mUri = null;
        this.mSubItems = null;
        this.mParseStatus = 0;
        this.mNativeMetas = new String[25];
        this.mDuration = -1L;
        this.mType = -1;
        this.mCodecOptionSet = false;
        this.mFileCachingSet = false;
        this.mNetworkCachingSet = false;
        if (iMediaList != null && !iMediaList.isReleased()) {
            if (iMediaList.isLocked()) {
                nativeNewFromMediaList(iMediaList, i3);
                this.mUri = VLCUtil.UriFromMrl(nativeGetMrl());
                return;
            }
            throw new IllegalStateException("MediaList should be locked");
        }
        throw new IllegalArgumentException("MediaList is null or released");
    }
}
