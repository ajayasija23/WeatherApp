package in.org.weatherapp.view.fragment;

import android.app.Dialog;
import android.view.Window;
import android.widget.ProgressBar;

import androidx.fragment.app.Fragment;

import in.org.weatherapp.R;

public class BaseFragment extends Fragment {

    public Dialog dialog;
    public void showProgress(){
        dialog=new Dialog(getActivity());
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setContentView(R.layout.dialog_progressbar);
        ProgressBar progressBar=dialog.findViewById(R.id.progressBar);
        dialog.setCancelable(false);
        dialog.show();

    }
    public void hideProgress(){
        if(dialog!=null&&dialog.isShowing()){
            dialog.dismiss();
            dialog=null;
        }

    }


}
