package com.jakb.cropdemo.callback;

import android.graphics.Bitmap;

import javax.security.auth.callback.Callback;

public interface CropCallback extends Callback {
  void onSuccess(Bitmap cropped);
}
