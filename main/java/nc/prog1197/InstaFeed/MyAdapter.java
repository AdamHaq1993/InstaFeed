package nc.prog1197.InstaFeed;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {
    private List<reviewItem> mreviewItem;
    private ItemClickListener mClickListener;

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

       //declare public variables
        public TextView location_nameTextView;
        public TextView bodyTextView;
        public TextView starsTextView;
        public Button messageButton;
        public ViewHolder(View itemView) {

            super(itemView);

            //find the stuff within the itemview
            location_nameTextView = (TextView) itemView.findViewById(R.id.item_location_name);
            bodyTextView = (TextView) itemView.findViewById(R.id.item_body);
            starsTextView = (TextView) itemView.findViewById(R.id.item_stars);
            messageButton = (Button) itemView.findViewById(R.id.message_button);
            //button for things
            messageButton = itemView.findViewById(R.id.message_button);
            messageButton.setOnClickListener(this);
        }
        @Override
        public void onClick(View view) {
            if (mClickListener != null) mClickListener.onItemClick(view, getAdapterPosition());
        }
    }

    // put the items in the array
    public MyAdapter(List<reviewItem> reviewItems) {
        mreviewItem = reviewItems;
    }
    @Override
    public MyAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        View contactView = inflater.inflate(R.layout.listview_item, parent, false);
        ViewHolder viewHolder = new ViewHolder(contactView);
        return viewHolder;
    }


    @Override
    public void onBindViewHolder(MyAdapter.ViewHolder viewHolder, int position) {
        reviewItem item = mreviewItem.get(position);
    TextView textView2 = viewHolder.location_nameTextView;
        TextView textView3 = viewHolder.bodyTextView;
        TextView textView4 = viewHolder.starsTextView;
        textView2.setText(item.getLocation_name());
        textView3.setText(item.getBody());
        textView4.setText(String.valueOf(item.getStars()));
        Button button = viewHolder.messageButton;

        button.setText("View");


    }

    @Override
    public int getItemCount() {
        return mreviewItem.size();

    }
    public interface ItemClickListener {
        void onItemClick(View view, int position);
    }
    // allows clicks events to be caught
    void setClickListener(ItemClickListener itemClickListener) {
        this.mClickListener = itemClickListener;
    }

}
