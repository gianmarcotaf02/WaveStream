package org.videolan.libvlc.util;

/* JADX INFO: loaded from: classes4.dex */
public class Dumper {
    private final org.videolan.libvlc.interfaces.ILibVLC mILibVLC;
    private final org.videolan.libvlc.util.Dumper.Listener mListener;
    private final org.videolan.libvlc.MediaPlayer mMediaPlayer;

    public interface Listener {
        void onFinish(boolean z6);

        void onProgress(float f9);
    }

    public Dumper(android.net.Uri uri, java.lang.String str, org.videolan.libvlc.util.Dumper.Listener listener) {
        if (uri == null || str == null || listener == null) {
            throw new java.lang.IllegalArgumentException("arguments shouldn't be null");
        }
        this.mListener = listener;
        java.util.ArrayList arrayList = new java.util.ArrayList(8);
        arrayList.add("--demux");
        arrayList.add("dump2,none");
        arrayList.add("--demuxdump-file");
        arrayList.add(str);
        arrayList.add("--no-video");
        arrayList.add("--no-audio");
        arrayList.add("--no-spu");
        arrayList.add("-vv");
        org.videolan.libvlc.LibVLC libVLC = new org.videolan.libvlc.LibVLC(null, arrayList);
        this.mILibVLC = libVLC;
        org.videolan.libvlc.Media media = new org.videolan.libvlc.Media(libVLC, uri);
        org.videolan.libvlc.MediaPlayer mediaPlayer = new org.videolan.libvlc.MediaPlayer(media);
        this.mMediaPlayer = mediaPlayer;
        mediaPlayer.setEventListener(new org.videolan.libvlc.MediaPlayer.EventListener() { // from class: org.videolan.libvlc.util.Dumper.1
            @Override // org.videolan.libvlc.interfaces.AbstractVLCEvent.Listener
            public void onEvent(org.videolan.libvlc.MediaPlayer.Event event) {
                int i3 = event.type;
                if (i3 == 259) {
                    org.videolan.libvlc.util.Dumper.this.mListener.onProgress(event.getBuffering());
                } else if (i3 == 265 || i3 == 266) {
                    org.videolan.libvlc.util.Dumper.this.mListener.onFinish(event.type == 265);
                    org.videolan.libvlc.util.Dumper.this.cancel();
                }
            }
        });
        media.release();
    }

    public void cancel() {
        this.mMediaPlayer.stop();
        this.mMediaPlayer.release();
        this.mILibVLC.release();
    }

    public void start() {
        this.mMediaPlayer.play();
    }
}
