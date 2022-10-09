package mao.android_fragment.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import mao.android_fragment.R;


public class BlankFragment extends Fragment
{

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.fragment_static, container, false);
        TextView tv_adv = view.findViewById(R.id.tv_adv);
        ImageView iv_adv = view.findViewById(R.id.iv_adv);
        tv_adv.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Toast.makeText(getActivity(), "点击了广告文本", Toast.LENGTH_SHORT).show();
            }
        });

        iv_adv.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Toast.makeText(getActivity(), "点击了广告图片", Toast.LENGTH_SHORT).show();
            }
        });
        return view;
    }
}