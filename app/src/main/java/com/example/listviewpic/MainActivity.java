//��򵥵Ĵ�ͼƬ��listview
package com.example.listviewpic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;
import android.widget.SimpleAdapter;


public class MainActivity extends Activity {
	 private ListView lv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //mylistΪ��listview��һ������
        setContentView(R.layout.mylist);
        lv = (ListView) findViewById(R.id.listview);
        //activity_main��������listview�ľ�����ʽ��adapterΪ������ͼ�����ݵ�����
                SimpleAdapter adapter = new SimpleAdapter(this, getData(),
                R.layout.activity_main, new String[] { "img", "title", "info" },
                new int[] { R.id.img, R.id.title, R.id.info });
        lv.setAdapter(adapter);
    }
    
    private List<Map<String, Object>> getData() { //list���͵ķ���
        List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("img", R.drawable.zhuanyepic);
        map.put("title", "小明");
        map.put("info", "小明");
        list.add(map);

        map = new HashMap<String, Object>();
        map.put("img", R.drawable.zhuanyepic);
        map.put("title", "����");
        map.put("info", "�ذ�����");
        list.add(map);

        /*map = new HashMap<String, Object>();
        map.put("img", R.drawable.ic_launcher);
        map.put("title", "�̲�");
        map.put("info", "�崿����");
        list.add(map);

        map = new HashMap<String, Object>();
        map.put("img", R.drawable.ic_launcher);
        map.put("title", "���");
        map.put("info", "��С��");
        list.add(map);

        map = new HashMap<String, Object>();
        map.put("img", R.drawable.ic_launcher);
        map.put("title", "hello");
        map.put("info", "every thing");
        list.add(map);

        map = new HashMap<String, Object>();
        map.put("img", R.drawable.ic_launcher);
        map.put("title", "world");
        map.put("info", "hello world");
        list.add(map);*/

        return list; //����list��adapter
    }

   
}
