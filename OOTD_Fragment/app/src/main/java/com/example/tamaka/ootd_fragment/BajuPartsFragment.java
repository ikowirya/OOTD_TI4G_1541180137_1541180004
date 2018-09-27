package com.example.tamaka.ootd_fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

public class BajuPartsFragment extends Fragment{

    private List<Integer> mImageIds;
    private Integer mListIndex;

    //merubah posisi devive lanscape atau horizontal
    public static  final String IMAGE_ID_LIST= "image_ids";
    public static final String LIST_INDEX = "list_index";
    private static final String TAG = "BajuPartsFragment";

    public BajuPartsFragment() {

    }

    //Untuk memanggil gambar kepala, badan, dan kaki
    public void setmImageIds(List<Integer>mImageIds){
        this.mImageIds = mImageIds;
    }

    public void setmListIndex(Integer mListIndex){
        this.mListIndex = mListIndex;
    }


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //return super.onCreateView(inflater, container, savedInstanceState);

        if(savedInstanceState != null){
            mImageIds = savedInstanceState.getIntegerArrayList(IMAGE_ID_LIST);
            mListIndex = savedInstanceState.getInt(LIST_INDEX);
        }

        //membuat tampilan fragment dari fragment layout
        View rootView = inflater.inflate(R.layout.fragment_layout, container,false);
        //menyatakan bahwa gambar akan diletakkan pada id imageViewFragment
        final ImageView imageViewVar = (ImageView) rootView.findViewById(R.id.ImageViewFragment);
        //mengisi id imageView dengan gambar dari resource
        BajuImageAssets varAsssets = new BajuImageAssets();
        //get 0 menandakan mengambil data pertama
        imageViewVar.setImageResource(mImageIds.get(mListIndex));

        //fungsi ketika image digeser/diklik akan berganti
        imageViewVar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if (mListIndex <  mImageIds.size()-1){
                    mListIndex++;
                }
                else {
                    mListIndex = 0;
                }
                imageViewVar.setImageResource(mImageIds.get(mListIndex));
            }
        });

        return rootView;
    }

    @Override
    //menyimpan variable array beserta index
    public void onSaveInstanceState(Bundle currentState) {
        currentState.putIntegerArrayList(IMAGE_ID_LIST, (ArrayList<Integer>) mImageIds);
        currentState.putInt(LIST_INDEX,mListIndex);
    }

}
