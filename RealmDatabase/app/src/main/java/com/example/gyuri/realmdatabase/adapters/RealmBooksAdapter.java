package com.example.gyuri.realmdatabase.adapters;

/**
 * Created by gyuri on 7/27/2016.
 */
        import android.content.Context;

        import com.example.gyuri.realmdatabase.model.Book;
        import io.realm.RealmResults;

public class RealmBooksAdapter extends RealmModelAdapter<Book> {

    public RealmBooksAdapter(Context context, RealmResults<Book> realmResults, boolean automaticUpdate) {

        super(context, realmResults, automaticUpdate);
    }
}