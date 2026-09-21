package androidx.media3.common;

/* JADX INFO: loaded from: classes.dex */
public interface GlObjectsProvider {
    androidx.media3.common.GlTextureInfo createBuffersForTexture(int i3, int i9, int i10);

    android.opengl.EGLContext createEglContext(android.opengl.EGLDisplay eGLDisplay, int i3, int[] iArr);

    android.opengl.EGLSurface createEglSurface(android.opengl.EGLDisplay eGLDisplay, java.lang.Object obj, int i3, boolean z6);

    android.opengl.EGLSurface createFocusedPlaceholderEglSurface(android.opengl.EGLContext eGLContext, android.opengl.EGLDisplay eGLDisplay);

    void release(android.opengl.EGLDisplay eGLDisplay);
}
