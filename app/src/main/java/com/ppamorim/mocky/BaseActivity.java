package com.ppamorim.mocky;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.ListView;
import butterknife.ButterKnife;
import butterknife.InjectView;
import com.ppamorim.library.Mocky;
import com.ppamorim.mocky.model.Android;
import java.util.ArrayList;

public class BaseActivity extends ActionBarActivity {

  ArrayList<Android> mAndroids;

  @InjectView(R.id.list_view) ListView mListView;

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_base);
    ButterKnife.inject(this);
  }

  private void generateMocky() {
    try {
      //ArrayList<Android> androids = Mocky.arrayList(Android.class, 10);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

}
