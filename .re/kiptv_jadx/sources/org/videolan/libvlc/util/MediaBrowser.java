package org.videolan.libvlc.util;

/* JADX INFO: loaded from: classes4.dex */
public class MediaBrowser {
    private static final java.lang.String IGNORE_LIST_OPTION = ":ignore-filetypes=";
    private static final java.lang.String TAG = "MediaBrowser";
    private boolean mAlive;
    private org.videolan.libvlc.interfaces.IMediaList mBrowserMediaList;
    private final org.videolan.libvlc.interfaces.IMediaList.EventListener mBrowserMediaListEventListener;
    private final java.util.ArrayList<org.videolan.libvlc.interfaces.IMedia> mDiscovererMediaArray;
    private final org.videolan.libvlc.interfaces.IMediaList.EventListener mDiscovererMediaListEventListener;
    private org.videolan.libvlc.util.MediaBrowser.EventListener mEventListener;
    private org.videolan.libvlc.interfaces.IMediaFactory mFactory;
    private android.os.Handler mHandler;
    private final org.videolan.libvlc.interfaces.ILibVLC mILibVlc;
    private java.lang.String mIgnoreList;
    private org.videolan.libvlc.interfaces.IMedia mMedia;
    private final java.util.ArrayList<org.videolan.libvlc.MediaDiscoverer> mMediaDiscoverers;

    public interface EventListener {
        void onBrowseEnd();

        void onMediaAdded(int i3, org.videolan.libvlc.interfaces.IMedia iMedia);

        void onMediaRemoved(int i3, org.videolan.libvlc.interfaces.IMedia iMedia);
    }

    public static class Flag {
        public static final int Interact = 1;
        public static final int NoSlavesAutodetect = 2;
        public static final int ShowHiddenFiles = 4;
    }

    public MediaBrowser(org.videolan.libvlc.interfaces.ILibVLC iLibVLC, org.videolan.libvlc.util.MediaBrowser.EventListener eventListener) {
        this.mMediaDiscoverers = new java.util.ArrayList<>();
        this.mDiscovererMediaArray = new java.util.ArrayList<>();
        this.mIgnoreList = "db,nfo,ini,jpg,jpeg,ljpg,gif,png,pgm,pgmyuv,pbm,pam,tga,bmp,pnm,xpm,xcf,pcx,tif,tiff,lbm,sfv,txt,sub,idx,srt,ssa,ass,smi,utf,utf-8,rt,aqt,txt,usf,jss,cdg,psb,mpsub,mpl2,pjs,dks,stl,vtt,ttml";
        this.mBrowserMediaListEventListener = new org.videolan.libvlc.interfaces.IMediaList.EventListener() { // from class: org.videolan.libvlc.util.MediaBrowser.1
            @Override // org.videolan.libvlc.interfaces.AbstractVLCEvent.Listener
            public void onEvent(org.videolan.libvlc.interfaces.IMediaList.Event event) {
                if (org.videolan.libvlc.util.MediaBrowser.this.mEventListener == null) {
                    return;
                }
                int i3 = event.type;
                if (i3 == 512) {
                    org.videolan.libvlc.util.MediaBrowser.this.mEventListener.onMediaAdded(event.index, event.media);
                } else if (i3 == 514) {
                    org.videolan.libvlc.util.MediaBrowser.this.mEventListener.onMediaRemoved(event.index, event.media);
                } else {
                    if (i3 != 516) {
                        return;
                    }
                    org.videolan.libvlc.util.MediaBrowser.this.mEventListener.onBrowseEnd();
                }
            }
        };
        this.mDiscovererMediaListEventListener = new org.videolan.libvlc.interfaces.IMediaList.EventListener() { // from class: org.videolan.libvlc.util.MediaBrowser.2
            @Override // org.videolan.libvlc.interfaces.AbstractVLCEvent.Listener
            public void onEvent(org.videolan.libvlc.interfaces.IMediaList.Event event) {
                if (org.videolan.libvlc.util.MediaBrowser.this.mEventListener == null) {
                    return;
                }
                int i3 = event.type;
                if (i3 == 512) {
                    org.videolan.libvlc.util.MediaBrowser.this.mDiscovererMediaArray.add(event.media);
                    org.videolan.libvlc.util.MediaBrowser.this.mEventListener.onMediaAdded(-1, event.media);
                    return;
                }
                if (i3 != 514) {
                    if (i3 != 516) {
                        return;
                    }
                    org.videolan.libvlc.util.MediaBrowser.this.mEventListener.onBrowseEnd();
                } else {
                    int iIndexOf = org.videolan.libvlc.util.MediaBrowser.this.mDiscovererMediaArray.indexOf(event.media);
                    if (iIndexOf != -1) {
                        org.videolan.libvlc.util.MediaBrowser.this.mDiscovererMediaArray.remove(iIndexOf);
                    }
                    if (iIndexOf != -1) {
                        org.videolan.libvlc.util.MediaBrowser.this.mEventListener.onMediaRemoved(iIndexOf, event.media);
                    }
                }
            }
        };
        this.mFactory = (org.videolan.libvlc.interfaces.IMediaFactory) org.videolan.libvlc.FactoryManager.getFactory(org.videolan.libvlc.interfaces.IMediaFactory.factoryId);
        this.mILibVlc = iLibVLC;
        iLibVLC.retain();
        this.mEventListener = eventListener;
        this.mAlive = true;
    }

