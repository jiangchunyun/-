package main.activity;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import com.example.readingsoftware.R;

/**
 * Created by 上官刀刀 on 2018/8/14.
 */

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private FragmentManager fragmentManager_button;
    private Fragment fragment_good_word=new FragmentGoodword();
    private Fragment fragment_home=new FragmentHome();
    private Fragment fragment_book_shelf=new FragmentBookShelf();
    private Fragment fragment_book_house=new FragmentBookHouse();
    private Fragment fragment_book_chat=new FragmentBookChat();
    View good_word,home,book_shelf,book_chat,book_house;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initView();
        setListener();
    }

    /**
     * 初始化view
     */
    public void initView()
    {
        setContentView(R.layout.activity_main);
        fragmentManager_button=getSupportFragmentManager();
        good_word=findViewById(R.id.good_word);
        home=findViewById(R.id.home);
        book_chat=findViewById(R.id.book_chat);
        book_house=findViewById(R.id.book_house);
        book_shelf=findViewById(R.id.book_shelf);

        FragmentTransaction fragmentTransaction_button=fragmentManager_button.beginTransaction();
        fragmentTransaction_button.add(R.id.content,fragment_good_word);
        fragmentTransaction_button.add(R.id.content,fragment_book_chat);
        fragmentTransaction_button.add(R.id.content,fragment_home);
        fragmentTransaction_button.add(R.id.content,fragment_book_house);
        fragmentTransaction_button.add(R.id.content,fragment_book_shelf);
        fragmentTransaction_button.show(fragment_home);
        hideAllFragment(fragmentTransaction_button);
        fragmentTransaction_button.show(fragment_home);
        fragmentTransaction_button.commit();
    }

    /**
     * 给button设置监听按钮
     */
    private void setListener()
    {
        good_word.setOnClickListener(this);
        home.setOnClickListener(this);
        book_house.setOnClickListener(this);
        book_chat.setOnClickListener(this);
        book_shelf.setOnClickListener(this);
    }

    /**
     * 影藏所有的fragment
     * @param fragmentTransaction
     */
    private void hideAllFragment(FragmentTransaction fragmentTransaction)
    {
        if(fragment_home!=null)
            fragmentTransaction.hide(fragment_home);
        if(fragment_good_word!=null)
            fragmentTransaction.hide(fragment_good_word);
        if(fragment_book_chat!=null)
            fragmentTransaction.hide(fragment_book_chat);
        if(fragment_book_shelf!=null)
            fragmentTransaction.hide(fragment_book_shelf);
        if(fragment_book_house!=null)
            fragmentTransaction.hide(fragment_book_house);
    }

    @Override
    public void onClick(View view) {
        FragmentTransaction fragmentTransaction_button=fragmentManager_button.beginTransaction();
        hideAllFragment(fragmentTransaction_button);
        switch (view.getId())
        {
            case R.id.good_word:
            {
                fragmentTransaction_button.show(fragment_good_word);
                break;
            }

            case R.id.book_house:
            {
                fragmentTransaction_button.show(fragment_book_house);
                break;
            }

            case R.id.home:
            {
                fragmentTransaction_button.show(fragment_home);
                break;
            }
            case R.id.book_chat:
            {
                fragmentTransaction_button.show(fragment_book_chat);
                break;
            }

            case R.id.book_shelf:
            {
                fragmentTransaction_button.show(fragment_book_shelf);
                break;
            }
        }
        fragmentTransaction_button.commit();
    }
}