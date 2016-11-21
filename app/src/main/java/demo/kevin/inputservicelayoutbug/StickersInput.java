package demo.kevin.inputservicelayoutbug;

import android.inputmethodservice.InputMethodService;
import android.view.View;

public class StickersInput extends InputMethodService {

  @Override
  public void onCreate() {
    super.onCreate();
  }

  @Override
  public View onCreateInputView() {
    final View keyboardView = getLayoutInflater().inflate(R.layout.stickers_input, null);
    return keyboardView;
  }
}