    private void reset() {
        java.util.Iterator<org.videolan.libvlc.MediaDiscoverer> it = this.mMediaDiscoverers.iterator();
        while (it.hasNext()) {
            it.next().release();
        }
        this.mMediaDiscoverers.clear();
        this.mDiscovererMediaArray.clear();
        org.videolan.libvlc.interfaces.IMedia iMedia = this.mMedia;
        if (iMedia != null) {
            iMedia.release();
            this.mMedia = null;
        }
        org.videolan.libvlc.interfaces.IMediaList iMediaList = this.mBrowserMediaList;
        if (iMediaList != null) {
            iMediaList.release();
            this.mBrowserMediaList = null;
        }
    }

    private void startMediaDiscoverer(java.lang.String str) {
        org.videolan.libvlc.MediaDiscoverer mediaDiscoverer = new org.videolan.libvlc.MediaDiscoverer(this.mILibVlc, str);
        this.mMediaDiscoverers.add(mediaDiscoverer);
        org.videolan.libvlc.MediaList mediaList = mediaDiscoverer.getMediaList();
        mediaList.setEventListener(this.mDiscovererMediaListEventListener, this.mHandler);
        mediaList.release();
        if (mediaDiscoverer.isReleased()) {
            return;
        }
        mediaDiscoverer.start();
    }

    public void browse(java.lang.String str, int i3) {
        org.videolan.libvlc.interfaces.IMedia fromLocalPath = this.mFactory.getFromLocalPath(this.mILibVlc, str);
        browse(fromLocalPath, i3);
        fromLocalPath.release();
    }

    public void changeEventListener(org.videolan.libvlc.util.MediaBrowser.EventListener eventListener) {
        reset();
        this.mEventListener = eventListener;
    }

    public void discoverNetworkShares() {
        reset();
        org.videolan.libvlc.MediaDiscoverer.Description[] list = org.videolan.libvlc.MediaDiscoverer.list(this.mILibVlc, 1);
        if (list == null) {
            return;
        }
        for (org.videolan.libvlc.MediaDiscoverer.Description description : list) {
            android.util.Log.i(TAG, "starting " + description.name + " discover (" + description.longName + ")");
            startMediaDiscoverer(description.name);
        }
    }

    public org.videolan.libvlc.interfaces.IMedia getMediaAt(int i3) {
        if (i3 < 0 || i3 >= getMediaCount()) {
            throw new java.lang.IndexOutOfBoundsException();
        }
        org.videolan.libvlc.interfaces.IMediaList iMediaList = this.mBrowserMediaList;
        org.videolan.libvlc.interfaces.IMedia mediaAt = iMediaList != null ? iMediaList.getMediaAt(i3) : this.mDiscovererMediaArray.get(i3);
        mediaAt.retain();
        return mediaAt;
    }

    public int getMediaCount() {
        org.videolan.libvlc.interfaces.IMediaList iMediaList = this.mBrowserMediaList;
        return iMediaList != null ? iMediaList.getCount() : this.mDiscovererMediaArray.size();
    }

    public void release() {
        reset();
        if (!this.mAlive) {
            throw new java.lang.IllegalStateException("MediaBrowser released more than one time");
        }
        this.mILibVlc.release();
        this.mAlive = false;
    }

    public void setIgnoreFileTypes(java.lang.String str) {
        this.mIgnoreList = str;
    }

    public void browse(android.net.Uri uri, int i3) {
        org.videolan.libvlc.interfaces.IMedia fromUri = this.mFactory.getFromUri(this.mILibVlc, uri);
        browse(fromUri, i3);
        fromUri.release();
    }

    public void browse(org.videolan.libvlc.interfaces.IMedia iMedia, int i3) {
        iMedia.retain();
        iMedia.addOption(IGNORE_LIST_OPTION + this.mIgnoreList);
        if ((i3 & 2) != 0) {
            iMedia.addOption(":no-sub-autodetect-file");
        }
        if ((i3 & 4) != 0) {
            iMedia.addOption(":show-hiddenfiles");
        }
        int i9 = (i3 & 1) != 0 ? 34 : 2;
        reset();
        org.videolan.libvlc.interfaces.IMediaList iMediaListSubItems = iMedia.subItems();
        this.mBrowserMediaList = iMediaListSubItems;
        iMediaListSubItems.setEventListener(this.mBrowserMediaListEventListener, this.mHandler);
        iMedia.parseAsync(i9, 0);
        this.mMedia = iMedia;
    }

    public void discoverNetworkShares(java.lang.String str) {
        reset();
        startMediaDiscoverer(str);
    }

    public MediaBrowser(org.videolan.libvlc.interfaces.ILibVLC iLibVLC, org.videolan.libvlc.util.MediaBrowser.EventListener eventListener, android.os.Handler handler) {
        this(iLibVLC, eventListener);
        this.mHandler = handler;
    }
}
