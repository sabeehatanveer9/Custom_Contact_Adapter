package com.example.naveed.custom_contact_adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import java.util.List;


public class ContactsAdapter  extends RecyclerView.Adapter<ContactsAdapter.ViewHolder> {



    public class ViewHolder extends RecyclerView.ViewHolder {

        public TextView nameTextView;
        public TextView numTextView;
        public Button callButton;



        public ViewHolder(View itemView) {

            super(itemView);

            nameTextView = (TextView) itemView.findViewById(R.id.contact_name);
            numTextView= (TextView) itemView.findViewById(R.id.contact_no);
            callButton = (Button) itemView.findViewById(R.id.call_button);
        }
    }

    private List<Contacts> mContacts;
    private Context mContext;

    // Pass in the contact array into the constructor
    public ContactsAdapter(Context context, List<Contacts> contacts) {
        mContacts = contacts;
        mContext = context;
    }


    private Context getContext() {
        return mContext;
    }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Context context = viewGroup.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        // Inflate the custom layout
        View contactView = inflater.inflate(R.layout.contact_layout, viewGroup, false);

        // Return a new holder instance
        ViewHolder viewHolder = new ViewHolder(contactView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int i) {

        Contacts contact = mContacts.get(i);


        TextView textView = viewHolder.nameTextView;
        textView.setText(contact.getName());
        TextView textView2 = viewHolder.numTextView;
        textView2.setText(contact.getNum());

        Button button = viewHolder.callButton;


    }

    @Override
    public int getItemCount() {
        return mContacts.size();
    }
}

