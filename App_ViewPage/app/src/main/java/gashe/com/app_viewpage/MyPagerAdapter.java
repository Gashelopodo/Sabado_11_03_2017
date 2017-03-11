package gashe.com.app_viewpage;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by cice on 11/3/17.
 */

public class MyPagerAdapter extends FragmentStatePagerAdapter {

    public MyPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;

        switch (position){
            case 0: fragment = new ScreenFragment1();
                break;
            case 1: fragment = new ScreenFragment2();
                break;
            case 2: fragment = new ScreenFragment3();
        }

        return fragment;
    }

    @Override
    public int getCount() {
        return 3;
    }



    @Override
    public CharSequence getPageTitle(int position) {
        String response = "";

        switch (position){
            case 0: response = "OPCION 1";
                break;
            case 1: response = "OPCION 2";
                break;
            case 2: response = "OPCION 3";
        }

        return response;


    }




}
