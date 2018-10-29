package np.com.bsubash.awesomedialog;

import android.app.Dialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import np.com.bsubash.awesomedialoglibrary.AwesomeAlertDialog;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AwesomeAlertDialog dialog = new AwesomeAlertDialog(this, AwesomeAlertDialog.SUCCESS_TYPE);
        dialog.setTitleText("It's Working !");
        dialog.setConfirmText("OK");
        dialog.setConfirmClickListener(Dialog::dismiss);
        dialog.show();
    }
}