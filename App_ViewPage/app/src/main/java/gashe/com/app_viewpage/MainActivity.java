package gashe.com.app_viewpage;

import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    /*Permite la animación y la transición entre fragments*/
    private ViewPager viewPager;

    /*Esta clase suministra las vista al ViewPager*/
    private MyPagerAdapter myPagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        Intent sendIntent = new Intent();
        sendIntent.setAction(Intent.ACTION_SEND);
        sendIntent.putExtra(Intent.EXTRA_TEXT, "This is my text to send.");
        sendIntent.setType("text/plain");
        sendIntent.setPackage("com.whatsapp");

        try {
            startActivity(sendIntent);
        }catch (Exception e){

        }






        viewPager = (ViewPager)findViewById(R.id.myViewPager);
        myPagerAdapter = new MyPagerAdapter(getSupportFragmentManager());

        viewPager.setAdapter(myPagerAdapter);

        TabLayout tabLayout = (TabLayout)findViewById(R.id.tabLayout);
        tabLayout.setupWithViewPager(viewPager);

        tabLayout.getTabAt(0).setIcon(R.mipmap.ic_launcher);
        tabLayout.getTabAt(1).setIcon(R.mipmap.ic_launcher);
        tabLayout.getTabAt(2).setIcon(R.mipmap.ic_launcher);
        tabLayout.getTabAt(1).select();


        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                Log.d(getClass().getCanonicalName(), "TAB SELECTED: " + tab.getText());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
                Log.d(getClass().getCanonicalName(), "TAB DESELECTED: " + tab.getText());
            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {
                Log.d(getClass().getCanonicalName(), "TAB RESELECTED: " + tab.getText());
            }
        });


    }

    @Override
    public void onBackPressed() {

        if(viewPager.getCurrentItem() == 0){
            super.onBackPressed();
        }else{
            viewPager.setCurrentItem(viewPager.getCurrentItem()-1);
        }

    }
}
