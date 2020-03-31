package androidx.camera.core.impl;

import android.os.Handler;
import android.view.Surface;
import androidx.camera.core.ImageProxy;
import java.util.concurrent.Executor;

public interface ImageReaderProxy {

    public interface OnImageAvailableListener {
        void onImageAvailable(ImageReaderProxy imageReaderProxy);
    }

    ImageProxy acquireLatestImage();

    ImageProxy acquireNextImage();

    void close();

    int getHeight();

    int getImageFormat();

    int getMaxImages();

    Surface getSurface();

    int getWidth();

    void setOnImageAvailableListener(OnImageAvailableListener onImageAvailableListener, Handler handler);

    void setOnImageAvailableListener(OnImageAvailableListener onImageAvailableListener, Executor executor);
}
