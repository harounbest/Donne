package bloodbank.ieee.com.bloodbank.LearnFragmentFiles;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ieee.donne.R;


/**
 * Created by rashad on 5/23/16.
 *
 */
public class FactsFragment extends Fragment {

    View root;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        root = inflater.inflate(R.layout.facts, container, false);

        return root;

    }

}
