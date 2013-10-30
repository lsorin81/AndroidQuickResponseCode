package ro.cvu.android.qrscan;

import ro.cvu.android.qrscan.camera.CameraManager;
import android.graphics.Bitmap;
import android.os.Handler;

import com.google.zxing.Result;

public interface IDecoderActivity {

    public ViewfinderView getViewfinder();

    public Handler getHandler();

    public CameraManager getCameraManager();

    public void handleDecode(Result rawResult, Bitmap barcode);
}
